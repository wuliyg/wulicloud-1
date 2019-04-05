package com.wulis.provider.dataDictionary.service.hystrix;

import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryTypeFeignApi;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class DictionaryTypeFeignHystrix implements DictionaryTypeFeignApi {
    @Override
    public Wrapper queryDataDicPage(DictionaryTypeVo dictionaryTypeVo) {
        return null;
    }

    @Override
    public Wrapper queryDicInfoById(DictionaryTypeVo dictionaryTypeVo) {
        return null;
    }
}
