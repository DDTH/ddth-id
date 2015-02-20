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
     * Thrown to indicate that the operation has failed.
     * 
     * @author Thanh Nguyen <btnguyen2k@gmail.com>
     * @since 0.2.0
     */
    public static class OperationFailedException extends IdException {

        private static final long serialVersionUID = 1L;

        public OperationFailedException() {
        }

        public OperationFailedException(String message) {
            super(message);
        }

        public OperationFailedException(Throwable cause) {
            super(cause);
        }

        public OperationFailedException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
