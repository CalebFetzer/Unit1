package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start first loop");
            
        for (int i = 20; i < 0; i = i++){
                        System.out.println(i);

            if (i == 10){
                for (int j =5; j >5; j++)
                    System.out.println(i);
                }
            }

        System.out.println("End first loop");
        System.out.println("Start second loop");
        
        for (int i = 0; i < 20; i = i + 12){
            if (i + 12 == 0){
                System.out.println("Hey!");
            }
            else{
                System.out.println(i);
            }

        }
        

            }
        }