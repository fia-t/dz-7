public enum Planet {
    MERCURY(1, 0, 0.387, 0.382, null, null),
    VENUS(2, 0.33, 0, 0.949, MERCURY, null),
    EARTH(3, 0.27,0, 1, VENUS, null),
    MARS(4, 2.5, 0, 0.532, EARTH, null),
    JUPITER(5, 5.203, 0, 11.21, MARS, null),
    SATURN(6, 9.539, 0, 9.45, JUPITER, null),
    URANUS(7, 19.18, 0, 4.01, SATURN, null),
    NEPTUNE(8, 30.07, 0, 3.88, URANUS, null);

    private int orderFromSun;
    private double distanceFromPrevious;
    private double distanceFromSun;
    private double radius;
    private Planet previousPlanet;
    private Planet nextPlanet;

    Planet(int orderFromSun, double distanceFromPrevious, double distanceFromSun, double radius, Planet previousPlanet, Planet nextPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
        if(previousPlanet == null) {
            // Якщо попередня планета не існує, значить це Меркурій і відстань до Сонця - вказана
            this.distanceFromSun = distanceFromSun;
        } else {
            // Обчислюємо відстань до Сонця, використовуючи відстань до попередньої планети та відстань до Сонця попередньої планети
            this.distanceFromSun = previousPlanet.distanceFromSun + distanceFromPrevious;
        }
    }
    static {
        MERCURY.nextPlanet = VENUS;
        VENUS.nextPlanet = EARTH;
        EARTH.nextPlanet = MARS;
        MARS.nextPlanet = JUPITER;
        JUPITER.nextPlanet = SATURN;
        SATURN.nextPlanet = URANUS;
        URANUS.nextPlanet = NEPTUNE;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
    public double getRadius() {
        return radius;
    }
    public Planet getPreviousPlanet() {
        return previousPlanet;
    }
    public Planet getNextPlanet() {
        return nextPlanet;
    }

}
