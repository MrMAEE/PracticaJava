import queue
import random

num_personas = int(input("Ingrese la cantidad de personas a atender: "))

cola = queue.Queue()

for i in range(num_personas):
    cola.put(f"Persona {i+1}")

# Almacenar copia de la cola original
cola_original = cola.queue.copy()

# Lista para almacenar los nombres ingresados por el usuario
nombres = []

while not cola.empty():
    persona = cola.get()
    tiempo = random.randint(5, 20)
    nombre = input(f"Ingrese el nombre de {persona}: ")
    nombres.append(nombre)  # Agregar nombre a la lista de nombres
    print(f"{nombre} ha sido atendido en {tiempo} segundos")

# Imprimir los nombres ingresados

print("Los nombres ingresados fueron: ", ", ".join(nombres))
