package com.community.manager.service.impl;

/*
 * Created by zk on 18-9-20.
 */

import com.community.manager.dao.ResidentDao;
import com.community.manager.domain.Resident;
import com.community.manager.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpServiceImpl implements ResidentService {

    @Autowired
    public ResidentDao residentDao;

    @Override
    public Resident findById(String id) {
        return residentDao.findById(id);
    }

    @Override
    public Resident findByTelephoneNumber(String telephoneNumber) {
        return residentDao.findByTelephoneNumber(telephoneNumber);
    }

    @Override
    public List<Resident> findAll() {
        return residentDao.findAll();
    }

    @Override
    public void insertResident(Resident resident) {
        residentDao.insertResident(resident);
    }

    @Override
    public void deleteResident(String id) {
        residentDao.deleteResident(id);
    }

    @Override
    public void updateResident(Resident resident) {
        residentDao.updateResident(resident);
    }
}
