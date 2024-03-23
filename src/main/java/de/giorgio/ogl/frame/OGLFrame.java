package de.giorgio.ogl.frame;

import javax.swing.*;
import java.awt.*;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLJPanel;

/**
 * The main JFrame class for the OpenGL application.
 */
public class OGLFrame extends JFrame {

    /**
     * Constructor for OGLFrame.
     * Sets up the JFrame window with an OpenGL rendering panel.
     */
    public OGLFrame() {
        setTitle("OpenGL Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        // Center the window on the screen
        setLocationRelativeTo(null);

        // Create a default OpenGL profile
        GLProfile profile = GLProfile.getDefault();

        // Create OpenGL capabilities based on the profile
        GLCapabilities capabilities = new GLCapabilities(profile);

        // Create a GLJPanel for OpenGL rendering
        GLJPanel gljPanel = new GLJPanel(capabilities);

        // Add the OpenGL event listener (renderer) to the GLJPanel
        gljPanel.addGLEventListener(new OGLRenderer());

        // Add the GLJPanel to the center of the JFrame
        getContentPane().add(gljPanel, BorderLayout.CENTER);

        // Make the window visible
        setVisible(true);
    }
}



