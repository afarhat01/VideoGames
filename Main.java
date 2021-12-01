class Main {
  public static void main(String[] args) {

//Testing Both Types of Constructors
    VideoGame v1 = new VideoGame();
    VideoGame v2 = new VideoGame("Call of Duty: Vangaurd", "Activision", 69.99, 2021, true);
    VideoGame v3 = new VideoGame("Call of Duty: Vangaurd", "AnotherCompany", 49.99, 2010, false);

//Testing return data using accessor methods
    System.out.println("\nv1's Information with accessor methods:");
    System.out.println(v1.getName() + " " + v1.getCompany() + " " + v1.getYear() + " " + v1.getPrice() + " " + v1.getConsole());
//Testing return data using toString method
    System.out.println("\nv1's Information through the toString method");
    System.out.println(v1);
    
//Testing Mutator methods
    System.out.println("\nChanging v1's Information with mutator method");
    v1.setName("Super Mario Galaxy");
    v1.setCompany("Nintendo Wii");
    v1.setYear(2002);
    v1.setPrice(29.99);
    v1.setConsole(true);
    System.out.println(v1);

//Testing newVersion method
    System.out.println("\nChanging v1's versions to 2 and 3");
    v1.newVersion(2);
    System.out.println(v1);
    System.out.println();
    v1.newVersion(3);
    System.out.println(v1);

//Testing discount method
    System.out.println("\nUsing discount on v2");
    v2.discount(20);
    System.out.println(v2);

//Testing equals method
    System.out.println("\nUsing the .equals method");
    System.out.println("Is v1 and v3 equal? " + v1.equals(v2));
    System.out.println("Is v2 and v3 equal? " + v2.equals(v3));


  }
}