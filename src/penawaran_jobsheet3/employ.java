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
class employ extends person {
    private String nokaryawan;

    public employ(String nokaryawan,String nama ,int usia) {
        super(nama, usia);
        this.nokaryawan = nokaryawan;
    }
    
    public void info(){
    System.out.println("no. karyawan : "+this.nokaryawan);
    super.info();
    }
    
}
