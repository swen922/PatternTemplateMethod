package cleaning;

public class CleaningCorridor extends Cleaning {

    public CleaningCorridor() {
        System.out.println("\nStarting cleaning Corridor...");
    }

    @Override
    public void procedeFurniture() {
        System.out.println("Corridor: Up and out slippers");
    }

    @Override
    public void procedeTableware() {

    }

    @Override
    public void procedeThings() {

    }

    @Override
    public void procedeClothes() {

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

    }

    @Override
    public void fixBrokenThings() {

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
    public void procedeParquetFloor() {

    }
}
