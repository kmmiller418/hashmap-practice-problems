import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOUs;

    public IOU(){
        this.IOUs = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        IOUs.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return IOUs.containsKey(toWhom) ? IOUs.get(toWhom) : 0;
        
    }
}
