package com.wulis.provider.dataDictionary.service;

import com.wulis.core.config.FeginInterceptor;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.hystrix.DictionaryTypeFeignHystrix;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "wulicloud-provider-adm",configuration = FeginInterceptor.class, fallback = DictionaryTypeFeignHystrix.class)
public interface DictionaryTypeFeignApi {

    /**
     * 查询数据字典类型列表
     *
     * @return
     */
    @PostMapping(value = "data/dic/queryDatDicPage")
    Wrapper queryDataDicPage(@RequestBody DictionaryTypeVo dictionaryTypeVo);

    /**
     * 根据Id查询字典信息
     *
     * @return
     */
    @PostMapping(value = "data/dic/queryDicInfoById")
    Wrapper queryDicInfoById(@RequestBody DictionaryTypeVo dictionaryTypeVo);
}