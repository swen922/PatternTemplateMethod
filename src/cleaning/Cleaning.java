package cleaning;

public abstract class Cleaning {

    public abstract void procedeFurniture();

    public abstract void procedeTableware();

    public abstract void procedeThings();

    public abstract void procedeClothes();

    public abstract void procedeCatsTray();

    public abstract void procedeWashThingsPot();

    public abstract void procedeUnderWardrobe();

    public abstract void procedeWindowSill();

    public abstract void fixBrokenThings();

    public abstract void procedeWashBowl();

    public abstract void procedeToiletBowl();

    public void procedeCarpets() {
        System.out.println("Vacuum all carpets");
    }

    public void procedeParquetFloor() {
        System.out.println("Wash parquet floor with water and mop");
    }

    public void procedeTileFloor() {
        System.out.println("Wash tile floor with water and mop");
    }

}
