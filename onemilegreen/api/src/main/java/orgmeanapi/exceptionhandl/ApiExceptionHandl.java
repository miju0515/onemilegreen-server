package orgmeanapi.exceptionhandl;

import org.springframework.web.bind.annotation.ExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import orgmeanapi.ragiar.apis.Api;
import orgmeanapi.ragiar.exception.ApiException;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order(value = Integer.MIN_VALUE)   // 먼저
public class ApiExceptionHandl {

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<Api<Object>> apiException(
            ApiException apiException
    ){
        log.error("", apiException);

        var errorCode = apiException.getErrorCodeIfs();

        return ResponseEntity
                .status(errorCode.getHttpStatusCode())
                .body(
                        Api.ERROR(errorCode, apiException.getErrorDescription())
                );

    }
}
