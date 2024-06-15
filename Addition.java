    import java.awt.*;    
      
    public class Addition {    
    public static void main(String args[]){   
      
        // creating the object of Frame class and Label class  
        Frame f = new Frame ("Sum of two number");  
        Label l1, l2;   
        TextField t1, t2; 
      
        // initializing the labels   
        l1 = new Label ("First Value."); 
        l1.setBounds(50, 100, 100, 30); 
       
         t1 = new TextField("");    
         t1.setBounds(200, 100, 200, 30);  

        l2 = new Label ("Second Value");   
              
        l2.setBounds(50, 150, 100, 30);  
       
      
    t2 = new TextField("");    
    t2.setBounds(200, 150, 200, 30);    
    // adding the components to frame  
            // adding labels to the frame    
        f.add(l1);  
        f.add(t1);  
    
        f.add(l2); 
        f.add(t2);   
  
      
        // setting size, layout and visibility of frame   
        f.setSize(600,600);    
        f.setLayout(null);    
        f.setVisible(true);    
    }    
    }    