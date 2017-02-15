import java.io.*;
import java.util.*;

public class Picture {

    public static void main(String[] args) throws FileNotFoundException {

	// Lines ==============================
	Canvas c = new Canvas(500, 500, 0, 0, 0);

	/*
	c = new Canvas();
	c.line(250, 250, 400, 250); // +x
	c.line(250, 250, 350, 300); // 1
	c.line(250, 250, 300, 350); // 2
	c.line(250, 250, 250, 400); // +y
	c.line(250, 250, 200, 350); // 3
	c.line(250, 250, 150, 300); // 4
	c.line(250, 250, 100, 250); // -x
	c.line(250, 250, 150, 200); // 5
	c.line(250, 250, 200, 150); // 6
	c.line(250, 250, 250, 100); // -y
	c.line(250, 250, 300, 150); // 7
	c.line(250, 250, 350, 200); // 8
	*/

	Pixel p = new Pixel(18, 10, 143);
	int x1, y1, x2, y2;
	for (int i = 0; i < 500; i += 5) {
	    x1 = i; y1 = 499;
	    x2 = 499; y2 = 499 - i;
	    c.line(x1, y1, x2, y2, p);
	}
	for (int i = 0; i < 500; i += 10) {
	    x1 = 499; y1 = 499 - i;
	    x2 = 499 - i; y2 = 0;
	    c.line(x1, y1, x2, y2, p);
	}
	for (int i = 0; i < 500; i += 15) {
	    x1 = 499 - i; y1 = 0;
	    x2 = 0; y2 = i;
	    c.line(x1, y1, x2, y2, p);
	}
	for (int i = 0; i < 500; i += 20) {
	    x1 = 0; y1 = i;
	    x2 = i; y2 = 499;
	    c.line(x1, y1, x2, y2, p);
	}
	c.save("out.ppm");
	// ==================================== */
	
	/* // Green Mountains =================
	Canvas c = new Canvas(1000, 500, 16, 0, 32);
	for (int y = 480; y > 0; y -= 10) {
	    for (int x = 0; x < 1000; x++) {
		if (Math.random() < 0.005) { // 0.5%
		    int g = (int)(256 * (1 - y / 500.));
		    int r = (int)(g * 0.35);
		    int b = (int)(g * 0.35);
		    c.triangle(x, y, new Pixel(r, g, b));
		}
	    }
	}
	c.save("out.ppm");
	// ==================================== */
    }
}
