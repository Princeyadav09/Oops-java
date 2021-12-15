import java.awt.*;    
public class test {    
public static void main (String[] args) {   
     
    myframe f =new myframe("Button Example");    
    
    Button b1 = new Button("Button 1");   
    Button b2 = new Button("Button 2");   
    Button b3 = new Button("Button 3");   
    
    b1.setBounds(400,400,80,30);    
    b2.setBounds(400,430,80,30);    
    b3.setBounds(400,460,80,30);    
      
    f.add(b1);    
    f.add(b2);
    f.add(b3);

    f.setSize(100,100);    
    f.setLayout(null);    
    f.setVisible(true);  
    f.setBounds(280,280,280,280);   
}    
}
class myframe extends Frame
{ 
    myframe(String m)
    {
        super(m);
    }
    public void paint(Graphics g)
    {
        g.drawRect(300,300,300,300);
    }
} 