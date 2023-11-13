import java.util.ArrayList;
import java.util.Iterator;

class TiendaEbooks {
    private String nombreTienda;
    private String propietario;
    private String identificadorTributario;
    private ArrayList<Ebook> ebooks;

    // Constructor
    public TiendaEbooks(String nombreTienda, String propietario, String identificadorTributario) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.ebooks = new ArrayList<>();
    }

    // Método para agregar un eBook a la tienda
    public void agregarEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

    // Método para eliminar un eBook de la tienda por género
    public void eliminarPorGenero(String genero) {
        Iterator<Ebook> iterator = ebooks.iterator();
        while (iterator.hasNext()) {
            Ebook ebook = iterator.next();
            if (ebook.getGenero().equalsIgnoreCase(genero)) {
                iterator.remove();
            }
        }
    }

    // Método para buscar un eBook por autor
    public void buscarPorAutor(String autor) {
        for (Ebook ebook : ebooks) {
            if (ebook.getAutor().equalsIgnoreCase(autor)) {
                ebook.displayInfo();
            }
        }
    }

    // Método para listar todos los eBooks de la tienda
    public void listarEbooks() {
        for (Ebook ebook : ebooks) {
            ebook.displayInfo();
            System.out.println("--------------");
        }
    }
}
