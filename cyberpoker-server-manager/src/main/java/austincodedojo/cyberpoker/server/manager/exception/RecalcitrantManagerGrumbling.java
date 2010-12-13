package austincodedojo.cyberpoker.server.manager.exception;

public class RecalcitrantManagerGrumbling extends RuntimeException {

	/**
   * 
   */
  private static final long serialVersionUID = 1560064670704150511L;

  public RecalcitrantManagerGrumbling(String message, Exception cause) {
		super(message, cause);
	}

}
