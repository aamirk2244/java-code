// Event Handling
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class YCalculator implements ActionListener
{
	JFrame frameBorder;
	JPanel flowPanel, gridPanel;
	
	JTextField answer;
	JTextArea name;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bPlus, bMinus, bMul, bDivid, bPoint, bEqual;

	//constructor
	public YCalculator() 
	{
		initGUI();
	}

	// setting layout components
	public void initGUI ( ) 
	{
		frameBorder = new JFrame();
		flowPanel = new JPanel(new FlowLayout());
		gridPanel = new JPanel(new GridLayout(4,4));
		
		Container borderC = frameBorder.getContentPane();
		borderC.setLayout(new BorderLayout());
		
		//Creating event generator step-1 of our process
		b0 = new JButton("0");
		b1 = new JButton("1"); 
		b2 = new JButton("2"); 
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		bEqual = new JButton("=");
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMul = new JButton("*"); 
		bDivid = new JButton("/");
		bPoint = new JButton(".");
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bEqual.addActionListener(this);
		bPlus.addActionListener(this);
		bMinus.addActionListener(this);
		bMul.addActionListener(this);
		bDivid.addActionListener(this);
		bPoint.addActionListener(this);
		
		answer = new JTextField();
		answer.setPreferredSize(new Dimension(240,40));              
	    
		name = new JTextArea("My Calculator");
		
		borderC.add(flowPanel, BorderLayout.NORTH);
		flowPanel.add(answer);
		borderC.add(name, BorderLayout.SOUTH);
		borderC.add(gridPanel, BorderLayout.CENTER);

		gridPanel.add(b7);
		gridPanel.add(b8);
		gridPanel.add(b9);
		gridPanel.add(bDivid);

		gridPanel.add(b4);
		gridPanel.add(b5);
		gridPanel.add(b6);
		gridPanel.add(bMul);

		gridPanel.add(b1);
		gridPanel.add(b2);
		gridPanel.add(b3);
		gridPanel.add(bMinus);
		
		gridPanel.add(b0);
		gridPanel.add(bPoint);
		gridPanel.add(bEqual);
		gridPanel.add(bPlus);
		
		frameBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBorder.setSize(250, 250);
		frameBorder.setVisible(true);
		frameBorder.setResizable(false);
	}
	
	/* 	
	 * Override actionPerformed method of ActionListener’s interface method which will be called when event takes place 
	 */
	public void actionPerformed(ActionEvent event) 
	{
		boolean operatorMissing = true;
				
		if(answer.getText().contains("+") | answer.getText().contains("-") | 
				answer.getText().contains("*") | answer.getText().contains("/"))
		{
			operatorMissing = false;
		}
		
		if(event.getSource() == b0) 
		{
			answer.setText(answer.getText() + b0.getText());	
		}
		else if(event.getSource() == b1) 
		{
			answer.setText(answer.getText() + b1.getText());	
		}
		else if(event.getSource() == b2) 
		{
			answer.setText(answer.getText() + b2.getText());	
		}
		else if(event.getSource() == b3) 
		{
			answer.setText(answer.getText() + b3.getText());	
		}
		else if(event.getSource() == b4) 
		{
			answer.setText(answer.getText() + b4.getText());	
		}
		else if(event.getSource() == b5) 
		{
			answer.setText(answer.getText() + b5.getText());	
		}
		else if(event.getSource() == b6) 
		{
			answer.setText(answer.getText() + b6.getText());	
		}
		else if(event.getSource() == b7) 
		{
			answer.setText(answer.getText() + b7.getText());	
		}
		else if(event.getSource() == b8) 
		{
			answer.setText(answer.getText() + b8.getText());	
		}
		else if(event.getSource() == b9) 
		{
			answer.setText(answer.getText() + b9.getText());	
		}

		else if(event.getSource() == bPoint) 
		{
			answer.setText(answer.getText() + bPoint.getText());	
		}

		else if(event.getSource() == bPlus & operatorMissing) 
		{
			answer.setText(answer.getText() + bPlus.getText());	
		}

		else if(event.getSource() == bMinus & operatorMissing) 
		{
			answer.setText(answer.getText() + bMinus.getText());	
		}
		else if(event.getSource() == bMul & operatorMissing) 
		{
			answer.setText(answer.getText() + bMul.getText());	
		}
		else if(event.getSource() == bDivid & operatorMissing) 
		{
			answer.setText(answer.getText() + bDivid.getText());	
		}

		if(event.getSource() == bEqual) 
		{
			String ansStr = "";
			
			if(answer.getText().toString().indexOf('+') != -1)
			{
				String[] strArr = answer.getText().toString().split("\\+");
				double num1 = Double.parseDouble(strArr[0]);
				double num2 = Double.parseDouble(strArr[1]);
				answer.setText((num1 + num2) + "");
				//answer.setText(Double.toString(num1 + num2));
			}
			
			else if(answer.getText().toString().indexOf('-') != -1)
			{
				String[] strArr = answer.getText().toString().split("\\-");
				double num1 = Double.parseDouble(strArr[0]);
				double num2 = Double.parseDouble(strArr[1]);
				answer.setText((num1 - num2) + "");
				//answer.setText(Double.toString(num1 + num2));
			}
			
			else if(answer.getText().toString().indexOf('*') != -1)
			{
				String[] strArr = answer.getText().toString().split("\\*");
				double num1 = Double.parseDouble(strArr[0]);
				double num2 = Double.parseDouble(strArr[1]);
				answer.setText((num1 * num2) + "");
				//answer.setText(Double.toString(num1 + num2));
			}
			
			else if(answer.getText().toString().indexOf('/') != -1)
			{
				String[] strArr = answer.getText().toString().split("\\/");
				double num1 = Double.parseDouble(strArr[0]);
				double num2 = Double.parseDouble(strArr[1]);
				answer.setText((num1 / num2) + "");
				//answer.setText(Double.toString(num1 + num2));
			}
		}

	}

	public static void main(String args[]) 
	{
		YCalculator ae = new YCalculator();
	}
	
} // end class