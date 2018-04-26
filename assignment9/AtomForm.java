/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

/**
 * @author Laurens Kubat s4626249
 * @author Reinier Sanders s4335422
 */
public class AtomForm implements Form {
    private AtomVal value;
    
    public AtomForm(AtomVal value){
        this.value = value;
    }
    
    public Form getValue(){
        return value;
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
