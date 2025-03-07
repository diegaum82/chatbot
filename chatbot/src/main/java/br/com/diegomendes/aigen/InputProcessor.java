package br.com.diegomendes.aigen;

import java.util.Arrays;
import java.util.List;

public class InputProcessor {

    public String cleanInput(String input) {
        if (input == null) {
            return "";
        }
        return input.trim().toLowerCase(); // Limpeza básica: trim e lowercase
    }

    public List<String> extractKeywords(String input) {
        // Implementação simples de extração de palavras-chave (pode ser melhorada depois)
        return Arrays.asList(input.split("\\s+")); // Dividir por espaços
    }

    public String identifyIntent(String input) {
        // Implementação inicial muito básica - por palavras-chave (melhorar depois com NLP)
        if (input.contains("olá") || input.contains("oi") || input.contains("bom dia") || input.contains("boa tarde") || input.contains("boa noite")) {
            return "saudacao";
        } else if (input.contains("adeus") || input.contains("tchau") || input.contains("até logo")) {
            return "despedida";
        } else if (input.contains("como você está") || input.contains("tudo bem")) {
            return "pergunta_bem_estar";
        }
        return "geral"; // Intenção genérica se não identificar nada específico
    }
}