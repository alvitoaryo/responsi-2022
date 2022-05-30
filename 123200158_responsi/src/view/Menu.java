/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.Koneksi;
import model.Karyawan1;
import view.TampilKaryawan;



public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel("Main Menu");

   public JButton btambah = new JButton("Tambah Karyawan");
   public JButton blihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
        setSize(155,120);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);

        ljudul.setBounds(35,5,200,20);


        btambah.setBounds(0,25,150,20);
        blihat.setBounds(0,45,150,20);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           TampilKaryawan lh = new TampilKaryawan();
           lh.dispose();
           dispose();
           InputKaryawan ik = new InputKaryawan();
           Lemburkaryawan ed = new Lemburkaryawan();
           ed.dispose();
           Karyawan1 md = new Karyawan1();
           Control ct = new Control(lh, md,ik,ed);
          
        }
        if(e.getSource() == blihat){
            TampilKaryawan lh = new TampilKaryawan();
           InputKaryawan ik = new InputKaryawan();
           ik.dispose();
           Lemburkaryawan ed = new Lemburkaryawan();
           ed.dispose();
           Karyawan1 md = new Karyawan1();
           Control ct = new Control(lh, md,ik,ed);
        }

    }

}

