/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Entity.Barang;
import Entity.PenjualanDetil;
import Entity.PenjualanMaster;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jajang Nurjaman
 */
public class BarangDao {
    public static void main(String[] args) {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s=sf.openSession();
        Barang br=new Barang();
        br.setKodeBarang("x2");
        br.setNamaBarang("bubur");
        br.setHarga(Float.parseFloat("5"));
        br.setSatuan("pcf");
        br.setStok(Double.parseDouble("10"));
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(br);
        tx.commit();
        s.flush();
        s.close();
    }
}
