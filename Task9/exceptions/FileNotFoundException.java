package by.epam_pre_training.task9.exceptions;

public class FileNotFoundException extends LogicTask9Exception {

    public FileNotFoundException(String msg) {
        super(msg);
    }

    public FileNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public FileNotFoundException(Throwable cause) {
        super(cause);
    }
}
