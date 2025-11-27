class ReverseString {

    String reverse(String inputString) {
        String result= ""; 
        for (int i = 0; i < inputString.length(); i++){
            result = inputString.charAt(i) + result;
        }
        return result;
    }
  
}
