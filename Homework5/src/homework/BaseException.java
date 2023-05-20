package homework;

public class BaseException extends Exception {

	public BaseException(String message) {
		super(message);
	}
}

class InvalidAmountException extends BaseException {

	public InvalidAmountException(String message) {
		super(message);

	}
}

class InvalidCardNumberException extends BaseException {

	public InvalidCardNumberException(String message) {
		super(message);

	}

}

class InvalidDateException extends BaseException {

	public InvalidDateException(String message) {
		super(message);

	}
}

class InvalidSecurityCodeException extends BaseException {

	public InvalidSecurityCodeException(String message) {
		super(message);

	}
}

class SystemNotWorkingException extends BaseException {

	public SystemNotWorkingException(String message) {
		super(message);

	}
}
