package com.telas.vehicles;

public class VeredaGT implements Vehicle {

    private String matricula;
    private float maxEnergy;
    private float energy;
    private int movementCount = 0;
    private float energyDelta;

    public VeredaGT(String matricula, float maxEnergy, float energy, float energyDelta) {

        this.matricula = matricula;

        if (maxEnergy < 0) {
            System.out.println("NO SE PUEDE INTRODUCIR UN VALOR NEGATIVO, SE PONDRÁ COMO VALOR INICIAL \"0\"");
            this.maxEnergy = 0;
        } else {
            this.maxEnergy = maxEnergy;
        }

        if (energy < 0) {
            System.out.println("NO SE PUEDE INTRODUCIR UN VALOR NEGATIVO, SE PONDRÁ COMO VALOR INICIAL \"0\"");
            this.energy = 0;
        } else {
            this.energy = energy;
        }

        if (energyDelta < 0) {
            System.out.println("NO SE PUEDE INTRODUCIR UN VALOR NEGATIVO, SE PONDRÁ COMO VALOR INICIAL \"0\"");
            this.energy = 0;
        } else {
            this.energyDelta = energyDelta;
        }

    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        if (energy != maxEnergy) {
            energy = maxEnergy;
            System.out.println("- Vehículo recargado al máximo -");
        } else {
            System.out.println("- Ya está cargado al tope -");
        }

    }

    @Override
    public void move() {
        if (energy >= energyDelta) {
            movementCount++;
            energy = energy - energyDelta;
        } else {
            System.out.println("No hay energía suficiente :(");
        }
    }

    @Override
    public String status() {
        return "El vehículo " + matricula + " tiene un nivel de carga de: " + energy + " Watios y se ha movido " + movementCount + " veces.";
    }

}
