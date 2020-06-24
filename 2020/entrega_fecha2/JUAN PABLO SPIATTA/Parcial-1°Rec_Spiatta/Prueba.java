public class Prueba
{
    /*Todo lo que escribi en esta main lo hice con el fin de
     * probar el funcionamiento de los metodos del parcial y otros*/
    
    
    public static void main(String[] args)
    {
        Localidad l1 = new Localidad("Pergamino");
        Localidad l2 = new Localidad("Junin");
         
        
        Centro c1 = new Intensivo("Centro de Pergamino",l1);
        Centro c2 = new Preventivo("Centro de Junin",l2,"Responsable_1");

        c2.nuevaSala(1);
        c2.nuevaSala(2);
        c2.nuevaSala(3);
        
        c1.nuevaSala(2);
        c1.nuevaSala(3);
        
        c1.agregaMedicos("Medico_1","apellido",25,0000001,01,"Especialidad_1");
        c1.agregaMedicos("Medico_2","apellido",25,0000002,02,"Especialidad_2");
        c1.agregaMedicos("Medico_3","apellido",25,0000003,03,"Especialidad_3");
        
       
        /*Pacientes Pergamino*/
        Paciente p1 = new Paciente("Paciente_1","apellido",22,1,l1);
        Paciente p2 = new Paciente("Paciente_2","apellido",22,2,l1);
        Paciente p3 = new Paciente("Paciente_3","apellido",22,3,l1);
        Paciente p4 = new Paciente("Paciente_4","apellido",22,4,l1);
        Paciente p5 = new Paciente("Paciente_5","apellido",22,5,l1);
        Paciente p6 = new Paciente("Paciente_6","apellido",22,6,l1);
        /*JPacientes Junin*/
        Paciente p7 = new Paciente("Paciente_1","apellido",22,7,l2);
        Paciente p8 = new Paciente("Paciente_2","apellido",22,8,l2);
        Paciente p9 = new Paciente("Paciente_3","apellido",22,9,l2);
        Paciente p10 = new Paciente("Paciente_4","apellido",22,10,l2);
        Paciente p11 = new Paciente("Paciente_5","apellido",22,11,l2);
        
        /*Cargo los pacientes de junin*/
        c2.agregaPaciente(p1);
        c2.agregaPaciente(p2);
        c2.agregaPaciente(p3);
        c2.agregaPaciente(p4);
        c2.agregaPaciente(p5);
        c2.agregaPaciente(p6);
        /*Cargo los pacientes de Pergamino*/
        c1.agregaPaciente(p7);
        c1.agregaPaciente(p8);
        c1.agregaPaciente(p9);
        c1.agregaPaciente(p10);
        c1.agregaPaciente(p11);
        
        MinisterioSalud ms = new MinisterioSalud();
        
        ms.cargaCentros(c1);
        ms.cargaCentros(c2);
        ms.cargaCentros(c2); /*No permite repetidos asi que no se carga// Podria cargar otro objeto 
                               con los mismos datos pero no el mismo objeto*/
        
        ms.agregarNuevaSala(c1,5); 
        ms.agregarNuevaSala(c2,5);
        
        ms.agregarPaciente(c1,p1);
        ms.agregarPaciente(c1,p2);
        
        System.out.println("Vector de salas llenas: " + ms.salasLlenas());
        
        System.out.println("Cantidad de medicos: " + ms.cantidadDeMedicos());
        System.out.println("Cantidad de centros de Aislamiento: " + ms.totalCentroAislamiento()); 
        System.out.println("Cantidad de salas en total: " + ms.cantidadTotalSalas()); //Son 7, 5 ya estaban y 2 agregue
        
    }
}
