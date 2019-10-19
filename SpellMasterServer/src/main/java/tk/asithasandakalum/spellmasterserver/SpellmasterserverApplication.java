package tk.asithasandakalum.spellmasterserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpellmasterserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpellmasterserverApplication.class, args);
    }

    @Bean
    CommandLineRunner init(Server server) {
        return (args) -> {
            server.start(
                    ClassLoader.getSystemClassLoader().getResource("textFile/textData.txt").getPath());
        };
    }
}
