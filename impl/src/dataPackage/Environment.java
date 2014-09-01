package dataPackage;

import java.util.ArrayList;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the class that defines the xml input file structure.
 */

public class Environment {

	//----Fields----------------------------------------------------
	/** Composite Name **/
	protected String compositeName;
	/** Package name **/
	protected String packageName;
	/** Type of Component **/
	protected String typeOfComponent;
	/** Extensions **/
	protected ArrayList<String> extensions;
	/** Robot Name **/
	protected String robotName;
	/** Robot NickName **/
	protected String nickName;
	/** Weight **/
	protected String weight;
	/** Height **/
	protected String height;
	/** Price **/
	protected String price;
	/** Implementation **/
	protected ArrayList<String> implementations;
	
	//----Error & Warning management----------------------------------
	
	/** Error List **/
	public ArrayList<String> errorList;
	/** Warning List **/
	public ArrayList<String> warningList;
	/** Translation String **/
	public String translation;
	
	//----Constructor----------------------------------------------------
	
	/** 
     * Constructor of Environment.
     */
	public Environment(){
		compositeName = "";
		packageName = "";
		typeOfComponent = "";
		extensions = new ArrayList<String> ();
		robotName = "";
		nickName = "";
		weight = "";
		height = "";
		price = "";
		implementations = new ArrayList<String> ();
		
		errorList = new ArrayList<String> ();
		warningList = new ArrayList<String>  ();
		translation = "";
	}
	
	/** 
     * Method to add Error to the errorList.
     */
	public void addError (String msg) {
		errorList.add(msg); 		
	}
}
