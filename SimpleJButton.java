import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleJButton {
    
    public static void main(String[] args) {    
        new SimpleJButton();  
    }    
    
    
    SimpleJButton(){    
	JFrame f=new JFrame("Button Example"); 
				//submit button
	JButton b=new JButton("Submit");    
	b.setBounds(100,100,140, 40);    
				//enter name label
	JLabel label = new JLabel();		
	label.setText("Enter Name :");
	label.setBounds(70, 10, 100, 100);
				//empty label which will show event after button clicked
	JLabel label1 = new JLabel();
	label1.setBounds(10, 10, 250, 100);
				//textfield to enter name
	JTextField textfield= new JTextField();
	textfield.setBounds(180, 50, 130, 30);
				//add to frame
	
	f.add(textfield);
	f.add(label);
	f.add(b);    
	f.setSize(600,600);    
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	
	//action listener
        b.addActionListener(new ActionListener() {
            
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String name = textfield.getText();
            f.getContentPane().removeAll();
            f.repaint();
            label1.setText("Name has been submitted." + name);	
            f.add(label1);
        }          
        });
    }   
}