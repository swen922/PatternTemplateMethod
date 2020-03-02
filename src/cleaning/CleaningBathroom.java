package cleaning;

public class CleaningBathroom extends Cleaning {

    public CleaningBathroom() {
        System.out.println("\nStarting cleaning Bathroom...");

    }

    @Override
    public void procedeFurniture() {

    }

    @Override
    public void procedeTableware() {

    }

    @Override
    public void procedeThings() {
        System.out.println("Bathroom: Up all shampoos");
    }

    @Override
    public void procedeClothes() {
        System.out.println("Bathroom: Up the shower cap");
    }

    @Override
    public void procedeCatsTray() {

    }

    @Override
    public void procedeWashThingsPot() {
        System.out.println("Bathroom: Wash-machine with linen is ON");
    }

    @Override
    public void procedeUnderWardrobe() {

    }

    @Override
    public void procedeWindowSill() {

    }

    @Override
    public void fixBrokenThings() {

    }

    @Override
    public void procedeWashBowl() {
        System.out.println("Bathroom: water cleaning washbowl with Sanox");

    }

    @Override
    public void procedeToiletBowl() {

    }


    // Переопределяем два метода из вышестоящего класса, которые не нужно запускать, – делаем их пустыми

    @Override
    public void procedeCarpets() {

    }

    @Override
    public void procedeParquetFloor() {

    }
}
