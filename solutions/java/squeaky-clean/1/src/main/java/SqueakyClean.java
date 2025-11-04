class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;
        for(int i = 0,n = identifier.length(); i < n;i++)
            {
                char ch = identifier.charAt(i);
                 if (ch == ' '){
                    ch = '_';
                }
                else if(Character.isDigit(ch))
                {
                    ch = switch(ch){
                            case '4' -> 'a';
                            case '3' -> 'e';
                            case '0' -> 'o';
                            case '1' -> 'l';
                            case '7' ->'t';
                            default -> ch;
                    };
                }
                if (ch == '-') {
                    capitalizeNext = true;
                    continue;
                }  
                 if (!Character.isLetter(ch) && ch != '_')
                 {
                    continue;
                 }
                if(capitalizeNext)
                 {
                     ch= Character.toUpperCase(ch);
                     capitalizeNext = false;
                 }
                 builder.append(ch);
                             
            }
        return builder.toString();
    }
}
