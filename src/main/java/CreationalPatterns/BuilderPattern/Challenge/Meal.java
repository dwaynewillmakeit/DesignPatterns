package CreationalPatterns.BuilderPattern.Challenge;

import CreationalPatterns.BuilderPattern.Challenge.food_items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item :
                items) {

            cost += item.price();

        }

        return cost;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.println("Item: " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        });
    }
}
