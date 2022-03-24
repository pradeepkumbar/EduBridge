class Noarg {

  int i;

  // constructor with no parameter
  private Noarg() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Noarg obj = new Noarg();
    System.out.println("Value of i: " + obj.i);
  }
}