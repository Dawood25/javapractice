import java.io.*;
class Dog implements Serializable{
    int i,j;
    Dog(){
        this.i=10;
        this.j=20;
    }
}
class SerializableDemo{
    public static void main(String... args) throws Exception{
        Dog d1=new Dog();
        FileOutputStream FOS=new FileOutputStream("abc.txt");
        ObjectOutputStream OOS=new ObjectOutputStream(FOS);
        OOS.writeObject(d1);

        FileInputStream FIS=new FileInputStream("abc.txt");
        ObjectInputStream OIS=new ObjectInputStream(FIS);
        Dog d2=(Dog)OIS.readObject();
        System.out.println(d2.i+"...."+d2.j);

    }
}