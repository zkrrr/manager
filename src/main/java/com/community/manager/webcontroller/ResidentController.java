package com.community.manager.webcontroller;


import com.community.manager.domain.Resident;
import com.community.manager.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/manager")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

//    @RequestMapping(value = "/resident", method = RequestMethod.GET)
//    public Resident findResident(@RequestParam(value = "id", required = true) String id) {
//        return residentService.findById(id);
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public boolean login(@RequestParam(value = "telephoneNumber", required = true) String telephoneNumber,@RequestParam(value = "password", required = true)String password) {
//        Resident resident = residentService.findByTelephoneNumber(telephoneNumber);
//        if (resident != null) {
//            return resident.getPassword().equals(password);
//        }
//        else
//            return false;
//    }
}
