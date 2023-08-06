package orgmeanapi.exceptionhandl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import orgmeanapi.ragiar.apis.Api;
import orgmeanapi.ragiar.errors.ErrorCode;

@Slf4j
@RestControllerAdvice
@Order(value = Integer.MAX_VALUE)   // 가장 마지막에 실행
public class GlobalExceptionHandl {





    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Api<Object>> exception (

            Exception exception
    ){
        log.error("",exception);


        return ResponseEntity

                .status(500)

                .body(

                        Api.ERROR(ErrorCode.SERVER_ERROR)
                );
    }
}
