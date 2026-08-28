#include <iostream>
using namespace std;

int main() {
    int opcion, cantidad;
    double precio = 0, subtotal, descuento, total;
    string producto;

    cout << "===== MENU DE PRODUCTOS =====" << endl;
    cout << "1. Cafe - $2.00" << endl;
    cout << "2. Sandwich - $3.50" << endl;
    cout << "3. Jugo - $1.50" << endl;
    cout << "4. Pastel - $4.00" << endl;
    cout << "==============================" << endl;

    cout << "Seleccione una opcion: ";
    cin >> opcion;

    switch (opcion) {
        case 1:
            producto = "Cafe";
            precio = 2.00;
            break;
        case 2:
            producto = "Sandwich";
            precio = 3.50;
            break;
        case 3:
            producto = "Jugo";
            precio = 1.50;
            break;
        case 4:
            producto = "Pastel";
            precio = 4.00;
            break;
        default:
            cout << "Opción inválida" << endl;
            return 0;
    }

    cout << "Ingrese la cantidad: ";
    cin >> cantidad;

    subtotal = precio * cantidad;

    if (subtotal >= 10) {
        descuento = subtotal * 0.10;
    } else {
        descuento = 0;
    }

    total = subtotal - descuento;

    cout << "\n=== RESUMEN DE LA COMPRA ===" << endl;
    cout << "Producto: " << producto << endl;
    cout << "Cantidad: " << cantidad << endl;
    cout << "Precio unitario: $" << precio << endl;
    cout << "Subtotal: $" << subtotal << endl;
    cout << "Descuento: $" << descuento << endl;
    cout << "Total a pagar: $" << total << endl;

    return 0;
}
