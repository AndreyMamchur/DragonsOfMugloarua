package ua.DragonsOfMugolar.entity;

import com.google.gson.annotations.Expose;

public class Dragon {
    @Expose
    private int scaleThickness;
    @Expose
    private int clawSharpness;
    @Expose
    private int wingStrength;
    @Expose
    private int fireBreath;

    public Dragon() {
    }

    public Dragon(int scaleThickness, int clawSharpness, int wingStrength, int fireBreath) {
        this.scaleThickness = scaleThickness;
        this.clawSharpness = clawSharpness;
        this.wingStrength = wingStrength;
        this.fireBreath = fireBreath;
    }

    public int getScaleThickness() {
        return scaleThickness;
    }

    public void setScaleThickness(int scaleThickness) {
        this.scaleThickness = scaleThickness;
    }

    public int getClawSharpness() {
        return clawSharpness;
    }

    public void setClawSharpness(int clawSharpness) {
        this.clawSharpness = clawSharpness;
    }

    public int getWingStrength() {
        return wingStrength;
    }

    public void setWingStrength(int wingStrength) {
        this.wingStrength = wingStrength;
    }

    public int getFireBreath() {
        return fireBreath;
    }

    public void setFireBreath(int fireBreath) {
        this.fireBreath = fireBreath;
    }

}
