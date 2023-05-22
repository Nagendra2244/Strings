/*Write a Java program to sort a list of strings based on their lengths in ascending order.*/

public class Sort_List_ofSrings_based_lengths_ascending_order{
    public static void main(String[] args){
        String arr[]=new String[]{"Fan","dexter","abc","fruit","apple","banana"};
        
       
        for(int i=0; i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i].length()>arr[j].length()){              
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The strings in the sorted order of length are:");
        for (String sortedArray : arr) {
            System.out.println(sortedArray);
        }
    }
}
