/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 *
 * class containing method to draw triangle icon
 * using parameters color, size, size2
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Triangle extends JPanel {
	
	Color c;
	double size, size2;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int xpoints[] = {0, (int) size, 0};
		int ypoints[] = {0, 0, (int) size2};
		int npoints = 3;
		g.setColor(c);
		g.fillPolygon(xpoints, ypoints, npoints);
		
	}
	
}