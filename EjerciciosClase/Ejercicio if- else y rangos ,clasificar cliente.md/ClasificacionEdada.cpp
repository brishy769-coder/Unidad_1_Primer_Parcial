#include <iostream>
using namespace std;

int main() {
    int edad;
    cout << "Ingrese la edad del cliente: ";
    cin >> edad;

    if (edad < 18) {
        cout << "Cliente Joven" << endl;
    } else if (edad <= 64) {
        cout << "Cliente Adulto" << endl;
    } else {
        cout << "Cliente de la Tercera Edad" << endl;
    }

    return 0;
}
