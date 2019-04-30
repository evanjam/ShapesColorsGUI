/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 *
 * class to store control color and size
 * has Setter methods
 * 
 */

import java.awt.Color;

public class Model {
	
	Color c;
	double size, size2;
	
	public void setColor(Color c)
	{
		this.c = c;
	}
	
	public void setSize(double size)
	{
		this.size = size;
	}
	public void setSize2x(double x, double y)
	{
		this.size = x;
		this.size2 = y;
	}
}
