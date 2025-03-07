package br.com.diegomendes.aigen;

import java.util.Scanner;

public class ChatbotAgent {

    private InputProcessor inputProcessor;
    private ResponseGenerator responseGenerator;

    public ChatbotAgent() {
        this.inputProcessor = new InputProcessor();
        this.responseGenerator = new ResponseGenerator();
    }

    public void runChatbot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot iniciado! Diga 'adeus' para sair.");

        String userInput;
        do {
            System.out.print("Você: ");
            userInput = scanner.nextLine();

            String processedInput = inputProcessor.cleanInput(userInput);
            String response = responseGenerator.generateResponse(processedInput);

            System.out.println("Chatbot: " + response);

        } while (!userInput.equalsIgnoreCase("adeus"));

        System.out.println("Chatbot encerrado.");
        scanner.close();
    }

    public static void main(String[] args) {
        ChatbotAgent chatbot = new ChatbotAgent();
        chatbot.runChatbot();
    }
}