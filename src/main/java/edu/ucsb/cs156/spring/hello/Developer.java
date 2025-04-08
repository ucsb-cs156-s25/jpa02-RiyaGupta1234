package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Riya G.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "RiyaGupta1234";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-06");
        team.addMember("Yarwin L.");
        team.addMember("Sanjana J.");
        team.addMember("Rachit G.");
        team.addMember("Aryan C.");
        team.addMember("Saeed A.");
        team.addMember("Riya G.");
        return team;
    }
}
