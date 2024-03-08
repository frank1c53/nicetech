public class NormalFizzBuzz {
    public static void main(String[] args) {
        int n=15;
        for(int i=1;i<=n;i++){
            //if number is divisible by 3 & 5 pring fizzbuzz
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){ //for 3 print fizz
                System.out.println("Fizz");
            }else if(i%5==0){ //for 5 pring buzz
                System.out.println("Buzz");
            }else{

            }
        }
    }
}
