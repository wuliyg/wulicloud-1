package com.wulis.provider.dataDictionary.model.domain;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "admin_dictionary_type")
public class DictionaryType extends BaseEntity {

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