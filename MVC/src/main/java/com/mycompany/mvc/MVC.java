/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc;

import com.mycompany.mvc.visao.Tela;

/**
 *
 * @author sanmg
 */
public class MVC {

    public static void main(String[] args) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}
