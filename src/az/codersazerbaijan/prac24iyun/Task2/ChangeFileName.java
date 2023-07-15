package az.codersazerbaijan.prac24iyun.Task2;

import java.io.File;

public class ChangeFileName {
    public static void main(String[] args) {
        File originalFile = new File("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac24iyun\\Task2\\Nicat.img");
       String fileName = originalFile.getName();
       String fileNameWithoutExtension = fileName.substring(0,fileName.lastIndexOf("."));
        String newFileName = fileNameWithoutExtension+".rar";
        File newFile = new File(originalFile.getParent(),newFileName);
         if (originalFile.renameTo(newFile)){
             System.out.println(originalFile.getName());
         }
    }
    }
