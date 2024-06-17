import java.util.*;
class Main {
    node head=null;
    node temp=null;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void insert(int n){
        node nn=new node(n);
        if(head==null){
            head=nn;
            temp=nn;
            
        }
        else{
            node t=head;
            while(t!=null){
                if(t.data==nn.data)
                    return;
                    t=t.next;
            }
           
            
            temp.next=nn;
            temp=nn;
        }
    }
    void display(){
       
         
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void max(){
        
    temp=head;
    int max=0;
    while(temp!=null){
       
        if(max<=temp.data)
        max=temp.data;
        temp=temp.next;
        
    }
        System.out.println("Maximum element"+max);
    }
    void mid(){
     node o=head;
     node f=head;
    while(f!=null && f.next!=null){
        o=o.next;
        f=f.next.next;
        
    }
    System.out.println(o.data);
}
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       Main s= new Main();
       while(true){
           int n=in.nextInt();
           if(n<0){
              break;
           }
           else{
                s.insert(n);
           }
       }
       
       s.display();
       s.max();
       s.mid();
    }
}