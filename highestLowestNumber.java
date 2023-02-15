public class highAndLow{

     public static void main(String []args){
        System.out.println("Hello, World!");
        highAndLow("6 2 7 4 10 6");
     }
     
     public static String highAndLow(String numbers) {
    // Code here or
    String[] splitStr = numbers.split(" "); // split by " "
    int lNum = Integer.parseInt(splitStr[0]); //lowest number init;
    int hNum = Integer.parseInt(splitStr[0]); // highest number init;
    for(int i=1; i<splitStr.length; i++){//compare
      if(lNum>Integer.parseInt(splitStr[i]))
        lNum = Integer.parseInt(splitStr[i]);
      if(hNum<Integer.parseInt(splitStr[i]))
        hNum = Integer.parseInt(splitStr[i]);
    }
    
    System.out.println(String.valueOf(hNum)+" "+ String.valueOf(lNum));
    //"hNum lNum";
    return  String.valueOf(hNum)+" "+ String.valueOf(lNum);
  }