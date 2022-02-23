package it.insiel.innovazione.ipp.referenceapp.commons.exceptions;

public class ServiceException extends Exception {
    public ServiceException () {
        super();
    }
    public ServiceException(String msg) {
        super(msg);
    }
    public ServiceException(Exception e) {
        super(e);
    }
}
