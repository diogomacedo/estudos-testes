package br.com.curso.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import br.com.curso.servicos.CalculadoraTest;
import br.com.utilitarios.AnagramaTest;

//@Suite
@SelectClasses({ CalculadoraTest.class, AnagramaTest.class })
public class SuiteDeTestes {

}
