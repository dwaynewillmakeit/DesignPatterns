package StructuralPatterns.DecoratorPattern.Example3;

import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCream;
import StructuralPatterns.DecoratorPattern.Example3.models.BasicIceCream;
import StructuralPatterns.DecoratorPattern.Example3.models.ChocolateTopping;
import StructuralPatterns.DecoratorPattern.Example3.models.PeanutTopping;

public class Main {
    public static void main(String[] args) {

        IceCream basicIceCream =  new BasicIceCream();
        System.out.println("Basic Ice-Cream cost: $"+ basicIceCream.cost());

        System.out.println();
        //Add ChocolateToppings
        IceCream iceCreamWithChocolateToppings = new ChocolateTopping(basicIceCream);
        System.out.println("Ice Cream with chocolate toppings cost: $"+iceCreamWithChocolateToppings.cost());

        System.out.println();
        IceCream iceCreamWithChocolateAndPeanutToppings = new PeanutTopping(iceCreamWithChocolateToppings);
        System.out.println("Ice Cream with chocolate and peanut toppings cost: $"+iceCreamWithChocolateAndPeanutToppings.cost());
    }
}
