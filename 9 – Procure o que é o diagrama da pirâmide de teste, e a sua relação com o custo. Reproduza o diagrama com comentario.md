Samuel Silva Tavares  ADS2C - 1800099

Em uma Pirâmide de Testes, a equipe de desenvolvimento de software faz (ou pelo menos, deveria)
testes em todas as aplicações produzidas. Testes de software são divididos primariamente em 
três categorias: unitários, de integração e ponta a ponta.
Ao longo de todo o século percebeu-se que há uma economia muito grande no custo se forem efetuados
testes ao longo da criação e sendo efetuados as trativas pontuais necessárias, do que encontrar
um erro ao final do processo e ter um gasto imenso para refazer todo o processo ou até ter que 
iniciar um processo do zero. 


                               /\                                     
                              /  \                                  
                             /    \                                     
                            /      \                                     
                           / Ponta  \                                     
                          /    a     \                                     
                         /   Ponta    \                                     
                        /_ _ _ _ _ _ __\                                     
                       /                \                                     
                      /                  \                                     
                     /                    \                                     
                    /                      \                                     
                   /      Integração        \                                     
                  /                          \                                     
                 /_ _ _ _ _ _ _ _ _ _ _ _ _ __\                                     
                /                              \                                     
               /                                \                                     
              /                                  \                                     
             /             Unitário               \                                     
            /                                      \                                     
           /                                        \                                     
          /_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __\                                     

Testes unitários são feitos em partes isoladas do código, para cada componente. É como se 
testássemos cada “peça” de um aparelho antes de colocá-las. Vamos pensar que estamos montando
 um carro. Para garantir a segurança e evitar erros antes de unir todas as peças, é preciso 
testar cada uma delas separadamente. Por exemplo, para ter certeza que o veículo está funcionando
normalmente antes de ir para o mercado, você tem que testar separadamente o freio, o volante, 
o câmbio, etc.
Testes de integração são testes unitários feitos em mais de uma parte do código. Eles juntam 
múltiplos componentes (normalmente 2) e verificam a comunicação e integração entre os mesmos. 
Este é o teste que garante que a ligação entre as peças está funcionando. Pense no caso do carro
novamente: quando você utiliza o volante para dirigir-lo, a roda tem que responder ao pedido e 
mover o automóvel.
Testes de ponta a ponta são testes que validam todo tipo de comportamento possível dentro da 
aplicação, ou seja, simulam a atividade do usuário final. Se usarmos o exemplo do carro, esse 
tipo de teste seria dirigir o veículo após tudo estar finalizado, como se fosse o usuário normal.
Garantindo assim que todas as peças do produto final e as comunicações entre elas estão funcionando 
corretamente.
