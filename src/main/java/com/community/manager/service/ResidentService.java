package com.community.manager.service;

/*
 * Created by zk on 18-9-21.
 */

import com.community.manager.domain.Resident;

import java.util.List;

public interface ResidentService {
    Resident findById(String id);
    Resident findByTelephoneNumber(String telephoneNumber);
    List<Resident> findAll();
    void insertResident(Resident resident);
    void deleteResident(String id);
    void updateResident(Resident resident);
}
