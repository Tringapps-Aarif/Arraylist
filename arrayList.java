import java.util.*;

class arrayList {
    public static void main(String args[]) {
        int ch = 0;
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (ch != 4) {

            System.out.println("\n1.Add \n2.Delete \n3.Display \n4.Exit\nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println(" Enter the element to add in the array : ");
                    int n = sc.nextInt();
                    a.add(n);
                    break;

                case 2:

                    if (a.isEmpty()) {
                        System.out.println(" Array empty");
                    } else {
                        System.out.println("Enter the array element yo need  : ");
                        int del = sc.nextInt();
                        if (a.contains(del)) {
                            for (int i = 0; i < a.size(); i++) {
                                if (a.get(i) == del) {
                                    a.remove(i);
                                    System.out.println("Element Deleted!");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("The element you entered is not in the array");
                        }
                    }
                    break;

                case 3:
                    System.out.println("The element in the array are : " + a);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
        sc.close();
    }
}