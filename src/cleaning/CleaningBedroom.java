package cleaning;

public class CleaningBedroom extends Cleaning {

    public CleaningBedroom() {
        System.out.println("\nStarting cleaning Bedroom...");
    }

    @Override
    public void procedeFurniture() {
        System.out.println("Bedroom: Up the tabourets, pillows and lamps");
    }

    @Override
    public void procedeTableware() {

    }

    @Override
    public void procedeThings() {
        System.out.println("Bedroom: Up and out slippers");
    }

    @Override
    public void procedeClothes() {
        System.out.println("Bedroom: Up and out clothes");
    }

    @Override
    public void procedeCatsTray() {

    }

    @Override
    public void procedeWashThingsPot() {

    }

    @Override
    public void procedeUnderWardrobe() {

    }

    @Override
    public void procedeWindowSill() {
        System.out.println("Bedroom: Ordering something between flowers");
    }

    @Override
    public void fixBrokenThings() {
        System.out.println("Bedroom: Closing boxes under bed");
    }

    @Override
    public void procedeWashBowl() {

    }

    @Override
    public void procedeToiletBowl() {

    }

    // Переопределяем два метода из вышестоящего класса, которые не нужно запускать, – делаем их пустыми

    @Override
    public void procedeCarpets() {

    }

    @Override
    public void procedeTileFloor() {

    }
}
