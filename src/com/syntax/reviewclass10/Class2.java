package Review10;

public class Class2 {
    String generateUserName(String firstName, String lastName){

        return firstName+"123"+lastName+".com";
    }

    public static void main(String[] args) {
        Class2 obj=new Class2();
        System.out.println(obj.generateUserName("volkan","dereli"));
    }
}
