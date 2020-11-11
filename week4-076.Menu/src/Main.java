
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
        
        //adds meals to arraylist
        exactum.addMeal("Fish fingers and chips");
        exactum.addMeal("Vegetable casserole with salad cheese");
        exactum.addMeal("Chicken and nacho salad");
        
        exactum.printMeals();//prints meals in the menu
        
        
        exactum.clearMenu();//clears all items in the menu
        
        exactum.printMeals();//prints meals in the menu
        
        System.out.println("did it work");
        // When you have created addMeal(String meal) method,
        // you may remove the comments below
        // exactum.addMeal("Fish fingers with sour cream sauce);
        // exactum.addMeal("Vegetable casserole with salad cheese");
        // exactum.addMeal("Chicken and nacho salad");

        // When you have created printMeals() method,
        // you may remove the comments below
        // exactum.printMeals();

        // When you have created clearMenu() method,
        // You may remove the comments below
        // exactum.clearMenu();
        // exactum.printMeals();
    }
}
