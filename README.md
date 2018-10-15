# Devops-Teste
AC 7 DevOps - Testes

1 – O que são testes em DevOps? Teste é um processo que faz parte do #desenvolvimento de software, e tem como principal objetivo revelar falhas/bugs para que sejam corrigidas até que o produto final atinja a qualidade desejada / acordada.

Profissionais que trabalham com testes (denominados analistas de testes, técnicos de testes, homologador, ou simplesmente testes) estão habituados a realizar uma bateria de testes de diferentes naturezas e propósitos, envolvendo não apenas os testes funcionais da aplicação, mas diversas outras atividades como:

avaliação da especificação de requisitos, avaliação de projeto técnico, verificações em outros documentos, testes de performance e capacidade, avaliação de interface, dentre outros.

2 – O que eles validam? Os testes representam uma etapa de extrema importância no processo de desenvolvimento de software, pois visam validar se a aplicação está funcionando corretamente e se atende aos requisitos especificados.

3 – Qual a diferença entre Verificação e Validação? O objetivo da Validação e da Verificação é assegurar que o SW seja adequado e se atende às necessidades, ou seja, a confirmação de que este cumpra suas especificações.

A Verificação é uma atividade, a qual envolve a análise de um sistema para certificar se este atende aos requisitos funcionais e não funcionais. Já a Validação, é a certificação de que o sistema atende as necessidades e expectativas do cliente. O processo de Validação e Verificação, não são processos separados e independentes.

4 – Quais os objetivos do teste? O principal objetivo do teste de software é revelar a presença de erros no produto. Portanto, o teste bem sucedido é aquele que consegue determinar casos de teste para os quais o programa em teste falhe. Tem-se observado que a própria atividade de projeto de casos de teste é bastante efetiva em evidenciar a presença de defeitos de software. Em geral, os critérios de teste de software são estabelecidos, basicamente, a partir de três técnicas: a funcional, a estrutural e a baseada em erros. Na técnica funcional, os critérios e requisitos de teste são estabelecidos a partir da função de especificação do software; na técnica estrutural, os critérios e requisitos são derivados essencialmente a partir das características de uma particular implementação em teste; e, na técnica baseada em erros, os critérios e requisitos de teste são oriundos do conhecimento sobre erros típicos cometidos no processo de desenvolvimento de software.

5 – O que é um Test Case? A finalidade do Caso de Teste é identificar e comunicar formalmente as condições específicas detalhadas que serão validadas para permitir a avaliação de determinados aspectos dos Itens de Teste-alvo. Os Casos de Teste podem ser motivados por vários fatores, mas normalmente incluirão um subconjunto dos Requisitos (Casos de Uso, características de desempenho etc.) e dos riscos envolvidos no projeto.

O Caso de Teste é usado basicamente:

para enumerar um número adequado de testes específicos para garantir a abrangência da avaliação. para identificar e considerar Scripts de Teste e geradores, de forma manual e automatizada. para fornecer um esquema para a implementação de Scripts de Teste e geradores, fornecendo uma descrição dos pontos-chave de observação e controle e qualquer pós ou precondição.

Nada proporciona satisfação maior ao usuário final, com relação ao software, do que uma visão clara de suas expectativas, para que sejam verificadas e validadas. Os casos de teste refletem os requisitos que devem ser verificados. Entretanto, a verificação desses requisitos pode ser feita de forma diferente e por testadores distintos. Por exemplo, a execução do software para verificar sua função e desempenho pode ser feita por um testador usando técnicas de teste automatizadas, a seqüência de desligamento de um sistema de computadores pode ser realizada por teste manual e observação, ao passo que a participação no mercado e as vendas (também requisitos do produto) serão realizadas através da avaliação do produto e das vendas competitivas.

Como talvez você não consiga verificar todos os requisitos, nem seja responsável por isso, é essencial para o sucesso do projeto selecionar os requisitos mais apropriados e importantes para o teste. Os requisitos escolhidos para verificação representarão um equilíbrio entre o custo, o risco e a necessidade de verificá-los.

A identificação dos casos de teste é importante por vários motivos.

