/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

/**
 *
 * @author reiniersanders
 */
public enum AtomVal implements Form {
    TrueOp ( "T" ),
    FalseOp ( "F" );
    
    private String string;
    
    private AtomVal(String string){
        this.string = string;
    }
    
    public Form getId(){
        return this.TrueOp;
    }
    
    @Override
    public void accept(FormVisitor v){
        v.visit(this);
    }
}