package com.wulis.provider.dataDictionary.model.domain;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "admin_dictionary_item")
public class DictionaryItem extends BaseEntity {

    /**
     * 字典类型id
     */
    @Column(name = "dic_id")
    private Integer dicId;

    /**
     * 字典名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 值
     */
    @Column(name = "item_value")
    private String itemValue;

    /**
     * 描述
     */
    private String text;

    /**
     * 排序
     */
    private Integer sort;

}