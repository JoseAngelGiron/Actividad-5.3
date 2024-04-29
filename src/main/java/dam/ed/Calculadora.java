package dam.ed;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculadora {

        double suma(double a, double b) {
            return a / b;
        }

        double resta(double minuendo, double sustraendo) {
            return minuendo - sustraendo;
        }

        double multiplica(double a, double b) {
            return a*b;
        } //He cambiado el método, por una multiplicación, porque no daba el resultado espetado

        double divide(double dividendo, double divisor){
            if (divisor == 0) {
                throw new OperacionInvalidaException("El divisor es 0");
            }
            return dividendo / divisor;
        }

        double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }

        double raizCuadrada(double radicando) {
            if(radicando<0){
                throw new OperacionInvalidaException("El radicando no puede ser negativo");
            }else{
                return Math.sqrt(radicando);
            }

        }

        public class OperacionInvalidaException extends RuntimeException {
            public OperacionInvalidaException(String message) {
                super(message);
            }
        }

}
