package de.giorgio.ogl.frame;

import javax.swing.*;

/**
 * The main class to start the OpenGL application.
 */
public class Main {

    /**
     * The main method to start the application.
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Schedule a task to be executed on the event dispatch thread (EDT) to create and show the OpenGL frame
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the OGLFrame class
            OGLFrame frame = new OGLFrame();
        });
    }
}