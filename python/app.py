def run():
    print('***************** B I E N V E N I D O S  A L  E X A M E N *****************')
    print("""Cual algoritmo quieres ejecutar:
    [1]. Algoritmo1Dpl
    [2]. Algoritmo2Dpl
    [3]. Algoritmo3Dpl
    [4]. Algoritmo4Dpl
    [5]. Algoritmo5Dpl
    [0]. Salir   
    """)

    teclado = int(input("> "))

    if teclado == 1:
        algoritmo1Dpl()
        repetir()
    if teclado == 2:
        algoritmo2Dpl()
        repetir()
    if teclado == 3:
        algoritmo3Dpl()
        repetir()
    if teclado == 4:
        algoritmo4Dpl()
        repetir()
    if teclado == 5:
        algoritmo5Dpl()
        repetir()
    if teclado == 0:
        print("Gracias Adios....")
    else:
        print("No es una opcion")
        run()

def algoritmo1Dpl():
    ## Datos de entrada
    print("************ Promediador de Notas ************")
    print("Cuanto saco en la Unidad 1: ")
    unidad1 = int(input("> "))
    print("Cuanto saco en la Unidad 2: ")
    unidad2 = int(input("> "))
    print("Cuanto saco en la Unidad 3: ")
    unidad3 = int(input("> "))
    print("Cuanto saco en la practica Final: ")
    trabajoFinal = int(input("> "))
    ## Linea en blanco
    print(" ")
    ## Logica
    notaFinal = ((unidad1 * 0.10) + (unidad2 * 0.15) + (unidad3 * 0.25) + (trabajoFinal * 0.50))
    ## Datos de salida
    print("La nota final del estudiante es: ", notaFinal)

def algoritmo2Dpl():
    print("*************** Saca Bono ***************")
    print("Cuanto es tu salario: ")
    salario = int(input("> "))
    print("Cuanto es tu puntaje: ")
    puntos = int(input("> "))
    ## Logica
    if puntos >= 50 and puntos <= 100: 
        bono = salario * 0.10
        totalC = salario + bono
    ## Datos de salida
        print("Tu bono sera de " , bono)
        print("Total a Cobrar: " , totalC)
    elif (puntos >= 101 and puntos <= 150) :
        bono = salario * 0.50
        totalC = salario + bono
    ## Datos de salida
        print("Tu bono sera de " ,bono)
        print("Total a Cobrar: " , totalC)
    elif (puntos >= 151):
        bono = salario * 0.80
        totalC = salario + bono
    ## Datos de salida
        print("Tu bono sera de " , bono)
        print("Total a Cobrar: " , totalC)
    else:
        print("No tienes bono....")
    ## Final y despedida
        print("Gracias....")

def algoritmo3Dpl():
    ## Datos de entrada
    print("************ Determinador de vacuna del Covid19 ************")
    print("Dime tu nombre: ")
    nombre = str(input("> "))
    print("Marca 1 = Masculino y 0 = Femenino : ")
    sexo = int(input("> "))
    print("Dime tu edad: ")
    edad = int(input("> "))
    ## Logica y datos de salida
    if (edad > 70):
        print("Vacuna de tipo [ C ] para " + nombre)
    elif (edad >= 16 and edad <= 69):
        if (sexo == 0):
            print("Vacuna de tipo [ B ] para " + nombre)
        elif (sexo == 1):
            print("Vacuna de tipo [ A ] para " + nombre)
        else:
            print("error")
    elif (edad < 16):
        print("Vacuna de tipo [ A ] para " + nombre)
    else:
        print("error.....")
    ## Final y despedida
    print("Gracias....")

def algoritmo4Dpl():
    ## Dato de entrada
    print("************ Interpretador de Operaciones Aritmeticas ************")
    print("Que operacion aritmetica aras:\n1. [+]\n2. [-]\n3. [*]\n4. [/]\n5. [^]\n")
    signo = int(input("> "))
    print("Cual es el valor a: ")
    a = int(input("> "))
    print("Cual es el valor b: ")
    b = int(input("> "))
    ## Logica
    if signo == 1:
        operacion = a + b
    elif signo == 2:
        operacion = a + b
    elif signo == 3:
        operacion = a + b
    elif signo == 4:
        operacion = a + b
    elif signo == 5:
        operacion = a + b
    else:
        print("Erorr")

    print("Es igual a : " , operacion)

def algoritmo5Dpl():
    ## Datos de entrada
    print("************ Determinador de salarios especifico de 6 Años ************")
    print("Cauanto es tu salario: ")
    salario = int(input("> "))
    ## Logica
    print("Año " + " : " + " Salario")
    salarioIncremento = salario * 0.10
    for i in range(1, 6):
        salario = salarioIncremento + salario
        print(i , "   :  ", salario)
    print("Gracias....")

def repetir():
    print("""
    
    """)
    print("""Deseas volver al menu
    [1]. Si
    [2]. No
    """)
    decicion = int(input("> "))
    if decicion == 1:
        run()
    elif decicion == 2:
        print("Gracias Adios....")
    else:
        print("No existe esa opcion")
        repetir()


if __name__ == "__main__":
    run()