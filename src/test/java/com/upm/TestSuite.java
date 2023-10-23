package com.upm.examen;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectClasses({ClienteTest.class})
@SelectClasses({PedidoTest.class})

@Suite
public class TestSuite {}
