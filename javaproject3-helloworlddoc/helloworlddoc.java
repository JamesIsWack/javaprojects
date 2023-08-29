import java.util.*;

class _helloworlddoc {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Your name?\n");

        String userName = name.nextLine();

        Scanner street = new Scanner(System.in);
        System.out.println("Street address?\n");

        String userStreet = street.nextLine();

        Scanner cSZ = new Scanner(System.in);
        System.out.println("City, state and ZIP code?\n");

        String usercSZ = cSZ.nextLine();

        name.close();
        street.close();
        cSZ.close();

        System.out.println("YourName: "+userName+"\n");
        System.out.println("StreetAddress: "+userStreet+"\n");
        System.out.println("City, state, and ZIP:"+usercSZ+"\n");
    }
}