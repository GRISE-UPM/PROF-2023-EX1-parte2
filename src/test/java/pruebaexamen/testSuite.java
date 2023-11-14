package pruebaexamen;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectClasses( {testCliente.class , testPedido.class} )

@Suite
public class testSuite {

}
