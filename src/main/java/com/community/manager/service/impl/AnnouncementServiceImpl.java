package com.community.manager.service.impl;

/*
 * Created by zk on 18-9-21.
 */

import com.community.manager.dao.AnnouncementDao;
import com.community.manager.domain.Announcement;
import com.community.manager.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    public AnnouncementDao announcementDao;

    @Override
    public Announcement findById(String id) {
        return announcementDao.findById(id);
    }
}
