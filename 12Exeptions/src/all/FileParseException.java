package all;

public class FileParseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileParseException() {
        super();
    }
	
	public FileParseException(String s) {
        super(s);
    }
	
	FileParseException(String msg, String pathFilename, int line) {
		System.out.println(msg + " in "+ pathFilename + " at line " + line  );
	}
}
