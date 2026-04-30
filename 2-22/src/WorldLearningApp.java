import java.util.Scanner;

public class WorldLearningApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] englishWords=new String[20];
        String[] japaneseMeanings=new String[20];
        int wordCount=0;
        while (true) {
            System.out.println("\n--- メニュー ---");
            System.out.println("1: 単語登録");
            System.out.println("2: クイズ実施");
            System.out.println("3: 終了");
            System.out.print("選択してください: ");
            
            String choice=scanner.next();

            if(choice.equals("1")){
                if(wordCount>=20){
                    System.out.println("登録可能な単語数は20個までです");
                }else{
                    System.out.println("英単語を入力してください: ");
                    englishWords[wordCount]=scanner.next();
                    System.out.println("日本語訳を入力してください: ");
                    japaneseMeanings[wordCount]=scanner.next();
                    wordCount++;
                    System.out.println("登録完了しました。");
                }
            }else if(choice.equals("2")){
                if(wordCount==0){
                    System.out.println("単語が登録されていません");
                }else{
                    int correctCount=0;
                    System.out.println("\n--- クイズ開始！ ---");
                    for(int i=0;i<wordCount;i++){
                        System.out.print("問題 "+(i+1)+": "+englishWords[i]+"の意味は？");
                        String answer=scanner.next();
                        if(answer.equals(japaneseMeanings[i])){
                            System.out.println("正解！");
                            correctCount++;
                        }else{
                            System.out.println("不正解... 正解は"+japaneseMeanings[i]+"です。");
                        }
                    }
                    System.out.println("\n"+wordCount+"問中"+correctCount+"問正解でした！");
                }
            }else if(choice.equals("3")){
                System.out.println("プログラムを終了します。");
                break;
            }else{
                System.out.println("1-3の数字を入力してください");
            }
        }
        scanner.close();
    }
}
