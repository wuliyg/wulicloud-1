package com.wulis.provider.notice.service;

import com.wulis.core.config.FeginInterceptor;
import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.wulis.provider.notice.service.hystrix.NoticeInformationFeignHystrix;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "wulicloud-provider-adm", configuration = FeginInterceptor.class, fallback = NoticeInformationFeignHystrix.class)
public interface NoticeInformationFeignApi {
    /**
     * 查询公告信息
     *
     * @return
     */
    @PostMapping(value = "notice/queryNoticeInformation")
    Wrapper queryNoticeInformation(@RequestBody NoticeInformationVo noticeInformationVo);
}
