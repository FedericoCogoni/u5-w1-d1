package FedericoCogoni.u5_w1_d1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping  extends Product{
    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }
}