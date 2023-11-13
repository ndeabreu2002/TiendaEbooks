class Ebook {
    private String nombre;
    private int cantidadPaginas;
    private String autor;
    private String genero;
    private double precio;

    // Constructor
    public Ebook(String nombre, int cantidadPaginas, String autor, String genero, double precio) {
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void displayInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Páginas: " + cantidadPaginas);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Precio: " + precio);
    }
}