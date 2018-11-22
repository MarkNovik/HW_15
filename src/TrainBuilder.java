import java.util.Random;

class TrainBuilder {
    private static int amountOfCarriages = DataTaker.takeAmountOfCarriages();
    private static int[] typeOfCarriages = DataTaker.takeTypeOfCarriages(amountOfCarriages);
    private static String departCity = DataTaker.takeDepartCity();
    private static String arriveCity = DataTaker.takeArriveCity();


    static void buildTrain() {
        Random rand = new Random();
        System.out.println("Train goes from " + departCity + " to " + arriveCity);
        System.out.println("Train scheme:");
        System.out.print("<:locomotive]");
        for (int i = 0; i < amountOfCarriages; i++) {
            if (typeOfCarriages[i] == 1) {
                System.out.print("=[passngr, 1st class, " + rand.nextInt(100) + "]");
            } else if (typeOfCarriages[i] == 2) {
                System.out.print("=[psngr, 2nd class, " + rand.nextInt(200) + "]");
            } else if (typeOfCarriages[i] == 3) {
                System.out.print("=[cargo, " + rand.nextInt(100) + "%]");
            }
        }

    }
}

