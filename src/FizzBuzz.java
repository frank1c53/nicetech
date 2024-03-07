public class FizzBuzz {
    public static void main(String[] args) {

        int c3=0;
        int c5=0;
        int n = 16;
        for(int i=0;i<n;i++){
            String s="";
            c3++;
            c5++;
            if(c3==3){
                s+="Fizz";
                c3=0;
            }
            if(c5==5) {
                s += "Buzz";
                c5 = 0;
            }
            if(s.length()!=0){
                System.out.println(s);
            }

        }




    }
}