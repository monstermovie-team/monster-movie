package edu.nf.movie.customer.service.exception;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-11
 */
public class FileUploadException extends RuntimeException{
    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }
}
