package com.excursions.excursions.exception;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import static com.excursions.excursions.log.message.ServiceExceptionLogMessages.SERVICE_EXCEPTION_LOG;

@Slf4j
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
        log.error(SERVICE_EXCEPTION_LOG, message);
    }
}
