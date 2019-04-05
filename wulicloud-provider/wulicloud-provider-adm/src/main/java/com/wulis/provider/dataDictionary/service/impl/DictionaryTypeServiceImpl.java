package com.wulis.provider.dataDictionary.service.impl;

import com.wulis.core.support.BaseServiceImpl;
import com.wulis.provider.dataDictionary.mapper.DictionaryItemMapper;
import com.wulis.provider.dataDictionary.mapper.DictionaryTypeMapper;
import com.wulis.provider.dataDictionary.model.domain.DictionaryType;
import com.wulis.provider.dataDictionary.model.example.DictionaryItemExample;
import com.wulis.provider.dataDictionary.model.example.DictionaryTypeExample;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
public class DictionaryTypeServiceImpl extends BaseServiceImpl<DictionaryType> implements DictionaryTypeService {
    @Resource
    private DictionaryTypeMapper dictionaryTypeMapper;
    @Resource
    private DictionaryItemMapper dictionaryItemMapper;

    /**
     * 查询数据字典类型列表
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    public PageInfo queryDataDicPage(DictionaryTypeVo dictionaryTypeVo) {
        DictionaryTypeExample dictionaryTypeExample = new DictionaryTypeExample();
        DictionaryTypeExample.Criteria criteria = dictionaryTypeExample.createCriteria();
        if (!StringUtils.isEmpty(dictionaryTypeVo.getDicName()))
            criteria.andDicNameLike("%" + dictionaryTypeVo.getDicName() + "%");
        dictionaryTypeExample.setOrderByClause("id asc");
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(dictionaryTypeVo.getPage(), dictionaryTypeVo.getLimit());
        List<DictionaryType> dictionaryTypes = dictionaryTypeMapper.selectByExample(dictionaryTypeExample);
        PageInfo<DictionaryType> pageInfo = new PageInfo<>(dictionaryTypes);
        return pageInfo;
    }

    /**
     * 校验字典名称是否存在
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    public int checkDataDicName(DictionaryTypeVo dictionaryTypeVo) {
        DictionaryTypeExample dictionaryTypeExample = new DictionaryTypeExample();
        DictionaryTypeExample.Criteria criteria = dictionaryTypeExample.createCriteria();
        if (!StringUtils.isEmpty(dictionaryTypeVo.getDicName()))
            criteria.andDicNameEqualTo(dictionaryTypeVo.getDicName());
        if (!StringUtils.isEmpty(dictionaryTypeVo.getId()))
            criteria.andIdNotEqualTo(dictionaryTypeVo.getId());
        return dictionaryTypeMapper.selectCountByExample(dictionaryTypeExample);
    }

    /**
     * 添加数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    public int addDataDictionary(DictionaryTypeVo dictionaryTypeVo) {
        DictionaryType dictionaryType = new DictionaryType();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dictionaryType.setInputTime(simpleDateFormat.format(new Date()));
        dictionaryType.setDicName(dictionaryTypeVo.getDicName());
        dictionaryType.setText(dictionaryTypeVo.getText());
        return dictionaryTypeMapper.insertSelective(dictionaryType);
    }

    /**
     * 修改数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    public int editDataDictionary(DictionaryTypeVo dictionaryTypeVo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DictionaryType dictionaryType = new DictionaryType();
        dictionaryType.setId(dictionaryTypeVo.getId());
        dictionaryType.setDicName(dictionaryTypeVo.getDicName());
        dictionaryType.setText(dictionaryTypeVo.getText());
        dictionaryType.setUpdateTime(simpleDateFormat.format(new Date()));
        return dictionaryTypeMapper.updateByPrimaryKeySelective(dictionaryType);
    }

    /**
     * 删除数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteDataDictionary(DictionaryTypeVo dictionaryTypeVo) {
        //删除数据字典Type表
        DictionaryType dictionaryType = new DictionaryType();
        dictionaryType.setId(dictionaryTypeVo.getId());
        dictionaryTypeMapper.deleteByPrimaryKey(dictionaryType);
        //删除数据字典Item表
        DictionaryItemExample dictionaryItemExample = new DictionaryItemExample();
        dictionaryItemExample.createCriteria().andDicIdEqualTo(dictionaryTypeVo.getId());
        dictionaryItemMapper.deleteByExample(dictionaryItemExample);
        return 1;
    }
}
