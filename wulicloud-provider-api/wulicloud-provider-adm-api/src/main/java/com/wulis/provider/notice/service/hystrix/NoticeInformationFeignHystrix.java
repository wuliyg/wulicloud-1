package com.wulis.provider.notice.service.hystrix;

import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.wulis.provider.notice.service.NoticeInformationFeignApi;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class NoticeInformationFeignHystrix implements NoticeInformationFeignApi {
    @Override
    public Wrapper queryNoticeInformation(NoticeInformationVo noticeInformationVo) {
        return null;
    }
}
