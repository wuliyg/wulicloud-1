package com.wulis.provider.notice.service.impl;

import com.wulis.core.support.BaseServiceImpl;
import com.wulis.provider.notice.mapper.NoticeInformationMapper;
import com.wulis.provider.notice.model.domain.NoticeInformation;
import com.wulis.provider.notice.model.example.NoticeInformationExample;
import com.wulis.provider.notice.model.vo.NoticeInformationVo;
import com.wulis.provider.notice.service.NoticeInformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Herman on 2019/3/11.
 */
@Slf4j
@Service
public class NoticeInformationServiceImpl extends BaseServiceImpl<NoticeInformation> implements NoticeInformationService {
    @Resource
    private NoticeInformationMapper noticeInformationMapper;

    /**
     * 公告发布
     *
     * @param noticeInformationVo
     * @return
     */
    @Override
    public int publishNotice(NoticeInformationVo noticeInformationVo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        NoticeInformation noticeInformation = new NoticeInformation();
        noticeInformation.setInputTime(simpleDateFormat.format(new Date()));
        noticeInformation.setTitle(noticeInformationVo.getTitle());
        noticeInformation.setContent(noticeInformationVo.getContent());
        noticeInformation.setPublisherId(noticeInformationVo.getPublisherId());
        noticeInformation.setReleaseTime(noticeInformationVo.getReleaseTime());
        noticeInformation.setSort(0);
        return noticeInformationMapper.insertSelective(noticeInformation);
    }

    /**
     * 查询公告信息
     *
     * @param noticeInformationVo
     * @return
     */
    @Override
    public PageInfo queryNoticeInformation(NoticeInformationVo noticeInformationVo) {
        NoticeInformationExample noticeInformationExample = new NoticeInformationExample();
        NoticeInformationExample.Criteria criteria = noticeInformationExample.createCriteria();
        if (!StringUtils.isEmpty(noticeInformationVo.getReleaseTime()))
            criteria.andReleaseTimeLike("%" + noticeInformationVo.getReleaseTime() + "%");
        if (!StringUtils.isEmpty(noticeInformationVo.getTitle()))
            criteria.andTitleLike("%" + noticeInformationVo.getTitle() + "%");
        if (!StringUtils.isEmpty(noticeInformationVo.getPublisherId()))
            criteria.andPublisherIdEqualTo(noticeInformationVo.getPublisherId());
        noticeInformationExample.setOrderByClause("release_time desc");
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(noticeInformationVo.getPage(), noticeInformationVo.getLimit());
        List<NoticeInformation> noticeInformations = noticeInformationMapper.selectByExample(noticeInformationExample);
        PageInfo<NoticeInformation> pageInfo = new PageInfo<>(noticeInformations);
        return pageInfo;
    }
}
