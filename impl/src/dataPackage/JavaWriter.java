package dataPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the class that generates a java code from the xml input file.
 */

public class JavaWriter implements CodeWriter {
	
	//--Fields------------------------------------------------------
	/** Xml file **/
	private Environment env;
	/** Buffer containing the code to translate the xml file **/
	public StringBuilder buff;
	
	//--Constructor------------------------------------------------------
	/** 
     * Constructor of JavaWriter.
     * 
     * @param env
     */
	public JavaWriter(Environment env){
		buff = new StringBuilder();
		this.env = env;
	}
	
	//--Create a new file method------------------------------------------------------
	@Override
	public void write() throws IOException {
		System.out.println("...\nthe Writer is ready to start its job...");
		
		//--File structure---------------------------------------------
		System.out.println("...\nthe Writer is creating the code...");
		createIntestation();
		createPackage();
		createClass();
		
		//--Write to file----------------------------------------------
		System.out.println("...\nthe Writer is ready to create a new file...");
		
		try {
		String path = env.packageName;
		File file = new File("./src/out_"+path.substring(4),"/"+env.robotName+".java");
		file.mkdirs();
		if(file.exists()){
            file.delete();
        }
		file.createNewFile();
		BufferedWriter out = new BufferedWriter(new java.io.FileWriter(file));
		out.write(buff.toString());
		out.close();
		System.out.println("\nNew file created succesfully!");
		} catch ( IOException e ) {
	           e.printStackTrace();
	        }
	}
	
	//--Write methods------------------------------------------------------
	/** 
	 * Method to add the intestation comment to the buffer.
     */
	private void createIntestation() {
		buff.append("//--------------------------------------------------------\n");
		buff.append("//	<auto-generated>\n");
		buff.append("//	This code was generated by a tool.\n");
		buff.append("//		@author Yamuna Maccarana.\n");
		buff.append("//		@author Gabriele Maroni.\n");
		buff.append("//		@author Giampietro Bordogna.\n");
		buff.append("//	This file can be modify, changes will not cause incorrect behaviors of the tool.\n");
		buff.append("//	ATTENTION: Changes could be lost if the code is regenerated.\n");
		buff.append("//	</auto-generated>\n");
		buff.append("//--------------------------------------------------------\n\n");
	}

	/** 
	 * Method to add the package code to the buffer.
     */
	private void createPackage(){
		buff.append("package ");
		buff.append(env.packageName);
		buff.append(";\n\n");
	}
	
	/** 
	 * Method to add the class code to the buffer.
     */
	private void createClass(){
		buff.append("public abstract class ");
		buff.append(env.robotName);
		buff.append(" extends ");
				
		for(int i = 0; i < env.extensions.size(); i++) {   
			buff.append(env.extensions.get(i));
			if (i < env.extensions.size() - 1){
				buff.append(" , ");
			}
		} 
		
		buff.append(" implements ");
		
		for(int i = 0; i < env.implementations.size(); i++) {   
			buff.append(env.implementations.get(i));
			if (i < env.implementations.size() - 1){
				buff.append(" , ");
			}
		} 

		buff.append(" {\n\n");
		
		createFields();
		createConstructor();
		createMethods();
		//..Add some methods
		
		
		buff.append("}\n");
	}


	/** 
	 * Method to create and initialize the fields in the class.
     */
	private void createFields() {
		buff.append("\t@SuppressWarnings(\"unused\")\n");		
		buff.append("\tprivate String nickname;\n");
		buff.append("\t@SuppressWarnings(\"unused\")\n");
		buff.append("\tprivate String weight;\n");
		buff.append("\t@SuppressWarnings(\"unused\")\n");
		buff.append("\tprivate String height;\n");
		buff.append("\t@SuppressWarnings(\"unused\")\n");
		buff.append("\tprivate String price;\n\n");		
	}
	
	/** 
	 * Method to create the constructor of the class.
     */
	private void createConstructor() {
		buff.append("\tpublic ");
		buff.append(env.robotName);
		buff.append("() {\n");
		buff.append("\t\tnickname = \"");
		buff.append(env.nickName);
		buff.append("\";\n");
		buff.append("\t\tweight = \"");
		buff.append(env.weight);
		buff.append("\";\n");
		buff.append("\t\theight = \"");
		buff.append(env.height);
		buff.append("\";\n");
		buff.append("\t\tprice = \"");
		buff.append(env.price);
		buff.append("\";\n");
		buff.append("\t }\n\n");		
	}
	
	/** 
	 * Method to create the new methods of the class.
     */	
	private void createMethods() {
		//...Do some computation...
		buff.append("\tpublic void userMethod(){\n");
		buff.append("\tSystem.out.println(\"The new class has been created succesfully\");\n");
		buff.append("\tSystem.out.println(\"and it is ready to do some computation\");\n");
		buff.append("\t//..Do some User Computation..\n");
		buff.append("\t }\n\n");
	}
}
