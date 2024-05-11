package com.dungnt.remote_healthcare.exeption;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(999, "Uncategorized exception"),
    INSECURE_PASSWORD(1001, "Password must be at least 6 characters"),
    INVALID_MESSAGE_KEY(1000, "Invalid message key"),
    UNAUTHENTICATED(1002, "Unauthenticated");
    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
