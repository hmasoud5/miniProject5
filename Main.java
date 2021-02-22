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
    

  }

  // method called checkIn
  static boolean checkIn(String name, int index) 
  {
    String[] names = {"Bella", "Journey", "Neveah"};
    if (name = names[index]){
     System.out.println("Yay! You're checked in. ");
     return true;
    }else{
      index++;
      checkIn(name, index);
    } 
    if(index < names.length){
      index = 1; 
      checkIn(name, index); 
    } 
}
}