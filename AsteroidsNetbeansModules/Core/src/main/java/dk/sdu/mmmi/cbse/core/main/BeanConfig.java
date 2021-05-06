/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.sdu.mmmi.cbse.core.main;

import dk.sdu.mmmi.cbse.asteroid.AsteroidPlugin;
import dk.sdu.mmmi.cbse.asteroid.AsteroidProcessor;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.enemysystem.EnemyControlSystem;
import dk.sdu.mmmi.cbse.enemysystem.EnemyPlugin;
import dk.sdu.mmmi.cbse.playersystem.PlayerControlSystem;
import dk.sdu.mmmi.cbse.playersystem.PlayerPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mara816
 */
@Configuration
public class BeanConfig {

@Bean
public IGamePluginService enemyPlugin(){
return new EnemyPlugin();
}

@Bean
public IEntityProcessingService enemyControlSystem(){
return new EnemyControlSystem();
}

@Bean
public IGamePluginService playerPlugin(){
return new PlayerPlugin();
}

@Bean
public IEntityProcessingService playerControlSystem(){
return new PlayerControlSystem();
}

@Bean
public IGamePluginService asteroidPlugin(){
    return new AsteroidPlugin();
}

@Bean
public IEntityProcessingService asteroidControlSystem() {
    return new AsteroidProcessor();
}
}



