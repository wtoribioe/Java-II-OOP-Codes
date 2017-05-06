/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1315;

//exibit (a)
interface Labschapter1315a {
    void print() {};  //Incorrect cannot have body {}; in the methdo
}
//exibit (b)
abstract interface Labschapter1315b {
  abstract void print() {};   //Incorrect cannot have body {}; in the methdo
}

//exibit (c)
abstract interface Labschapter1315c {
  print();   //Incorrect method declaration missing
}
//exibit (d)
abstract interface Labschapter1315d {
  void print();   //correct 
}