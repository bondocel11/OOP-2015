import javax.swing.JFrame;

public class MainDesign extends JFrame {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("1010");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Constants.G_w, Constants.G_h);
		frame.setResizable(false);
		frame.setVisible(true);
		BoardPanel board = new BoardPanel();
		frame.add(board);		

	}

}
