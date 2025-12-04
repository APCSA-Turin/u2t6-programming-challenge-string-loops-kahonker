package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
       String return_string = "";
       for (int i = 0; i < str.length(); i++){
           if (!str.substring(i, i+1).equals("a")) return_string += str.substring(i, i+1);
       }
       return return_string;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
       String return_string = "";
       int i = 0;
       while (i < str.length()){
           if (!str.substring(i, i+1).equals("a")) return_string += str.substring(i, i+1);
           i++;
       }
       return return_string;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
      String return_string = "";
      for (int i = str.length()-1; i >= 0; i--){
          return_string += str.substring(i, i + 1);
      }
      return return_string; 
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
       String temp_string = "";
       String return_string = "";
       for (int i = 0; i < str.length(); i++){
           temp_string =  str.substring(i, i + 1) + return_string;
           return_string = temp_string;
       }
       return return_string;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
       String new_string = "";
       for (int i = 0; i < origStr.length(); i++){
            if (origStr.substring(i, i+1).equals(searchChar)) new_string += replaceChar;
            else new_string += origStr.substring(i, i+1);
       }
       return new_string;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
       String new_string = "";
       int i = 0;
       while (i < origStr.length()){
          if (origStr.substring(i, i+1).equals(searchChar)) new_string += replaceChar;
          else new_string += origStr.substring(i, i+1); 
          i++;
       }
       return new_string;
   }

   public int countString(String searchString, String origString) {
       int count = 0;
       for (int i = 0; i < origString.length() - (searchString.length() -1); i++) {
           if (origString.substring(i, i+searchString.length()).equals(searchString)) count++;
       }
       return count;
   }

   public String removeString(String searchString, String origString) {
    StringBuilder out = new StringBuilder();
    int m = searchString.length();
    for (int i = 0; i < origString.length(); i++) {
        out.append(origString.charAt(i));
        if (out.length() >= m) {
            boolean match = true;
            for (int k = 0; k < m; k++) {
                if (out.charAt(out.length() - m + k) != searchString.charAt(k)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                out.setLength(out.length() - m);
            }
        }
    }

    return out.toString();
}


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
       String output = "";
       if (fromNum < toNum) {
           for (int i = fromNum; i < toNum + 1; i++) {
               output += i;
               if (i != toNum) output += ", ";
           }
       }
       else {
          for (int i = fromNum; i > toNum-1; i--) {
               output += i;
               if (i != toNum) output += ", ";
           } 
       }
       System.out.println(output);
   }

   public String removeSpaces(String str){
       String return_string = "";
       for (int i = 0; i < str.length(); i++){
           if (!str.substring(i, i+1).equals(" ")) return_string += str.substring(i, i+1);
       }
       return return_string;
   }


   public boolean isPalindrome(String myString) {
       return removeSpaces(myString).equals(removeSpaces(reverseString(myString)));
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
       String output = "[";
       for (int i = 0; i < num; i++){
           output += toPrint;
           if (i != num-1) output += " ";
       }
       output += "]";
       System.out.println(output);
   }
}
