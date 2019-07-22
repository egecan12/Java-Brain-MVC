package sample;

public class BrainModel extends  Database {

    private String rawBrainName,rawBrainSmartLevel,rawBrainIq, brainName;

    private int smartLevel;

    private double iq;


    public BrainModel(String rawBrainName, String rawBrainSmartLevel, String rawBrainIq) {
        this.rawBrainName = rawBrainName;
        this.rawBrainSmartLevel = rawBrainSmartLevel;
        this.rawBrainIq = rawBrainIq;
    }


    // bu method sonucu direk test edip illegalExceptiona yonlendiriyor

    public void validateBrainName() throws IllegalArgumentException{

        if (rawBrainName.length() < 3 || rawBrainName.length()>45){

            throw new IllegalArgumentException(

                String.format("invalid brain name. "+ " length of %d is too small" +" or too big", rawBrainName.length())
            );

        }

        brainName=rawBrainName;

    }

    @Override
    public String toString() {
        return "BrainModel{" +
                "brainName='" + brainName + '\'' +
                ", smartLevel=" + smartLevel +
                ", iq=" + iq +
                '}';
    }
}
