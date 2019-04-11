package kz.logistic.logistic_server.controllers.advice;

import kz.logistic.logistic_server.controllers.BaseController;
import kz.logistic.logistic_server.exceptions.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Assylkhan
 * on 10.04.2019
 * @project logistic_server
 */
@ControllerAdvice
@RestController
public class ErrorController extends BaseController{

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<?> resourceNotFoundException(ServiceException e) {
        return buildResponse(buildErrorResponse(e), HttpStatus.NOT_FOUND);
    }

}
