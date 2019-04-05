package com.wulis.provider.dataDictionary.service.impl;

import com.wulis.core.support.BaseServiceImpl;
import com.wulis.provider.dataDictionary.mapper.DictionaryItemMapper;
import com.wulis.provider.dataDictionary.model.domain.DictionaryItem;
import com.wulis.provider.dataDictionary.model.dto.DictionaryItemDto;
import com.wulis.provider.dataDictionary.model.example.DictionaryItemExample;
import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Herman on 2019/3/11.
 */
@Slf4j
@Service
public class DictionaryItemServiceImpl extends BaseServiceImpl<DictionaryItem> implements DictionaryItemService {
    @Resource
    private DictionaryItemMapper dictionaryItemMapper;

    /**
     * 查询数据字典item列表
     *
     * @param dictionaryItemVo
     * @return
     */
    @Override
    public PageInfo queryDataDicItemPage(DictionaryItemVo dictionaryItemVo) {
        DictionaryItemExample dictionaryItemExample = new DictionaryItemExample();
        DictionaryItemExample.Criteria criteria = dictionaryItemExample.createCriteria();
        criteria.andDicIdEqualTo(dictionaryItemVo.getDicId());
        if (!StringUtils.isEmpty(dictionaryItemVo.getItemName()))
            criteria.andItemNameLike("%" + dictionaryItemVo.getItemName() + "%");
        dictionaryItemExample.setOrderByClause("id asc");
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(dictionaryItemVo.getPage(), dictionaryItemVo.getLimit());
        List<DictionaryItem> dictionaryTypes = dictionaryItemMapper.selectByExample(dictionaryItemExample);
        PageInfo<DictionaryItem> pageInfo = new PageInfo<>(dictionaryTypes);
        return pageInfo;
    }

    /**
     * 校验字典item名称是否存在
     *
     * @param dictionaryItemVo
     * @return
     */
    @Override
    public int checkDataDicItemName(DictionaryItemVo dictionaryItemVo) {
        DictionaryItemExample dictionaryItemExample = new DictionaryItemExample();
        DictionaryItemExample.Criteria criteria = dictionaryItemExample.createCriteria();
        if (!StringUtils.isEmpty(dictionaryItemVo.getId()))
            criteria.andIdNotEqualTo(dictionaryItemVo.getId());
        if (!StringUtils.isEmpty(dictionaryItemVo.getDicId()))
            criteria.andDicIdEqualTo(dictionaryItemVo.getDicId());
        if (!StringUtils.isEmpty(dictionaryItemVo.getItemName()))
            criteria.andItemNameEqualTo(dictionaryItemVo.getItemName());
        return dictionaryItemMapper.selectCountByExample(dictionaryItemExample);
    }

    /**
     * 添加数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    @Override
    public int addDataDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DictionaryItem dictionaryItem = new DictionaryItem();
        dictionaryItem.setItemName(dictionaryItemVo.getItemName());
        dictionaryItem.setItemValue(dictionaryItemVo.getItemValue());
        dictionaryItem.setSort(dictionaryItemVo.getSort());
        dictionaryItem.setText(dictionaryItemVo.getText());
        dictionaryItem.setDicId(dictionaryItemVo.getDicId());
        dictionaryItem.setInputTime(simpleDateFormat.format(new Date()));
        return dictionaryItemMapper.insertSelective(dictionaryItem);
    }

    /**
     * 修改数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    @Override
    public int editDataDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DictionaryItem dictionaryItem = new DictionaryItem();
        dictionaryItem.setId(dictionaryItemVo.getId());
        dictionaryItem.setUpdateTime(simpleDateFormat.format(new Date()));
        dictionaryItem.setItemName(dictionaryItemVo.getItemName());
        dictionaryItem.setItemValue(dictionaryItemVo.getItemValue());
        dictionaryItem.setSort(dictionaryItemVo.getSort());
        dictionaryItem.setText(dictionaryItemVo.getText());
        return dictionaryItemMapper.updateByPrimaryKeySelective(dictionaryItem);
    }

    /**
     * 删除数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    @Override
    public int deleteDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        DictionaryItem dictionaryItem = new DictionaryItem();
        dictionaryItem.setId(dictionaryItemVo.getId());
        dictionaryItemMapper.deleteByPrimaryKey(dictionaryItem);
        return 1;
    }

    /**
     * 根据字典名称查询字典item信息
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    public List<DictionaryItemDto> queryDicItemByDicName(DictionaryTypeVo dictionaryTypeVo) {
        if (StringUtils.isEmpty(dictionaryTypeVo.getDicName())) {
            return null;
        }
        return dictionaryItemMapper.queryDicItemByDicName(dictionaryTypeVo);
    }
}
