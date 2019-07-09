package com.zzj.theconsumer.controller;

import com.zzj.theconsumer.services.ServiceExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.awt.geom.GeneralPath;

@Controller
@RequestMapping("exe")
public class ServiceExeController {

    @Autowired
    private ServiceExe serviceExe;

    @ResponseBody
    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    public String exe(HttpServletRequest request){
        String bi = request.getParameter("bi");
        String sss = (String) serviceExe.getSomething(bi);
        return sss;
    }
}
