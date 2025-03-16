package app.model;

import org.springframework.stereotype.Component;

@Component("timerBean")
public class Timer {

    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
