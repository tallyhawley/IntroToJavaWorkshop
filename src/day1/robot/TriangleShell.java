package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot k9 = new Robot();
	
	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		k9.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int len = 50;
		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++){
			// 9. Change the color of the pen to a random color
			k9.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			len += 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(k9, len);
			// 10. Turn the tortoise 6 degrees to the right
			k9.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(Robot rob, int length) {
		rob.penDown();
		for (int x = 0; x<3; x++){
			rob.move(length);
			rob.turn(360/3);
		}
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
