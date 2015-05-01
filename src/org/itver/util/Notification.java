/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itver.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author vrebo
 */
public class Notification {

    private Notification() {
    }

    public static void error(Component c, String message) {
        JOptionPane.showMessageDialog(c, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void info(Component c, String message) {
        JOptionPane.showMessageDialog(c, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}
