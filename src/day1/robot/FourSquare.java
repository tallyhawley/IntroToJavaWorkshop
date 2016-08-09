package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot bb7 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		bb7.setSpeed(25);
		// 5. Set the pen width to 5
		bb7.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 360/5; i++){
			// 7. Set the pen color to random
			bb7.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawShape(bb7, 4, 200);
			// 8. Turn the robot 90 degrees to the right
			bb7.turn(5);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawShape(Robot robot, int sides, int dist) {
		robot.penDown();
		for (int x = 0; x < sides; x++){
			robot.move(dist);
			robot.turn(360/sides);
		}	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
