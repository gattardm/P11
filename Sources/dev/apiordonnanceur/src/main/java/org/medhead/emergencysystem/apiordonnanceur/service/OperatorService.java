package org.medhead.emergencysystem.apiordonnanceur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.medhead.emergencysystem.apiordonnanceur.repository.OperatorProxy;
import org.medhead.emergencysystem.apiordonnanceur.model.Operator;

import lombok.Data;

@Data
@Service
public class OperatorService {

    @Autowired
    private OperatorProxy operatorProxy;

    public Operator getOperator(final int id) { return  operatorProxy.getOperator(id); }

    public Iterable<Operator> getOperators() { return operatorProxy.getOperators(); }

    public Operator saveOperator(Operator operator) {
        Operator savedOperator;
        savedOperator = operatorProxy.updateOperator(operator);
        return savedOperator;
    }

    public Iterable<Operator> treatedOperators() {
        Iterable<Operator> listOperators = operatorProxy.getOperators();
        for (Operator o : listOperators) {
            if (o.getAvailable().contains("true")) {
                this.busyOperator(o);
                continue;
            } ;
        }
        return  operatorProxy.getOperators();
    }

    public Operator busyOperator(Operator operator) {
        System.out.println("avant : "+ operator.getName() + operator.getAvailable());
        System.out.println("modification true --> false");
        operator.setAvailable("false");
        this.saveOperator(operator);

        return operator;
    }

    public Operator freeOperator(Operator operator) {
        System.out.println("avant : "+ operator.getName() + operator.getAvailable());
        System.out.println("modification false --> true");
        operator.setAvailable("true");
        this.saveOperator(operator);

        return operator;
    }

}
