package fr.ul.miage.agent;

import jade.core.Agent;

public class CompagnieVolCharter extends Agent{

    @Override
    protected void setup() {
        super.setup();
        System.out.println(CompagnieVolCharter.class.getName()+" started");
    }

    @Override
    protected void takeDown() {
        super.takeDown();
    }
}
