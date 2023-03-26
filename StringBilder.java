/*String Builder */

class StringBilder{

     public static void main(String args[]){
          StringBuilder sb=new StringBuilder("GoodMornig ");
                sb.append("Java");
             //System.out.println(sb);
            sb.insert(1,"Java");
           // System.out.println(sb);
           sb.replace(1,3,"Java");
           //System.out.println(sb);
            sb.delete(1,3);
         // System.out.println(sb);
            sb.reverse();
      System.out.println(sb);
     }
}