package org.medhead.emergencysystem.apiordonnanceur.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.medhead.emergencysystem.apiordonnanceur.repository.OperatorProxy;
import org.medhead.emergencysystem.apiordonnanceur.model.OperatorOrd;

@Data
@Service
public class OperatorServiceOrd {

    @Autowired
    private OperatorProxy operatorProxy;

    public OperatorOrd getOperator(final int id) { return  operatorProxy.getOperator(id); }

    public Iterable<OperatorOrd> getOperators() { return operatorProxy.getOperators(); }

    public OperatorOrd saveOperator(OperatorOrd operator) {
        OperatorOrd savedOperator;
        savedOperator = operatorProxy.updateOperator(operator);
        return savedOperator;
    }
}
