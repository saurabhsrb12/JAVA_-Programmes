import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BoxDemo extends JFrame
{
  //vars
 // JLable lb1;
   //lb1=new JLabel("WELCOME");
   //lb1.setFont(new Font("Helvetica",Font.ITALIC,18));
   BoxDemo()
   {
    
       addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
	});
	
     JLabel l1=new JLabel("Enter name:");
     JTextField t1=new JTextField(20);
     t1.setMaximumSize(t1.getPreferredSize());
     
     Box horiz1=Box.createHorizontalBox();
     horiz1.add(l1);
     horiz1.add(Box.createHorizontalStrut(20));
     horiz1.add(t1);
     
     JLabel l2=new JLabel("Enter password:");
     JTextField t2=new JTextField(20);
     t2.setMaximumSize(t2.getPreferredSize());
      Box horiz2=Box.createHorizontalBox();
     horiz2.add(l2);
     horiz2.add(Box.createHorizontalStrut(20));
     horiz2.add(t2);
             JButton b1=new JButton("submit"); 

    Box horiz3=Box.createHorizontalBox();
     horiz3.add(b1);
    /* horiz3.add(Box.createHorizontalGlue());
     horiz3.add(b2);*/
             

     Box vert=Box.createVerticalBox();
     vert.add(horiz1);
     vert.add(Box.createVerticalStrut(100));
     vert.add(horiz2);
      vert.add(Box.createVerticalStrut(100));
      vert.add(horiz3);
      // setBackground(Color.blue);
     

   Container c= getContentPane();
    c.add(vert);
  // lb1=new JLabel("WELCOME");
  //  lb1.setFont(new Font("Helvetica",Font.ITALIC,18));
}
/*public void Paint(Graphics g)
{
   this.setBackground(new Color(255,0,0));
}*/
 
   public static void main(String args[])
    {
       BoxDemo bd=new BoxDemo();
       bd.setTitle("WELCOME");
       bd.setSize(400,350);
        // bd.setBackground(new Color(0,0,255));
       bd.setVisible(true);
        
       bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}


