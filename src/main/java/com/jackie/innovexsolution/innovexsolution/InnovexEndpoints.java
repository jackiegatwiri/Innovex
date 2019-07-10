package com.jackie.innovexsolution.innovexsolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InnovexEndpoints {
    @Autowired
    private Service service;

    @RequestMapping("/compute")
    public List<Compute> computationResult(){
        return service.computationResult();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/compute/new")
    public void addUserData(@RequestBody UserData userData){
        service.processUserData(userData);
    }
}
