
package game;

import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

                          //  ROOM DETAILS  - LINE_NO - 55            
                          //  ROOM BOOKING  - LINE_NO - 317
                         //   FOOD ORDER    - LINE_NO - 886
                         //       EXIT      - LINE_NO - 1458

public class restaurants  {

	
  	public static void main(String[] args) {  				 
  		
  		JFrame Hotel = new JFrame ("HOTEL MANAGEMENT SYSTEM"); 
  		Hotel.setLayout(new FlowLayout());
  		Hotel.setSize(1000,1000);
  		Hotel.setVisible(true);
  		Hotel.setLayout(null);
  		Hotel.setDefaultCloseOperation(Hotel.EXIT_ON_CLOSE); 
 		JLabel l=new JLabel((  "WELCOME TO OUR                                          " ),JLabel.CENTER);
  		l.setIcon(new ImageIcon( "Downloads\\sarrr.jpg"));
		l.setOpaque(true);
		l.setBackground(Color.white);
		l.setForeground(Color.RED);
		l.setFont(new Font("TimesNewRoman",Font.BOLD,50));
		l.setBounds(0,0,1400,150);
		Hotel.add(l);   
  	
  		JLabel l1=new JLabel(( "\" THE GRAND STAR HOTEL \"" ),JLabel.CENTER);
   
		l1.setOpaque(true);
		l1.setBackground(Color.white);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
			
	 	l1.setBounds( 0,150,1400,150);
		
		Hotel.add(l1);  
 
    	JButton b1 = new JButton("Room Details");
  		
  		b1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	b1.setBackground(Color.YELLOW);
    	b1.setForeground(Color.black);
    	b1.setBounds(300,400, 300, 50);
    	Hotel.add(b1);
		    
     	b1.addActionListener(new ActionListener() 
    	{
    	public void actionPerformed(ActionEvent e) 
    	{
    	
    		JFrame f4=new JFrame();
    
    		f4.setLayout(new FlowLayout());
    		f4.setSize(1000,1000);    		 
    		f4.setVisible(true);
    		f4.setLayout(null);
    		f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);
    	
    		JLabel l3=new JLabel(("Room Details"),JLabel.CENTER);
 
    		l3.setOpaque(true);
    		l3.setBackground(Color.white);
    		l3.setForeground(Color.RED);
    		l3.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    		l3.setBounds(0,0,1400,200);
    		f4.add(l3);
    		
    		
    		JButton b1=new JButton("Luxury Single Room");
    		b1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b1.setBackground(Color.WHITE);
    		b1.setForeground(Color.black);
    		b1.setBounds( 450, 250, 500, 50);
    		f4.add(b1);
    		
    		
    		JButton b2=new JButton("Luxury Double Room");
    		b2.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b2.setBackground(Color.WHITE);
    		b2.setForeground(Color.black);
    		b2.setBounds( 450, 350, 500, 50);
    		f4.add(b2);
    		
    		JButton b3=new JButton("Deluxe Single Room");
    		b3.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b3.setBackground(Color.WHITE);
    		b3.setForeground(Color.black);
    		b3.setBounds( 450, 450, 500, 50);
    		f4.add(b3);
    		
    		JButton b4=new JButton("Deluxe Double Room");
    		b4.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b4.setBackground(Color.WHITE);
    		b4.setForeground(Color.black);
    		b4.setBounds( 450, 550, 500, 50);
    		f4.add(b4);
    		
    	  
    		b1.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent e) 
    		{
    			JFrame f5=new JFrame();
         
        		f5.setLayout(new FlowLayout());
        		f5.setSize(1000,1000);
        		f5.setVisible(true);
        		f5.setLayout(null);
        		f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);
        		
        		JLabel l13=new JLabel(("Luxury Single Room"),JLabel.CENTER);
 
        	     l13.setOpaque(true);
        	     l13.setBackground(Color.white);
        	     l13.setForeground(Color.RED);
        	     l13.setFont(new Font("TimesNewRoman",Font.BOLD,50));
        	     l13.setBounds(0,0,1400,200);
        	     f5.add(l13); 		
        	
        		JLabel l3=new JLabel(("Number of Single bed - 1"),JLabel.CENTER);
        		l3.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l3.setBounds(350,260,700,50);
        		l3.setOpaque(true);
        		
        		JLabel l4=new JLabel(("AC - yes"),JLabel.CENTER);
        		l4.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l4.setBounds(240,350,700,50);
        		l4.setOpaque(true);
        		
        		JLabel l5=new JLabel(("Free Breakfast - yes"),JLabel.CENTER);
        		l5.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l5.setBounds(320,440,700,50);
        		l5.setOpaque(true);       	
        		
        		JLabel l6=new JLabel(("Charge Per Day - 4000 "),JLabel.CENTER);
        		l6.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l6.setBounds(330,540,700,50);
        		l6.setOpaque(true);
        		
         
        		f5.add(l3);
    	        f5.add(l4);
    	        f5.add(l5);
    	        f5.add(l6);
    	        
    		}});
    	        b2.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        			JFrame f6=new JFrame();
 
            		f6.setLayout(new FlowLayout());
            		f6.setSize(1000,1000);
            		f6.getContentPane().setBackground(Color.BLUE);
            		f6.setVisible(true);
            		f6.setLayout(null);
            		f6.setDefaultCloseOperation(f6.EXIT_ON_CLOSE);
            		
            		JLabel l14=new JLabel(("Luxury Double Room"),JLabel.CENTER);
 
           	     l14.setOpaque(true);
           	     l14.setBackground(Color.white);
           	     l14.setForeground(Color.RED);
           	     l14.setFont(new Font("TimesNewRoman",Font.BOLD,50));
           	     l14.setBounds(0,0,1400,200);
           	     f6.add(l14);
            	
            		JLabel l7=new JLabel(("Number of Double bed - 1"),JLabel.CENTER);
            		l7.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l7.setBounds(350,260,700,50);
            		l7.setOpaque(true);
            		
            		JLabel l8=new JLabel(("AC - yes"),JLabel.CENTER);
            		l8.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l8.setBounds(240,350,700,50);
            		l8.setOpaque(true);
            		
            		JLabel l9=new JLabel(("Free Breakfast - No"),JLabel.CENTER);
            		l9.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l9.setBounds(320,440,700,50);
            		l9.setOpaque(true);       	
            		
            		JLabel l10=new JLabel(("Charge Per Day - 6000 "),JLabel.CENTER);
            		l10.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l10.setBounds(330,540,700,50);
            		l10.setOpaque(true);
            		
             
            		f6.add(l7);
        	        f6.add(l8);
        	        f6.add(l9);
        	        f6.add(l10);
        		}});  
        	        
        	        b3.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
	            			JFrame f7=new JFrame();
	             
	                		f7.setLayout(new FlowLayout());
	                		f7.setSize(1000,1000);
	                		f7.getContentPane().setBackground(Color.BLUE);
	                		f7.setVisible(true);
	                		f7.setLayout(null);
	                		f7.setDefaultCloseOperation(f7.EXIT_ON_CLOSE);
	                		
	                		JLabel l15=new JLabel(("Deluxe Single Room"),JLabel.CENTER);
	             
	                  	     l15.setOpaque(true);
	                  	     l15.setBackground(Color.white);
	                  	     l15.setForeground(Color.RED);
	                  	     l15.setFont(new Font("TimesNewRoman",Font.BOLD,50));
	                  	     l15.setBounds(0,0,1400,200);
	                  	     f7.add(l15);
	                	
	                		JLabel l11=new JLabel(("Number of Single bed - 1"),JLabel.CENTER);
	                		l11.setFont(new Font("TimesNewRoman",Font.BOLD,30));
	                		l11.setBounds(350,260,700,50);
	                		l11.setOpaque(true);
	                		
	                		JLabel l12=new JLabel(("AC - yes"),JLabel.CENTER);
	                		l12.setFont(new Font("TimesNewRoman",Font.BOLD,30));
	                		l12.setBounds(240,350,700,50);
	                		l12.setOpaque(true);
                		
                		JLabel l13=new JLabel(("Free Breakfast - No"),JLabel.CENTER);
                		l13.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                		l13.setBounds(320,440,700,50);
                		l13.setOpaque(true);       	
                		
                		JLabel l14=new JLabel(("Charge Per Day - 1500 "),JLabel.CENTER);
                		l14.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                		l14.setBounds(330,540,700,50);
                		l14.setOpaque(true);
                		
                 
                		f7.add(l11);
            	        f7.add(l12);
            	        f7.add(l13);
            	        f7.add(l14);
            		}});  
            	        b4.addActionListener(new ActionListener() 
                		{
                		public void actionPerformed(ActionEvent e) 
                		{
                			JFrame f8=new JFrame();
 
                    		f8.setLayout(new FlowLayout());
                    		f8.setSize(1000,1000);
                    		f8.getContentPane().setBackground(Color.BLUE);
                    		f8.setVisible(true);
                    		f8.setLayout(null);
                    		f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);
                    		JLabel l19=new JLabel(("Deluxe Double Room"),JLabel.CENTER);
 
	                  	     l19.setOpaque(true);
	                  	     l19.setBackground(Color.white);
	                  	     l19.setForeground(Color.RED);
	                  	     l19.setFont(new Font("TimesNewRoman",Font.BOLD,50));
	                  	     l19.setBounds(0,0,1400,200);
	                  	     f8.add(l19);   		
                    	
                    		JLabel l15=new JLabel(("Number of Double bed - 1"),JLabel.CENTER);
                    		l15.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                    		l15.setBounds(350,260,700,50);
                    		l15.setOpaque(true);
                    		
                    		JLabel l16=new JLabel(("AC - yes"),JLabel.CENTER);
                    		l16.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                    		l16.setBounds(240,350,700,50);
                    		l16.setOpaque(true);
                    		
                    		JLabel l17=new JLabel(("Free Breakfast - Yes"),JLabel.CENTER);
                    		l17.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                    		l17.setBounds(320,440,700,50);
                    		l17.setOpaque(true);       	
                    		
                    		JLabel l18=new JLabel(("Charge Per Day - 2000 "),JLabel.CENTER);
                    		l18.setFont(new Font("TimesNewRoman",Font.BOLD,30));
                    		l18.setBounds(330,540,700,50);
                    		l18.setOpaque(true);
                    		
                     
                    		f8.add(l15);
                	        f8.add(l16);
                	        f8.add(l17);
                	        f8.add(l18);
                	             
    		}});
    	}});
     	
     	
     	
     	
     	
     	
	
    	JButton b2 = new JButton ("Room Booking");
 		b2.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	b2.setBackground(Color.YELLOW);
    	b2.setForeground(Color.black);
    	b2.setBounds(300, 550, 300, 50);
    	Hotel.add(b2);
     	
    	b2.addActionListener(new ActionListener() 
    	{
    	public void actionPerformed(ActionEvent e) 
    	{
    	
    		JFrame f9=new JFrame();
 
    		f9.setLayout(new FlowLayout());
    		f9.setSize(1000,1000);    		 
    		f9.setVisible(true);
    		f9.setLayout(null);
    		f9.setDefaultCloseOperation(f9.EXIT_ON_CLOSE);
    	
    		JLabel l19=new JLabel(("Room Booking"),JLabel.CENTER);
    
    		l19.setOpaque(true);
    		l19.setBackground(Color.white);
    		l19.setForeground(Color.RED);
    		l19.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    		l19.setBounds(0,0,1400,200);
    		f9.add(l19);
    		
    		
    		JButton b12=new JButton("Luxury Single Room");
    		b12.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b12.setBackground(Color.WHITE);
    		b12.setForeground(Color.black);
    		b12.setBounds( 450, 250, 500, 50);
    		f9.add(b12);
    		
    		
    		JButton b13=new JButton("Luxury Double Room");
    		b13.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b13.setBackground(Color.WHITE);
    		b13.setForeground(Color.black);
    		b13.setBounds( 450, 350, 500, 50);
    		f9.add(b13);
    		
    		JButton b14=new JButton("Deluxe Single Room");
    		b14.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b14.setBackground(Color.WHITE);
    		b14.setForeground(Color.black);
    		b14.setBounds( 450, 450, 500, 50);
    		f9.add(b14);
    		
    		JButton b15=new JButton("Deluxe Double Room");
    		b15.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b15.setBackground(Color.WHITE);
    		b15.setForeground(Color.black);
    		b15.setBounds( 450, 550, 500, 50);
    		f9.add(b15);
    		
    		b12.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent e) 
    		{
    			JFrame f5=new JFrame();
        		f5.setLayout(new FlowLayout());
        		f5.setSize(1000,1000);
        		f5.setVisible(true);
        		f5.setLayout(null);
        		f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);
        	
        		JLabel l20=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
        		l20.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l20.setBounds(240,200,700,50);
        		l20.setOpaque(true);
        		
        		
        		
        		JTextField t2=new JTextField();
    			t2.setBounds(800, 200, 100, 50);
    			t2.setVisible(true);
    			f5.add(t2);
        		
        		JLabel l21=new JLabel(("Enter Contact Number "),JLabel.CENTER);
        		l21.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l21.setBounds(240,300,700,50);
        		l21.setOpaque(true);
        		
        		JTextField t3=new JTextField();
    			t3.setBounds(800, 300, 100, 50);
    			t3.setVisible(true);
    			f5.add(t3);
        		
        		JLabel l22=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
        		l22.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l22.setBounds(240,400,700,50);
        		l22.setOpaque(true);       	
        		
        		
        		JTextField t4=new JTextField();
    			t4.setBounds(800, 400, 100, 50);
    			t4.setVisible(true);
    			f5.add(t4);
        		
        		JLabel l23=new JLabel(("Enter Your Address"),JLabel.CENTER);
        		l23.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		l23.setBounds(240,500,700,50);
        		l23.setOpaque(true);
        		
        		JTextField t5=new JTextField();
    			t5.setBounds(800, 500, 100, 50);
    			t5.setVisible(true);
    			f5.add(t5);
    			
    			JLabel l29=new JLabel(("CUSTOMER-1"),JLabel.CENTER);
        	    l29.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l29.setBackground(Color.white);
            	l29.setForeground(Color.RED);
        	    l29.setBounds(400,100,500,50);
        	    l29.setOpaque(true);
    			
    			JButton b16 = new JButton("CONFORM");   		    			
    			b16.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    			b16.setBackground(Color.YELLOW);
    			b16.setForeground(Color.black);
    			b16.setBounds(600, 620, 200, 50);
    			f5.add(b16);
    			
    			b16.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        		
        			JFrame f8=new JFrame();
        			f8.setLayout(new FlowLayout());
        			f8.setSize(1000,1000);
        			f8.setVisible(true);
        			f8.setLayout(null);
        			f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);	
        			
        			JLabel l1=new JLabel(("Your Room Booking Submitted Succesfully"),JLabel.CENTER);
        			l1.setOpaque(true);
        			l1.setBackground(Color.white);
        			l1.setForeground(Color.RED);
        			l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
        			l1.setBounds(0,0,1400,200);
        			f8.add(l1);
        		}});
        		f5.add(l20);
    	        f5.add(l21);
    	        f5.add(l22);
    	        f5.add(l23);
    	        f5.add(b16);  
    	        f5.add(l29);
     
    		}});
    			
        	
        			b13.addActionListener(new ActionListener() 
        			{
        			public void actionPerformed(ActionEvent e) 
        			{
       			JFrame f7=new JFrame();
        	    f7.setLayout(new FlowLayout());
        	    f7.setSize(1000,1000);
        	    f7.setVisible(true);
        	    f7.setLayout(null);
        	    f7.setDefaultCloseOperation(f7.EXIT_ON_CLOSE);
        	    
        	    
        	    	
        	    JLabel l20=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
        	    l20.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l20.setBounds(0,200,500,50);
        	    l20.setOpaque(true);
        	    		
        	    		
        	    JTextField t2=new JTextField();
        		t2.setBounds(500, 200, 100, 50);
        		t2.setVisible(true);
        		f7.add(t2);
        	    		
        	    JLabel l21=new JLabel(("Enter Contact Number "),JLabel.CENTER);
        	    l21.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l21.setBounds(0,300,500,50);
        	    l21.setOpaque(true);
        	    		
        	    JTextField t3=new JTextField();
        		t3.setBounds(500, 300, 100, 50);
        		t3.setVisible(true);
        		f7.add(t3);
        	    		
        	    JLabel l22=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
        	    l22.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l22.setBounds(0,400,500,50);
        	    l22.setOpaque(true);       	
        	    		
        	    		
        	    JTextField t4=new JTextField();
        		t4.setBounds(500, 400, 100, 50);
        		t4.setVisible(true);
        		f7.add(t4);
        	    		
        	    JLabel l23=new JLabel(("Enter Your Address"),JLabel.CENTER);
        	    l23.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l23.setBounds(0,500,500,50);
        	    l23.setOpaque(true);
        	    		
        	    JTextField t5=new JTextField();
        		t5.setBounds(500, 500, 100, 50);
        		t5.setVisible(true);
        		f7.add(t5);
        				
        	
        		 
        		JLabel l24=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
        	    l24.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l24.setBounds(680,200,500,50);
        	    l24.setOpaque(true);
        	    		
        	    		
        	    JTextField t6=new JTextField();
        		t6.setBounds(1180, 200, 100, 50);
        		t6.setVisible(true);
        		f7.add(t6);
        	    		
        	    JLabel l25=new JLabel(("Enter Contact Number "),JLabel.CENTER);
        	    l25.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l25.setBounds(680,300,500,50);
        	    l25.setOpaque(true);
        	    		
        	    JTextField t7=new JTextField();
        		t7.setBounds(1180, 300, 100, 50);
        		t7.setVisible(true);
        		f7.add(t7);
        	    		
        	    JLabel l26=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
        	    l26.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l26.setBounds(680,400,500,50);
        	    l26.setOpaque(true);       	
        	    		
        	    		
        	    JTextField t8=new JTextField();
        		t8.setBounds(1180, 400, 100, 50);
        		t8.setVisible(true);
        		f7.add(t8);
        	    		
        	    JLabel l27=new JLabel(("Enter Your Address"),JLabel.CENTER);
        	    l27.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l27.setBounds(680,500,500,50);
        	    l27.setOpaque(true); 
        	    
        	    JTextField t9=new JTextField();
        		t9.setBounds(1180, 500, 100, 50);
        		t9.setVisible(true);
        		f7.add(t9);
        	    
        		JButton b12 = new JButton("CONFORM");   		    			
        		b12.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        		
        		b12.setBackground(Color.YELLOW);
        		b12.setForeground(Color.black);
        		b12.setBounds(600, 620, 200, 50);
        		
        		JLabel l28=new JLabel(("CUSTOMER-1"),JLabel.CENTER);
        	    l28.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l28.setBackground(Color.white);
            	l28.setForeground(Color.RED);
        	    l28.setBounds(60,100,500,50);
        	    l28.setOpaque(true);	
        		
        	    JLabel l29=new JLabel(("CUSTOMER-2"),JLabel.CENTER);
        	    l29.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        	    l29.setBackground(Color.white);
            	l29.setForeground(Color.RED);
        	    l29.setBounds(740,100,500,50);
        	    l29.setOpaque(true);
        	           	    
        	    f7.add(l20);
        		f7.add(l21);
        		f7.add(l22);
        		f7.add(l23);
        		 
        		f7.add(l24);
        		f7.add(l25);
        		f7.add(l26);
        		f7.add(l27);
        		f7.add(l28);
        		f7.add(l29);
        		f7.add(b12);	
        		
        		b12.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        		
        			JFrame f7=new JFrame();
        			f7.setLayout(new FlowLayout());
        			f7.setSize(1000,1000);
        			f7.setVisible(true);
        			f7.setLayout(null);
        			f7.setDefaultCloseOperation(f7.EXIT_ON_CLOSE);	
        			
        			JLabel l1=new JLabel(("Your Room Booking Succesfully Submitted"),JLabel.CENTER);
        			l1.setOpaque(true);
        			l1.setBackground(Color.white);
        			l1.setForeground(Color.RED);
        			l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
        			l1.setBounds(0,0,1400,200);
        			f7.add(l1);
        		}});
        		
        			}});
        		b14.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        			JFrame f9=new JFrame();
            		f9.setLayout(new FlowLayout());
            		f9.setSize(1000,1000);
            		f9.setVisible(true);
            		f9.setLayout(null);
            		f9.setDefaultCloseOperation(f9.EXIT_ON_CLOSE);
            	
            		JLabel l30=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
            		l30.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l30.setBounds(240,200,700,50);
            		l30.setOpaque(true);
            		
            		
            		JTextField t2=new JTextField();
        			t2.setBounds(800, 200, 100, 50);
        			t2.setVisible(true);
        			f9.add(t2);
            		
            		JLabel l31=new JLabel(("Enter Contact Number "),JLabel.CENTER);
            		l31.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l31.setBounds(240,300,700,50);
            		l31.setOpaque(true);
            		
            		JTextField t3=new JTextField();
        			t3.setBounds(800, 300, 100, 50);
        			t3.setVisible(true);
        			f9.add(t3);
            		
            		JLabel l32=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
            		l32.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l32.setBounds(240,400,700,50);
            		l32.setOpaque(true);       	
            		
            		
            		JTextField t4=new JTextField();
        			t4.setBounds(800, 400, 100, 50);
        			t4.setVisible(true);
        			f9.add(t4);
            		
            		JLabel l33=new JLabel(("Enter Your Address"),JLabel.CENTER);
            		l33.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            		l33.setBounds(240,500,700,50);
            		l33.setOpaque(true);
            		
            		JTextField t5=new JTextField();
        			t5.setBounds(800, 500, 100, 50);
        			t5.setVisible(true);
        			f9.add(t5);
        			
        			JLabel l34=new JLabel(("CUSTOMER-1"),JLabel.CENTER);
            	    l34.setFont(new Font("TimesNewRoman",Font.BOLD,30));
            	    l34.setBackground(Color.white);
                	l34.setForeground(Color.RED);
            	    l34.setBounds(400,100,500,50);
            	    l34.setOpaque(true);
        			
        			JButton b16 = new JButton("CONFORM");   		    			
        			b16.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        			b16.setBackground(Color.YELLOW);
        			b16.setForeground(Color.black);
        			b16.setBounds(600, 620, 200, 50);
        			f9.add(b16);
        			b16.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            			JFrame f8=new JFrame();
            			f8.setLayout(new FlowLayout());
            			f8.setSize(1000,1000);
            			f8.getContentPane().setBackground(Color.BLUE);
            			f8.setVisible(true);
            			f8.setLayout(null);
            			f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);	
            			
            			JLabel l1=new JLabel(("Your Room Booking Submitted Succesfully"),JLabel.CENTER);
            			l1.setOpaque(true);
            			l1.setBackground(Color.white);
            			l1.setForeground(Color.RED);
            			l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            			l1.setBounds(0,0,1400,200);
            			f8.add(l1);
            		}});	
        			f9.add(l30);
            		f9.add(l31);
            		f9.add(l32);
            		f9.add(l33);
            		f9.add(l34);
        		
        			}});    
    	        
        		b15.addActionListener(new ActionListener() 
    			{
    			public void actionPerformed(ActionEvent e) 
    			{
   			JFrame f11=new JFrame();
    	    f11.setLayout(new FlowLayout());
    	    f11.setSize(1000,1000);   	     
    	    f11.setVisible(true);
    	    f11.setLayout(null);
    	    f11.setDefaultCloseOperation(f11.EXIT_ON_CLOSE);
    	    
    	    
    	    	
    	    JLabel l35=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
    	    l35.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l35.setBounds(0,200,500,50);
    	    l35.setOpaque(true);
    	    		
    	    		
    	    JTextField t2=new JTextField();
    		t2.setBounds(500, 200, 100, 50);
    		t2.setVisible(true);
    		f11.add(t2);
    	    		
    	    JLabel l36=new JLabel(("Enter Contact Number "),JLabel.CENTER);
    	    l36.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l36.setBounds(0,300,500,50);
    	    l36.setOpaque(true);
    	    		
    	    JTextField t3=new JTextField();
    		t3.setBounds(500, 300, 100, 50);
    		t3.setVisible(true);
    		f11.add(t3);
    	    		
    	    JLabel l37=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
    	    l37.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l37.setBounds(0,400,500,50);
    	    l37.setOpaque(true);       	
    	    		
    	    		
    	    JTextField t4=new JTextField();
    		t4.setBounds(500, 400, 100, 50);
    		t4.setVisible(true);
    		f11.add(t4);
    	    		
    	    JLabel l38=new JLabel(("Enter Your Address"),JLabel.CENTER);
    	    l38.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l38.setBounds(0,500,500,50);
    	    l38.setOpaque(true);
    	    		
    	    JTextField t5=new JTextField();
    		t5.setBounds(500, 500, 100, 50);
    		t5.setVisible(true);
    		f11.add(t5);
    				
    	
    		 
    		JLabel l39=new JLabel(("Enter The Customer Name "),JLabel.CENTER);
    	    l39.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l39.setBounds(680,200,500,50);
    	    l39.setOpaque(true);
    	    		
    	    		
    	    JTextField t6=new JTextField();
    		t6.setBounds(1180, 200, 100, 50);
    		t6.setVisible(true);
    		f11.add(t6);
    	    		
    	    JLabel l40=new JLabel(("Enter Contact Number "),JLabel.CENTER);
    	    l40.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l40.setBounds(680,300,500,50);
    	    l40.setOpaque(true);
    	    		
    	    JTextField t7=new JTextField();
    		t7.setBounds(1180, 300, 100, 50);
    		t7.setVisible(true);
    		f11.add(t7);
    	    		
    	    JLabel l41=new JLabel(("Enter Your Aadhar Number"),JLabel.CENTER);
    	    l41.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l41.setBounds(680,400,500,50);
    	    l41.setOpaque(true);       	
    	    		
    	    		
    	    JTextField t8=new JTextField();
    		t8.setBounds(1180, 400, 100, 50);
    		t8.setVisible(true);
    		f11.add(t8);
    	    		
    	    JLabel l42=new JLabel(("Enter Your Address"),JLabel.CENTER);
    	    l42.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l42.setBounds(680,500,500,50);
    	    l42.setOpaque(true); 
    	    
    	    JTextField t9=new JTextField();
    		t9.setBounds(1180, 500, 100, 50);
    		t9.setVisible(true);
    		f11.add(t9);
    	    
    		JButton b13 = new JButton("CONFORM");   		    			
    		b13.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		
    		b13.setBackground(Color.YELLOW);
    		b13.setForeground(Color.black);
    		b13.setBounds(600, 620, 200, 50);
    		
    		JLabel l43=new JLabel(("CUSTOMER-1"),JLabel.CENTER);
    	    l43.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l43.setBackground(Color.white);
        	l43.setForeground(Color.RED);
    	    l43.setBounds(60,100,500,50);
    	    l43.setOpaque(true);	
    		
    	    JLabel l44=new JLabel(("CUSTOMER-2"),JLabel.CENTER);
    	    l44.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	    l44.setBackground(Color.white);
        	l44.setForeground(Color.RED);
    	    l44.setBounds(740,100,500,50);
    	    l44.setOpaque(true);
    	    
    	    b13.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent e) 
    		{
    		
    			JFrame f8=new JFrame();
    			f8.setLayout(new FlowLayout());
    			f8.setSize(1000,1000);
    			f8.getContentPane().setBackground(Color.BLUE);
    			f8.setVisible(true);
    			f8.setLayout(null);
    			f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);	
    			
    			JLabel l1=new JLabel(("Your Room Booking Submitted Succesfully"),JLabel.CENTER);
    			l1.setOpaque(true);
    			l1.setBackground(Color.white);
    			l1.setForeground(Color.RED);
    			l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    			l1.setBounds(0,0,1400,200);
    			f8.add(l1);
    		}});	    
    	    f11.add(l35);
    		f11.add(l36);
    		f11.add(l37);
    		f11.add(l38);
    		 
    		f11.add(l39);
    		f11.add(l40);
    		f11.add(l41);
    		f11.add(l42);
    		
    		f11.add(l43);
    		f11.add(l44);
    		f11.add(b13);	
    		
    		}});
    	        
    	}});
     	
    	
    	
     	
  		JButton b3 = new JButton("Order Food");
  		 
  		b3.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	b3.setBackground(Color.YELLOW);
    	b3.setForeground(Color.black);
    	b3.setBounds(800, 400, 300, 50);
    	Hotel.add(b3);
    	
    	b3.addActionListener(new ActionListener() 
    	{
    	public void actionPerformed(ActionEvent e) 
    	{
    	    
    		JFrame f1=new JFrame();
    		f1.setLayout(new FlowLayout());
    		f1.setSize(1000,1000);
    		f1.setVisible(true);
    		f1.setLayout(null);
    		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    	
    		JLabel l1=new JLabel(("ITEMS (BIRYANI SPECIAL)"),JLabel.CENTER);
    		l1.setOpaque(true);
    		l1.setBackground(Color.white);
    		l1.setForeground(Color .RED);
    		l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    		l1.setBounds(0,0,1400,200);
    		f1.add(l1);
    		
    		JButton b1=new JButton("Ambur chicken biryani - 250");
    		b1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b1.setBackground(Color.WHITE);
    		b1.setForeground(Color.black);
    		b1.setBounds( 100, 250, 500, 50);
    		f1.add(b1);
    		
    		JButton b2=new JButton("Hyderabad chicken biryani - 300");
    		b2.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b2.setBackground(Color.WHITE);
    		b2.setForeground(Color.black);
    		b2.setBounds( 100, 350, 500, 50);
    		f1.add(b2);
    		
    		JButton b3=new JButton("Vegtable biryani - 170");
    		b3.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b3.setBackground(Color.WHITE);
    		b3.setForeground(Color.black);
    		b3.setBounds( 100, 450, 500, 50);
    		f1.add(b3);
    		
    		JButton b4=new JButton("Egg roast biryani - 200");
    		b4.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b4.setBackground(Color.WHITE);
    		b4.setForeground(Color.black);
    		b4.setBounds( 100, 550, 500, 50);
    		f1.add(b4);		
    		
    		 	
    		
    		JButton b5=new JButton("Paneer dum biryani - 210");
    		b5.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b5.setBackground(Color.WHITE);
    		b5.setForeground(Color.black);
    		b5.setBounds( 750, 250, 530, 50);
    		f1.add(b5);	
    		
    		JButton b6=new JButton("Chettinad chicken biryani - 280");
    		b6.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b6.setBackground(Color.WHITE);
    		b6.setForeground(Color.black);
    		b6.setBounds( 750, 350, 530, 50);
    		f1.add(b6);	
    		
    		JButton b7=new JButton("Hyderbad mutton biryani - 320");
    		b7.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b7.setBackground(Color.WHITE);
    		b7.setForeground(Color.black);
    		b7.setBounds( 750, 450, 530, 50);
    		f1.add(b7);
    		
       		JButton b8=new JButton("Mashroom biryani - 240");
    		b8.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    		b8.setBackground(Color.WHITE);
    		b8.setForeground(Color.black);
    		b8.setBounds( 750, 550, 530, 50);
    		f1.add(b8);
    		
    		 
    		
    		
    		b1.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent e) 
    		{
    		
    			JFrame f2=new JFrame();
    			f2.setLayout(new FlowLayout());
    			f2.setSize(1000,1000);
    			f2.setVisible(true);
    			f2.setLayout(null);
    			f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);	
    			
    			JLabel l1=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
    			l1.setOpaque(true);
    			l1.setBackground(Color.white);
    			l1.setForeground(Color.RED);
    			l1.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    			l1.setBounds(0,0,1400,200);
    			f2.add(l1);
    			
    			JTextField t10=new JTextField();
    			t10.setBounds(650, 270, 100, 50);
    			t10.setVisible(true);
    			f2.add(t10);
    						
    			JButton b11=new JButton("OK");
    			b11.setFont(new Font("TimesNewRoman",Font.BOLD,20));
    			b11.setBackground(Color.YELLOW);
    			b11.setForeground(Color.black);
    			b11.setBounds(665, 370, 70, 40);
    			f2.add(b11);	
    			
              
    			
    			b11.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        			String item= t10.getText();
        			int   quentity=Integer.parseInt(item);
        			if(quentity>0  )
        			{
    			
        			JFrame f3=new JFrame();
        			f3.setLayout(new FlowLayout());
        			f3.setSize(1000,1000);
        			f3.setVisible(true);
        			f3.setLayout(null);
        			f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);	
        				
        			JLabel l2=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
        			l2.setOpaque(true);
        			l2.setBackground(Color.white);
        			l2.setForeground(Color.RED);
        			l2.setFont(new Font("TimesNewRoman",Font.BOLD,50));
        			l2.setBounds(0,0,1400,200);
        			f3.add(l2);
        			}  		}});		
    		}});	
        	
        			b2.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            			JFrame f3=new JFrame();
            			f3.setLayout(new FlowLayout());
            			f3.setSize(1000,1000);
            			f3.setVisible(true);
            			f3.setLayout(null);
            			f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);	
            			
            			JLabel l2=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            			l2.setOpaque(true);
            			l2.setBackground(Color.white);
            			l2.setForeground(Color.RED);
            			l2.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            			l2.setBounds(0,0,1400,200);
            			f3.add(l2);
            			
            			JTextField t11=new JTextField();
            			t11.setBounds(650, 270, 100, 50);
            			t11.setVisible(true);
            			f3.add(t11);
            						
            			JButton b12=new JButton("OK");
            			b12.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            			b12.setBackground(Color.YELLOW);
            			b12.setForeground(Color.black);
            			b12.setBounds(665, 370, 70, 40);
            			f3.add(b12);
        			
            			b12.addActionListener(new ActionListener() 
                		{
                		public void actionPerformed(ActionEvent e) 
                		{
                			String item= t11.getText();
                			int   quentity=Integer.parseInt(item);
                			if(quentity>0 )
                			{
            			
                			JFrame f4=new JFrame();
                			f4.setLayout(new FlowLayout());
                			f4.setSize(1000,1000);
                			f4.setVisible(true);
                			f4.setLayout(null);
                			f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);	
                				
                			JLabel l3=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
                			l3.setOpaque(true);
                			l3.setBackground(Color.white);
                			l3.setForeground(Color.RED);
                			l3.setFont(new Font("TimesNewRoman",Font.BOLD,50));
                			l3.setBounds(0,0,1400,200);
                			f4.add(l3);
                			}}});
            			   		}});
        			
        			b3.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            JFrame f5=new JFrame();
            f5.setLayout(new FlowLayout());
            f5.setSize(1000,1000);
            f5.setVisible(true);
            f5.setLayout(null);
            f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);	
            			
            JLabel l3=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            l3.setOpaque(true);
            l3.setBackground(Color.white);
            l3.setForeground(Color.RED);
            l3.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            l3.setBounds(0,0,1400,200);
            f5.add(l3);
            			
            JTextField t12=new JTextField();
            t12.setBounds(650, 270, 100, 50);
            t12.setVisible(true);
            f5.add(t12);
            						
            JButton b13=new JButton("OK");
            b13.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            b13.setBackground(Color.YELLOW);
            b13.setForeground(Color.black);
            b13.setBounds(665, 370, 70, 40);
            f5.add(b13);
        			
            b13.addActionListener(new ActionListener() 
               {
            public void actionPerformed(ActionEvent e) 
                {
            	String item= t12.getText();
    			int   quentity=Integer.parseInt(item);
    			if(quentity>0  )
    			{ 			
             JFrame f6=new JFrame();
             f6.setLayout(new FlowLayout());
             f6.setSize(1000,1000);
             f6.setVisible(true);
             f6.setLayout(null);
             f6.setDefaultCloseOperation(f6.EXIT_ON_CLOSE);	
                				
             JLabel l4=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
             l4.setOpaque(true);
             l4.setBackground(Color.white);
             l4.setForeground(Color.RED);
             l4.setFont(new Font("TimesNewRoman",Font.BOLD,50));
             l4.setBounds(0,0,1400,200);
             f6.add(l4);
             
    			}}});
            			
    }});		
     
        			b4.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            JFrame f7=new JFrame();
            f7.setLayout(new FlowLayout());
            f7.setSize(1000,1000);
            f7.setVisible(true);
            f7.setLayout(null);
            f7.setDefaultCloseOperation(f7.EXIT_ON_CLOSE);	
            			
            JLabel l5=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            l5.setOpaque(true);
            l5.setBackground(Color.white);
            l5.setForeground(Color.RED);
            l5.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            l5.setBounds(0,0,1400,200);
            f7.add(l5);
            			
            JTextField t13=new JTextField();
            t13.setBounds(650, 270, 100, 50);
            t13.setVisible(true);
            f7.add(t13);
            						
            JButton b14=new JButton("OK");
            b14.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            b14.setBackground(Color.YELLOW);
            b14.setForeground(Color.black);
            b14.setBounds(665, 370, 70, 40);
            f7.add(b14);
        			
            b14.addActionListener(new ActionListener() 
               {
            public void actionPerformed(ActionEvent e) 
                {
            	String item= t13.getText();
    			int   quentity=Integer.parseInt(item);
    			if(quentity>0  )
    			{ 
            			
             JFrame f8=new JFrame();
             f8.setLayout(new FlowLayout());
             f8.setSize(1000,1000);
             f8.setVisible(true);
             f8.setLayout(null);
             f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);	
                				
             JLabel l6=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
             l6.setOpaque(true);
             l6.setBackground(Color.white);
             l6.setForeground(Color.RED);
             l6.setFont(new Font("TimesNewRoman",Font.BOLD,50));
             l6.setBounds(0,0,1400,200);
             f8.add(l6);
             
    			} }});
            			
    }});    			
        			
    
        			b5.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            JFrame f9=new JFrame();
            f9.setLayout(new FlowLayout());
            f9.setSize(1000,1000);
            f9.setVisible(true);
            f9.setLayout(null);
            f9.setDefaultCloseOperation(f9.EXIT_ON_CLOSE);	
            			
            JLabel l7=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            l7.setOpaque(true);
            l7.setBackground(Color.white);
            l7.setForeground(Color.RED);
            l7.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            l7.setBounds(0,0,1400,200);
            f9.add(l7);
            			
            JTextField t14=new JTextField();
            t14.setBounds(650, 270, 100, 50);
            t14.setVisible(true);
            f9.add(t14);
            						
            JButton b15=new JButton("OK");
            b15.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            b15.setBackground(Color.YELLOW);
            b15.setForeground(Color.black);
            b15.setBounds(665, 370, 70, 40);
            f9.add(b15);
        			
            b15.addActionListener(new ActionListener() 
               {
            public void actionPerformed(ActionEvent e) 
                {
            	String item= t14.getText();
    			int   quentity=Integer.parseInt(item);
    			if(quentity>0  )
    			{ 
            			
             JFrame f10=new JFrame();
             f10.setLayout(new FlowLayout());
             f10.setSize(1000,1000);
             f10.setVisible(true);
             f10.setLayout(null);
             f10.setDefaultCloseOperation(f10.EXIT_ON_CLOSE);	
                				
             JLabel l8=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
             l8.setOpaque(true);
             l8.setBackground(Color.white);
             l8.setForeground(Color .RED);
             l8.setFont(new Font("TimesNewRoman",Font.BOLD,50));
             l8.setBounds(0,0,1400,200);
             f10.add(l8);
             
    			} }});
            			
    }});
        			
        			b6.addActionListener(new ActionListener() 
            		{
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            JFrame f11=new JFrame();
            f11.setLayout(new FlowLayout());
            f11.setSize(1000,1000);
            f11.setVisible(true);
            f11.setLayout(null);
            f11.setDefaultCloseOperation(f11.EXIT_ON_CLOSE);	
            			
            JLabel l9=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            l9.setOpaque(true);
            l9.setBackground(Color.white);
            l9.setForeground(Color.RED);
            l9.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            l9.setBounds(0,0,1400,200);
            f11.add(l9);
            			
            JTextField t15=new JTextField();
            t15.setBounds(650, 270, 100, 50);
            t15.setVisible(true);
            f11.add(t15);
            						
            JButton b16=new JButton("OK");
            b16.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            b16.setBackground(Color.YELLOW);
            b16.setForeground(Color.black);
            b16.setBounds(665, 370, 70, 40);
            f11.add(b16);
        			
            b16.addActionListener(new ActionListener() 
               {
            public void actionPerformed(ActionEvent e) 
                {
            	
            	String item= t15.getText();
    			int   quentity=Integer.parseInt(item);
    			if(quentity>0  )
    				
    			{ 
             JFrame f12=new JFrame();
             f12.setLayout(new FlowLayout());
             f12.setSize(1000,1000);
             f12.setVisible(true);
             f12.setLayout(null);
             f12.setDefaultCloseOperation(f12.EXIT_ON_CLOSE);	
                				
             JLabel l10=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER); 
             l10.setOpaque(true);
             l10.setBackground(Color.white);
             l10.setForeground(Color.RED);
             l10.setFont(new Font("TimesNewRoman",Font.BOLD,50));
             l10.setBounds(0,0,1400,200);
             f12.add(l10);
             
    			}}});
            			
    }});    
        			
           			b7.addActionListener(new ActionListener() 
           					{		
            		public void actionPerformed(ActionEvent e) 
            		{
            		
            JFrame f13=new JFrame();
            f13.setLayout(new FlowLayout());
            f13.setSize(1000,1000);
            f13.setVisible(true);
            f13.setLayout(null);
            f13.setDefaultCloseOperation(f13.EXIT_ON_CLOSE);	       			
            JLabel l10=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
            l10.setOpaque(true);
            l10.setBackground(Color.white);
            l10.setForeground(Color.RED);
            l10.setFont(new Font("TimesNewRoman",Font.BOLD,50));
            l10.setBounds(0,0,1400,200);
            f13.add(l10);
            			
            JTextField t16=new JTextField();
            t16.setBounds(650, 270, 100, 50);
            t16.setVisible(true);
            f13.add(t16);
            						
            JButton b17=new JButton("OK");
            b17.setFont(new Font("TimesNewRoman",Font.BOLD,20));
            b17.setBackground(Color.YELLOW);
            b17.setForeground(Color.black);
            b17.setBounds(665, 370, 70, 40);
            f13.add(b17);
        			
            b17.addActionListener(new ActionListener() 
               {
            public void actionPerformed(ActionEvent e) 
                {
            	String item= t16.getText();
    			int   quentity=Integer.parseInt(item);
    			if( quentity>0 )
    			{ 
             JFrame f14=new JFrame();
  
             f14.setLayout(new FlowLayout());
             f14.setSize(1000,1000);
             f14.setVisible(true);
             f14.setLayout(null);
             f14.setDefaultCloseOperation(f14.EXIT_ON_CLOSE);	                				
             JLabel l11=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
             l11.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Logo.jpg"));
             l11.setOpaque(true);
             l11.setBackground(Color.white);
             l11.setForeground(Color.RED);
             l11.setFont(new Font("TimesNewRoman",Font.BOLD,50));
             l11.setBounds(0,0,1400,200);
             f14.add(l11);
             
    			}  }});
            			
    }});   			
        			
        			b8.addActionListener(new ActionListener() 
   					{		
    		public void actionPerformed(ActionEvent e) 
    		{
    		
    JFrame f15=new JFrame();
    f15.setLayout(new FlowLayout());
    f15.setSize(1000,1000);
    f15.setVisible(true);
    f15.setLayout(null);
    f15.setDefaultCloseOperation(f15.EXIT_ON_CLOSE);	    			
    JLabel l12=new JLabel(("Please Enter Quentity"),JLabel.CENTER);
 
    l12.setOpaque(true);
    l12.setBackground(Color.white);
    l12.setForeground(Color.RED);
    l12.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    l12.setBounds(0,0,1400,200);
    f15.add(l12);
    			
    JTextField t17=new JTextField();
    t17.setBounds(650, 270, 100, 50); 
    t17.setVisible(true);
    f15.add(t17);
    						
    JButton b18=new JButton("OK");
    b18.setFont(new Font("TimesNewRoman",Font.BOLD,20));
    b18.setBackground(Color.YELLOW);
    b18.setForeground(Color.black);
    b18.setBounds(665, 370, 70, 40);
    f15.add(b18);
			
    b18.addActionListener(new ActionListener() 
       {
    public void actionPerformed(ActionEvent e) 
        {
    	String item= t17.getText();
		int   quentity=Integer.parseInt(item);
		if( quentity>0 )
		{
     JFrame f16=new JFrame();
     f16.setLayout(new FlowLayout());
     f16.setSize(1000,1000);  
     f16.setVisible(true);
     f16.setLayout(null);
     f16.setDefaultCloseOperation(f16.EXIT_ON_CLOSE);	
        				
     JLabel l13=new JLabel(("Your Order Succesfully Submitted"),JLabel.CENTER);
 
     l13.setOpaque(true);
     l13.setBackground(Color.white);
     l13.setForeground(Color.RED);
     l13.setFont(new Font("TimesNewRoman",Font.BOLD,50));
     l13.setBounds(0,0,1400,200);
     f16.add(l13);
     
    }}});
    			
   }});     			
        			
    	}});
    	
      
	
     
     JButton b4= new JButton("Exit");
  		
  		b4.setFont(new Font("TimesNewRoman",Font.BOLD,30));
    	b4.setBackground(Color.YELLOW);
    	b4.setForeground(Color.black);
    	b4.setBounds(800, 550, 300, 50);
    	Hotel.add(b4);     	
    	
    	b4.addActionListener(new ActionListener() 
    	{
    	public void actionPerformed(ActionEvent e) 
    	{
    	    
    		JFrame f4=new JFrame();
    		f4.setLayout(new FlowLayout()); 
    		f4.setSize(1000,1000);
 
    		f4.setVisible(true);
    		f4.setLayout(null);
    		f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);
    	
    		JLabel l4=new JLabel(("Thank  you !" ),JLabel.CENTER);
    		l4.setOpaque(true);
    		l4.setBackground(Color.white);
    		l4.setForeground(Color .RED);
    		l4.setFont(new Font("TimesNewRoman",Font.BOLD,50));
    		l4.setBounds(0,0,1400,200);
    		f4.add(l4);
    	
    	}});  
		    }   }

  	










