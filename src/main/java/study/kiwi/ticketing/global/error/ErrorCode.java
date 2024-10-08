package study.kiwi.ticketing.global.error;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // common error "C001"
    INTERNAL_SERVER_ERROR( "C001", "Server Error"),
    INVALID_INPUT_VALUE("C002", "Invalid Input Value"),


    // auth error "A001"


    // user error "U001"

    ;

    private final String code;
    private final String message;

    /**
     *
     * @param code: Http Status Code
     * @param message: 설명
     */
    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
