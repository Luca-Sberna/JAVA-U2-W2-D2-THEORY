package exceptions;

public class NotFoundException extends RuntimeException {

	public NotFoundException(int id) {
		super("Item with id " + id + " not found!");
	}

}