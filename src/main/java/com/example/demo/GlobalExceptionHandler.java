package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.ConnectException;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(ConnectException.class)
    public ResponseEntity<String> handleCommunicationException(Exception exception) {
        log.error(exception.getMessage());
        return new ResponseEntity<>("Cannot connect to database, try again later.", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
