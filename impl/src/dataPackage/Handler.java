package dataPackage;

import java.io.IOException;
import org.antlr.runtime.Token;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the class that generates manages the java class construction.
 */

public class Handler {
	
	/** Environment file **/
	protected Environment env;
	
	//--Constructor--------------------------------------
	/** 
     * Constructor of ParseHandler.
     */
	public Handler(){
		env = new Environment();
	}
	
	//--Useful methods------------------------------------
	/**
	 * Method to print the Error and Warning Lists.
	 */
	public void printErrors(){
		for(String error:env.warningList)
			System.err.println(error);
		for(String error:env.errorList)
			System.err.println(error);
	}
	
	/**
	 * Method to add a new error message to the Error List.
	 * 
	 * @param msg   Error message
	 */
	public void addError(String msg){
		env.errorList.add(msg);
	}

	/**
	 * Method to delete '"' in the first and last position of the String.
	 * 
	 * @param s    String to modify
	 * @return     Modified String
	 */
	private String prepareString(String s){
		return s.substring(1, s.length()-1);
	}

	//--Parsing methods--------------------------------------
	/**
	 * Simple method to show that the handler started working
	 */
	public void start() {
		System.out.println("\nThe handler started working!");
	}

	/**
	 * Method to set the compositeName variable
	 */
	public void setCompositeName(Token t) {
		env.compositeName = prepareString(t.getText());
		System.out.println("\nCompositeName found and memorized: "+env.compositeName);
	}

	/**
	 * Method to set the packageName variable
	 */
	public void setPackage(Token t) {
		env.packageName = "out_"+(prepareString(t.getText()).substring(7));
		System.out.println("\nPackage found and memorized: "+env.packageName);
	}

	/**
	 * Method to set the type of the Component
	 */
	public void setTypeOfComponent(Token t) {
		env.typeOfComponent = prepareString(t.getText());
		//Type of Component: useful in big app 
	}
	
	/**
	 * Method to add the extensions of the Class
	 */
	public void addExtension(Token t) {
		env.extensions.add(prepareString(t.getText()));
		System.out.println("\nExtension found and memorized: "+(prepareString(env.extensions.toString())));
	}
	
	/**
	 * Method to set the Name of the Class
	 */
	public void setIDProperty(Token t) {
		env.robotName = t.getText();
		System.out.println("\nRobotName found and memorized: "+env.robotName);
	}
	
	/**
	 * Method to set the NickName variable of the Class
	 */
	public void setNickNameProperty(Token t) {
		env.nickName = (t.getText());
		System.out.println("\nRobot's NickName found and memorized: "+env.nickName);
	}

	/**
	 * Method to set the Weight variable of the Class
	 */
	public void setWeightProperty(Token t) {
		env.weight = (t.getText());
		System.out.println("\nRobot's Weight found and memorized: "+env.weight);
	}

	/**
	 * Method to set the Height variable of the Class
	 */
	public void setHeightProperty(Token t) {
		env.height = (t.getText());
		System.out.println("\nRobot's Height found and memorized: "+env.height);
	}

	/**
	 * Method to set the Price variable of the Class
	 */
	public void setPriceProperty(Token t) {
		env.price = (t.getText());
		System.out.println("\nRobot's Price found and memorized: "+env.price);			
		
	}
	
	/**
	 * Method to add the implementations of the Class
	 */
	public void addImplementation(Token t) {
		env.implementations.add(prepareString(t.getText()));
		System.out.println("\nImplementation found and memorized: "+prepareString(t.getText()));
	}

	/**
	 * Simple method to show that the handler completed its work
	 * 
	 */
	public void stop() {
		System.out.println("\nThe handler completed its work!" + "\n");
	}

	
	//--Write method-----------------------------------------------------
	/**
	 * This method creates the java class from the xml code. 
	 */
	public void writeToFile() {	
		System.out.println("The handler ask the Writer to create a new file:");
		//CodeWriter codeWr = new CodeWriter(env):
		//C++Writer c++Wr = new C++Writer(env):
		//ScalaWriter scalaWr = new ScalaWriter(env):
		JavaWriter javaWr = new JavaWriter(env);
		try {
			javaWr.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
