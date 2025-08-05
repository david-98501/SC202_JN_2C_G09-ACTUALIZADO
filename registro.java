import javax.swing.*;

public class Registro {

    private String[] nombre;
    private int[] cedula;
    private int[] celular;
    private String[] correo;
    private String[] direccion;

    private int cantidad;

    public Registro(int cantidad) {
        this.cantidad = cantidad;
        nombre = new String[cantidad];
        cedula = new int[cantidad];
        celular = new int[cantidad];
        correo = new String[cantidad];
        direccion = new String[cantidad];
    }

    public void registrarClientes() {
        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Registro del cliente #" + (i + 1));

            nombre[i] = JOptionPane.showInputDialog("Digite su nombre");
            cedula[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula"));
            celular[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite su celular"));
            correo[i] = JOptionPane.showInputDialog("Digite su correo");
            direccion[i] = JOptionPane.showInputDialog("Digite su direccion");

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
            if (edad < 18) {
                JOptionPane.showMessageDialog(null, "Lo sentimos, por politicas del hotel no registramos menores de edad.");
                i--;
            }
        }
    }

    public void mostrarClientes() {
        for (int i = 0; i < cantidad; i++) {
            String mensaje = "Cliente #" + (i + 1) + "\n" +
                    "Nombre: " + nombre[i] + "\n" +
                    "Cedula: " + cedula[i] + "\n" +
                    "Celular: " + celular[i] + "\n" +
                    "Correo: " + correo[i] + "\n" +
                    "Direccion: " + direccion[i] + "\n";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public String[] getNombres() { return nombre; }
    public String[] getCorreos() { return correo; }
    public int[] getCelulares() { return celular; }
    public int getCantidad() { return cantidad; }
}
