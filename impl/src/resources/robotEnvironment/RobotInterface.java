package resources.robotEnvironment;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the interface for the Robot class.
 */

public interface RobotInterface {
	
	public String getID();
	public String getNickname();
	public double getWeight();
	public double getHeight();
	public double getPrice();
	public void move();

}