Os casos de teste constituem a base do design e do desenvolvimento dos Scripts de Teste. A "profundidade" do teste é proporcional ao número de casos de teste. O aumento do número de casos de teste gera uma maior confiança na qualidade do produto e no processo de teste, já que cada caso de teste reflete um cenário, uma condição ou um fluxo diferente através do produto. A principal avaliação da abrangência do teste é a cobertura baseada em requisitos, de acordo com o número de casos de teste identificados, implementados e/ou executados. Uma sentença como "Executamos e verificamos 95% dos casos de teste críticos" é mais significativa do que a sentença "Já executamos 95% do total de testes". A escala do esforço de teste é proporcional ao número de casos de teste. Com uma análise abrangente dos casos de teste, é possível estimar com mais precisão a duração dos estágios subseqüentes do ciclo de teste. Os tipos de design e desenvolvimento de testes e os recursos necessários são amplamente controlados pelos casos de teste. Geralmente, os casos de teste são categorizados ou classificados pelo tipo ou requisito de teste ao qual estão associados e variam de acordo com isso. A melhor prática consiste em desenvolver pelo menos dois casos de teste para cada requisito de teste:

um caso de teste para demonstrar que o requisito foi atendido, geralmente conhecido como um caso de teste positivo, outro caso de teste, conhecido como negativo, refletindo uma condição ou dados inaceitáveis, anormais ou inesperados para demonstrar que o requisito só pode ser atendido sob a condição desejada.

6 – O que é um Test Suite? No desenvolvimento de software , um conjunto de testes (Test Suite) , menos conhecido como "conjunto de validação", é uma coleção de casos de teste (Test Case) que devem ser usados ??para testar um programa de software para mostrar que ele possui alguns conjuntos de comportamentos especificados. Um conjunto de testes geralmente contém instruções detalhadas ou metas para cada coleção de casos de teste e informações sobre a configuração do sistema a ser usada durante o teste. Um grupo de casos de teste também pode conter estados ou etapas de pré-requisitos e descrições dos testes a seguir.

Coleções de casos de teste são às vezes chamado incorretamente um plano de teste , um script de teste , ou mesmo um cenário de teste .

Ocasionalmente, os conjuntos de testes são usados ??para agrupar casos de teste semelhantes. Um sistema pode ter um conjunto de testes de fumaça que consiste apenas em testes de fumaça ou um conjunto de testes para algumas funcionalidades específicas do sistema. Ele também pode conter todos os testes e indicar se um teste deve ser usado como um teste de fumaça ou para alguma funcionalidade específica.

No teste baseado em modelo , distingue-se entre conjuntos de testes abstratos , que são conjuntos de casos de teste abstratos derivados de um modelo de alto nível do sistema em teste , e conjuntos de testes executáveis , derivados de conjuntos de testes abstratos fornecendo detalhes de nível inferior necessários para executar este conjunto por um programa. Um conjunto de testes abstrato não pode ser usado diretamente no sistema em teste (SUT) porque os casos de teste abstratos permanecem em um nível de abstração alto e não possuem detalhes concretos sobre o SUT e seu ambiente. Um conjunto de testes executável funciona em um nível suficientemente detalhado para se comunicar corretamente com o SUT e um equipamento de teste geralmente está presente para fazer a interface do conjunto de testes executáveis com o SUT.

Um conjunto de testes para uma sub-rotina de teste de primalidade pode consistir em uma lista de números e sua primalidade (primárias ou compostas), juntamente com uma sub-rotina de testes. A sub-rotina de teste forneceria cada número da lista para o testador de primalidade e verificar se o resultado de cada teste está correto.

7 – Quais são os tipos de teste? Tipos de Testes Lista dos tipos de testes que podem ser feitos:

Teste de Unidade Teste em um nível de componente ou classe. É o teste cujo objetivo é um “pedaço do código”. Teste de Integração Garante que um ou mais componentes combinados (ou unidades) funcionam. Podemos dizer que um teste de integração é composto por diversos testes de unidade. Teste Operacional Garante que a aplicação pode rodar muito tempo sem falhar. Teste Positivo-negativo Garante que a aplicação vai funcionar no “caminho feliz” de sua execução e vai funcionar no seu fluxo de exceção. Teste de Regressão Toda vez que algo for mudado, deve ser testada toda a aplicação novamente. Teste de Caixa-preta Testar todas as entradas e saídas desejadas. Não se está preocupado com o código, cada saída indesejada é visto como um erro. Teste Caixa-branca O objetivo é testar o código. Às vezes, existem partes do código que nunca foram testadas. Teste Funcional Testar as funcionalidades, requerimentos, regras de negócio presentes na documentação. Validar as funcionalidades descritas na documentação (pode acontecer de a documentação estar inválida) Teste de Interface Verifica se a navegabilidade e os objetivos da tela funcionam como especificados e se atendem da melhor forma ao usuário. Teste de Performance Verifica se o tempo de resposta é o desejado para o momento de utilização da aplicação. Teste de Carga Verifica o funcionamento da aplicação com a utilização de uma quantidade grande de usuários simultâneos. Teste de Aceitação do usuário Testa se a solução será bem vista pelo usuário. Ex: caso exista um botão pequeno demais para executar uma função, isso deve ser criticado em fase de testes. (aqui, cabem quesitos fora da interface, também). Teste de Volume Testar a quantidade de dados envolvidos (pode ser pouca, normal, grande, ou além de grande). Testes de Stress Testar a aplicação sem situações inesperadas. Testar caminhos, às vezes, antes não previstos no desenvolvimento/ documentação. Testes de Configuração Testar se a aplicação funciona corretamente em diferentes ambientes de hardware ou de software. Testes de Instalação Testar se a instalação da aplicação foi OK. Testes de Segurança Testar a segurança da aplicação das mais diversas formas. Utilizar os diversos papéis, perfis, permissões, para navegar no sistema.

