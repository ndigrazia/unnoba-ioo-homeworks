ublic class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@example.com");
        Usuario usuario2 = new Usuario("María", "Gómez", "maria.gomez@example.com");

        Seguidor seguidor1 = new Seguidor("Carlos", "López", "carlos.lopez@example.com");
        Seguidor seguidor2 = new Seguidor("Ana", "Martínez", "ana.martinez@example.com");

        usuario1.suscribir(seguidor1);
        usuario1.suscribir(seguidor2);
        usuario2.suscribir(seguidor1);

        usuario1.publicar("¡Hola a todos!");
        usuario2.publicar("¡Buenos días!");
    }
}
