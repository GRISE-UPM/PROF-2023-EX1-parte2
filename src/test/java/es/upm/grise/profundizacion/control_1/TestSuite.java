package es.upm.grise.profundizacion.control_1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(value = {ClienteTest.class, PedidoTest.class})
public class TestSuite {
    
}
