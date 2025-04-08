package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");   
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_case_1_check() {
        assertEquals(team.equals(team), true);
    }

    @Test
    public void equals_case_2_check() {
        Object obj = new Object();
        assertEquals(team.equals(obj), false);
    }

    @Test
    public void equals_case_3_same_name_and_mem() {
        Team teamsame = new Team();
        teamsame.setName("test-team");
        assertEquals(team.equals(teamsame), true);
    }

    @Test
    public void equals_case_3_same_name_diff_mem() {
        Team nameSameMemDiff = new Team();
        nameSameMemDiff.setName("test-team");
        nameSameMemDiff.addMember("member_diff");
        assertEquals(team.equals(nameSameMemDiff), false);
    }

    @Test
    public void equals_case_3_diff_name_same_mem() {
        Team nameDiffMemSame = new Team();
        nameDiffMemSame.setName("test-team-diff");
        assertEquals(team.equals(nameDiffMemSame), false);
    }

    @Test
    public void equals_case_3_diff_name_diff_mem() {
        Team allDiff = new Team();
        allDiff.setName("test-team-diff");
        allDiff.addMember("member-diff");
        assertEquals(team.equals(allDiff), false);
    }

    @Test
    public void hash_match() {
        // Team t1 = new Team();
        // t1.setName("foo");
        // t1.addMember("bar");
        // Team t2 = new Team();
        // t2.setName("foo");
        // t2.addMember("bar");
        // assertEquals(t1.hashCode(), t2.hashCode());

        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }


}
