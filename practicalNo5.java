class Emerging_Technologie {
    String president;
    String treasurer;
    String secretary;
    Emerging_Technologie(String president, String treasurer, String secretary) {
    this.president = president;
    this.treasurer = treasurer;
    this.secretary = secretary;
    }
    void display() {
    System.out.println("President: " + president);
    System.out.println("Treasurer: " + treasurer);
    System.out.println("Secretary: " + secretary);
    }
    }
    // Child class 1
    class AIML extends Emerging_Technologie {
    AIML(String president, String treasurer, String secretary) {
    super(president, treasurer, secretary);
    }
    }
    // Child class 2
    class AIDS extends Emerging_Technologie {
    AIDS(String president, String treasurer, String secretary) {
    super(president, treasurer, secretary);
    }
    }
    // Child class 3
    class CSE extends Emerging_Technologie {
    CSE(String president, String treasurer, String secretary) {
    super(president, treasurer, secretary);
    }
    }
    public class practicalNo5 {
    public static void main(String[] args) {
    // Creating instances for AIML and AIDS classes
    AIML aiml = new AIML("Isha Mankar", "Shreya Paranjape", "Ayushi Wankhede");
    AIDS aids = new AIDS("Nandani Raut", "Mehek Khan", "Ankita Dafare");
    
    CSE cse=new CSE("Achal Patil","Khushi welekar","Anisha Bobade");
    // Displaying details for AIML
    System.out.println("Details for AIML:");
    aiml.display();
    System.out.println(); // Just for spacing
    
    // Displaying details for AIDS
    System.out.println("Details for AIDS:");
    aids.display();
    System.out.println(); // Just for spacing
    
    // Displaying details for CSE
    System.out.println("Details for CSE:");
    cse.display();
    }
    }