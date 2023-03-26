class stringbuffer{
 public static void main(String args[]) {
   
   StringBuffer st1=new StringBuffer();
    StringBuffer st2=new StringBuffer("Welcome");
 
   System.out.println("The Default Capacity is:"+st1.capacity());
 
   System.out.println("The Capacity of St2:"+st2.capacity());
 
   System.out.println("The Given String 2 is:"+st2);

   System.out.println("The Reverse of the given String is:"+st2.reverse());

     }
 }