package resources.robotEnvironment;

/**
 * 
 * @author Yamuna Maccarana
 * @author Gabriele Maroni
 * @author Giampietro Bordogna
 * 
 * This is the class that provides to the Robot the position it needs to reach.
 * For this project's aim, positions will be randomly generated.
 */

public abstract class Navigator implements NavigatorInterface{
	
	//----Properties----------------------------------------------------
	
	//----Methods-------------------------------------------------------
	
	/**
	 * Provider method for Position
	 * @return returns a random Position
	 */
	public Position updatePosition(){
		//--Do some computation...
		Position pos = new Position();
		pos.generateRandomPosition();
		return pos;
	}
}
