fun main(args: Array<String>) {
/*
* "Clientes nao devem ser forçados a depender de metodos que nao usam" -ISP
*
* Nesse modelo de aplicação CRM temos um conjunto de classes de dominio e algumas classes
* modelo para salvar esses objetos no banco de dados. Acontece que os objetos modelo
* no pacote DAO, tem de extender de 'BD' e implementar 'ICadastro' para funcionarem porem
* das 3 classes modelo, apenas uma delas tem necessecidade de implementar todas as funçoes da interface
* as outras duas só precisam implementar 1 e 2 funçoes dessa interface, ferindo o principio ISP
* citado no topo dessse texto. A ideia desse principio é diminuir o acoplamento e aumentar a coesão
* */
}