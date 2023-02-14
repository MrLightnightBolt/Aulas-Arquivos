package ExercicioExcecoes;

public class Error extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public Error (String msg) {
		super(msg);
	}
}
