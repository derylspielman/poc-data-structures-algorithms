package com.derylspielman.problems;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dev
 */
public class StackMemoryLeakTest {
    

    @Test
    public void testPop() {
        
        StackMemoryLeak instance = new StackMemoryLeak();
        IntStream.range(1, 17).boxed()
                .forEach(t -> {
                  instance.push(t);
                });
        
        instance.push(1);
        
        Object result = instance.pop();
        
    }
    
}
