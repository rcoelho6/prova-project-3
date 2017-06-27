# prova-project-3
Terceiro exercicio da prova


Neste exercicio foi criado a classe Stream com a interface solicitada.

Foi criado uma classe StreamImpl com a implementação da interface:
* Nela o hasNext valida se existe proximo e o getNext pega o proximo item.
* Ela também grava o ultimo caracter selecionado e o anterior.
* Nela também foi colocado um methodo para chegar primeiro caracter que tenho uma vogal antecessora. Neste caso não foi utilizado lambda e sim um while normal para facilitar a construção.
* O construtor desta classe recebe uma string que separada em um Array para facilitar a navegação dela. Também se separado todas vogais em outro array para ser usado na validação posterior.

Foi criado a classe ReadStream com uma classe main para execução do projeto.
* Na execução dela a palavra que sera processada deve ser passada como parametro.
* É no proprio main que a busca pelo caracter é feita, pois não vi motivos para ela ficar na classe da implementação dos hasNext e getNext.
* A busca é feita em um loop simples (também não foi utilizado lambda nem nada, pois não encontrei um solução 100% eficas).
