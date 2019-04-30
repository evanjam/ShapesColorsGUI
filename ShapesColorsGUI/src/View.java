/**"ShapesColorsGUI:
 * 
 * evan fulciniti
 * 4/28/2019
 *
 *
 * class containing all swingx components
 * and button listeners
 * 
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

public class View  {
	
	// driver method
	public View() 
	{
		initialize();
	}
	
	// instanciate swingx components
	JFrame f = new JFrame();
	static JPanel p = new JPanel();
	JButton recButton = new JButton("rectangle");
	JButton triButton = new JButton("triangle");
	JButton cirButton = new JButton("circle");
	JButton redButton = new JButton("red");
	JButton bluButton = new JButton("blue");
	JButton yelButton = new JButton("yellow");
	static JSlider slider = new JSlider(JSlider.VERTICAL, 20, 150, 80);
	
	// instanciate other classes
	static Rectangle rec = new Rectangle();
	static Triangle tri = new Triangle();
	static Circle cir = new Circle();
	static Model model = new Model();
	
	// main method to build swingx components and place buttons
	private void initialize() 
	{
		// don't use any pre-defined layout
		p.setLayout(null);
	
		// manually set button layout with coordinates
		recButton.setBounds(150, 10, 100, 40);
		triButton.setBounds(250, 10, 100, 40);
		cirButton.setBounds(350, 10, 100, 40);
		redButton.setBounds(150, 600, 100, 40);
		bluButton.setBounds(250, 600, 100, 40);
		yelButton.setBounds(350, 600, 100, 40);
			
		// give text to buttons and color them
		recButton.setText("rectangle");
		triButton.setText("triangle"); 
		cirButton.setText("circle"); 
		redButton.setText("red");
		bluButton.setText("blue");
		yelButton.setText("yellow"); 
		redButton.setBackground(Color.red);
		bluButton.setBackground(Color.blue);
		yelButton.setBackground(Color.yellow);
			
		// slider layout parameters
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(1, 130, 100, 420);
		slider.setBackground(Color.gray);
			
		//add things to JPanel p
		p.add(slider); 
		p.add(recButton);
		p.add(triButton);
		p.add(cirButton);
		p.add(redButton);
		p.add(bluButton);
		p.add(yelButton);
		p.setBackground(Color.darkGray);
		
		// add JPanel p to JFrame f
		f.add(p); 
		
		// set behaviors of JFrame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650, 700);
		f.setVisible(true);
		
		// background of "outside shape"
		rec.setBackground(Color.darkGray);
		tri.setBackground(Color.darkGray);
		cir.setBackground(Color.darkGray);
		
		// button listener functions
		// create new listeners and assign to buttons
		// calls corresponding 'button press event' from Controller class
		recButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				Controller.recButtonPressed(event); 
			}
		});
		
		triButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				Controller.triButtonPressed(event); 
			}
		});
		
		cirButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				Controller.cirButtonPressed(event); 
			}
		});
		

		redButton.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent event) 
			{
				Controller.redButtonPressed(event); 
			}
		});
			
		bluButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				Controller.bluButtonPressed(event); 
			}
		});
	

		yelButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				Controller.yelButtonPressed(event); 
			}
		});
			
		//slider
		slider.addChangeListener(new ChangeListener() 
		{
			public void stateChanged(ChangeEvent event) 
			{
				Controller.sliderChange(event);
	        }
		});
		
	}
}
