package resources.robotEnvironment;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This class defines the Robot's position
 */

public class Position {
	
	public double north;
	public double est;
	
	/**
	 * Constructor of the class Position
	 * 
	 */
	
	public Position (){
	}
	
	/**
	 * Getter method for Position
	 * @return returns a random Position
	 */
	public Position getPosition(){
		Position pos = new Position();
		pos.generateRandomPosition();
		return pos;
	}
	
	/**
	 * Setter method for Position
	 * @return returns the setted Position
	 */
	public void setPosition(double n, double e){
		this.north = n;
		this.est = e;
	}
	
	/**
	 * Method to generate a random position
	 * @return returns a random position
	 */
	public Position generateRandomPosition(){
		Position pos = new Position();
		pos.setPosition (Math.random(), Math.random());
		return pos;
	}
}
