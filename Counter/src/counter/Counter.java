
package counter;
import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame {
    private Label counterlbl;
    private TextField countertxtf;
    private Button counterbtn;
    private int cnt=0;
    
    public Counter(){
    setLayout(new FlowLayout());
    
    counterlbl = new Label("Counter");
    add(counterlbl);
    
    countertxtf = new TextField(cnt+ "", 10); 
      countertxtf.setEditable(false);
      add(countertxtf);
      
      counterbtn = new Button("Count");
      add(counterbtn);
      
      CounterListner list =new CounterListner();
      counterbtn.addActionListener(list);
      
      setTitle("Counter App");
      setSize(300,100);
      
      setVisible(true);
    }  
    public static void main(String[] args) {
        
        // TODO code application logic here
        Counter application=new Counter();
    }
    private class CounterListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            ++cnt;
            countertxtf.setText(cnt+ "");
        }
    } 
}
