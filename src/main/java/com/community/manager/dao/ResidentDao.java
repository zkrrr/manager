package com.community.manager.dao;

/*
 * Created by zk on 18-9-21.
 */

import com.community.manager.domain.Resident;

import java.util.List;

public interface ResidentDao {
    Resident findById(String id);
    Resident findByTelephoneNumber(String telephoneNumber);
    List<Resident> findAll();
    void insertResident(Resident resident);
    void deleteResident(String id);
    void updateResident(Resident resident);
}
