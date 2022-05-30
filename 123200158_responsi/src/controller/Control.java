/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the lemburor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import karyawan.Karyawan;
import model.Karyawan1;
import view.EditKaryawan;
import view.Lemburkaryawan;
import view.InputKaryawan;
import view.Menu;
import view.TampilKaryawan;


public class Control {
    
    Karyawan1 modell;
    TampilKaryawan tampilVieww;
    InputKaryawan inputt;
    Lemburkaryawan lemburt;
    
    public Control(TampilKaryawan tampilview, Karyawan1 model,InputKaryawan input, Lemburkaryawan lembur){
        this.modell = model;
        this.tampilVieww = tampilview;
        this.inputt = input;
        this.lemburt = lembur;
      
        
        if(modell.getBanyakData()!=0){
            String dataKaryawan[][] = modell.readContact();
            tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        inputt.bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = inputt.getNama();
                String usia = inputt.getUsia();
                String gaji =inputt.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readContact();
                tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
            }
        });
         inputt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        inputt.bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.tNama.setText(null);
                inputt.tUsia.setText(null);  
                inputt.tGaji.setText(null);
            }
        });
        lemburt.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lembur.dispose();
                

            }
        });
        tampilVieww.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilVieww.dispose();

            }
        });
        lembur.bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = lembur.getNama();
                String cek = lembur.getCek();
                String usia = lembur.getUsia();
                String gaji =lembur.getGaji();
                model.update(nama,cek, usia, gaji);
                lembur.dispose();
            }
        });
        lembur.bhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = lembur.getCek();
                model.delete(cek);
                lembur.dispose();
            }
        });
              tampilVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                Lemburkaryawan ed = new Lemburkaryawan();
                ed.fnama.setText(nama);
                ed.fcek.setText(id);
                ed.fusia.setText(usia);
                ed.fgaji.setText(gaji);
                TampilKaryawan lh = new TampilKaryawan();
                lh.dispose();
                InputKaryawan ik = new InputKaryawan();
                ik.dispose();
                Karyawan1 md = new Karyawan1();
                Control ct = new Control(lh,md,ik,ed);
                System.out.println("");          
            }
        }
        );
    }
    
   
}
    

