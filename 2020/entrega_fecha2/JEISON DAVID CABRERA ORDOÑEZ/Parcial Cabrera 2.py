from dataclasses import dataclass
from typing import Any

class ListaDoble():
    @dataclass
    class _Nodo:
        dato: Any
        ant: '_Nodo'
        sig: '_Nodo'

    __slots__ = ['_pri', '_ult', '_tamaño']

    def __init__(self):#Creo el init vacio
        self._pri=self._ult=None#Primero y ultimo apuntan a None ya que estan vacios
        self._tamaño=0#El tamaño es 0 porque esta vacio
        
    def es_vacia(self):
        return self._pri is None#Mi es_vacia() lo hice así para ver si mi puntero primero enlazaba, tambien se puede hacer con el self._tamaño
    
    def agregar_al_final(self,value):
        nuevoNodo=ListaDoble._Nodo(value,None,None)#Creo el nodo nuevoNodo e inserto el valor y sig y ant los dejo apuntando a None para luego cambiarlos
        if self.es_vacia():#Si la lista esta vacia 
            self._tamaño+=1
            self._pri=self._ult=nuevoNodo#self._pri y self._ult apuntan al unico nodo que añado
        else:#Si no es vacia
            self._ult.sig=nuevoNodo#El ._sig de mi ultimo nodo apunta a mi nuevo nodo
            nuevoNodo.ant=self._ult#El ant de mi nuevoNodo apunta a mi ultimo nodo
            self._ult=nuevoNodo#mi NuevoNodo ahora es mi self._ult
            self._tamaño+=1
    def reverse(self):
        aux=self._pri#Guardo la posición de mi primer elemento y obtengo una variable con la cual moverme sobre la lista 
        for x in range(self._tamaño):#Recorro toda la lista 
            temp=aux.sig#Guardo la posición del nodo siguiente a mi nodo actual(el siguiente a aux)
            aux.sig=aux.ant#Mi .sig apunta a mi nodo anterior
            aux.ant=temp#Mi .ant apunta a mi nodo siguiente anteriormente guardado
            aux=temp#avanzo mi aux al siguiente de mi auxiliar
        aux=self._pri#Nuevamente guardo mi nodo primero ya que en la iteración mi aux cambió de nodo
        self._pri=self._ult#Mi primer elemento ahora es el ultimo
        self._ult=aux#Mi ultimo elemento ahora es el primero
    def __len__(self):
        return self._tamaño#Retorno el tamaño
    def __repr__(self):
        if self.es_vacia():
            return "No hay elementos"#Si la lista esta vacía retorno "No hay elementos"
        lista=""#Creo un string para ir llenandolo con la impresión de los datos
        aux=self._pri#Guardo el primer nodo que tengo y obtengo una variable para recorrer la lista
        while (aux!=None):#Voy recorriendo la lista
            lista=lista+"['"+str(aux.dato)+"'], "#Añado al String los datos de la lista
            aux=aux.sig#Avanzo el aux
        return lista#retorno el string anteriormente llenado






        
