import java.util.ArrayList;
import java.util.List;

public class GenerateNumbers {

    private List<Integer> digits = new ArrayList<Integer>();

    private String fullNumber;

    GenerateNumbers(){

        this.addDigits();


    }

    public void addDigits(){

        for(int x=0; x<4;x++)

        digits.add((int) (Math.random()*9)+1);

    }





    public List<Integer> getDigitArray(){

        return this.digits;
    }





}
