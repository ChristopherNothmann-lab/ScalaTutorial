def par(x:Int): Boolean = {
    x % 2 == 0
}

val lista = (1 to 10).toList
print(lista.filter(par(_)), '\n')
