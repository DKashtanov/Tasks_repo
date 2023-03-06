package tasks.Task3.AbstractFactory.project_1_team;

import tasks.Task3.AbstractFactory.ITester;

public class Tester implements ITester {

    @Override
    public void testCode() {
        System.out.println("Team 1 Tester is testing code.");
    }
}