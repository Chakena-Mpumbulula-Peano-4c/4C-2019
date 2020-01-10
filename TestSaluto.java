/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsaluto;

/**
 *
 * @author martone.christian
 */
public class TestSaluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     HiHello threadD = new HiHello();
     threadD.run();
     CiaoHiHello threadE = new CiaoHiHello();
     threadE.run();
    }

}
