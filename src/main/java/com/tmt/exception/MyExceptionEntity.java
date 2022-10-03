package com.tmt.exception;

import lombok.Data;

import java.util.Date;

@Data
public class MyExceptionEntity {
    private String message;
    private String code;
    private Date timestamp;
}
