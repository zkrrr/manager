package com.community.manager.webcontroller;

/*
 * Created by zk on 18-9-20.
 */


import com.community.manager.domain.Resident;
import com.community.manager.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/manager")
public class IndexController {
    private static final String txjyy_login = "txjyy_login";
    private static final String residentList = "residentList";
    private static final String residentForm = "residentForm";
    private static final String redirects = "redirect:/manager/residentList";
    private static final String error = "redirect:/manager/index";
    @Autowired
    private ResidentService residentService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "telephoneNumber", required = true) String telephoneNumber,@RequestParam(value = "password", required = true)String password) {
        Resident resident =  residentService.findByTelephoneNumber(telephoneNumber);
        if (resident!=null) {
            return redirects;
        }
        else
            return error;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.addAttribute("resident", new Resident());
        modelMap.addAttribute("action","login");
        return txjyy_login;
    }

    @RequestMapping(value = "/residentList",method = RequestMethod.GET)
    public String list(ModelMap modelMap){
        modelMap.addAttribute("residents",residentService.findAll());
        return residentList;
    }

    @RequestMapping(value="/residentForm", method = RequestMethod.GET)
    public String form(){
        return residentForm;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String insert(ModelMap map){
            map.addAttribute("resident", new Resident());
            map.addAttribute("action", "create");
            return residentForm;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createResident(@ModelAttribute Resident resident) {
        residentService.insertResident(resident);
        return redirects;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteResident(@PathVariable String id) {
        residentService.deleteResident(id);
        return redirects;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable String id, ModelMap map) {
        map.addAttribute("resident", residentService.findById(id));
        map.addAttribute("action", "update");
        return residentForm;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putResident(@ModelAttribute Resident resident) {
        residentService.updateResident(resident);
        return redirects;
    }

}
