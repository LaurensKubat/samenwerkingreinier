/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

/**
 * @author Reinier Sanders s4335422
 * @author Laurens Kubat s4626249
 */
public enum NotSym implements Form{
    NotSym( "<>" ){
        public boolean apply(boolean a){
            return !a;
        }
    };
    
    private String string;
    
    private NotSym(String string){
        this.string = string;
    }
    
    @Override
    public Form getId(){
        return this;
    }
    
    @Override
    public boolean accept(FormVisitor v){
        return v.visit(this);
    }
}
