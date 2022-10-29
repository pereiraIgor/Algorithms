lista = [2, 6, 89, 1, 2, -4]

for i in range(len(lista)):
    menor_index = i
    for j in range(i + 1, len(lista)):
        if lista[j] < lista[menor_index]:
            menor_index = j

    lista[i], lista[menor_index] = lista[menor_index], lista[i]
