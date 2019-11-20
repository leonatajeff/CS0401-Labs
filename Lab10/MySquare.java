public class MySquare extends MyRectangle {
	
	public MySquare() {
		startX = 0;
		startY = 0;
		height = 0;
		width = 0;
	}

	public MySquare(int x, int y, int side) {
		startX = x;
		startY = y;
		setSide(side);
      // Constructors to allow new objects to be created. x and y are the
      // location coordinates and size is the side length
	}

	public String toString() {
		return "S1: Side: " + height + " X: " + startX + " Y: " + startY;
      // Redefining toString().  See output for effect.
	}

	public void setSize(int w, int h) {
		if (w != h) {
			System.out.println("Sides must be equal. " + w + " != " + h + " so no action taken");
		} else {
			setSide(w);
		}
      // Redefining setSize().  This must be done because the inherited version

      // allows the width and height to differ but in a square they must be the

      // same.  In this version, if the width and height are not the same, the

      // method should output a message and not change anything.
	}

	public void setSide(int side) {
		width = side;
		height = side;
      // This is a new method that updates that size of the square.  Think about

      // how this will be implemented using the existing inherited instance vars.
	}
}