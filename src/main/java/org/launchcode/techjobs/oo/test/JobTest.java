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
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", objTest1.getName());
        assertEquals("ACME", objTest1.getEmployer().getValue());
        assertEquals("Desert", objTest1.getLocation().getValue());
        assertEquals("Quality control", objTest1.getPositionType().getValue());
        assertEquals("Persistence", objTest1.getCoreCompetency().getValue());
        assertTrue(objTest1.getName() instanceof String);
        assertTrue(objTest1.getEmployer() instanceof Employer);
        assertTrue(objTest1.getLocation() instanceof Location);
        assertTrue(objTest1.getPositionType() instanceof PositionType);
        assertTrue(objTest1.getCoreCompetency() instanceof CoreCompetency);

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
    @Test
    public void testToStringHandlesEmptyJob() {
        String ExpectedData = "\nOOPS! This job does not seem to exist.\n";
        Job Objtest = new Job();
        String actualData =Objtest.toString();
        assertEquals(ExpectedData,actualData);
    }
}
