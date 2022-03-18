

from matriz_adjacencia import main


class Grapth:

    def __init__(self, vertices):

        self.vertices = vertices
        self.grafo = [[] for i in range(self.vertices)]
        pass

    def addAresta(self, firstVertice, secondVertice):
        # pensando em grafos direcionados
        self.grafo[firstVertice - 1].append(secondVertice)


    def showTheList(self):
        for i in range(self.vertices):
            
            print(f'{i+1}:', end='  ')

            for j in self.grafo[i]:
                print(f'{j}  ->', end='  ')
            
            print('')


def main():
    
    g = Grapth(4)

    g.addAresta(1,2)
    g.addAresta(1,3)
    g.addAresta(1,4)
    g.addAresta(2,3)

    g.showTheList()   


if(__name__ == "__main__"):
    main()




