package client;
import com.sun.corba.se.pept.transport.ContactInfo;
import model.Contact;
import rmiinterface.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {
    private static RMIInterface look_up;

    public static void main(String[] args)
            throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
        //String txt = JOptionPane.showInputDialog("What is your name?");

        Contact response = look_up.getContact();
        JOptionPane.showMessageDialog(null, response.getName() + " " + response.getTelefone());

    }
}
