package ch.bfh.www.documentUploader;
import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ch.bfh.www.ehrservices.entities.Documentrepository;
import ch.bfh.www.util.Utility;

public class DocumentUploader {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocumentUploader window = new DocumentUploader();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DocumentUploader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser fileChooser = new JFileChooser();
		int option = fileChooser.showSaveDialog(null);
		frame.add(fileChooser);
		
		if(option == JFileChooser.APPROVE_OPTION)
        {
            Utility.getEM().getTransaction().begin();
            try {
	            ch.bfh.www.ehrservices.entities.Documentrepository document = new Documentrepository();
	            File file = fileChooser.getSelectedFile();
	            byte[] byteArray;
	            int size = (int) file.length();
	            byteArray = new byte[size];
	            DataInputStream dis = new DataInputStream(new FileInputStream(file)); 
	            int read = 0;
	            int numRead = 0;
	            while (read < byteArray.length && (numRead=dis.read(byteArray, read, byteArray.length-read)) >= 0) {
	            	read = read + numRead;
	            }
	            System.out.println("File size: " + read);
	            // Ensure all the bytes have been read in
	            if (read < byteArray.length) {
	            	System.out.println("Could not completely read: "+file.getName());
	            }
	            
	            document.setDocument(byteArray);
	            
	            Utility.getEM().persist(document);
	            Utility.getEM().getTransaction().commit();
	            
	            JOptionPane.showMessageDialog(null, "Erfolgreich gespeichert!");
            }
            catch (Exception e){
            	e.getMessage();
            }
        }
		else if(option == JFileChooser.CANCEL_OPTION) {
			System.exit(0);
		}
		else if(option == JFileChooser.ABORT) {
			System.exit(0);
		}
		else {
			// nix
		}
	}

}
