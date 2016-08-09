package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bb9 = new Robot();
		// 5. Set your robot's pen to the down position
		bb9.penDown();
		// 3. Set the robot to go at max speed (10)
		bb9.setSpeed(10);
	
		int r = 102;
		int g = 42;
		int b = 255;
		// 4. Do the following (steps 6-9) 75 times
		for (int x = 0; x <1280; x++){
			// 7. Change the pen color to random
			bb9.setPenColor(r, g, b);
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			bb9.move(5*x/3);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			bb9.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
			r += 2;
			g += 5;
			b -= 9;
			// 9. Set the pen width to i
			bb9.setPenWidth(3);}
	}
}
