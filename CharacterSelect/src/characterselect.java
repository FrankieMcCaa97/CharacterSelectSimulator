import java.util.Scanner;

public class characterselect {
    public static void main(String[] args){
        //Character Selection
        String selection = new String();
        String char1, char2, last;

        Scanner select = new Scanner(System.in);

        System.out.println("Select char1");
        char1 = select.nextLine();

        System.out.println("Select char2:");
        char2 = select.nextLine();

        switch(selection){
            case "Megaman":
                System.out.println("You choose Megaman!");
                break;
            case "Mario":
                System.out.println("You choose Mario!");
                break;
            case "Link":
                System.out.println("You choose Link!");
                break;
            case "Samus":
                System.out.println("You choose Samus!");
                break;
            case "Zero Suit Samus":
                System.out.println("You choose Zero Suit Samus!");
                break;
            case "Wario":
                System.out.println("You choose Wario!");
                break;
            case "Zelda":
                System.out.println("You choose Zelda!");
                break;
            default:
                System.out.println(char1 + " vs " + char2);
        }

        Scanner health = new Scanner(System.in);
        System.out.println(" What's " + char1 + " Health ");
        char1 = select.nextLine();

        System.out.println(" What's " + char2 + " Health ");
//        char2 = select.nextLine();

        int num = 100;
        num=health.nextInt();

        if(num == 100){
            System.out.println(char1 + " Has won ");
        } else{
            System.out.println(char2 + " Has won ");
        }
    }
}
