package handlerexceptions;

public class ContatoNotFoundException extends Exception {
	public ContatoNotFoundException() {
        super("Contato não encontrado");
    }

    public ContatoNotFoundException(String message) {
        super(message);
    }

    public ContatoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
