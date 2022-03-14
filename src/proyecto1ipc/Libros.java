/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1ipc;



public class Libros {
    
private int id;
private String titulo;
private String autor;
private int copias;
private String tipo;

    public Libros(int id, String titulo, String autor, String tipo, int copias) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.copias = copias;
    }

    public Libros() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  

   



}
