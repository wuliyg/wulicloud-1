package com.wulis.provider.dataDictionary.service;

import com.wulis.core.support.BaseService;
import com.wulis.provider.dataDictionary.model.domain.DictionaryType;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by Herman on 2019/3/11.
 */
public interface DictionaryTypeService extends BaseService<DictionaryType> {

    /**
     * 查询数据字典类型列表
     *
     * @param dictionaryTypeVo
     * @return
     */
    PageInfo queryDataDicPage(DictionaryTypeVo dictionaryTypeVo);

    /**
     * 校验字典名称是否存在
     *
     * @param dictionaryTypeVo
     * @return
     */
    int checkDataDicName(DictionaryTypeVo dictionaryTypeVo);

    /**
     * 添加数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    int addDataDictionary(DictionaryTypeVo dictionaryTypeVo);

    /**
     * 修改数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    int editDataDictionary(DictionaryTypeVo dictionaryTypeVo);

    /**
     * 删除数据字典
     *
     * @param dictionaryTypeVo
     * @return
     */
    int deleteDataDictionary(DictionaryTypeVo dictionaryTypeVo);
}
