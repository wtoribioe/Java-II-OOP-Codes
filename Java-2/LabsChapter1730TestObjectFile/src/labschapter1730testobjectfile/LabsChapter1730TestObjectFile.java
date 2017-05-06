/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1730testobjectfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LabsChapter1730TestObjectFile {

    public static void main(String[] args) throws IOException{
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));){
            output.writeObject(new A());
        }
    }
}
class A implements Serializable {
    B b = new B();  //NotSerializableException will occur because B() is not serialized class
}
class B {
    
}
