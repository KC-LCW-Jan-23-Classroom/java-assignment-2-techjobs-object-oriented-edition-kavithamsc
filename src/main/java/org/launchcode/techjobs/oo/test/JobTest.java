package org.launchcode.techjobs.oo.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;

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
        Job objTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Assert.assertEquals("Product tester", objTest3.getName());
        Assert.assertEquals("ACME", objTest3.getEmployer().getValue());
        Assert.assertEquals("Desert", objTest3.getLocation().getValue());
        Assert.assertEquals("Quality control", objTest3.getPositionType().getValue());
        Assert.assertEquals("Persistence", objTest3.getCoreCompetency().getValue());
        Assert.assertTrue(objTest3.getName() instanceof String);
        Assert.assertTrue(objTest3.getEmployer() instanceof Employer);
        Assert.assertTrue(objTest3.getLocation() instanceof Location);
        Assert.assertTrue(objTest3.getPositionType() instanceof PositionType);
        Assert.assertTrue(objTest3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job objTest1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job objTest2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(objTest1.equals(objTest2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals('\n', objTest1.toString().charAt(0));
        Assert.assertEquals('\n', objTest1.toString().charAt(objTest1.toString().length()-1));
    }
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job objTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String ExpectedData ="\nID: " + objTest1.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";

    Assert.assertEquals(ExpectedData,objTest1.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job8 = new Job("Product tester", new Employer(""),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String expected = "\nID: 1\nName: Product tester\nEmployer: Data not available\n" +
                "Location: Desert\nPosition Type: Quality control\n" +
                "Core Competency: Persistence\n";
        String actual = job8.toString();
        System.out.println(expected + actual);
        Assert.assertEquals(expected , actual);
    }
   
}