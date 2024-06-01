# Gestion de Cuenta Bancaria

Este ejercicio te ayudará a practicar la creación de atributos privados y el uso de métodos públicos (getters y setters) para acceder y modificar estos atributos, aplicando así el concepto de encapsulamiento.

## Enunciado del ejercicio

Diseña una clase `CuentaBancaria` que represente una cuenta bancaria. La clase debe tener los siguientes atributos privados:
- `numeroCuenta` (String): el número de cuenta.
- `saldo` (double): el saldo de la cuenta.
- `titular` (String): el nombre del titular de la cuenta.

Proporciona métodos públicos para:
1. Obtener el número de cuenta.
2. Obtener y modificar el saldo de la cuenta.
3. Obtener y modificar el nombre del titular de la cuenta.

Además, agrega un método `depositar(double cantidad)` que aumente el saldo en la cantidad especificada y un método `retirar(double cantidad)` que disminuya el saldo en la cantidad especificada, siempre que haya suficiente saldo disponible.
