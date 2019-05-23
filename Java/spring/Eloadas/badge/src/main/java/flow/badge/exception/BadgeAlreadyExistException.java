package flow.badge.exception;

public class BadgeAlreadyExistException extends RuntimeException {

    public BadgeAlreadyExistException(Long id) {
        super("Badge is already exist whith " + id + " id.");
    }
}
