package com.doctorAppointment.HideSecretKey;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

public class SecretHiding implements Serializable {


    @Value("${spring.mail.username}")
    private transient String username;

    @Value("${spring.mail.password}")
    private transient String password;

}
