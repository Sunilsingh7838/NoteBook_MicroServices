package in.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value= ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae){
		ExceptionInfo exception = new ExceptionInfo();
		exception.setMsg(ae.getMessage());
		exception.setCode("AIt0034567");
		
		return new ResponseEntity<> (exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= noDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNDFE(noDataFoundException ndfe){
		ExceptionInfo exception = new ExceptionInfo();
//		exception.setMsg("Error during fecting data");
		exception.setMsg(ndfe.getMessage());
		exception.setCode("500");
		
		return new ResponseEntity<> (exception, HttpStatus.BAD_REQUEST);
	}
}
