package com.wulis.provider.dataDictionary.mapper;

import com.wulis.core.mybatis.BaseMapper;
import com.wulis.provider.dataDictionary.model.domain.DictionaryItem;
import com.wulis.provider.dataDictionary.model.dto.DictionaryItemDto;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;

import java.util.List;

public interface DictionaryItemMapper extends BaseMapper<DictionaryItem> {
    /**
     * 根据字典名称查询字典item信息
     *
     * @param dictionaryTypeVo
     * @return
     */
    List<DictionaryItemDto> queryDicItemByDicName(DictionaryTypeVo dictionaryTypeVo);
}