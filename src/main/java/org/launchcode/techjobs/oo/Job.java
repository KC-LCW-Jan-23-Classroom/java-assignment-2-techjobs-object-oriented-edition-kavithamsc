package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String strJob;
        if ((name == null || name.isEmpty()) &&
                (employer == null || employer.getValue().isEmpty()) &&
                (location == null || location.getValue().isEmpty()) &&
                (positionType == null || positionType.getValue().isEmpty()) &&
                (coreCompetency == null || coreCompetency.getValue().isEmpty())){
            strJob = "\nOOPS! This job does not seem to exist.\n";
        } else {
            strJob = "\nID: " + id + "\n" +
                    "Name: " + (name.isEmpty() ? "Data not available" : name) + "\n" +
                    "Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer) + "\n" +
                    "Location: " + (location.getValue().isEmpty() ? "Data not available" : location) + "\n" +
                    "Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType) + "\n" +
                    "Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency) + "\n" ;
        }
        return strJob;
    }
}
