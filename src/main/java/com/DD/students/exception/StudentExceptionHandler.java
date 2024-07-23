package com.DD.students.exception;

import org.antlr.v4.runtime.atn.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
    @ExceptionHandler(value = StudentException.class)
    public ResponseEntity<ErrorInfor> handleException(StudentException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorInfor(e.getStudentError().getMessage()));
    }

}
