package az.codersazerbaijan.prac15iyun.Task3;

import az.codersazerbaijan.prac13iyun.Task1.File;

import java.io.*;
import java.util.List;

public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    public boolean signIn(Login login){
//
//    }
    public static boolean signUp(Login login) throws IOException {
        boolean b = false;
        String a;
        BufferedReader br = new BufferedReader(new FileReader("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task3\\Users"));

        while (null!=(a=br.readLine())){
            List<String>list = List.of(a.trim().split(","));
            b= !login.username.equals(list.get(0));
        }
        if (b){
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task3\\Users",true));
            bw.append("\n"+login.username);
            bw.append(","+login.password);
            bw.close();
        }else b= false;
        return b;
    }
}
