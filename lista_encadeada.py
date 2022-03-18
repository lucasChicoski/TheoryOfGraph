
# Contexto: Grafos
# lista encadeada.
# Primeira modelagem de um grafo de 2 nós


class Node:
    # construtor da classe
    def __init__(self, nodeValue):
        self.nodeValue = nodeValue
       # self.memoryAdressNode = None

    def getValueNode(self):
        return self.nodeValue

    def setNextNode(self, nextNode):
        self.memoryAdressNode = nextNode

    def getNextNode(self):
        return self.memoryAdressNode



def main():
    no1 = Node(4)
    no2 = Node(7)
    no1.setNextNode(no2)  # Criando uma aresta entre o nó1 e nó2

    print(no1.getValueNode())
    print(no2.getValueNode())
    print(no1.getNextNode())  # Obtém o valor do endereço de memória do nó 2
    print(no2) # Imprime o valor de memória do nó 2
    print(no1.getNextNode().getValueNode())  # Obtém o valor setado do nó 2


if(__name__ == "__main__"):
    main()
