<div align="center">

  <div>
    <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=black" alt="oracle" />
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="java" />
   
  </div>
  
  <h1 align="center">Conversor de moeda</h3>
  

  
  </div>

# Configuração inicial:
- O programa importa as bibliotecas necessárias, incluindo Gson para manipulação de JSON.
- Duas listas são inicializadas: uma contendo códigos de moeda e outra contendo os nomes correspondentes das moedas.
- **Configurando sua [API de taxas de câmbio](https://www.exchangerate-api.com)**


# Função principal:
- O usuário é solicitado a escolher uma moeda de origem entre as opções listadas com seus códigos e nomes correspondentes.
- Após a escolha, o programa consulta uma API de taxas de câmbio para obter as taxas de conversão em relação à moeda de origem.
- A resposta da API é processada e exibida, mostrando a moeda de origem e suas taxas de conversão.
- O usuário é então solicitado a escolher a moeda de destino para a conversão.
- Após a escolha da moeda de destino, o usuário insere o valor a ser convertido.
- O programa calcula a conversão usando as taxas obtidas da API e exibe o valor convertido.

# Observações:
- O programa lida com possíveis erros de entrada do usuário.
- Se houver falha na obtenção dos dados da API, o programa exibirá uma mensagem de erro.
- Em caso de exceções, o programa imprime a pilha de erros para depuração.
