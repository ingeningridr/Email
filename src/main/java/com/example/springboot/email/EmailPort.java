package com.example.springboot.email;

import javax.mail.MessagingException;

public interface EmailPort {
    boolean sendEmail(EmailBody emailBody) throws MessagingException;
}
