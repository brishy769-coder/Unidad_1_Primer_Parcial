#include <iostream>
using namespace std;

int main() {
    int numero;
    cout << "Ingrese un número: ";
    cin >> numero;

    if (numero > 100) {
        cout << "El número es mayor a 100" << endl;
    } else {
        cout << "El número es menor o igual a 100" << endl;
    }

    return 0;
}
