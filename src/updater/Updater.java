/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updater;

import java.io.File;
import java.net.URL;

/**
 *
 * @author parke
 */
public class Updater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        args = new String[]{"C:\\GitHub\\MIPS\\dist\\MIPS.jar","https://github.com/ParkerTenBroeck/MIPS/releases/download/0.9.1/MIPS.jar"};

        MainGUI gui = new MainGUI();

        File jarFile = null;
        URL jarURL = null;

        try {
            jarFile = new File(args[0]);
        } catch (Exception e) {

        }
        try {
            jarURL = new URL(args[1]);
        } catch (Exception e) {

        }
        gui.update(jarFile, jarURL);
    }

}
