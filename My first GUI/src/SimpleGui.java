import javax.swing.*;

public class SimpleGui {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		button.setText("Click Me");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}
