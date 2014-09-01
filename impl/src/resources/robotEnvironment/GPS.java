package resources.robotEnvironment;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the class that provides to the Robot its position.
 * For this project's aim, positions will be randomly generated.
 */

public abstract class GPS implements GPSInterface{
	
	//----Properties----------------------------------------------------
	
	//----Methods-------------------------------------------------------

	/**
	 * Getter method to get the Robot's position
	 * @return returns a random Position
	 */
	public Position getGPSPosition(){
		//--Do some computation...
		Position pos = new Position();
		pos.generateRandomPosition();
		return pos;
	}

}
