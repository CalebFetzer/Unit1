package app;


public class App {
    public static void main(String[] args) throws Exception {

         System.out.println("Start first loop");
        for (int i = 1; i < 10; i = i + 1) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("five");
            }
        }
        System.out.println("End first loop");
        System.out.println("Start second loop");
        for (int i = 100; i <= 200; i = i + 10) {
            System.out.println(i);
            if (i == 150){
                for (int j = 150; j < 160; j = j + 1){
                    System.out.println(j);
                }
            }
                } 

            }
        }
    


