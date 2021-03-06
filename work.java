import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class work implements ActionListener
{
	JFrame a = new JFrame();				//Opens a frame
	JFrame scoreboard = new JFrame();
	JPanel panel = new JPanel();				//Opens a panel
	JPanel scorepanel = new JPanel();
	JLabel l = new JLabel();				//Add a label
	JLabel lbottom = new JLabel();
	JLabel HighScore = new JLabel();
	JTextField name = new JTextField(5);			//Add a text box
	JButton[][] button = new JButton[3][4];			//adds 2D array of buttons
	JButton finish = new JButton();
	Icon Temp = new ImageIcon();				//temporary icon storage
	int x1, x2, y1, y2;					//integers for action listeners
	int locX, locY;						//integers for action listeners
	int score = 0;						//integer for currect score
	int highscore = 1000;
	
	public work()
	{
		GridLayout layout = new GridLayout(3,4);	//Makes grid layout to fit images
		panel.setLayout(layout);			//Sets the layout of panel to the grid			
		scorepanel.setLayout(null);			//Sets no default layout, therefore labels can be places via co-ordinates

		ImageIcon aa = new ImageIcon("bart0.jpg");	//Import selected image
		ImageIcon bb = new ImageIcon("bart1.jpg");	//Import selected image
		ImageIcon cc = new ImageIcon("bart2.jpg");	//Import selected image
		ImageIcon dd = new ImageIcon("bart3.jpg");	//Import selected image
		ImageIcon ee = new ImageIcon("bart4.jpg");	//Import selected image
		ImageIcon ff = new ImageIcon("bart5.jpg");	//Import selected image
		ImageIcon gg = new ImageIcon("bart6.jpg");	//Import selected image
		ImageIcon hh = new ImageIcon("bart7.jpg");	//Import selected image
		ImageIcon ii = new ImageIcon("bart8.jpg");	//Import selected image
		ImageIcon jj = new ImageIcon("bart9.jpg");	//Import selected image
		ImageIcon kk = new ImageIcon("bart10.jpg");	//Import selected image
		ImageIcon ll = new ImageIcon("bart11.jpg");	//Import selected image

		button[0][0] = new JButton(aa);			//Add button and icon to button
		button[0][1] = new JButton(bb);			//Add button and icon to button
		button[0][2] = new JButton(cc);			//Add button and icon to button
		button[0][3] = new JButton(dd);			//Add button and icon to button
		button[1][0] = new JButton(ee);			//Add button and icon to button
		button[1][1] = new JButton(ff);			//Add button and icon to button
		button[1][2] = new JButton(gg);			//Add button and icon to button
		button[1][3] = new JButton(hh);			//Add button and icon to button
		button[2][0] = new JButton(ii);			//Add button and icon to button
		button[2][1] = new JButton(jj);			//Add button and icon to button
		button[2][2] = new JButton(kk);			//Add button and icon to button
		button[2][3] = new JButton(ll);			//Add button and icon to button

		panel.add(button[0][0]);			//Add button to panel
		panel.add(button[0][1]);			//Add button to panel
		panel.add(button[0][2]);			//Add button to panel
		panel.add(button[0][3]);			//Add button to panel
		panel.add(button[1][0]);			//Add button to panel
		panel.add(button[1][1]);			//Add button to panel
		panel.add(button[1][2]);			//Add button to panel
		panel.add(button[1][3]);			//Add button to panel
		panel.add(button[2][0]);			//Add button to panel
		panel.add(button[2][1]);			//Add button to panel
		panel.add(button[2][2]);			//Add button to panel
		panel.add(button[2][3]);			//Add button to panel

		button[0][0].addActionListener(this);		//Add action listener to button
		button[0][1].addActionListener(this);		//Add action listener to button
		button[0][2].addActionListener(this);		//Add action listener to button
		button[0][3].addActionListener(this);		//Add action listener to button
		button[1][0].addActionListener(this);		//Add action listener to button
		button[1][1].addActionListener(this);		//Add action listener to button
		button[1][2].addActionListener(this);		//Add action listener to button
		button[1][3].addActionListener(this);		//Add action listener to button
		button[2][0].addActionListener(this);		//Add action listener to button
		button[2][1].addActionListener(this);		//Add action listener to button
		button[2][2].addActionListener(this);		//Add action listener to button
		button[2][3].addActionListener(this);		//Add action listener to button
		
		a.setVisible(true);				//Makes frame visible
		a.setTitle("Simpsons Puzzle!");			//Names the frame
		a.setSize(450,370);				//Set frame size (same as image)
		a.setContentPane(panel);	

		scorepanel.add(l);				//Add label to scorepanel
		scorepanel.add(name);				//Add text field to scorepanel
		scorepanel.add(lbottom);			//Add label to scoreboard
		scorepanel.add(HighScore);			//Add label to scoreboard
		scorepanel.add(finish);				//Add finish button

		scoreboard.setVisible(true);			//Makes frame visible
		scoreboard.setTitle("Scoreboard");		//Names the frame
		scoreboard.setSize(250,300);			//Set frame size
		scoreboard.setContentPane(scorepanel);		//Content panel is scorepanel
		scoreboard.setLocation(535,020);		//Set location of scoreboard

		l.setText("Score: " + score);			//Sets text to be score: value of score
		lbottom.setText("Name: ");			//Sets text to Name:
		HighScore.setText("HighScore: ");		//Set text to show HighScore

		l.setBounds(0,0,150,50);			//boundries of the label
		name.setBounds(100,200,100,20);			//boundries of the text field
		lbottom.setBounds(50,200,100,20);		//bounries of the name label
		HighScore.setBounds(0,0,200,100);		//Set boundries of HIghScore
		finish.setLocation(0,150);
		finish.setSize(100,20);
		finish.setText("Finished");
		finish.addActionListener(this);
		
		scoreboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Closes when red cross clicked
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//Closes when red cross clicked
	}

	public void actionPerformed(ActionEvent e)
	{
		ImageIcon clear = new ImageIcon("bart0.jpg");	//"clear" is now the blank image
		
		if(e.getSource() == button[0][0])		//If button is clicked
		{
			x1 = 0;					//Location of image clicked
			y1 = 0;					//Location of image clicked

			locX = x1 - x2;				
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0)) //Finds locations that are 1 up, down, left and right of the image clicked

			{
				Temp = button[x1][y1].getIcon();	//Stores image clicked in Temp
				button[x1][y1].setIcon(clear);		//Sets button clicked to clear
				button[x2][y2].setIcon(Temp);		//Swaps clear button with image
				score = score + 1;			//Adds one to the score
				x2 = 0;
				y2 = 0;
				l.setText("Score: " + String.valueOf(score)); //Sets label to be the currect score
			}
		}

		else if(e.getSource() == button[0][1])
		{
			x1 = 0;
			y1 = 1;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 0;
				y2 = 1;
				l.setText("Score: " + String.valueOf(score));
				
				}
		}	

		else if(e.getSource() == button[0][2])
		{
			x1 = 0;
			y1 = 2;

			locX = x1 - x2;
			locY = y1 - y2;
			
			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 0;
				y2 = 2;
				l.setText("Score: " + String.valueOf(score));
			}
		}
		
		else if(e.getSource() == button[0][3])
		{
			x1 = 0;
			y1 = 3;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 0;
				y2 = 3;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[1][0])
		{
			x1 = 1;
			y1 = 0;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 1;
				y2 = 0;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[1][1])
		{
			x1 = 1;
			y1 = 1;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 1;
				y2 = 1;
				l.setText("Score: " + String.valueOf(score));
			}
		}
		
		else if(e.getSource() == button[1][2])
		{
			x1 = 1;
			y1 = 2;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 1;
				y2 = 2;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[1][3])
		{
			x1 = 1;
			y1 = 3;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 1;
				y2 = 3;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[2][0])
		{
			x1 = 2;
			y1 = 0;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 2;
				y2 = 0;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[2][1])
		{
			x1 = 2;
			y1 = 1;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 2;
				y2 = 1;
				l.setText("Score: " + String.valueOf(score));
			}
		}
		
		else if(e.getSource() == button[2][2])
		{
			x1 = 2;
			y1 = 2;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 2;
				y2 = 2;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == button[2][3])
		{
			x1 = 2;
			y1 = 3;

			locX = x1 - x2;
			locY = y1 - y2;

			if((locX==0 && locY==1) || (locX==0 && locY==-1) || (locX==1 && locY==0) || (locX==-1 && locY==0))
			{
				Temp = button[x1][y1].getIcon();
				button[x1][y1].setIcon(clear);
				button[x2][y2].setIcon(Temp);
	
				score = score + 1;
				x2 = 2;
				y2 = 3;
				l.setText("Score: " + String.valueOf(score));
			}
		}

		else if(e.getSource() == finish && (score < highscore))
		{
			HighScore.setText("Highscore: " + String.valueOf(score));
			highscore = score;
			score = 0;
			l.setText("Score: " + String.valueOf(score));
		}	
	}
}
