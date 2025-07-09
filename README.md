# Desafio: Sistema de Log Único (Padrão Singleton)

## 📝 Descrição

Em sistemas de software, frequentemente precisamos garantir que certas classes tenham **apenas uma única instância** em toda a aplicação. Isso é crucial para gerenciar recursos compartilhados, configurações globais ou, como neste desafio, um sistema de log centralizado.

O objetivo deste projeto é implementar o **Padrão de Projeto Singleton** para criar uma classe `Logger` que assegure que só exista uma instância dela em todo o ciclo de vida do programa.

Você deverá:
1.  Criar uma classe `Logger` que siga o padrão Singleton.
2.  Garantir que não seja possível criar instâncias de `Logger` de forma direta (usando `new`).
3.  Fornecer um método estático que retorne sempre a mesma e única instância de `Logger`.
4.  Implementar um método simples de `log` nesta classe para demonstrar seu funcionamento.

## 💡 Conceito de Padrão de Projeto

Este desafio foca no **Padrão de Criação Singleton**.

* **Singleton:** Um padrão de projeto que restringe a instanciação de uma classe a um único objeto. É útil para coordenar ações em todo o sistema a partir de um único ponto.

## ⚙️ Estrutura do Projeto

* **`Logger.java`:**
    * **Construtor:** Deve ser `private` para impedir instanciação externa.
    * **Campo de Instância:** Um campo `private static` para armazenar a única instância.
    * **Método `getInstance()`:** Um método `public static` que:
        * Verifica se a instância já existe.
        * Cria a instância se ainda não existir.
        * Retorna a única instância existente.
    * **Método `log(String mensagem)`:** Um método `public void` que imprime a mensagem de log no formato: `"LOG: " + [mensagem]`.

* **`Main.java`:**
    * No método `main`, você deverá:
        * Obter duas referências ao `Logger` utilizando `Logger.getInstance()`.
        * Comparar essas duas referências para provar que são o mesmo objeto.
        * Utilizar os métodos `log()` de ambas as referências para registrar mensagens distintas.

## 🚀 Como Executar

1.  Compile os arquivos Java:
    ```bash
    javac Main.java Logger.java
    ```
    (Ou apenas `javac *.java` se estiverem no mesmo diretório)
2.  Execute o programa:
    ```bash
    java Main
    ```
3.  O programa aguardará a entrada de duas mensagens de log.

## 📥 Entrada

Duas linhas de texto, representando duas mensagens de log distintas.

## 📤 Saída

1.  Uma linha que confirma se as duas instâncias de `Logger` são a mesma:
    ```
    Ambas as instancias sao as mesmas: true
    ```
2.  As duas mensagens de log, formatadas pelo método `log()`:
    ```
    LOG: [Primeira mensagem]
    LOG: [Segunda mensagem]
    ```

**Exemplos de Interação:**

| Entrada                 | Saída                                      |
| :---------------------- | :----------------------------------------- |
| Olá mundo!              | Ambas as instancias sao as mesmas: true   |
| Testando Singleton.     | LOG: Olá mundo!                            |
|                         | LOG: Testando Singleton.                   |

---
**Atenção:** As saídas devem ser **exatamente iguais** às descritas, incluindo a falta de acentuação e a formatação "LOG: ".
