package jp.ac.uryukyu.ie.e215718;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("単語リストなら1,単語テストなら2を入力してください。");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 1){
            WordBook[] words = {
                new WordBook("結果","result"),
                new WordBook("経験","experience"),
                new WordBook("社会","society"),
                new WordBook("困難","trouble"),
                new WordBook("価値","value"),
                new WordBook("効果","effect"),
                new WordBook("個人","individual"),
            };
            for(WordBook w : words){
                System.out.println(w.ja +" -> "+w.en);
            }
        
        } else if (num == 2){
            System.out.println("\n「結果」を英語でなんという?");
            System.out.println("\n1:experience, 2:experiment, 3.except");
            System.out.println("\n\n解答を入力->");
            Scanner scan2 = new Scanner(System.in);
            int a = scan2.nextInt();
            if (a == 1){
                System.out.println("\n正解");
            }
            else if (a == 2){
                System.out.println("\n不正解、正解は1.experience");
            }
            else if (a == 3){
                System.out.println("\n不正解、正解は1.experience");
            }else{
                System.out.println("入力が間違っています。1:experience, 2:experiment, 3.except");
            }

        } else{
            System.out.println("入力が間違っています。単語リストなら1,単語テストなら2を入力してください。");
        }

    }    
}
