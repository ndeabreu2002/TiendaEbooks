public class Main {
    public static void main(String[] args) {
        TiendaEbooks tienda = new TiendaEbooks("Mi Tienda", "Propietario", "ID-123");

        Ebook ebook1 = new Ebook("El Gran Libro", 300, "Autor A", "Aventura", 15.99);
        Ebook ebook2 = new Ebook("Historias Cortas", 150, "Autor B", "Drama", 9.99);
        Ebook ebook3 = new Ebook("Aventura Extrema", 400, "Autor A", "Aventura", 19.99);

        tienda.agregarEbook(ebook1);
        tienda.agregarEbook(ebook2);
        tienda.agregarEbook(ebook3);

        System.out.println("Ebooks en la tienda:");
        tienda.listarEbooks();

        tienda.eliminarPorGenero("Aventura");
        System.out.println("\nEbooks después de eliminar por género 'Aventura':");
        tienda.listarEbooks();

        System.out.println("\nEbook del autor 'Autor A':");
        tienda.buscarPorAutor("Autor A");
    }
}
