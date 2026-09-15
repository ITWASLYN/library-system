import java.sql.Array;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //private static Library library = new Library();

    //feel free to change any part of this code
    //NB: this code is incomplete. It's just to give you a quick start on the main menu of the library.
    public static void main(String[] args) {
        ArrayList<String> sorcererID = new ArrayList<String>();
        ArrayList<String> sorcererNAME = new ArrayList<String>();
        ArrayList<String> sorcererSANCTUM = new ArrayList<String>();

        ArrayList<String> tomesVCN = new ArrayList<String>();
        ArrayList<String> tomesTITLE = new ArrayList<String>();
        ArrayList<String> tomesAUTHOR = new ArrayList<String>();

        ArrayList<String> bsorcererID = new ArrayList<String>();
        ArrayList<String> bsorcererNAME = new ArrayList<String>();
        ArrayList<String> bsorcererSANCTUM = new ArrayList<String>();

        ArrayList<String> btomesVCN = new ArrayList<String>();
        ArrayList<String> btomesTITLE = new ArrayList<String>();
        ArrayList<String> btomesAUTHOR = new ArrayList<String>();
        while (true) {
            System.out.println("Library of the Mystic Arts Management System:");
            System.out.println("1. Register a Sorcerer");
            System.out.println("2. Catalogue a Tome");
            System.out.println("3. Display All Tomes");
            System.out.println("4. Search for a Tome");
            System.out.println("5. Lend Out a Tome");
            System.out.println("6. Return a Tome");
            System.out.println("7. Display Borrowed Tomes");
            System.out.println("8. List Tomes Held by a Sorcerer (Bonus)");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Sling Ring ID: ");
                    String sorcererId = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String sorcererName = scanner.nextLine();
                    System.out.print("Enter home sanctum (Kamar-Taj, New York, London, Hong Kong): ");
                    String sanctum = scanner.nextLine();
                    //logic to register the sorcerer here.
                    //you can for example call a function or some function within a class, etc.



                    if (sorcererID.indexOf(sorcererId) != -1) {

                        sorcererID.add(sorcererId);
                        sorcererNAME.add(sorcererName);
                        sorcererSANCTUM.add(sanctum);

                    }

                    break;
                case 2:
                    System.out.print("Enter VCN (13 digits): ");
                    String vcn = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    //logic to catalogue the tome here.


                    if (vcn.length() == 13) {
                        tomesVCN.add(vcn);

                    }

                    break;
                case 3:
                    //call some function here to display all tomes.
                    for (int i = 0; i == tomesVCN.size(); i++) {
                        System.out.println(tomesVCN.get(i) + tomesTITLE.get(i) + tomesAUTHOR.get(i));
                    }
                    break;
                case 4:
                    System.out.print("Enter VCN to search for: ");
                    String searchVcn = scanner.nextLine();
                    //call some function here to search for the tome.
                    if (tomesVCN.indexOf(searchVcn) != -1) {
                       int index = tomesVCN.indexOf(searchVcn);
                        System.out.println(tomesVCN.get(index) + tomesTITLE.get(index) + tomesAUTHOR.get(index));
                    }

                    break;
                case 5:
                    System.out.print("Enter VCN of the tome to lend: ");
                    String lendVcn = scanner.nextLine();
                    System.out.print("Enter Sling Ring ID of the borrower: ");
                    String borrowerId = scanner.nextLine();
                    //call some function here to lend out the tome.
                    if (tomesVCN.indexOf(lendVcn) == -1) {
                        System.out.println("Book Already Borrowed");
                        break;
                    }
                    else if (sorcererID.indexOf((borrowerId)) == -1) {
                        System.out.println("ID Does Not Exist");
                        break;
                    }


                    int indexVCN = tomesVCN.indexOf(lendVcn);
                    int indexID = sorcererID.indexOf((borrowerId));

                    bsorcererID.add(sorcererID.get(indexID));
                    bsorcererNAME.add(sorcererNAME.get(indexID));
                    bsorcererSANCTUM.add(sorcererSANCTUM.get(indexID));

                    btomesVCN.add(tomesVCN.get(indexVCN));
                    btomesTITLE.add(tomesTITLE.get(indexVCN));
                    btomesAUTHOR.add(tomesAUTHOR.get(indexVCN));

                    sorcererID.remove(indexID);
                    sorcererNAME.remove(indexID);
                    sorcererSANCTUM.remove(indexID);

                    tomesVCN.remove(indexVCN);
                    tomesTITLE.remove(indexVCN);
                    tomesAUTHOR.remove(indexVCN);




                    break;
                case 6:
                    System.out.print("Enter VCN of the tome being returned: ");
                    String returnVcn = scanner.nextLine();
                    //call some function here to return the tome.

                    break;
                case 7:
                    //call some function here to display borrowed tomes.
                    int len = btomesVCN.size();


                    break;
                case 8:
                    System.out.print("Enter Sling Ring ID: ");
                    String holderId = scanner.nextLine();
                    //call some function here to list tomes held by this sorcerer.
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}