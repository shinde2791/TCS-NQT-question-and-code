public class Problem7 {
    public static void main(String[] args) {
        String input ="abc1xyz34mno6";
        int sum=0;
        String temp="";

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(Character.isDigit(ch)){
                temp +=ch;
            }else{
                if(!temp.isEmpty()){
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}
