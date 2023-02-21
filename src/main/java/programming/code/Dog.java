package programming.code;

import org.springframework.stereotype.Component;

@Component("pes")
public class Dog implements Animal{
    public String getVoice() {
        return "gav";
    }
}
