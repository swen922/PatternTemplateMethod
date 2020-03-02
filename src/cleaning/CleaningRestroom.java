package cleaning;

public class CleaningRestroom extends Cleaning {

    public CleaningRestroom() {
        System.out.println("\nStarting cleaning Restroom...");
    }

    @Override
    public void procedeFurniture() {

    }

    @Override
    public void procedeTableware() {

    }

    @Override
    public void procedeThings() {
        System.out.println("Restroom: Up all toilet paper");
    }

    @Override
    public void procedeClothes() {

    }

    @Override
    public void procedeCatsTray() {
        System.out.println("Restroom: Cleaning both cats trays");
    }

    @Override
    public void procedeWashThingsPot() {

    }

    @Override
    public void procedeUnderWardrobe() {

    }

    @Override
    public void procedeWindowSill() {

    }

    @Override
    public void fixBrokenThings() {
        System.out.println("Restroom: Screwing up ToiletBowl Knob");
    }

    @Override
    public void procedeWashBowl() {

    }

    @Override
    public void procedeToiletBowl() {
        System.out.println("Restroom: Water cleaning toiletbowl with Sanox");
    }

    // Переопределяем два метода из вышестоящего класса, которые не нужно запускать, – делаем их пустыми

    @Override
    public void procedeCarpets() {

    }

    @Override
    public void procedeParquetFloor() {

    }
}
