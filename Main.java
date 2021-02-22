import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // recieving user input from the user
    System.out.println("Welcome! What is your name?");
    // Welcoming patients
    String name = scan.next();
    // saving and recieving name into type string
    int index = 0;
    checkIn(name, index);
    //calling checkIn method back into main method 
    

  }

  // method called checkIn
  static boolean checkIn(String name, int index) 
  {
    String[] names = {"Bella", "Journey", "Neveah"};
    //array of name elements
    if (name == names[index]){
     System.out.println("Yay! You're checked in. ");
     //if the name is equal to the index of the name then print out this statement
     return true;
    }else{
      index++;
      //add 1 to the index until names equals to index
      checkIn(name, index);
      //calling checkIn method until it returns true
    } 
    if(index < names.length){
      index = 1; 
      checkIn(name, index);
    } 
}
}