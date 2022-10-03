package com.tmt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyExceptionProcess {

    //cách 1: return ResponEntity
//    @ExceptionHandler(value = MyException.class)
//    public ResponseEntity<Object> handleException1(MyException mex) {
//        MyExceptionEntity entity = new MyExceptionEntity();
//        entity.setMessage(mex.getMessage());
//        entity.setCode("04105");
//        entity.setTimestamp(new Date());
//
//        return new ResponseEntity<> (entity, HttpStatus.BAD_REQUEST);
//    }

    //cách 2: sử dụng Map
    @ExceptionHandler(value = MyException.class)
    public Map<String, Object> handleException2(MyException mex) {
        Map<String, Object> err = new HashMap<>();
        err.put("code", "04105");
        err.put("message", mex.getMessage());
        err.put("timestamp", new Date());

        return err;
    }
}
