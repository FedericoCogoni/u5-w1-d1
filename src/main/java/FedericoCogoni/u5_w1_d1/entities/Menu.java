package FedericoCogoni.u5_w1_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;
@Getter
@AllArgsConstructor
public class Menu {

    private List<Topping> toppings;
    private List<Drink> drinks;
    private List<Pizza> pizzas;

    public void menuPrint(){
        System.out.println("Menu");
        System.out.println("Pizzas");
        this.pizzas.forEach(System.out::println);

        System.out.println("Toppings");
        this.toppings.forEach(System.out::println);

        System.out.println("Drinks");
        this.drinks.forEach(System.out::println);

    }
}
