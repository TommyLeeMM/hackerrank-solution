import java.util.*;

public class Permutation {
    static ArrayList<String> list = new ArrayList<String>();
  public static void main(String[] args)
  {    
    String no = args[0];
    char[] arr = no.toCharArray();
    permutate(arr, 0, arr.length-1);
    Collections.sort(list);
    int check=0;
    
    while(check < list.size()-1){
        if(list.get(check).equals(list.get(check+1))){
            list.remove(check);
        }
        else{
            check++;
        }
    }
    
    int checka = 0;
    while(checka < list.size()){
        if(list.get(checka).charAt(0) == '0') {
            list.remove(checka);
        }
        else checka++;
    }
    System.out.println(list.size());
  }
  
  
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
  
  public static void swap(char[] arr,int a,int b){
    char temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
