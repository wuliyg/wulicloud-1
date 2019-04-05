package com.wulis.provider.notice.service;

import com.wulis.core.support.BaseService;
import com.wulis.provider.notice.model.domain.NoticeInformation;
import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by Herman on 2019/3/11.
 */
public interface NoticeInformationService extends BaseService<NoticeInformation> {
    /**
     * 公告发布
     *
     * @param noticeInformationVo
     * @return
     */
    int publishNotice(NoticeInformationVo noticeInformationVo);

    /**
     * 查询公告信息
     *
     * @param noticeInformationVo
     * @return
     */
    PageInfo queryNoticeInformation(NoticeInformationVo noticeInformationVo);
}
