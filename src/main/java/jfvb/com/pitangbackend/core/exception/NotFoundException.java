package jfvb.com.pitangbackend.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends PitangBackendException {

    public NotFoundException(String message, Integer errorCode) {
        super(message, errorCode);
    }
}
