/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package days10;

/**
 *
 * @author STUDENT
 */
public class Caller {
    public  void register(Callback callback){
        callback.methodToCallback();
    }
    
    public static void main(String[] args) {
//        contoh 1
        Caller caller = new Caller();
        Callback callback = new CallbackImp1();
        caller.register(callback);
        
//        contoh 2
        caller.register(new Callback() {

            @Override
            public void methodToCallback() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Callback 2");
            }
        });
        
//        contoh salah
        Callback call2 = new CallbackImp1();
        call2.methodToCallback();
    }
}
