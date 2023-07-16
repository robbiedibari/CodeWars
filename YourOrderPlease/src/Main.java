public class Main {
    public static Boolean order(String words) {
        if(words.equals(""))
            return false;
        else {
            String [] arr = words.split(" ");


            for(String word : arr){
                for(int i  = 0; i < word.length(); i++){
                    if(Character.isDigit(word.charAt(i)))
                        return true;
                }

               }
            }
        return false;
        }

    public static void main(String[] args) {

       String string = "is2 Thi1s T4est 3a";
        System.out.println(order(string));

       }
    }
