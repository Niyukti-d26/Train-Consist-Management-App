public class TrainConsistManagementApp {

    public static boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG507"};

        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = linearSearch(bogieIds, searchId);

        System.out.println("\n\nSearching for: " + searchId);

        if (found) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }

        System.out.println("\nUC18 search completed...");
    }
}