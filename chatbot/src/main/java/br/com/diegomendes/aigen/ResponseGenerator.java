package br.com.diegomendes.aigen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ResponseGenerator {

    private List<String> saudacoes = Arrays.asList("Olá! Como posso ajudar?", "Oi! Em que posso ser útil?", "Saudações! O que gostaria de saber?");
    private List<String> despedidas = Arrays.asList("Adeus! Foi bom conversar.", "Tchau! Até a próxima.", "Até logo!");
    private List<String> bemEstarRespostas = Arrays.asList("Estou bem, obrigado por perguntar!", "Tudo ótimo por aqui, e você?", "Indo bem, e você?");
    private List<String> respostasPadrao = Arrays.asList("Hum...", "Interessante.", "Entendi.", "Poderia explicar melhor?", "Conte-me mais.");

    private Random random = new Random();

    public String generateResponse(String processedInput) {
        String intent = new InputProcessor().identifyIntent(processedInput); // Reutiliza InputProcessor para identificar a intenção

        switch (intent) {
            case "saudacao":
                return getRespostaAleatoria(saudacoes);
            case "despedida":
                return getRespostaAleatoria(despedidas);
            case "pergunta_bem_estar":
                return getRespostaAleatoria(bemEstarRespostas);
            default:
                return getRespostaAleatoria(respostasPadrao); // Resposta genérica
        }
    }

    private String getRespostaAleatoria(List<String> respostas) {
        return respostas.get(random.nextInt(respostas.size())); // Seleciona resposta aleatória da lista
    }
}