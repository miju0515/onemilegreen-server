package orgmeanapi.ragiar.exception;

import lombok.Getter;
import orgmeanapi.ragiar.errors.ErrorCodeIfs;

@Getter
public class ApiException extends RuntimeException implements ApiExceptionIfs {

    private final String errorDescription;
    private final ErrorCodeIfs errorCodeIfs;

    public ApiException(ErrorCodeIfs errorCodeIfs) {
        this(errorCodeIfs, errorCodeIfs.getDescription());
    }

    public ApiException(ErrorCodeIfs errorCodeIfs, String errorDescription) {
        super(errorDescription);
        this.errorCodeIfs = errorCodeIfs;
        this.errorDescription = errorDescription;
    }

    public ApiException(ErrorCodeIfs errorCodeIfs, Throwable tx) {
        super(errorCodeIfs.getDescription(), tx);
        this.errorCodeIfs = errorCodeIfs;
        this.errorDescription = errorCodeIfs.getDescription();
    }
}








