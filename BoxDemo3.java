import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class BoxDemo3 extends JFrame
{
   BoxDemo3()
   {
      addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
	});


     JLabel l1=new JLabel("Directory name:");
     JTextField t1=new JTextField(20);
     t1.setMaximumSize(t1.getPreferredSize());
     
     Box horiz1=Box.createHorizontalBox();
     horiz1.add(l1);
     horiz1.add(Box.createHorizontalStrut(20));
     horiz1.add(t1);
     
     JLabel l2=new JLabel("Destination File Name:");
     JTextField t2=new JTextField(20);
     t2.setMaximumSize(t2.getPreferredSize());
      Box horiz2=Box.createHorizontalBox();
     horiz2.add(l2);
     horiz2.add(Box.createHorizontalStrut(20));
     horiz2.add(t2);
           
      JButton b1=new JButton("SUBMIT");
      JButton b2=new JButton("PREVIOUS");

 

    Box horiz3=Box.createHorizontalBox();
     horiz3.add(b1);
   // horiz3.add(Box.createHorizontalGlue());
     horiz3.add(b2);
             

     Box vert=Box.createVerticalBox();
     vert.add(horiz1);
     vert.add(Box.createVerticalStrut(100));
     vert.add(horiz2);
      vert.add(Box.createVerticalStrut(100));
      vert.add(horiz3);
    
     

    Container c= getContentPane();
    c.add(vert);
   }
   public static void main(String args[])
    {
       BoxDemo3 bd=new BoxDemo3();
       bd.setSize(400,350);
       bd.setVisible(true);
       bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    
