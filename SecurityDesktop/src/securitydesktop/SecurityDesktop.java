/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitydesktop;

import controladores.LugarControlador;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import objetos.Lugar;

/**
 *
 * @author Gaston
 */
public class SecurityDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        LugarControlador controlador = new LugarControlador();
       // List <Lugar> ca = controlador.extraertodo();
       
      /* Lugar l = new Lugar();
       l.setNombreLugar("A");
       l.setUbicacion("b");
       l.setEmail("c");
       l.setEstado("d");*/
    //   controlador.insetar(l);
            //System.out.println(ca);
            File original = new File("E:\\Descargas\\security\\gatito.png");
            File destino = new File("E:\\Descargas\\security\\gatito2.jpg");

        try {
            comprimirImagen(original, destino, 0.5f);
        } catch (IOException ex) {
            Logger.getLogger(SecurityDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void comprimirImagen(File original, File destino, float calidad) throws IOException{
    RenderedImage imagen = ImageIO.read(original);
    ImageWriter jpegWrite = ImageIO.getImageWritersByFormatName("jpg").next();
    ImageWriteParam jpgWriteParam = jpegWrite.getDefaultWriteParam();
    jpgWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
    jpgWriteParam.setCompressionQuality(calidad);
    try(ImageOutputStream output = ImageIO.createImageOutputStream(destino)){
        jpegWrite.setOutput(output);
        IIOImage outputImage = new IIOImage(imagen,null,null);
        jpegWrite.write(null, outputImage, jpgWriteParam);
    }
    jpegWrite.dispose();
    
}
}
