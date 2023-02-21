package programming.code;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal{
    public String getVoice() {
        return "auf";
    }
}
