/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Reinier Sanders s4335422
 * @author Laurens Kubat s4626249
 */
public class CollectVarsVisitor implements FormVisitor {
    private List<String> collectedVariables;
    
    public CollectVarsVisitor() {
        collectedVariables = new LinkedList<> ();
    }
    
    @Override
    public void visit( BinOpForm form ) {
        form.getLeft().accept( this );
        form.getRight().accept( this );
    }

    public void visit( NotForm form ){
    form.getOperand().accept( this );
    }

    @Override
    public void visit( AtomForm form ) {
        if ( ! collectedVariables.contains( form.getId() )) {
            collectedVariables.add( form.getId() );
        }
    }
    
    public void visit( BinOp form ) {
       if ( ! collectedVariables.contains( form.getId() )) {
            collectedVariables.add( form.getId() );
        } 
    }
    
    @Override
    public void visit( AtomVal form ) {
        if ( ! collectedVariables.contains( form.getId() )) {
            collectedVariables.add( form.getId() );
        }
    }
    
    public List<String> getCollectedVariables() {
        return collectedVariables;
    }
}
