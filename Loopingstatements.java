public class Loopingstatements{
    public static void main (String[] args){
        int i=0;
//while conditional loop
        while(i<=10){
            System.out.println(i);
            i++;
        }
//do while conditional loop
        do{
            System.out.println(i);
            i++;
        }while(i<=30);
//for loop looping statements
        for( i=0;i<=20;i++){
            System.out.println(i);
        }
        i=0; 
        for(;i<=9;i++){
            System.out.println(i);
        }
        i=0; 
        for(;i<=9;){
            System.out.println(i);
            i++;
        }
    }
}