/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 *
 * class containing method to draw rectangle icon
 * with parameters color and size
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rectangle extends JPanel {
	
	Color c;
	double size;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(c);
		g.fillRect(15,15, (int) size*2, (int) size);
	}
}