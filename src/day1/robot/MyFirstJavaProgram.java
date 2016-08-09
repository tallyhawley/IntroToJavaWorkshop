                                                       package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot r5d3 = new Robot();
		r5d3.setSpeed(8);
		r5d3.penDown();
		for(int y=0; y < 6; y++){
			r5d3.move(200);
			for(int x = 0; x < 2; x+=1){
				r5d3.turn(120);
				r5d3.setRandomPenColor();
				r5d3.move(200);}
			r5d3.turn(60);}
		
	}
}
