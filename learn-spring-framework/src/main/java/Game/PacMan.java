package Game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GammingConsole{
    @Override
    public void Up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left()
    {
        System.out.println("left");
    }

    @Override
    public void right()
    {
        System.out.println("right");
    }
}
