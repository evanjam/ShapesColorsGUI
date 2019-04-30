/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 *
 * class containing method to draw circle icon
 * with parameters color and size
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel {
	
	Color c;
	double size;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(c);
		g.fillOval(0,0,(int) size,(int) size);
	}
}