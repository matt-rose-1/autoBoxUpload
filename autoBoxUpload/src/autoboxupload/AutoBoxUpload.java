/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxupload;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author mrose
 */
public class AutoBoxUpload extends JFrame {

    private static final int JFXPANEL_WIDTH_INT = 500;
    private static final int JFXPANEL_HEIGHT_INT = 350;
    private JLabel logoHolder;
    private ImageIcon logo, newLogo;
    private Image image;
    private File file = new File("images/RadTechLogo2.png");
    BufferedImage buffImg = null;

    /**
     * @param args the command line arguments
     */
    public AutoBoxUpload() {
//        super("Login To Box.com");
//
//        this.setLayout(new BorderLayout());
//
//        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //what to do when the window closes.
//        this.setSize(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT); //set size of the window
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //get dimension of screen
//        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //set window to middle of user's screen
//
//        //LOAD THE LOGO
//        try {
//            buffImg = ImageIO.read(getClass().getClassLoader().getResource("images/RadTechLogo2.png")); 
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Image reBuffImg = buffImg.getScaledInstance(JFXPANEL_WIDTH_INT/2, JFXPANEL_HEIGHT_INT/4, Image.SCALE_SMOOTH);
//        logoHolder = new JLabel(new ImageIcon(reBuffImg));
//        this.add(logoHolder, BorderLayout.PAGE_START);
//
//        //LOAD THE USERNAME
//        
//        this.setVisible(true);
    }

    private static void createAndShowGUI() {
//        AutoBoxUpload me = new AutoBoxUpload();
            LoginToBox t = new LoginToBox();
            t.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
