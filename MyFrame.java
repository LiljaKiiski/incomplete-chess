import java.awt.GridLayout;
import javax.swing.JFrame;

//MyFrame Class
public class MyFrame extends JFrame {
	public final int WIDTH = 800;
	public final int HEIGHT = 800 + 36; 

	//Constructor
	public MyFrame(String title, Main main){
		super(title);
		setLayout(new GridLayout(1, 1));
                setSize(WIDTH, HEIGHT);
                setLocationRelativeTo(null);
                setResizable(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);

		add(main.painter);
                addMouseListener(main.mouseListener);
	}	
}
