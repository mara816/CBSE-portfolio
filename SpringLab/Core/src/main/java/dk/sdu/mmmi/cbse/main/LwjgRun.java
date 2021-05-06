package dk.sdu.mmmi.cbse.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class LwjgRun {

    @Bean
    public void createGame() {
        LwjglApplicationConfiguration cfg =
                new LwjglApplicationConfiguration();
        cfg.title = "Asteroids";
        cfg.width = 500;
        cfg.height = 400;
        cfg.useGL30 = false;
        cfg.resizable = false;
        new LwjglApplication(new Game(), cfg);
    }
}
