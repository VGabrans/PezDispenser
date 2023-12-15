package org.example;

public class PezDispenser {

    //PEZ DICPENSER //


    private String modelName;
    private int  dispenserCapacity;
    private int candyInDispenser;
    private String modelColor;

    //CANDY COLOR STRING :
    private String[] colorNames = {
            "Candy Color is : Red", "Candy Color is : Orange", "Candy Color is : Yellow", "Candy Color is : Green", "Candy Color is : Blue",
            "Candy Color is : Cyan", "Candy Color is : Magenta", "Candy Color is : Pink", "Candy Color is : Gray", "Candy Color is : Light Gray",
            "Candy Color is : Dark Gray", "Candy Color is : Black"
    };
    public String getModel() {
        return modelName;
    }
    public void setModel(String model) {
        this.modelName = model;
    }

    public int getDispenserCapacity() {
        return dispenserCapacity;
    }

    public void setDispenserCapacity(int dispenserCapacity) {
        this.dispenserCapacity = dispenserCapacity;
    }

    public int getCandyInDispenser() {
        return candyInDispenser;
    }

    public void setCandyInDispenser(int candyInDispenser) {
        this.candyInDispenser = candyInDispenser;
    }


    public PezDispenser(String modelName,String modelColor) {
        this.modelName = modelName;
        this.dispenserCapacity = 12;
        this.candyInDispenser = 12;
        this.modelColor = modelColor;

    }

//    I eat candy

    public void  eatCandy() {

        int[] candyThresholds = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        if (candyInDispenser == 0 ){
            System.out.println("No more Candy: Need Reload ");
        } else {
            System.out.println("I Eat Candy: Tasty");
            candyInDispenser --;

            System.out.println( getColorForCandyCount(candyInDispenser, candyThresholds));
        }

    }

    //FOR CANDY COLOR :
    private String getColorForCandyCount(int candyCount, int[] thresholds) {
        for (int i = 0; i < thresholds.length; i++) {
            if (candyCount >= thresholds[i]) {
                return colorNames[i];
            }
        }
        return colorNames[colorNames.length - 1];
    }


    //charge candy

    public void candyReload(int candyCount){
        if (candyCount <= 0) {
            System.out.println("No way to load nothing");
        } else {
            System.out.println("Total Candy : " + getCandyInDispenser());
            System.out.println("Yo add : " + candyCount + " Candy");
            if (candyCount >= getDispenserCapacity() || candyCount + getCandyInDispenser() > getDispenserCapacity()) {
                System.out.println("Maximum Candy limit is: " + getDispenserCapacity());
                int diff = getDispenserCapacity() - getCandyInDispenser();
                System.out.println("I will add " + diff + " Candy");
                setCandyInDispenser(getCandyInDispenser() + diff);
                System.out.println("Dispenser now is full, quantity is: " + getCandyInDispenser());
            } else if (candyCount + getCandyInDispenser() <= getDispenserCapacity()) {
                setCandyInDispenser(getCandyInDispenser() + candyCount);
                System.out.println("Now you have : " + getCandyInDispenser() + " Candy");
            }
        }


    }
    @Override
    public String toString() {
        return "org.example.PezDispenser{" +
                "modelName='" + modelName + '\'' +
                ", dispenserCapacity=" + dispenserCapacity +
                ", candyInDispenser=" + candyInDispenser +
                ", modelColor='" + modelColor + '\'' +
                '}';
    }
}

