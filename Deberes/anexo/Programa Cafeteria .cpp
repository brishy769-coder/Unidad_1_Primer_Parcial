#include <iostream>
#include <string>
#include <limits> // para numeric_limits
using namespace std;

int main() {
    string nombre, universidad, producto;
    int edad, cantidad;
    double precio, dinero, subtotal, descuento, total, cambio;

    cout << "Ingrese su nombre: ";
    getline(cin, nombre);

    cout << "Ingrese su edad: ";
    cin >> edad;
    cin.ignore(numeric_limits<streamsize>::max(), '\n'); // limpiar buffer

    cout << "Ingrese su universidad: ";
    getline(cin, universidad);

    cout << "Ingrese el producto: ";
    getline(cin, producto);

    cout << "Ingrese el precio unitario: ";
    cin >> precio;

    cout << "Ingrese la cantidad de unidades: ";
    cin >> cantidad;

    cout << "Ingrese el dinero entregado: ";
    cin >> dinero;

    subtotal = precio * cantidad;
    descuento = subtotal * 0.10;
    total = subtotal - descuento;

    // Bloque de datos personales
    cout << "\n=== DATOS PERSONALES ===" << endl;
    cout << "Nombre: " << nombre << endl;
    cout << "Edad: " << edad << endl;
    cout << "Universidad: " << universidad << endl;

    // Bloque de datos de compra
    cout << "\n=== DATOS DE COMPRA ===" << endl;
    cout << "Producto: " << producto << endl;
    cout << "Subtotal: " << subtotal << endl;
    cout << "Descuento (10%): " << descuento << endl;
    cout << "Total a pagar: " << total << endl;

    if (dinero >= total) {
        cambio = dinero - total;
        cout << "Dinero entregado: " << dinero << endl;
        cout << "Cambio: " << cambio << endl;
        cout << "Compra exitosa" << endl;
    } else {
        cout << "Dinero entregado: " << dinero << endl;
        cout << "Dinero insuficiente para cubrir el pago." << endl;
    }

    return 0;
}
