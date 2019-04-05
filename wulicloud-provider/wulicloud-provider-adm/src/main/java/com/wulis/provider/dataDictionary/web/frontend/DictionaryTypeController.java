package com.wulis.provider.dataDictionary.web.frontend;

import com.wulis.core.support.BaseController;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryTypeService;
import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@RequestMapping(value = "data/dic")
@Api(value = "API - DictionaryTypeController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DictionaryTypeController extends BaseController {

    @Resource
    private DictionaryTypeService dictionaryTypeService;

    @GetMapping(value = "checkDataDicName")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "校验字典名称是否存在")
    public Wrapper checkDataDicName(DictionaryTypeVo dictionaryTypeVo) {
        int result = dictionaryTypeService.checkDataDicName(dictionaryTypeVo);
        return WrapMapper.ok(result);
    }

    @GetMapping(value = "addDataDic")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "添加数据字典")
    Wrapper addDataDictionary(DictionaryTypeVo dictionaryTypeVo) {
        int result = dictionaryTypeService.addDataDictionary(dictionaryTypeVo);
        return WrapMapper.ok(result);
    }

    @GetMapping(value = "editDataDic")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "修改数据字典")
    Wrapper editDataDictionary(DictionaryTypeVo dictionaryTypeVo) {
        int result = dictionaryTypeService.editDataDictionary(dictionaryTypeVo);
        return WrapMapper.ok(result);
    }

    @GetMapping(value = "deleteDataDic")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "删除数据字典")
    Wrapper delDataDic(DictionaryTypeVo dictionaryTypeVo) {
        int result = dictionaryTypeService.deleteDataDictionary(dictionaryTypeVo);
        return WrapMapper.ok(result);
    }
}

