//--------------------------------------------------------
//	<auto-generated>
//	This code was generated by a tool.
//		@author Yamuna Maccarana.
//		@author Gabriele Maroni.
//		@author Giampietro Bordogna.
//	This file can be modify, changes will not cause incorrect behaviors of the tool.
//	ATTENTION: Changes could be lost if the code is regenerated.
//	</auto-generated>
//--------------------------------------------------------

package out_robotEnvironment;

public abstract class TestRobot001 extends resources.robotEnvironment.Robot implements resources.robotEnvironment.RobotInterface , resources.robotEnvironment.GPSInterface {

	@SuppressWarnings("unused")
	private String nickname;
	@SuppressWarnings("unused")
	private String weight;
	@SuppressWarnings("unused")
	private String height;
	@SuppressWarnings("unused")
	private String price;

	public TestRobot001() {
		nickname = "Discovery";
		weight = "20";
		height = "50";
		price = "499.99";
	 }

	public void userMethod(){
	System.out.println("The new class has been created succesfully");
	System.out.println("and it is ready to do some computation");
	//..Do some User Computation..
	 }

}