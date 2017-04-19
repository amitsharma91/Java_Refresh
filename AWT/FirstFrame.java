import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//java.awt.Frame class is a container
//either create Object(Frame f = new Frame)
//OR Extend it into your class
//Frame Vs Window
//Window - A rectangular area on screen that does not have border or buttons or title bar
//Frame - it is a Window with border and button or Title Bar 

public class FirstFrame extends Frame {
	public FirstFrame() {
		super("My Frame");
		// setTitle("First Frame");
		setSize(400, 400);
		setResizable(false);
		setVisible(true);
		// setLocation(350,200);
		setLocationRelativeTo(null);
		// setBackground(Color.red);
		setBackground(new Color(0, 0, 0));// rgb = 0-255
		// Attaching Listener
		// Using Anonymous Inner Class
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent bharti) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new FirstFrame();
		// Frame f = new Frame("My Frame");
		// f.setVisible(true);
		// f.setSize(100,100);//pixels
	}
}

/*
 * class HandleEvent extends WindowAdapter// implements WindowListener { // We
 * can use Adapter Classes public void windowClosing(WindowEvent arg0) {
 * System.exit(0); } }
 */
// UI - CUI() / GUI(User Friendly[Images,button ], Attractive,)
// to create GUI AWT(Abstract Window Toolkit), Swing, SWT, JavaFX
// Frame - Container(include Components)