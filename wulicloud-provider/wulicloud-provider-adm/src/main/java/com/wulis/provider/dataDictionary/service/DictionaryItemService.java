package com.wulis.provider.dataDictionary.service;

import com.wulis.core.support.BaseService;
import com.wulis.provider.dataDictionary.model.domain.DictionaryItem;
import com.wulis.provider.dataDictionary.model.dto.DictionaryItemDto;
import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Herman on 2019/3/11.
 */
public interface DictionaryItemService extends BaseService<DictionaryItem> {
    /**
     * 查询数据字典item列表
     *
     * @param dictionaryItemVo
     * @return
     */
    PageInfo queryDataDicItemPage(DictionaryItemVo dictionaryItemVo);

    /**
     * 校验字典item名称是否存在
     *
     * @param dictionaryItemVo
     * @return
     */
    int checkDataDicItemName(DictionaryItemVo dictionaryItemVo);

    /**
     * 添加数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    int addDataDictionaryItem(DictionaryItemVo dictionaryItemVo);

    /**
     * 修改数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    int editDataDictionaryItem(DictionaryItemVo dictionaryItemVo);

    /**
     * 删除数据字典item
     *
     * @param dictionaryItemVo
     * @return
     */
    int deleteDictionaryItem(DictionaryItemVo dictionaryItemVo);

    /**
     * 根据字典名称查询字典item信息
     *
     * @param dictionaryTypeVo
     * @return
     */
    List<DictionaryItemDto> queryDicItemByDicName(DictionaryTypeVo dictionaryTypeVo);
}
