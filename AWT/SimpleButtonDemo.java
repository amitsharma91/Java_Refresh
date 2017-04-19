import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleButtonDemo extends Frame// implements ActionListener
{
	public SimpleButtonDemo() {
		super("Buttons Demo");
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());//works like Text Editor
		
		
		Button b1 = new Button("red");
		Button b2 = new Button("green");
		Button b3 = new Button("blue");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBackground(Color.red);
			}
		});
		
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				setBackground(Color.green);
			}
		});
		
		
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				setBackground(Color.blue);
			}
		});
		
		//by default Layout is BorderLayout.CENTER
		add(b1);
		add(b2);
		add(b3);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent bharti) {
				System.exit(0);
			}
		});
	}//end constructor
	
	/*public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("red")){
			System.out.println("Red is Clicked");
			setBackground(Color.red);
		}
		if(ae.getActionCommand().equals("green")){
			System.out.println("Green is Clicked");
			setBackground(Color.green);
		}
		if(ae.getActionCommand().equals("blue")){
			System.out.println("Blue is Clicked");
			setBackground(Color.blue);
		}
		
	}*/
	

	public static void main(String[] args) {
		new SimpleButtonDemo();
	}




	
}