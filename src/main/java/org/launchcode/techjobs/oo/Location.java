package org.launchcode.techjobs.oo;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location job = (Location) o;
        return getId() == job.getId();
    }


}
