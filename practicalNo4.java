public class practicalNo4{

    public static void main(String[] args) {
        // Example usage
        printName("   Bill Joy   ");
    }

    public static void printName(String name) {
        // Trim leading and trailing spaces
        name = name.trim();

        // Split the name into first and last names
        String[] parts = name.split(" ");

        // Ensure there are at least two parts (first and last names)
        if (parts.length >= 2) {
            // Get the first and last names
            String firstName = parts[0];
            String lastName = parts[parts.length - 1];

            // Print the reformatted name
            System.out.println(lastName + ", " + firstName);
        } else {
            System.out.println("Invalid name format");
        }
    }
}
