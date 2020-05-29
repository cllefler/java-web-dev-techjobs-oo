package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job;

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertEquals("Desert", test_job.getLocation().getValue());
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

    @Test
    public void firstTestForToString() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("" + test_job + "", test_job.toString());
    }

    @Test
    public void secondTestForToString() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + test_job.getId() + "\n" +
                "Name: " + test_job.getName() + "\n" +
                "Employer: " + test_job.getEmployer() + "\n" +
                "Location: " + test_job.getLocation() + "\n" +
                "Position Type: " + test_job.getPositionType() + "\n" +
                "Core Competency: " + test_job.getCoreCompetency() + "\n", test_job.toString());
    }

    @Test
    public void thirdTestForToString() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location(""),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + test_job.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", test_job.toString());
    }
}
