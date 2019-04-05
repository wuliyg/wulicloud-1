package com.wulis.provider.notice.web.frontend;

import com.wulis.core.support.BaseController;
import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.wulis.provider.notice.service.NoticeInformationService;
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
@RequestMapping(value = "notice")
@Api(value = "API - NoticeInformationController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class NoticeInformationController extends BaseController {

    @Resource
    private NoticeInformationService noticeInformationService;

    /**
     * 发布公告
     */
    @GetMapping(value = "publishNotice")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @ApiOperation(httpMethod = "GET", value = "公告发布")
    Wrapper publishNotice(NoticeInformationVo noticeInformationVo) {
        int result = noticeInformationService.publishNotice(noticeInformationVo);
        return WrapMapper.ok(result);
    }
}

