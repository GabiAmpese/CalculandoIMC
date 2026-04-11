# 📋 Estudo de Caso: Calculadora de IMC em Java

## 1. Entrada e Saída de Dados

**Classe IO**: Utilização de uma classe utilitária personalizada para abstrair o `Scanner`.
**Captura de char**: Uso do método `.charAt(0)` para extrair o primeiro caractere de uma String (ex: transformar "Masculino" em 'M').
**Conversão (Parsing)**: Uso de `Double.parseDouble()` para transformar a entrada de texto do usuário em números decimais (`double`) operáveis.

## 2. Estruturas de Controle

**Switch Expression**: Implementação do `switch` moderno (Java 14+), que permite retornar valores diretamente e agrupar múltiplos casos em uma única linha (ex: `'F', 'f', 'N', 'n'`).
**Palavra-chave `yield`**: Utilizada dentro dos blocos do switch para "entregar" o valor da classificação para a variável `classificacao`.
**If/Else Encadeado**: Lógica interna para verificar as faixas de IMC dentro de cada caso de gênero.
