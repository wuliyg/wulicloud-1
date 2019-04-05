package com.wulis.provider.dataDictionary.service.hystrix;

import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryItemFeignApi;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class DictionaryItemFeignHystrix implements DictionaryItemFeignApi {
    @Override
    public Wrapper queryDataDicItemPage(DictionaryItemVo dictionaryItemVo) {
        return null;
    }

    @Override
    public Wrapper queryDicItemById(DictionaryItemVo dictionaryItemVo) {
        return null;
    }

    @Override
    public Wrapper queryDicItemByDicName(DictionaryTypeVo dictionaryTypeVo) {
        return null;
    }
}
