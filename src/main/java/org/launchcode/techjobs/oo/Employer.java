package org.launchcode.techjobs.oo;

public class Employer extends JobField {

   public Employer(String value){
       super(value);
   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer job= (Employer) o;
        return getId() == job.getId();
    }
}
