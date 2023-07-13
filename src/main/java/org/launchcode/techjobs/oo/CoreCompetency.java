package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField {

    public CoreCompetency(String value){

        super(value);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency job= (CoreCompetency) o;
        return this.getId() == job.getId();
    }

}
