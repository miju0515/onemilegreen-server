package orgmeanapi.ragiar.exception;

import orgmeanapi.ragiar.errors.ErrorCodeIfs;

public interface ApiExceptionIfs {

    ErrorCodeIfs getErrorCodeIfs();
    String getErrorDescription();
}
