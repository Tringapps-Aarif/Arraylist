import java.util.*;

class linkedList {
    public static void main(String args[]) {
        LinkedList<String> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 4) {
            System.out.println("Enter the choice \n1.Add \n2.Delete \n3.Display \n4.exit");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println("Enter the item to be added in the linked list : ");
                    String a = sc.next();
                    obj.addLast(a);
                    System.out.println("ADDED");
                    break;

                case 2:
                    obj.removeLast();
                    System.out.println("DELETED");
                    break;

                case 3:
                    for (String list : obj)
                        System.out.print(list + "\n");
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Enter the valid choice");
                    break;
            }
        }

    }
}