package com.stc.filemanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.*;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@RestControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex)
    {
        Map<String, String> res = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(fieldError ->
        {
            res.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
//        res.put("runtimeCode", String.valueOf(RuntimeErrorCode.BAD_REQUEST));
        return res;
    }





    @org.springframework.web.bind.annotation.ExceptionHandler({
            IllegalArgumentException.class
    })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIllegalArgumentException(
            Exception exception)
    {
        ErrorResponse res = new ErrorResponse();
        res.setMessage(exception.getLocalizedMessage());
            res.setRuntimeCode(HttpStatus.BAD_REQUEST.value());
        return res;
    }



    @org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFoundException(
            ResourceNotFoundException exception,
            WebRequest request)
    {
        ErrorResponse res = new ErrorResponse();
        res.setMessage(exception.getMessage());
        res.setRuntimeCode(HttpStatus.NOT_FOUND.value());
        return res;
    }


}
