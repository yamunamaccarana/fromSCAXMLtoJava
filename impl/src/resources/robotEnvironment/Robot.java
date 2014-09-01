package resources.robotEnvironment;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the main class of the Case Study: it manages the Robot component
 */

public abstract class Robot implements RobotInterface {
	
	//----Properties----------------------------------------------------
	    
	@Property(required=true) //see SCA documentation
	private String ID;
	@Property(required=false) //see SCA documentation
	protected String nickname;
	@Property(required=false) //see SCA documentation
	protected double weight;
	@Property(required=false) //see SCA documentation
	protected double height;
	@Property(required=false) //see SCA documentation
	protected double price;

	//----Methods-------------------------------------------------------
	
	/**
	 * Getter method for the ID variable
	 * @return returns the value of ID
	 */
	public final String getID() {
		return ID;
	}
	
	/**
	 * Getter method for the nickname variable
	 * @return returns the value of nickname
	 */
	public final String getNickname() {
		return nickname;
	}
	
	/**
	 * Getter method for the weight variable
	 * @return returns the value of weight
	 */
	public final double getWeight() {
		return weight;
	}
	
	/**
	 * Getter method for the height variable
	 * @return returns the value of height
	 */
	public final double getHeight() {
		return height;
	}
	
	/**
	 * Getter method for the price variable
	 * @return returns the value of price
	 */
	public final double getPrice() {
		return price;
	}
	
	/**
	 * Method to control the robot movement
	 */
	public void move(){
		//--Do some computation...
		Position pos = new Position();
		pos.generateRandomPosition();
		//--Reach a position...
	}
}
