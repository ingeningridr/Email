package com.example.springboot.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping(value = "/comerssia")
public class EmailRest {

    @Autowired
    private EmailPort emailPort;

    @PostMapping(value = "/notificaciones")
    @ResponseBody
    public boolean SendEmail(@RequestBody EmailBody emailBody) throws MessagingException {

        return emailPort.sendEmail(emailBody);
    }

}
