package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job objTest1 = new Job();
        Job objTest2 = new Job();
        assertNotEquals(objTest1.getId(),objTest2.getId());
    }
   @Test
    public void testJobConstructorSetsAllFields(){
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertEquals("Product tester", objTest1.getName());
       assertEquals("ACME",objTest1.getEmployer().getValue());
       assertEquals("Desert",objTest1.getLocation().getValue());
       assertEquals("Quality control",objTest1.getPositionType().getValue());
       assertEquals("Persistence",objTest1.getCoreCompetency().getValue());
      assertTrue(objTest1.getName() instanceof String);
      assertTrue(objTest1.getEmployer() instanceof Employer);
      assertTrue(objTest1.getLocation() instanceof Location);
      assertTrue(objTest1.getPositionType() instanceof PositionType);
      assertTrue(objTest1.getCoreCompetency() instanceof  CoreCompetency);

    }
    @Test
    public void  testJobsForEquality(){
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job objTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(objTest1.equals(objTest2));
    }



}
