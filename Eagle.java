public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        altitude += meters;
        System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        return altitude;
    }

    @Override
    public int descend(int meters) {
        altitude -= meters;
        System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        return altitude;
    }

    @Override
    public void land() {
        if (altitude == 0 && flying) {
            flying = false;
            System.out.printf("%s lands on the ground.%n", this.getName());
        }
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%sglides into the air.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't glide.%n", this.getName());
        }
    }

}
