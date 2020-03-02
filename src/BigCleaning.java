import cleaning.*;

public class BigCleaning {

    public void cleanup() {
        CleaningBathroom cleaningBathroom = new CleaningBathroom();
        procedeAllCleanups(cleaningBathroom);

        CleaningBedroom cleaningBedroom = new CleaningBedroom();
        procedeAllCleanups(cleaningBedroom);

        CleaningKidsRoom cleaningKidsRoom = new CleaningKidsRoom();
        procedeAllCleanups(cleaningKidsRoom);

        CleaningCorridor cleaningCorridor = new CleaningCorridor();
        procedeAllCleanups(cleaningCorridor);

        CleaningKitchenHall cleaningKitchenHall = new CleaningKitchenHall();
        procedeAllCleanups(cleaningKitchenHall);

        CleaningRestroom cleaningRestroom = new CleaningRestroom();
        procedeAllCleanups(cleaningRestroom);

    }

    private void procedeAllCleanups(Cleaning cleaning) {
        cleaning.procedeFurniture();
        cleaning.procedeTableware();
        cleaning.procedeThings();
        cleaning.procedeClothes();
        cleaning.procedeCatsTray();
        cleaning.procedeWashThingsPot();
        cleaning.procedeUnderWardrobe();
        cleaning.procedeWindowSill();
        cleaning.fixBrokenThings();
        cleaning.procedeWashBowl();
        cleaning.procedeToiletBowl();
        cleaning.procedeCarpets();
        cleaning.procedeParquetFloor();
        cleaning.procedeTileFloor();
    }

}
