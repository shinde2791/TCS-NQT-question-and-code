public class Problem6 {
    public static void main(String[] args) {
        String str="shinde";
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
