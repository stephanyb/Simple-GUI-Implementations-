import java.awt.*;
import javax.swing.*;

/*
 * Displays Frame with a color filled Panel and oval in the Center
 * 
 *  
 */

/*
public class MyDrawPanel extends JPanel{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel paint = new MyDrawPanel();
		
		frame.add(BorderLayout.CENTER,paint);
		frame.setSize(400, 400);
		frame.setVisible(true);	
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		//fills the background color of the whole panel 
		 
		 
		g.setColor(Color.MAGENTA);
		g.fillOval(100,100, 170, 170);
		
	}
}
*/

/*
 * Displays an image to the screen (on the panel (which is in the frame))
 * 
 */



public class MyDrawPanel extends JPanel{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel paint = new MyDrawPanel();
		
		frame.add(BorderLayout.CENTER,paint);
		frame.setSize(1200, 900);
		frame.setVisible(true);	
	}
	
	public void paintComponent(Graphics g)
	{
		Image image = new ImageIcon("/c:/Users/Stephany B/Documents/CISC 3120/Test image - Rose.jpg ").getImage();
		g.drawImage(image,0,0,getWidth(),getHeight(),this);
	}
}


