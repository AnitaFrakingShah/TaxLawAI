/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.hello;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author anitashah
 */
public class TAIApplett extends Applet {
    @Override
    public void paint(Graphics g) {
        String myQuestion   = getParameter("Question");
        g.drawString(myQuestion, 20, 20);
         }

}
