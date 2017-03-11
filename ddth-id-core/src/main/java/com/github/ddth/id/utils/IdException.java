package com.github.ddth.id.utils;

/**
 * Exception thrown by ID operations.
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.2.0
 */
public class IdException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public IdException() {
    }

    public IdException(String message) {
        super(message);
    }

    public IdException(Throwable cause) {
        super(cause);
    }

    public IdException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Thrown to indicate that the operation is not supported/implemented.
     * 
     * @author Thanh Nguyen <btnguyen2k@gmail.com>
     * @since 0.5.0
     */
    public static class OperationNotSupportedException extends IdException {
        private static final long serialVersionUID = 1L;

        public OperationNotSupportedException() {
        }

        public OperationNotSupportedException(String message) {
            super(message);
        }
    }

    /**
     * Thrown to indicate that the operation has failed due to timeout.
     * 
     * @author Thanh Nguyen <btnguyen2k@gmail.com>
     * @since 0.5.0
     */
    public static class OperationTimeoutException extends IdException {

        private static final long serialVersionUID = 1L;

        public OperationTimeoutException() {
        }

        public OperationTimeoutException(String message) {
            super(message);
        }

        public OperationTimeoutException(Throwable cause) {
            super(cause);
        }

        public OperationTimeoutException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
