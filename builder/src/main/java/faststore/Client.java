package faststore;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-11
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareMeal();
        System.out.println("meal");
        vegMeal.showItem();
        System.out.println("cost: "+ vegMeal.getCost());
    }
}
