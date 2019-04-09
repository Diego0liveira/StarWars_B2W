package br.b2w.starwars.exception;

import javax.validation.ConstraintViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import br.b2w.starwars.model.DetailErro;

//@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler({EmptyResultDataAccessException.class})
//    public ResponseEntity<Object> entidadeNaoEncontrada(EmptyResultDataAccessException ex,  WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                		.addDetail("Recurso não encontrado na base de dados.")
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.NOT_FOUND)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
//    }
//	
//	
//	@ExceptionHandler({IllegalArgumentException.class})
//    public ResponseEntity<Object> propriedadeNula(IllegalArgumentException ex,  WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                		.addDetail("Um ou mais campos fornecidos estão nulos.")
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.BAD_REQUEST)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
//    }
//	 
//
//	@ExceptionHandler({IdNotValidationException.class})
//    public ResponseEntity<Object> idInvalido(IdNotValidationException ex, WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.BAD_REQUEST)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
//    }
//	 
//	
//    @ExceptionHandler({ConstraintViolationException.class})
//    public ResponseEntity<Object> constraintViolada(ConstraintViolationException ex,
//                                                    WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                        .addDetail("Constraint violada: " + ex.getConstraintViolations())
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.CONFLICT)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.CONFLICT, request);
//    }
// 
////	    @ExceptionHandler({ValueException.class})
////	    public ResponseEntity<Object> propriedadeNula(PropertyValueException ex, WebRequest request) {
////	 
////	        return handleExceptionInternal(
////	                ex, DetailErro.builder()
////	                        .addDetail("O atributo '"+ ex.getPropertyName() +"' não pode ser nulo.")
////	                        .addErro(ex.getMessage())
////	                        .addStatus(HttpStatus.BAD_REQUEST)
////	                        .addHttpMethod(getHttpMethod(request))
////	                        .addPath(getPath(request))
////	                        .build(),
////	                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
////	    }
//	 
//    @ExceptionHandler({NotExistException.class})
//    public ResponseEntity<Object> entidadeNaoEncontrada(NotExistException ex, WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                        .addDetail("Recurso não encontrado na base de dados.")
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.NOT_FOUND)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
//    }
// 
//    @ExceptionHandler({NullPointerException.class, IllegalArgumentException.class})
//    public ResponseEntity<Object> serverException(RuntimeException ex, WebRequest request) {
// 
//        return handleExceptionInternal(
//                ex, DetailErro.builder()
//                        .addDetail("Um exceção foi lançada.")
//                        .addErro(ex.getMessage())
//                        .addStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .addHttpMethod(getHttpMethod(request))
//                        .addPath(getPath(request))
//                        .build(),
//                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
//    }
// 
//    private String getPath(WebRequest request) {
// 
//        return ((ServletWebRequest) request).getRequest().getRequestURI();
//    }
// 
//    private String getHttpMethod(WebRequest request) {
// 
//        return ((ServletWebRequest) request).getRequest().getMethod();
//    }
}