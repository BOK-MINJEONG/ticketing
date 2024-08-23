package study.kiwi.ticketing.global.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import study.kiwi.ticketing.global.error.ErrorCode;

@Getter
@NoArgsConstructor
public class BaseException extends RuntimeException {
    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
