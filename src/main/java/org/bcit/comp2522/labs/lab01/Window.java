package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Window.java
 * Draws something interesting to the window.
 *
 * @author Aric Or
 * @version 1
 *
 */
public class Window extends PApplet {

  /**
   * Sets the size of the window that pops up.
   */
  public void settings() {
    size(1000, 1000);
  }

  /**
   * Draws a snowman using 5 types of 2D primitives to the window.
   */
  public void draw() {
    circle(500, 300, 120);
    circle(500, 435, 170);
    ellipse(500, 620, 240, 220);
    triangle(500, 150, 400, 250, 600, 250);
    square(470, 275, 10);
    square(510, 275, 10);
    line(430, 320, 500, 320);
  }

  /**
   * Changes the window background when the mouse is pressed.
   */
  public void mousePressed() {
    background(64);
  }

  /**
   * Drives the program.
   *
   * @param  args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}