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
    }
}
