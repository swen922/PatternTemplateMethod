package cleaning;

public class CleaningKidsRoom extends Cleaning {

    public CleaningKidsRoom() {
        System.out.println("\nStarting cleaning KidsRoom...");
    }

    @Override
    public void procedeFurniture() {
        System.out.println("KidsRoom: Up the boxes from bed");
    }

    @Override
    public void procedeTableware() {

    }

    @Override
    public void procedeThings() {
        System.out.println("KidsRoom: Up and out everything");
    }

    @Override
    public void procedeClothes() {
        System.out.println("KidsRoom: Up and out clothes");
    }

    @Override
    public void procedeCatsTray() {

    }

    @Override
    public void procedeWashThingsPot() {

    }

    @Override
    public void procedeUnderWardrobe() {
        System.out.println("KidsRoom: Finding small tous under wardrobs");
    }

    @Override
    public void procedeWindowSill() {
        System.out.println("KidsRoom: Ordering something between chaos");
    }

    @Override
    public void fixBrokenThings() {
        System.out.println("KidsRoom: Throw to recycle bin everything not recognized");
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
