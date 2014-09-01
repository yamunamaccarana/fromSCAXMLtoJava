package dataPackage;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the interface for generating a code.
 * For this project's aim, it will be extended by the class JavaWriter.
 */

import java.io.IOException;

public interface CodeWriter {

	/** 
	 * Method to write the generated code in the selected file.
	 * 
	 * @throws  IOException
	 */
	public abstract void write() throws IOException;
}