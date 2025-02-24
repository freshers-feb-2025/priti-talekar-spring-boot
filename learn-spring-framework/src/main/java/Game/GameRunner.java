package Game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
   private GammingConsole game;
  //  private MarioGame game;

   public GameRunner(GammingConsole game){
       this.game=game;
   }

   public void display(){
       System.out.println("Running Game: "+this.game);
       game.Up();
       game.down();
       game.left();
       game.right();
   }

}
