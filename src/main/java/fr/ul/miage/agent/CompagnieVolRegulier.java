package fr.ul.miage.agent;

import jade.core.Agent;

public class CompagnieVolRegulier extends Agent {

    @Override
    protected void setup() {
        super.setup();
        System.out.println(CompagnieVolRegulier.class.getName()+" started");
    }
}
