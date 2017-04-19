import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioANDCheckBox extends Frame {

	Checkbox c1, c2, c3;
	String it = "";

	public RadioANDCheckBox() {
		super("RadioANDCheckBox");
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());

		c1 = new Checkbox("Java");
		c2 = new Checkbox("PHP");
		c3 = new Checkbox("python");

		c1.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent ie) {
				if (c1.getState()) {
					// System.out.println(c1.getLabel()+" selected");
					it = it + ","+ c1.getLabel();
					repaint();
				}
			}
		});

		c2.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent ie) {
				if (c2.getState()) {
					it = it + ","+ c2.getLabel();
					repaint();
				}
			}
		});
		
		c3.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent ie) {
				if (c3.getState()) {
					it = it + ","+ c3.getLabel();
					repaint();
				}
			}
		});

		add(c1);
		add(c2);
		add(c3);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent bharti) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.drawString("Selected Items are: ", 100, 200);
		g.drawString(it, 250, 200);

	}

	public static void main(String[] args) {
		new RadioANDCheckBox();
	}
}