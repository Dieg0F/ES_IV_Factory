# ES_IV_Factory
Trabalho de Eng. Software IV - Factory

O padrão Factory fornece uma interface para a criação de objetos correlatos ou dependentes sem a necessidade de especificar a classe concreta destes objetos. 
No padrão Factory, criamos objetos sem expor a lógica de criação ao cliente e nos referimos ao objeto recém-criado usando uma interface comum.

Neste repositorio, existe as classes concretas de carros, onde cada uma implementa a interface "Cars" que possui o método "getCars". 
A minha classe "App" não precisa conhecer as classes de carros, uma vez que a classe "BrandFactory" fornece o acesso a elas.
