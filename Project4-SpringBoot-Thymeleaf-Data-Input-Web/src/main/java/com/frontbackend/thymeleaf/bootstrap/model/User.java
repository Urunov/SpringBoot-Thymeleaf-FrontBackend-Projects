package com.frontbackend.thymeleaf.bootstrap.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birtdate;
}
