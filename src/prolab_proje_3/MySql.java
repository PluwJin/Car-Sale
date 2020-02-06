
package prolab_proje_3;
import java.sql.*;
import java.util.*;
import java.math.*;




public class MySql {
    static final String DRIVER="com.mysql.jdbc.Driver";
    static final String HOST_NAME="localhost:3306";
    static final String VERITABANI="ilan";
    static final String DB_URL ="jdbc:mysql://"+HOST_NAME+"/"+VERITABANI;
    
    static final String K_AD="root";
    static final String SIFRE ="***********";
    ResultSet sonuc;
     Connection baglanti=null;
        PreparedStatement sorgu=null;
        Statement dsorgu;
        
    //---------------------------------------------------------------------------------------------------------------------
     //---------------------------------------------------------------------------------------------------------------------
 
    public void Sorgu_Ekleme(String Sorgu) {
        
       
        
        try{
            Class.forName(DRIVER);
            baglanti=DriverManager.getConnection(DB_URL+"?useSSL=false",K_AD,SIFRE);
            sorgu=baglanti.prepareStatement(Sorgu);
            
            sorgu.executeUpdate();

            baglanti.close();
        }
        catch(Exception hata){
           hata.printStackTrace();
            
        
        
    }
     
  
    }
     //---------------------------------------------------------------------------------------------------------------------
     //---------------------------------------------------------------------------------------------------------------------
    public void Sorgu_MaxID(String Sorgu,int[] MaxID) {
        
       // Max ID yi Bulan sorgu
        
        try{
            Class.forName(DRIVER);
            baglanti=DriverManager.getConnection(DB_URL+"?useSSL=false",K_AD,SIFRE);
            sorgu=baglanti.prepareStatement(Sorgu);
            sonuc=sorgu.executeQuery();
            while(sonuc.next()){
                MaxID[0]=sonuc.getInt(1);
            }        
            baglanti.close();
        }
        catch(Exception hata){
           hata.printStackTrace();     
        
    }
     //---------------------------------------------------------------------------------------------------------------------
     //---------------------------------------------------------------------------------------------------------------------
    }
        public void Sorgulama(String Sorgu,Object[][] set) {
        int i=0;
       // Sorgula
        
        try{
            Class.forName(DRIVER);
            baglanti=DriverManager.getConnection(DB_URL+"?useSSL=false",K_AD,SIFRE);
            sorgu=baglanti.prepareStatement(Sorgu);
            sonuc=sorgu.executeQuery();
            while(sonuc.next()){
                set[i][0]=sonuc.getObject(1);
                set[i][1]=sonuc.getObject(2);
                set[i][2]=sonuc.getObject(3);
                set[i][3]=sonuc.getObject(4);
                set[i][4]=sonuc.getObject(5);
                set[i][5]=sonuc.getObject(6);
                set[i][6]=sonuc.getObject(7);
                set[i][7]=sonuc.getObject(8);
                set[i][8]=sonuc.getObject(9);
                set[i][9]=sonuc.getObject(10);
                set[i][10]=sonuc.getObject(11);
                set[i][11]=sonuc.getObject(12);
                i++;
        
            }
            baglanti.close();
        }
        catch(Exception hata){
           hata.printStackTrace();     
        
    }
    }
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
 public void Sorgu_Silme(String Sorgu) {

        try{
            Class.forName(DRIVER);
            baglanti=DriverManager.getConnection(DB_URL+"?useSSL=false",K_AD,SIFRE);
            sorgu=baglanti.prepareStatement(Sorgu);
            sorgu.executeUpdate();

            baglanti.close();
        }
        catch(Exception hata){
           hata.printStackTrace();
        
    }
    } 
 public void Sorgu_x(String Sorgu,Object[][] set) {
int i=0;
       // Sorgula
        
        try{
            Class.forName(DRIVER);
            baglanti=DriverManager.getConnection(DB_URL+"?useSSL=false",K_AD,SIFRE);
            sorgu=baglanti.prepareStatement(Sorgu);
            sonuc=sorgu.executeQuery();
            while(sonuc.next()){
                set[i][0]=sonuc.getObject(1);
                i++;
        
            }
            baglanti.close();
        }
        catch(Exception hata){
           hata.printStackTrace();     
        
    }
        
    }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
    



