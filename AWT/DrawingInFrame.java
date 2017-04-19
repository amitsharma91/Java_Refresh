import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawingInFrame extends Frame {

	public DrawingInFrame() {
		super("I am drawing");
		setSize(500, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}//end of Constructor
	
	//to draw in frame
	public void paint(Graphics g) {
		//g.setColor(Color.red);
		//g.drawLine(50,50,450,450);
//		g.setColor(Color.green);
		//g.drawLine(450,50,50,450);

//		g.fillRect(50,50,300,300);
		g.drawArc(100,100,100,100,90,180);
	}

	public static void main(String[] args) {
		new DrawingInFrame();
	}
}