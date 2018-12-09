import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ibm.twitter.Twitter;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import java.awt.ItemSelectable;

import static com.ibm.twitter.Twitter.*;


class myframe extends JPanel  {
	String a="";
	String b="";
	String c="";
	String d="";
	String e="";
	
	private static final long serialVersionUID = 0L;
	static JFrame mFrame;
	  JLabel result;
	  String currentPattern;
	  JTextField t1=null,t2=null,t3=null,t4=null,t5=null;
	  JButton b1,b2;
	  JLabel label;
		JComboBox cb;
		ItemSelectable is;
	public myframe() {
		setOpaque(false);
		setLayout(null);
	}
	
	public static void main(String[] args) {
		mFrame = new JFrame("Smack The Pet 1.0");
		
		
		myframe c = new myframe();
				
			mFrame.add(c);
				mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mFrame.setSize(600, 700);
				mFrame.setLocationRelativeTo(null);
				mFrame.setVisible(true);
		
		
		}
 
	public void paint(Graphics g) {
		
		
		Image bg = Toolkit.getDefaultToolkit().getImage("C:\\himanshu\\projectscala\\pc2.jpg");
		g.drawImage(bg,0,0,getSize().width,getSize().height,this);
		super.paint(g);
		
		label= new JLabel("No of Comparisons : ");
		label.setFont(new Font("Segoe Script", Font.BOLD, 30));
		  label.setBounds(160,175,350,50);
		add(label);
		
		String comp[]={"2","3","4","5"};        
		
	    cb = new JComboBox(comp);    
	    cb.setBounds(500,187,50,27);    
	    cb.setFont(new Font("Segoe Script", Font.BOLD, 14));
	    add(cb);        
	  
  	 
		//dd
		
		Color myColor = Color.decode("#3B3B6D");
		Color myColor1 = Color.decode("#F19CBB");
		
		b1 = new JButton("START COMPARISON");
		b1.setFont(new Font("Segoe Script", Font.BOLD, 30));
		b1.setForeground(myColor1);
		b1.setBackground(myColor);
		add(b1);
		b1.setBounds(100,525,400,35);
		
		b2 = new JButton("RESET");
		b2.setFont(new Font("Segoe Script", Font.BOLD, 30));
		b2.setForeground(myColor1);
		b2.setBackground(myColor);
		add(b2);
		b2.setBounds(100,575,400,35);
		
		ActionListener actionListener1 = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	  //if (actionEvent.getSource() == b1) {
		    	  if(selectedString(is) =="2")
		    	  {
		    	  if(t1.getText().equals(""))
		    	 {
		    		 a="ss";
		    	 }
		    	 else
		    	  a=t1.getText();
		    	  }
		    	  else {
		    	  if(t2.getText().equals(""))
		    	 {
		    		 b="dd";
		    	 } 
		    	 else
		    	 b=t2.getText();
		    	 if(t3.getText().equals(""))
		    	 {
		    		 c="ss";
		    	 } 
		    	 else
		    	 c=t3.getText(); 
		    	 if(t4.getText().equals(null))
		    	 {
		    		 d="ss";
		    	 } 
		    	 else
		    		 d=t4.getText(); 
		    	 if(t5.getText().equals(null))
		    	 {
		    		 e="ss";
		    	 } 
		    	 else
		    	e=t5.getText();}
		    		  	Twitter.main(a,b,c,d,e);
		    				  
		      }};
		    		   
		    		   ActionListener actionListener2 = new ActionListener() {
		    			      public void actionPerformed(ActionEvent actionEvent) {
		    			    	  //if (actionEvent.getSource() == b1) {
		    			    	//mFrame.removeAll();
		    			         // mFrame.repaint();
		    			    		System.exit(0);	
		    			    		   }};
		ActionListener actionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	  
		        //System.out.println("Command: " + actionEvent.getActionCommand());
		        is = (ItemSelectable)actionEvent.getSource();
		        //System.out.println(", Selected: " + selectedString(is));
		    	  
		    	  
		        if(selectedString(is) =="2")
		    	  {
		        	
		        	 t1 = new JTextField();
		     		add(t1);
		     		t1.setBounds(250,260,300,25);
		     		t2 = new JTextField();
		     		add(t2);
		     		t2.setBounds(250,305,300,25);  		
		     		  
		    	  }
		        else if(selectedString(is) =="3")
		    	  {
		        	
		        	 t1 = new JTextField();
		     		add(t1);
		     		t1.setBounds(250,260,300,25);
		     		t2 = new JTextField();
		     		add(t2);
		     		t2.setBounds(250,305,300,25);
		  		t3 = new JTextField();
		  		add(t3);
		  		t3.setBounds(250,350,300,25);
		  		 
		    	  }
		    	  
		    	  else if(selectedString(is) =="4")
		    	  {
		    		  t1 = new JTextField();
			     		add(t1);
			     		t1.setBounds(250,260,300,25);
			     		t2 = new JTextField();
			     		add(t2);
			     		t2.setBounds(250,305,300,25);
			  		t3 = new JTextField();
			  		add(t3);
			  		t3.setBounds(250,350,300,25);
			  		t4 = new JTextField();
			  		add(t4);
			  		t4.setBounds(250,395,300,25);
			  	    
		    	  }
		    	  
		    	  else if(selectedString(is) =="5")
		    	  {
		    		  t1 = new JTextField();
			     		add(t1);
			     		t1.setBounds(250,260,300,25);
			     		t2 = new JTextField();
			     		add(t2);
			     		t2.setBounds(250,305,300,25);
			  		t3 = new JTextField();
			  		add(t3);
			  		t3.setBounds(250,350,300,25);
			  		t4 = new JTextField();
			  		add(t4);
			  		t4.setBounds(250,395,300,25);
			  		t5 = new JTextField();
			  		add(t5);
			  		t5.setBounds(250,440,300,25);
			  	  }
		       
		    	  
		    	  
		      }
		    };
		    cb.addActionListener(actionListener);
		    b1.addActionListener(actionListener1);
		    b2.addActionListener(actionListener2);
		  }
		  static private String selectedString(ItemSelectable is) {
		    Object selected[] = is.getSelectedObjects();
		    return ((selected.length == 0) ? "null" : (String)selected[0]);
		  }  
		
		
		
	}
 

