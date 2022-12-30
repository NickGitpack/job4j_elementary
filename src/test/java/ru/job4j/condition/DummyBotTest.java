package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    public void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See ypu later.";
        assertThat(result).isEqualTo(expected);
    }

    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void answer() {
    }
}