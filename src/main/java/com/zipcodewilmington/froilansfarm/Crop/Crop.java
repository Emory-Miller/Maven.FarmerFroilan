package com.zipcodewilmington.froilansfarm.Crop;


import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;


//public class Crop <T extends Produce>{
public class Crop <T> implements Produce {
    public boolean hasBeenHarvested = false;
    public boolean hasBeenFertilized = false;
    public boolean getHarvested() {
        return hasBeenHarvested;
    }

    public void setHarvestToFalse() {
        hasBeenHarvested = false;
    }

    public void setHarvestToTrue() {
        hasBeenHarvested = true;
    }

    public void setFertilizedTrue() {
        hasBeenFertilized = true;
        //    corn.fertilized();
    }

    public boolean getFertilized() {
        return hasBeenFertilized;
    }

    public void setFertilizedFalse() {
        hasBeenFertilized = false;
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public void fertilized() {

    }

    @Override
    public Edible yield() {
        hasBeenHarvested=true;
        return null;
    }

}
