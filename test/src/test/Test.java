package test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {


		Coordinates[] c;
		c = new Coordinates[4];
		c[0] = new Coordinates(1, 2);
		c[1] = new Coordinates(2, 5);
		c[2] = new Coordinates(3, 6);
		c[3] = new Coordinates(4, 5);

		for (int i = 0; i < c.length-1; i++) {
			if (c[i].y <= c[i+1].x) {
				System.out.println(c[i].x + "," + c[i].y + " and " + c[i+1].x + "," +c[i+1].y);
			}
		}

	}
}

class Coordinates {
	int x;
	int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
