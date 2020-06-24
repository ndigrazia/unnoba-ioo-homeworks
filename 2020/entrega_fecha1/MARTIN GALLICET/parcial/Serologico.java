import java.util.List;
import java.util.ArrayList;

public class Serologico extends Test
{
    private int tiempo;   
    private List<Test> testeos = new ArrayList<Test>();

    public void addTesteos(List<Test> t) {
		testeos.addAll(t);
	}
	
    public void addTesteos(Test t) {
		testeos.add(t);
	}
	
    public void removeTesteos(Test t) {
		testeos.remove(t);
	}
    
    public int getTotalTesteos(){
    return testeos.size();
    }
    
    @Override
    public int tiempoTotalMinutos(){
           return  15;
    }
}
