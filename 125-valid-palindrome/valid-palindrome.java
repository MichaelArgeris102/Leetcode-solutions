class Solution {

    
    public boolean isPalindrome(String s) {
       //checking for # or 123
    String clean_string = "";
  
    s = s.toLowerCase();
   for(int i = 0; i<s.length(); i++){

       if(Character.isLetterOrDigit(s.charAt(i))){
        //adding string values to clean string 1 by 1
    clean_string = clean_string + s.charAt(i);
    }
   }


       for(int i= 0; i< clean_string.length()/2; i++){
        //we do charAt(0)!= the strings length-1-i which is 0 so we comapre first and last indice and move towards the center very easy 
        if(clean_string.charAt(i)!= clean_string.charAt(clean_string.length()-1-i)){
            return false;
        }
        
       }

       return true;
}
}