package AdvancedCodingExercise9;

import java.util.Objects;

public class Computer {

    private String processor;
    private int ramSizeInMb;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, int ramSizeInMb, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ramSizeInMb = ramSizeInMb;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSizeInMb() {
        return ramSizeInMb;
    }

    public void setRamSizeInMb(int ramSizeInMb) {
        this.ramSizeInMb = ramSizeInMb;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSizeInMb == computer.ramSizeInMb && Objects.equals(processor, computer.processor) && Objects.equals(graphicsCard, computer.graphicsCard) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ramSizeInMb, graphicsCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ramSizeInMb=" + ramSizeInMb +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
