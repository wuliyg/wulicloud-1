package com.wulis.provider.dataDictionary.web.frontend;

import com.wulis.core.support.BaseController;
import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.service.DictionaryItemService;
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
@RequestMapping(value = "data/dicItem")
@Api(value = "API - DictionaryItemController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DictionaryItemController extends BaseController {

    @Resource
    private DictionaryItemService dictionaryItemService;

    /**
     * 校验字典item名称是否存在
     */
    @GetMapping(value = "checkDataDicItemName")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "校验字典item名称是否存在")
    Wrapper checkDataDicItemName(DictionaryItemVo dictionaryItemVo) {
        int result = dictionaryItemService.checkDataDicItemName(dictionaryItemVo);
        return WrapMapper.ok(result);
    }

    /**
     * 添加数据字典item
     */
    @GetMapping(value = "addDataDicItem")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "添加数据字典item")
    Wrapper addDataDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        int result = dictionaryItemService.addDataDictionaryItem(dictionaryItemVo);
        return WrapMapper.ok(result);
    }

    /**
     * 修改数据字典item
     */
    @GetMapping(value = "editDataDicItem")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "修改数据字典item")
    Wrapper editDataDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        int result = dictionaryItemService.editDataDictionaryItem(dictionaryItemVo);
        return WrapMapper.ok(result);
    }

    /**
     * 删除数据字典item
     */
    @GetMapping(value = "deleteDataDicItem")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "删除数据字典item")
    Wrapper deleteDictionaryItem(DictionaryItemVo dictionaryItemVo) {
        int result = dictionaryItemService.deleteDictionaryItem(dictionaryItemVo);
        return WrapMapper.ok(result);
    }
}

