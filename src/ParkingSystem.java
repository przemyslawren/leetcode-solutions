public class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean hasSpace = false;
        switch (carType) {
            case 1 -> {
                if (big > 0) {
                    big--;
                    hasSpace = true;
                }
            }
            case 2 -> {
                if (medium > 0) {
                    medium--;
                    hasSpace = true;
                }
            }
            case 3 -> {
                if (small > 0) {
                    small--;
                    hasSpace = true;
                }
            }
        }
        return hasSpace;
    }


    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);

        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}


class ParkingSystem2 {
    int[] count;

    public ParkingSystem2(int big, int medium, int small) {
        count = new int[] {big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }


    public static void main(String[] args) {
        ParkingSystem2 parkingSystem = new ParkingSystem2(1,1,0);

        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));

    }
}
