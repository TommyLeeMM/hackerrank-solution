import java.util.*;

public class Permutation {
    static ArrayList<String> list = new ArrayList<String>();
  public static void main(String[] args)
  {    
    String no = args[0];
    char[] arr = no.toCharArray();
    permutate(arr, 0, arr.length-1);
    //sorting ArrayList
    Collections.sort(list);
    int check=0;
    
    //clear the same element.
    while(check < list.size()-1){
        if(list.get(check).equals(list.get(check+1))){
            list.remove(check);
        }
        else{
            check++;
        }
    }
    
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));   
    }
  }
  
    //permutate group of char
  public static void permutate(char[] arr, int l, int r){
    if(l == r){
      String result = new String();
      for(int i=0; i<arr.length; i++){
     	result += arr[i];
      }
      list.add(result);
    }else{
      for(int i=l; i<=r; i++){
        swap(arr, l, i);
        permutate(arr, l+1, r);
        swap(arr, l, i);
      }
    }
  }
  
    //swap 2 char arrays
  public static void swap(char[] arr,int a,int b){
    char temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
