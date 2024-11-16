public class Problem8 {
    public static void main(String[] args) {
        String input ="hello i love java";
        String result=capitalizeFirstAndLast(input);
        System.out.println(result);
    }

    public static String capitalizeFirstAndLast(String str){
        String Words[]=str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word:Words){
            if (word.length()==1) {
                result.append(Character.toUpperCase(word.charAt(0)));               
            }else{
                String modifiedWord=Character.toUpperCase(word.charAt(0))+
                                word.substring(1, word.length()-1)+
                                Character.toUpperCase(word.charAt(word.length()-1));

                                result.append(modifiedWord);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
