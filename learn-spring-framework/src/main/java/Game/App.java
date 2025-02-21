package Game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("Game")
public class App {
    public static void main(String[] args) {
//        MarioGame marioGame=new MarioGame();
//        GameRunner game=new GameRunner(marioGame);
//        game.display();

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
       context.getBean(GameRunner.class).display();

    }
}
