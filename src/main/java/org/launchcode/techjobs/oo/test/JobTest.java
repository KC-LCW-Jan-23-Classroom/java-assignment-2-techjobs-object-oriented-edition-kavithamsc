package org.launchcode.techjobs.oo.test;


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
    public void testSettingJobId() {
        Job Test1 = new Job();
        Job Test2 = new Job();
        assertNotEquals(Test1.getId(), Test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job objTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", objTest3.getName());
        assertEquals("ACME", objTest3.getEmployer().getValue());
        assertEquals("Desert", objTest3.getLocation().getValue());
        assertEquals("Quality control", objTest3.getPositionType().getValue());
        assertEquals("Persistence", objTest3.getCoreCompetency().getValue());
        assertTrue(objTest3.getName() instanceof String);
        assertTrue(objTest3.getEmployer() instanceof Employer);
        assertTrue(objTest3.getLocation() instanceof Location);
        assertTrue(objTest3.getPositionType() instanceof PositionType);
        assertTrue(objTest3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job objTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(objTest1.equals(objTest2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', objTest1.toString().charAt(0));
        assertEquals('\n', objTest1.toString().charAt(objTest1.toString().length()-1));
    }
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String ExpectedData ="\nID: " + objTest1.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";

    assertEquals(ExpectedData,objTest1.toString());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job objTest1 = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency(""));
        String ExpectedData ="\nID: " + objTest1.getId() + "\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Quality control\nCore Competency: Data not available\n";
        String actualData = objTest1.toString();
        assertEquals(ExpectedData,actualData);
    }
   
}
