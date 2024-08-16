/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import vista.FramesMenuPrincipal;
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Gabriel
 */
public class Main {

    public static void main(String[] args) {

        try {

            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;

                }

            }

        } catch (Exception e) {

        }
        EventQueue.invokeLater(() -> {

            FramesMenuPrincipal frm = new FramesMenuPrincipal();
            frm.setVisible(true);

        });

    }
}
