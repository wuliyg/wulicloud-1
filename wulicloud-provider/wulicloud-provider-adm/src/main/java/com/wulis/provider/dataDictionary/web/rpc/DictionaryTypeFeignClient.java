package com.wulis.provider.dataDictionary.web.rpc;

import com.wulis.core.support.BaseController;
import com.wulis.provider.dataDictionary.model.domain.DictionaryType;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryTypeFeignApi;
import com.wulis.provider.dataDictionary.service.DictionaryTypeService;
import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@Api(value = "API - DictionaryTypeFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DictionaryTypeFeignClient extends BaseController implements DictionaryTypeFeignApi {

    @Resource
    private DictionaryTypeService dictionaryTypeService;


    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "查询数据字典类型列表")
    public Wrapper queryDataDicPage(@RequestBody DictionaryTypeVo dictionaryTypeVo) {
        PageInfo pageInfo = dictionaryTypeService.queryDataDicPage(dictionaryTypeVo);
        return WrapMapper.ok(pageInfo);
    }

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "根据Id查询字典信息")
    public Wrapper queryDicInfoById(@RequestBody DictionaryTypeVo dictionaryTypeVo) {
        DictionaryType dictionaryType = dictionaryTypeService.selectByKey(dictionaryTypeVo);
        return WrapMapper.ok(dictionaryType);
    }

}

