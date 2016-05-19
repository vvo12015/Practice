package workshop4;

public class Doubles {

    public Double parse(String s) {
        Double result;

        try{
            result = Double.valueOf(s);
            return result;
        }catch (Exception e){
            return null;
        }

    }

}
