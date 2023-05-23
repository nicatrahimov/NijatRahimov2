public class Folder {
    String name;
    Folder subFolder;

    public Folder(String name, Folder subFolder) {
        this.name = name;
        this.subFolder = subFolder;
    }

    public static Folder PathToTransfer(String path,int index){
       String[]arr=path.split("/");
       String newPath=arr[index];

       return new Folder(newPath,PathToTransfer(String.join("/",arr),index++));

    }
}


