package com.wulis.provider.notice.web.rpc;

import com.wulis.core.support.BaseController;
import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.wulis.provider.notice.service.NoticeInformationFeignApi;
import com.wulis.provider.notice.service.NoticeInformationService;
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
@Api(value = "API - NoticeInformationFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class NoticeInformationFeignClient extends BaseController implements NoticeInformationFeignApi {

    @Resource
    private NoticeInformationService noticeInformationService;

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "查询公告信息")
    public Wrapper queryNoticeInformation(@RequestBody NoticeInformationVo noticeInformationVo) {
        PageInfo pageInfo = noticeInformationService.queryNoticeInformation(noticeInformationVo);
        return WrapMapper.ok(pageInfo);
    }
}

