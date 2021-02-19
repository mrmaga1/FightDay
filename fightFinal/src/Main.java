import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Привет друг(не дай бог анимешник(в краснм галстуке))\n тебя давно не было в файтинге, выбери свой гендер\n1)Студент\n2)Программист\n3)НЕ ДАЙ БОГ");
        Scanner sc = new Scanner(System.in);
        int player1= sc.nextInt();
        if (player1==1){
            Student st = new Student("Александр",50,600,75,10,25,30,20,2);
        }
        else if(player1==2){
            Programmer pr = new Programmer("Сергей",75,450,80,15,15,5,4,7);
        }
        else if(player1 == 3){
            Animeshnik an = new Animeshnik("Заур",10,100,10,1,0,100,100,10);
        }
        else {
            System.out.println("У нас только 3 гендера больше не дано");
        }
        System.out.println("Привет друг(не дай бог анимешник(в краснм галстуке))\n тебя давно не было в файтинге, выбери свой гендер\n1)Студент\n2)Программист\n3)НЕ ДАЙ БОГ");
        int player2= sc.nextInt();
        if (player2==1){
            Student st = new Student("Александр",50,600,75,10,25,30,20,3);
        }
        else if(player2==2){
            Programmer pr = new Programmer("Сергей",75,450,80,15,15,5,4,7);
        }
        else if(player2 == 3){
            Animeshnik an = new Animeshnik("Заур",10,100,10,1,0,100,100,10);
        }
        else {
            System.out.println("У нас только 3 гендера больше не дано");
        }
    }
    public static void FightPrVsSt(String namePlOne,int attackPlOne,int hpPlOne,int accuracyPlOne,int critPlOne, int dexPlOne,int intelPlOne,int hinkStenPlOne,int letSleepPlOne,String namePlTwo,int attackPlTwo,int hpPlTwo,int accuracyPlTwo,int critPlTwo,int dexPlTwo,int hackPlTwo,int cheatPlTwo,int stackoverflowPlTwo){
        int dex,accur,crit,count=0;
        String ultPlOne,ultPlTwo;
        while (true){
            Random ran = new Random();
            Scanner sc = new Scanner(System.in);
            accur = ran.nextInt(101);
            if(accuracyPlOne>=accur) {
                dex = ran.nextInt(100);
                if(dexPlTwo<dex) {
                    crit = ran.nextInt();
                    if(critPlOne<=crit) {
                        hpPlTwo -= (attackPlOne+(attackPlOne/100*critPlOne));
                        System.out.println("Твой урон = "+(attackPlOne+(attackPlOne/100*critPlOne)));
                        System.out.println("ХП второго игрока "+ hpPlTwo);
                    }
                    else {
                        hpPlTwo-=attackPlOne;
                        System.out.println("Твой урон = "+attackPlOne);
                        System.out.println("ХП второго игрока "+ hpPlTwo);
                    }
                }
                else { System.out.println("Чуть-чуть не попал"); }
            }
            else{ System.out.println("НЕ попал"); }
            System.out.println("Хочет ли "+ namePlOne+" испльзовать свою способность. \n1)ДА\n2)НЕТ");
            ultPlOne = sc.next();
            if(ultPlOne.equals("ДА")){
                count++;
            }
            if(count==0){

            }
            else {
               hpPlTwo-=hinkStenPlOne;//hpPlOne=hpPlOne- hinkStenPlOne;
               count++;
               if(count == 3){
                   count=0;
               }
            }

        }
    }
}