8 – O que são testes do tipo Caixa Branca e Caixa Preta? Teste de caixa branca O analista tem acesso ao código fonte, conhece a estrutura interna do produto sendo analisado e possibilita que sejam escolhidas partes específicas de um componente para serem avaliadas. Esse tipo de teste, também conhecido como teste estrutural, é projetado em função da estrutura do componente e permite uma averiguação mais precisa do comportamento dessa estrutura. Perceba que o acesso ao código facilita o isolamento de uma função ou ação, o que ajuda na análise comportamental das mesmas.

Teste de caixa preta O analista não tem acesso ao código fonte e desconhece a estrutura interna do sistema. É também conhecido como teste funcional, pois é baseado nos requisitos funcionais do software. O foco, nesse caso, é nos requisitos da aplicação, ou seja, nas ações que ela deve desempenhar.

Para mostrar quais problemas que esse tipo de teste rastreia, podemos citar alguns exemplos:

Data de nascimento preenchida com data futura; Campos de preenchimento obrigatório que não são validados; Utilizar números negativos em campos tipo valor a pagar; Botões que não executam as ações devidas; Enfim, todo tipo de falha funcional, ou seja, falhas que contrariam os requisitos da aplicação.

Há que se destacar, contudo, que existe um elemento comum aos dois tipos de teste. Tanto no teste de caixa branca quanto no teste de caixa preta, o analista não sabe qual será o comportamento da aplicação ou do alvo de teste em uma determinada situação. A imprevisibilidade de resultados é comum aos dois casos.

9 – Procure o que é o diagrama da pirâmide de teste, e a sua relação com o custo. Reproduza o diagrama com comentário. Em uma Pirâmide de Testes, a equipe de desenvolvimento de software faz (ou pelo menos, deveria) testes em todas as aplicações produzidas. Testes de software são divididos primariamente em três categorias: unitários, de integração e ponta a ponta. Ao longo de todo o século percebeu-se que há uma economia muito grande no custo se forem efetuados testes ao longo da criação e sendo efetuados as trativas pontuais necessárias, do que encontrar um erro ao final do processo e ter um gasto imenso para refazer todo o processo ou até ter que iniciar um processo do zero.

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
Testes unitários são feitos em partes isoladas do código, para cada componente. É como se testássemos cada “peça” de um aparelho antes de colocá-las. Vamos pensar que estamos montando um carro. Para garantir a segurança e evitar erros antes de unir todas as peças, é preciso testar cada uma delas separadamente. Por exemplo, para ter certeza que o veículo está funcionando normalmente antes de ir para o mercado, você tem que testar separadamente o freio, o volante, o câmbio, etc. Testes de integração são testes unitários feitos em mais de uma parte do código. Eles juntam múltiplos componentes (normalmente 2) e verificam a comunicação e integração entre os mesmos. Este é o teste que garante que a ligação entre as peças está funcionando. Pense no caso do carro novamente: quando você utiliza o volante para dirigir-lo, a roda tem que responder ao pedido e mover o automóvel. Testes de ponta a ponta são testes que validam todo tipo de comportamento possível dentro da aplicação, ou seja, simulam a atividade do usuário final. Se usarmos o exemplo do carro, esse tipo de teste seria dirigir o veículo após tudo estar finalizado, como se fosse o usuário normal. Garantindo assim que todas as peças do produto final e as comunicações entre elas estão funcionando corretamente.

10 – Percentualmente, qual é a distribuição dos tipos de testes na pirâmide de testes? Em uma Pirâmide de Testes, a sugestão é que se faça uma divisão de 70/20/10, ou seja:

70% de testes unitários; 20% de testes de integração; 10% de testes de ponta a ponta. Isso serve para tentar sempre evitar uma pirâmide invertida (focada em testes de ponta a ponta), ou em formato de ampulheta (foco em testes unitários e ponta a ponta, mas nenhum em integração).
