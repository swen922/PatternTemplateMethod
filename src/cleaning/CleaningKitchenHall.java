package cleaning;

public class CleaningKitchenHall extends Cleaning {

    public CleaningKitchenHall() {
        System.out.println("\nStarting cleaning KitchenHall...");
    }

    @Override
    public void procedeFurniture() {
        System.out.println("KitchenHall: Up all tabourets");
    }

    @Override
    public void procedeTableware() {
        System.out.println("KitchenHall: Set tableware to wash-machine");
    }

    @Override
    public void procedeThings() {
        System.out.println("KitchenHall: Set tableware to wash-machine");
    }

    @Override
    public void procedeClothes() {
        System.out.println("KitchenHall: Set clothes to wardrobe");

    }

    @Override
    public void procedeCatsTray() {

    }

    @Override
    public void procedeWashThingsPot() {
        System.out.println("KitchenHall: Set washThingsPot to windowSill");
    }

    @Override
    public void procedeUnderWardrobe() {
        System.out.println("KitchenHall: Closing wardrobe");
    }

    @Override
    public void procedeWindowSill() {
        System.out.println("KitchenHall: Ordering something between flowers etc");
    }

    @Override
    public void fixBrokenThings() {
        System.out.println("KitchenHall: Hiding broken things to sideboard");
    }

    @Override
    public void procedeWashBowl() {
        System.out.println("KitchenHall: Water cleaning washbowl with Fairy");
    }

    @Override
    public void procedeToiletBowl() {

    }

}
