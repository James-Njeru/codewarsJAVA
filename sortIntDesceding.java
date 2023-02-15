import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String number;
    //String[] splitS;
    Integer[] arrayInt;
    int res = 0;
    
    if(num >= 0){
      number = Integer.toString(num);
      
      if(number.length()>1){
        //splitS = new String[number.length()];
        arrayInt = new Integer[number.length()];
        
        for(int i = 0; i < number.length(); i++){
          arrayInt[i] = Character.digit(number.charAt(i), 10);
        }
        Arrays.sort(arrayInt, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayInt));
        
        //convert array to int
        for(int i = 0; i<arrayInt.length; i++){
            res=res*10+arrayInt[i];
        }
      }
    }
    return res;
  }
}