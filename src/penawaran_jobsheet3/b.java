/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penawaran_jobsheet3;

/**
 *
 * @author SMK TELKOM
 */
class b extends a {
    private int b;
    public void setb(int nilai){
    b = nilai;
    }
    
    public int getb(){
    return b;
    }
    
    public void tampilkannilai(){
    super.tampilkannilai();
    System.out.println("nilai b : "+getb());
    }
}
