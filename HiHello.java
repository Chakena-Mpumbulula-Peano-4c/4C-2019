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
public class HiHello {

    public void run() {
        Hello threadB = new Hello();
        threadB.start();
        Hi threadA = new Hi();
        threadA.start();

    }
}
