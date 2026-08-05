import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main4 {
    public static void main(String[] args) {
        // ここにコードを書いてください
        File sourceFile=new File("source.txt");
        File backupDir=new File("backup");
        File backupFile=new File(backupDir,"source.txt");
        File archiveDir=new File("archive");
        File archiveFile=new File(archiveDir,"sourece.txt");

        try{
            if(!sourceFile.exists()){
                sourceFile.createNewFile();
            }

            if(!backupDir.exists()){
                backupDir.mkdirs();
            }

            Files.copy(sourceFile.toPath(), backupFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'backuo/' にコピーされました。");

            if(backupFile.exists()){
                System.out.println("コピーの確認: 成功");
            }else{
                System.out.println("コピーの確認: 失敗");
            }

            if(!archiveDir.exists()){
                archiveDir.mkdirs();
            }

            Files.move(backupFile.toPath(), archiveFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'archive/' に移動されました。");

            if(archiveFile.exists()&&!backupFile.exists()){
                System.out.println("移動の確認: 成功");
            }else{
                System.out.println("移動の確認: 失敗");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}