
package guia7;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
public class ejer1Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private Integer numPag;

    public ejer1Libro() {
    }

    public ejer1Libro(String ISBN, String titulo, String autor, Integer numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "ejer1Libro{" + "ISBN=" + ISBN +"\n"+ "Título=" + titulo +"\n"+ "Autor=" + autor +"\n"+ "Número de Páginas=" + numPag +"\n"+ '}';
    }
    
}
