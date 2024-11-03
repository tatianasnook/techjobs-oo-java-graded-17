package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId(), 0.001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testerJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testerJob.getName() instanceof String);
        assertTrue(testerJob.getEmployer() instanceof Employer);
        assertTrue(testerJob.getLocation() instanceof Location);
        assertTrue(testerJob.getPositionType() instanceof PositionType);
        assertTrue(testerJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", testerJob.getName());
        assertEquals("ACME", testerJob.getEmployer().getValue());
//        System.out.println(testerJob.getEmployer());
//        System.out.println(testerJob.getEmployer().getValue());
        assertEquals("Desert", testerJob.getLocation().getValue());
        assertEquals("Quality control", testerJob.getPositionType().getValue());
        assertEquals("Persistence", testerJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("AcME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

}
