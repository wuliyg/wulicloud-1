package com.wulis.provider.dataDictionary.web.rpc;

import com.wulis.core.support.BaseController;
import com.wulis.provider.dataDictionary.model.domain.DictionaryItem;
import com.wulis.provider.dataDictionary.model.dto.DictionaryItemDto;
import com.wulis.provider.dataDictionary.model.vo.DictionaryItemVo;
import com.wulis.provider.dataDictionary.model.vo.DictionaryTypeVo;
import com.wulis.provider.dataDictionary.service.DictionaryItemFeignApi;
import com.wulis.provider.dataDictionary.service.DictionaryItemService;
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
import java.util.List;

@Slf4j
@RefreshScope
@RestController
@Api(value = "API - CommonDistrictCategoryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DictionaryItemFeignClient extends BaseController implements DictionaryItemFeignApi {

    @Resource
    private DictionaryItemService dictionaryItemService;

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "查询数据字典类型列表")
    public Wrapper queryDataDicItemPage(@RequestBody DictionaryItemVo dictionaryItemVo) {
        PageInfo pageInfo = dictionaryItemService.queryDataDicItemPage(dictionaryItemVo);
        return WrapMapper.ok(pageInfo);
    }

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "根据ID查询数据字典item信息")
    public Wrapper queryDicItemById(@RequestBody DictionaryItemVo dictionaryItemVo) {
        DictionaryItem dictionaryItem = dictionaryItemService.selectByKey(dictionaryItemVo);
        return WrapMapper.ok(dictionaryItem);
    }

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "根据字典名称查询字典item信息")
    public Wrapper queryDicItemByDicName(@RequestBody DictionaryTypeVo dictionaryTypeVo) {
        List<DictionaryItemDto> dictionaryItems = dictionaryItemService.queryDicItemByDicName(dictionaryTypeVo);
        return WrapMapper.ok(dictionaryItems);
    }
}

