package SagdiiRahimovHW.method;

public class Start extends Calculation {
    private double sumVolume;
    private double smallContVol;
    private double bigCountVol;

    //Constructor
    public Start() {
    }

    public Start(double sumVolume, double smallContVol, double bigCountVol) {
        this.sumVolume = sumVolume;
        this.smallContVol = smallContVol;
        this.bigCountVol = bigCountVol;
    }

    public double getSumVolume() {
        return sumVolume;
    }

    public void setSumVolume(double sumVolume) {
        this.sumVolume = sumVolume;
    }

    public double getSmallContVol() {
        return smallContVol;
    }

    public void setSmallContVol(double smallContVol) {
        this.smallContVol = smallContVol;
    }

    public double getBigCountVol() {
        return bigCountVol;
    }

    public void setBigCountVol(double bigCountVol) {
        this.bigCountVol = bigCountVol;
    }

}

