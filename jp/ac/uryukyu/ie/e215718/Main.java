package jp.ac.uryukyu.ie.e215718;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        WordBook[] words = {
            new WordBook("結果","result"),
            new WordBook("経験","experience"),
            new WordBook("社会","society"),
            new WordBook("困難","trouble"),
            new WordBook("価値","value"),
            new WordBook("効果","effect"),
            new WordBook("個人","individual"),
        };
        int correct = 0;
        for(WordBook w : words){
            System.out.println(w.ja +"->"+w.en);
        }
    }    
}
