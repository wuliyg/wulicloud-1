package com.wulis.provider.dataDictionary.model.dto;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "admin_dictionary_type")
public class DictionaryTypeDto extends BaseEntity {

    /**
     * 字典类型名称
     */
    @Column(name = "dic_name")
    private String dicName;

    /**
     * 描述
     */
    private String text;

}