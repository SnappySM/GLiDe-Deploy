package edu.upc.gessi.glidebackend.excpetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConstraintViolationException extends RuntimeException{

    public ConstraintViolationException(String message) {
        super(message);
    }

}