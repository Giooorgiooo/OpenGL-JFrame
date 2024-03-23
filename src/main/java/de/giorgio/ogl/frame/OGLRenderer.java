package de.giorgio.ogl.frame;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

/**
 * Implementation of GLEventListener for OpenGL rendering.
 */
class OGLRenderer implements GLEventListener {

    /**
     * Initialization method called once at the beginning of rendering.
     * @param drawable The GLAutoDrawable object associated with the OpenGL context.
     */
    @Override
    public void init(GLAutoDrawable drawable) {
        // Get the OpenGL context
        GL2 gl = drawable.getGL().getGL2();

        // Set the clear color (white in this case)
        gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /**
     * Dispose method called when the OpenGL context is destroyed.
     * @param drawable The GLAutoDrawable object associated with the OpenGL context.
     */
    @Override
    public void dispose(GLAutoDrawable drawable) {
        // No cleanup needed in this example
    }

    /**
     * Display method called to render the scene.
     * @param drawable The GLAutoDrawable object associated with the OpenGL context.
     */
    @Override
    public void display(GLAutoDrawable drawable) {
        // Get the OpenGL context
        GL2 gl = drawable.getGL().getGL2();

        // Clear the color buffer
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
    }

    /**
     * Reshape method called when the component is resized.
     * @param drawable The GLAutoDrawable object associated with the OpenGL context.
     * @param x The x-coordinate of the viewport.
     * @param y The y-coordinate of the viewport.
     * @param width The width of the viewport.
     * @param height The height of the viewport.
     */
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // Get the OpenGL context
        GL2 gl = drawable.getGL().getGL2();

        // Set the viewport to match the component size
        gl.glViewport(0, 0, width, height);
    }
}

