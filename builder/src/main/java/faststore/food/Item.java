package faststore.food;


import faststore.packing.Packing;

// step 1 : Create an interface Item representing food item and packing.
public interface Item {
    String name();
    Packing packing();
    float price();
}
