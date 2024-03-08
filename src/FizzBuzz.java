public class FizzBuzz {
    public static void main(String[] args) {
        //as modulo takes lot of operations and is costly operation we can use two counters for 3 & 5 to find the number is divisible by 3 or 5 or both or not
        int c3=0;
        int c5=0;
        //n is no of test cases used
        int n = 15;
        for(int i=1;i<=n;i++){
            //using empty string for appending
            String s="";
            c3++;
            c5++;
            //incrementing counter for each loop
            if(c3==3){
                //when loop reaches 3 it will append fizz to the string
                s+="Fizz"+i;
                //resetting the counter to 0 to so that it will find for new divisible by 3 number
                c3=0;
            }
            if(c5==5) {
                //when loop reaches 3 it will append buzz to the string
                //incase of 15 both fizzbuss will get appended
                s += "Buzz"+i;
                c5 = 0;
            }
            if(!s.isEmpty()){
                System.out.println(s);
            }

        }




    }
}