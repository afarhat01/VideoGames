class Main {
  public static void main(String[] args) {

    VideoGame v1 = new VideoGame();
    System.out.println("\nv1's Information with accessor methods:");
    System.out.println(v1.getName() + " " + v1.getCompany() + " " + v1.getYear() + " " + v1.getPrice() + " " + v1.getConsole());
    System.out.println("\nv1's Information through the toString method");
    System.out.println(v1);
    System.out.println("\nChanging v1's Information with mutator method");
    v1.setName("Super Mario Galaxy");
    v1.setCompany("Nintendo Wii");
    v1.setYear(2002);
    v1.setPrice(29.99);
    v1.setConsole(false);
    System.out.println(v1);

    System.out.println("\nChanging v1's version to 2 and 3");
    v1.newVersion(2);
    System.out.println(v1);
    System.out.println();
    v1.newVersion(3);
    System.out.println(v1);



  }
}