package es.upm.examen1;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;


@SelectClasses({Cliente.class, Pedido.class})

@Suite
public class ConjuntoTestSuite {}
