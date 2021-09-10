package com.derylspielman.problems;

import org.junit.jupiter.api.Test;

/**
 *
 * @author dev
 */
public class SemanticVersionConstraintTest {
    
    @Test
    public void getVersion_Scenario_Result() {
        SemanticVersionConstraint semanticVersionConstraint = new SemanticVersionConstraint();
        
        semanticVersionConstraint.getVersionConstraint(">1.0 <2.0.1 >5.0 <6.0.1");
    }
    
}
