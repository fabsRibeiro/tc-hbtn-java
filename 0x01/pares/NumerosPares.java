//package pares;

public class NumerosPares {
    public static void main(String[] args) {
        for(int i = 0; i <= 99; i++){
            if(i % 2 ==0){
                if(i < 98){
                    System.out.print(i + ",");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}