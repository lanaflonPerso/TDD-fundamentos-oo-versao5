# TDD-fundamentos 5

## Mokito  

### Spies
Muitas vezes, testar o SUT sozinho não é suficiente, precisamos saber se ele chamou alguma função ou quais tipos de argumentos foram passados, por exemplo, a um callback ou a uma promise, para isso, existem os spies.

Spy é uma denominação dada a um objeto que grava suas interações com outros objetos. Eles particularmente úteis para testar callbacks, visto que temos propriedades que assumem valores true, false e outros de acordo com a chamada.

### Stubs
Um stub é uma evolução de um spy. Em suma, um stub é um objeto com um comportamento fixo e previsível.

Estes objetos são utilizados principalmente em dois casos:

Evitar alguma interface desnecessária com alguma dependência (por exemplo uma chamada a uma API externa). Um exemplo disso é o Nock, um pacote para simular chamadas http.
Para alimentar o sistema com dados conhecidos. Então podemos forçar um determinado caminho.

### Mocks
Mocks são a evolução dos stubs, pois não substituem um único método, mas sim uma classe toda, mas somente implementa o método escolhido.

Por exemplo, podemos substituir o método de busca do Mongoose pelo nosso próprio método e retornar nosso próprio valor, e ainda por cima implementar o spy nisso tudo.

### Dummies
Dummies são objetos nulos, ou seja, literalmente não fazem nada. Geralmente são utilizados para preencher valores em listas de argumentos.

Este não é um objeto muito importante porque ele pode ser substituído por um valor null qualquer, mas, em alguns casos esses objetos não podem ser nulos puros, e sim devem possuir um tipo específico, neste caso os Dummies entram em cena.

### Fakes
Fake Objects (ou Fakers) são implementações reais e funcionais de alguma dependência, mas de alguma forma são incompletas para serem colocadas em produção (por exemplo, um banco de dados na memória).

Fakers podem ser utilizados quando precisamos incorporar um funcionamento real de um sistema mas precisamos que ele seja controlado.

### Limitações
Não funciona com métodos static ou private. Lista de limitações versão 1.x:

* Needs Java 5+
* Cannot mock final classes
* Cannot mock final methods - their real behavior is executed without any exception. Mockito cannot warn you about mocking final methods so be vigilant.
* Cannot mock static methods
* Cannot mock constructors
* Cannot mock equals(), hashCode(). Firstly, you should not mock those methods. Secondly, Mockito defines and depends upon a specific implementation of these methods. Redefining them might break Mockito.
Mocking is only possible on VMs that are supported by Objenesis (Note Objenesis is in version 2.1). Don't worry, most VMs should work just fine.
* Spying on real methods where real implementation references outer Class via OuterClass.this is impossible. Don't worry, this is extremely rare case.
 
Limitações da versão 2.x:

* Requires Java 6+
* Cannot mock static methods
* Cannot mock constructors
* Cannot mock equals(), hashCode(). Firstly, you should not mock those methods. Secondly, Mockito defines and depends upon a specific implementation of these methods. Redefining them might break Mockito.
Mocking is only possible on VMs that are supported by Objenesis. Don't worry, most VMs should work just fine.
* Spying on real methods where real implementation references outer Class via OuterClass.this is impossible. Don't worry, this is extremely rare case.
 
