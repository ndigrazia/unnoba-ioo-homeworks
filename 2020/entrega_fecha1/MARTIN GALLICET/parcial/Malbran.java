import java.util.List;
import java.util.ArrayList;

public class Malbran
{
    private Director director;
    private List<Instituto> instituciones = new ArrayList<Instituto>();

	
     public void addInstituto(Instituto i) {
		instituciones.add(i);
	}
	
	
     public void removeInstituto(Instituto i) {
		instituciones.remove(i);
	}
 
}
