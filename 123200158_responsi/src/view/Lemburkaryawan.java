/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Agung Rivalzo
 */
public class Lemburkaryawan extends JFrame{
    JLabel ljudul = new JLabel("Update Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    JLabel llembur = new JLabel("Lembur");
    public final JTextField flembur = new JTextField(10);
    
    public JButton bupdate = new JButton("Update");
    public JButton bhapus = new JButton("Hapus");
    public JButton bedit = new JButton("edit");
    
    public JButton bkembali = new JButton("Kembali");
    
     public Lemburkaryawan(){
        setTitle("gaji Karyawan");
        setSize(400,330);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji); 
        add(llembur);
        add(flembur); 
        add(bupdate);
        add(bhapus);
        add(bedit);
        add(bkembali);
        
        ljudul.setBounds(15,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(55,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(55,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(55,90,200,20);
        
        llembur.setBounds(15,120,150,20);
        flembur.setBounds(55,120,210,20);
        
        bupdate.setBounds(75,160,90,20);
        bhapus.setBounds(175,160,90,20);
        bkembali.setBounds(35,195,250,20);
        bedit.setBounds(275,160,90,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fnama.getText();
    }
    public String getCek(){
        return fcek.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
    public String getlembur(){
        return flembur.getText();
    }
}