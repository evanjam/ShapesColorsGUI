/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 * 
 * class containing button press event logic flow
 * ie; the steps triggered when a button is pressed
 * 
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;


public class Controller extends View {

	// rectangle button press event
	static void recButtonPressed(ActionEvent event)
	{
		// remove previous icons from JPanel
		p.remove(tri); 
		p.remove(cir);
		
		// add rectangle icon to JPanel and set bounds it lies within
		p.add(rec);
		rec.setBounds(125, 130, 500, 420);
		// initialize a starting size to draw icon
		model.setSize(120);
		rec.size = model.size;
		
		// update JPanel
		p.updateUI();		
	}
		
	// triangle button press event
	static void triButtonPressed(ActionEvent event)
	{
		// remove previous icons from JPanel
		p.remove(rec);
		p.remove(cir);
		
		// add triangle icon to JPanel and set bounds it lies within
		p.add(tri);
		tri.setBounds(150, 130, 500, 420);
		// initialize a starting size to draw icon
		model.setSize(160);
		tri.size = model.size;
		tri.size2 = model.size;
		
		// update JPanel
		p.updateUI();
	}
	
	// circle button press event
	static void cirButtonPressed(ActionEvent event) 
	{
		// remove previous icons from JPanel
		p.remove(rec);
		p.remove(tri);
		
		// add circle icon to JPanel and set bounds it lies within
		p.add(cir);
		cir.setBounds(150, 130, 500, 420);
		// initialize a starting size to draw icon
		model.setSize(160); 
		cir.size = model.size;
		
		// update JPanel
		p.updateUI();
	}
	
	// red button press event
	static void redButtonPressed(ActionEvent event)
	{
		//set Model.color to red
		model.setColor(Color.red);
		// set each icon according to model
		rec.c = model.c;
		tri.c = model.c;
		cir.c = model.c;
		// update JPanel
		p.updateUI();
	}
	
	// blue button press event
	static void bluButtonPressed(ActionEvent event)
	{
		// set Model.color to blue
		model.setColor(Color.blue);
		// set each icon according to model
		rec.c = model.c;
		tri.c = model.c;
		cir.c = model.c;
		// update JPanel
		p.updateUI();
	}
	
	// yellow button press event
	static void yelButtonPressed(ActionEvent event)
	{
		// set Model.color to blue
		model.setColor(Color.yellow);
		// set each icon according to model
		rec.c = model.c;
		cir.c = model.c;
		tri.c = model.c;
		// update UI
		p.updateUI();
	}
	
	 // slider slide-event
	static void sliderChange(ChangeEvent event)
    {
    	// call to Change
        changeSize();
        p.updateUI();
    }
    
    // set size via slider.getValue()
	static void changeSize() 
    {
    	// set Model.size to slider value
		model.setSize(Integer.valueOf(slider.getValue()));
    	
    	// set size of each icon according to model class
    	// multiplied by factor of 2 to increase icon size growth rate
    	rec.size = 1.5*model.size;
        cir.size = 2*model.size;
        tri.size = 2*model.size;
        tri.size2 = 2*model.size;
    }
}