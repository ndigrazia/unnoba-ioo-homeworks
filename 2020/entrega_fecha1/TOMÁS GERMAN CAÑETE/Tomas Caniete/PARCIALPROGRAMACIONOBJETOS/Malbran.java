        import java.util.Vector;
        import java.util.Date;
        public class Malbran
        {
           private Vector<Resultado> resultadospositivos = new Vector<Resultado>();
           private Vector<Institucion> instituciones = new Vector<Institucion>();
           private Vector<Resultado> resultadostotal = new Vector<Resultado>();
           private Persona director;
           
           public void addInstitucion(Institucion institucion){
            instituciones.add(institucion);
            }
            public void removeInstitucion(Institucion institucion){
            instituciones.remove(institucion);
            }
            public void addResultado(Resultado resultado){
             resultadostotal.add(resultado);
            }
            public void setDirector(Persona director){
            this.director=director;
            }
            public Persona getDirector(){
                return this.director;
            }
            public void agregarResultadoPositivo(Test test, Institucion institucion){
                Date fecha;
                fecha=new Date();
                Resultado n= new Resultado(fecha, institucion, true, test);
                resultadospositivos.add(n);
                instituciones.add(institucion);
                resultadostotal.add(n);
            }
            public int getTotalSerologicos(){
                                int serologicostotal=0;
                for(Resultado r:resultadospositivos){
                if(r.getTest().isSerologico()==true){
                  serologicostotal+=1;  
                }
               
                }
                 return serologicostotal;
            }
            public double tiempoTotalMinutos(){
                int tiempo = 0;
                for(Resultado r:resultadostotal)
                {
                    tiempo+=r.getTest().getTiempoResultado();
                }
                return tiempo; 
            }
            

   
}
