package com.exemplo.spock.groovy.CalculadoraSpec

import com.exemplo.spock.Calculadora
import spock.lang.Specification
import spock.lang.Unroll

class CalculadoraTest extends Specification{

    @Unroll
    def "deve somar dois números: #a + #b = #resultadoEsperado"() {
        given: "uma instância da calculadora"
        def calc = new Calculadora()

        when: "realizamos a soma"
        def resultado = calc.somar(a, b)

        then: "o resultado é o esperado"
        resultado == resultadoEsperado

        where:
        a | b || resultadoEsperado
        1 | 2 || 3
        5 | 7 || 12
        10| 0 || 10
    }

    def "deve lançar exceção ao dividir por zero"() {
        given:
        def calc = new Calculadora()

        when:
        calc.dividir(10, 0)

        then:
        def e = thrown(IllegalArgumentException)
        e.message == "Divisão por zero não permitida"
    }
}
