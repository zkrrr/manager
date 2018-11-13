package com.community.manager.dao;

/*
 * Created by zk on 18-9-21.
 */

import com.community.manager.domain.Announcement;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementDao {
    Announcement findById(@Param("id")String id);
}
