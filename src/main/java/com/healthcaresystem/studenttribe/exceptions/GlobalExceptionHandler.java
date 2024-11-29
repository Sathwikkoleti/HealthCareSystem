package com.healthcaresystem.studenttribe.exceptions;

import com.healthcaresystem.studenttribe.entity.TestResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TestResultNotFound.class)
    public ResponseEntity<String> Exception1(TestResultNotFound exception) {
        return new ResponseEntity<>("custom exception"+exception.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserIdNotFound.class)
    public ResponseEntity<String> Exception2(UserIdNotFound exception) {
        return new ResponseEntity<>("User Id Not Found exception"+exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AppointmentNotFound.class)
	public ResponseEntity<String> exp1(AppointmentNotFound e)
	{
		return new ResponseEntity<>("custom exception: "+e.getMessage(),HttpStatus.BAD_GATEWAY);
	}

    @ExceptionHandler(DiagnosticCenterNotFound.class)
    public ResponseEntity<String> exp2(DiagnosticCenterNotFound e)
    {
        return new ResponseEntity<>("custom exception: "+e.getMessage(),HttpStatus.BAD_GATEWAY);
    }
    
    @ExceptionHandler(TestIdNotFoundException.class)
	public ResponseEntity<String> exp3(TestIdNotFoundException e)
	{
		return new ResponseEntity<>("custom exception: "+e.getMessage(),HttpStatus.BAD_GATEWAY);
	}
}
