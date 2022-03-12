#Contexto: GRAFOS
#Como implementar uma matriz adjacência em python

from pickle import TRUE



class Grafo:
    # directed - referencia se o grafo é direcionado ou não.
    def __init__(self, vertices, directed):
        self.directed = directed
        self.vertices = vertices
        self.grafo = [[0] * self.vertices for i in range(self.vertices)]
        pass

    def addAresta(self, verticeFirst, verticeSecond):
        if(self.directed == TRUE):
            self.grafo[verticeFirst - 1][verticeSecond - 1] = 1

        else:
            self.grafo[verticeFirst - 1][verticeSecond - 1] = 1
            self.grafo[verticeSecond - 1][verticeFirst - 1] = 1

    def showMatrix(self):
        print("Matriz adjacência:")
        for i in range(self.vertices):
            print(self.grafo[i])


def main():

    grafo = Grafo(3, TRUE)
    grafo.addAresta(3, 1)
    grafo.addAresta(1, 2)
    grafo.addAresta(2, 3)
    grafo.showMatrix()


if (__name__ == "__main__"):
    main()
    pass
