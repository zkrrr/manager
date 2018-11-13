package com.community.manager.service;

/*
 * Created by zk on 18-9-21.
 */

import com.community.manager.domain.Announcement;

public interface AnnouncementService {
    Announcement findById(String id);
}
