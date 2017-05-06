/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1220;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LabsChapter1220 {
    public static void main(String[] args) {
        int vaule = 30;
        if (vaule < 40)
            try {
                throw new Exception("Value to small");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
