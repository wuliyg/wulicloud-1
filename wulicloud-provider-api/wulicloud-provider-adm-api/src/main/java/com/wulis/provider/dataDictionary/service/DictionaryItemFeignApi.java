package com.wulis.provider.dataDictionary.service;

import com.wulis.core.config.FeginInterceptor;
import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.hystrix.DictionaryItemFeignHystrix;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "wulicloud-provider-adm",configuration = FeginInterceptor.class, fallback = DictionaryItemFeignHystrix.class)
public interface DictionaryItemFeignApi {

    /**
     * 查询数据字典item列表
     */
    @PostMapping(value = "data/dicItem/queryDataDicItemPage")
    Wrapper queryDataDicItemPage(@RequestBody DictionaryItemVo dictionaryItemVo);

    /**
     * 根据ID查询数据字典item信息
     */
    @PostMapping(value = "data/dicItem/queryDicItemById")
    Wrapper queryDicItemById(@RequestBody DictionaryItemVo dictionaryItemVo);


    /**
     * 根据字典名称查询字典item信息
     *
     * @return
     */
    @PostMapping(value = "data/dicItem/queryDicItemByDicName")
    Wrapper queryDicItemByDicName(@RequestBody DictionaryTypeVo dictionaryTypeVo);
}
