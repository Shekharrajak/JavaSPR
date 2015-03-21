/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import javax.swing.JFrame;

public class MyApp {
  public static void main(String[] args) {
    // Actually slightly incorrect from a threading point of view
    JFrame frame = new JFrame("My Swing app");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
