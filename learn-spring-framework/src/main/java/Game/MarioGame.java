package Game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GammingConsole{
    @Override
    public void Up() {
        System.out.println("Go up...");
    }

    @Override
    public void down() {
        System.out.println("Go Down....");
    }

    @Override
    public void left() {
        System.out.println("Go left...");
    }

    @Override
    public void right() {
        System.out.println("Go right...");

    }
}
