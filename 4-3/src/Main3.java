public class Main3 {
    public static boolean validateUsername(String username) {
        // ここにコードを書いてください

        if (username==null) return false;

        if(username.length()<4||username.length()>16){
            return false;
        }

        if(!username.matches("^[a-zA-Z0-9_]+$")){
            return false;
        }

        if(username.matches("^[0-9]+$")){
            return false;
        }

        return true;
    }

    public static boolean validatePassword(String password) {
        // ここにコードを書いてください
        if(password==null) return false;

        if(password.length()<8){
            return false;
        }

        if(!password.matches(".*[A-Z].*")){
            return false;
        }

        if(!password.matches(".*[0-9].*")){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        // ここにテスト用のコードを書いてください

        System.out.println("ユーザー名チェック:");
        for(String uname:usernames){
            if(validateUsername(uname)){
                System.out.println(uname+": 有効");
            }else{
                System.out.println(uname+": 無効");
            }
        }

        System.out.println("パスワードチェック:");
        for(String pwd:passwords){
            if(validatePassword(pwd)){
                System.out.println(pwd+": 有効");
            }else{
                System.out.println(pwd+"無効");
            }
        }
    }
}