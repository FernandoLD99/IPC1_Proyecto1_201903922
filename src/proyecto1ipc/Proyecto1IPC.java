


package proyecto1ipc;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Proyecto1IPC {


   public static ArrayList<Libros> libros = new ArrayList();
   public static  ArrayList<Prestamos> prestamos = new ArrayList();
   public static  ArrayList<Login> usuarios = new ArrayList();

    public static void main(String[] args) {
         
        usuario1();
        ventanaLogin();
        
        
    }
    public static void ventanaLogin(){
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void usuario1(){
        Login user1 = new Login();
        user1.setUsuario("Fernando");
        user1.setPassword("123"); 
        user1.setTipo("1");
        
        usuarios.add(user1);
    }
    
    public static void ventanaLibros(){
        VentanaLibros ventana = new VentanaLibros();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
    public static void ingresarLibro(){
    String autor, titulo, tipo;
        int id, copias, i;
        
        Scanner nc = new Scanner(System.in);
        
        
        
        for (i = 0; i < 1; i++) {
            Libros ejemplar = new Libros();
            id = Integer.parseInt(JOptionPane.showInputDialog("ingrese ID"));
            titulo = JOptionPane.showInputDialog("ingrese titulo");
            autor = JOptionPane.showInputDialog("ingrese autor");
            tipo = JOptionPane.showInputDialog("ingrese tipo");
            copias = Integer.parseInt(JOptionPane.showInputDialog("ingrese copias"));
            
         ejemplar.setId(id); 
         ejemplar.setTitulo(titulo);
         ejemplar.setAutor(autor);
         ejemplar.setTipo(tipo);
         ejemplar.setCopias(copias);
         
         //se ingresa al array
         libros.add(ejemplar);
    }
        Iterator<Libros> itrlibro = libros.iterator();
        
        while(itrlibro.hasNext()){
            Libros ejemplar = itrlibro.next();
            System.out.println(ejemplar.getId());
            System.out.println(ejemplar.getTitulo());
            System.out.println(ejemplar.getAutor());
            System.out.println(ejemplar.getCopias());            
            System.out.println(ejemplar.getTipo());
            
        } 
    }
    
    public static void ingresarPrestamo(){
    String usuario, libro, fecha;
        //int id, copias, i;
        
        Scanner nc = new Scanner(System.in);
        
        
        
        for (int i = 0; i < 1; i++) {
            Prestamos ejemplar = new Prestamos();
             
            usuario = JOptionPane.showInputDialog("ingrese usuario");
            libro = JOptionPane.showInputDialog("ingrese libro");
            fecha = JOptionPane.showInputDialog("ingrese fecha");
            
            
         ejemplar.setUsuario(usuario); 
         ejemplar.setLibro(libro);
         ejemplar.setFecha(fecha);
         
         
         //se ingresa al array
         prestamos.add(ejemplar);
    }
        //Iterator<Prestamos> itrprestamo = prestamos.iterator();
        
         
    }
    
    
    

    

    
   
    
    
}
