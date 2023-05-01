public class SolarSystem {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Distance from Sun to planet "+planet.name()+'='+planet.getDistanceFromSun()+" AU");
        }

    }
}
