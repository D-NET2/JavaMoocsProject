import java.util.ArrayList;
public class Menu{
    private ArrayList<String> meals;
    
    public Menu(){
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal){
        if(!(this.meals.contains(meal)))//does not contain meal in list
        {
            this.meals.add(meal);//add meals to list
        }
        //skip       
    }
    
    
    public void printMeals(){
        for(String items : this.meals){
            System.out.println(items + ",");
        }
        
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
    
}