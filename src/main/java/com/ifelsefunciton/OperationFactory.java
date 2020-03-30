package com.ifelsefunciton;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class OperationFactory {
  private static Map<String,Operation> operatnionMap= new HashMap<>();
    static {
        operatnionMap.put("Add",new Additon());
        operatnionMap.put("Multiply",new Multiply());
    }
    private static Optional<Operation> getOperation(String operator){
            return Optional.ofNullable(operatnionMap.get(operator));
    }
}
