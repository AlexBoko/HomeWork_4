package transport;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int experienceInYear;

    public Driver(String name,
                  boolean hasDriverLicense,
                  int experienceInYear) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceInYear = experienceInYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public void setExperienceInYear(int experienceInYear) {
        this.experienceInYear = experienceInYear;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();
}


