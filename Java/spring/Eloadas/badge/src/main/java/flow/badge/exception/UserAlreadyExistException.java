package flow.badge.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String id) {
        super("User is already exist whith " + id + " id.");
    }
}
