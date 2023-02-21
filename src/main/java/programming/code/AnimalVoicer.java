package programming.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("voice")
@Scope("prototype")
public class AnimalVoicer {
    private Animal wolf;
    private Animal dog;
    @Value("${animal.volume}")
    private int volume;
    @Value("${animal.wolf.name}")
    private String wolfName;
    @Value("${animal.dog.name}")
    private String dogName;
    @Autowired
    public AnimalVoicer(@Qualifier("pes") Animal dog, @Qualifier("wolf") Animal wolf) {
        this.dog = dog;
        this.wolf = wolf;
    }

    public String voice(){
        return  dog.getVoice() + " " + wolf.getVoice();
    }
    @PostConstruct
    public void init(){
        System.out.println("bean created");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("bean destructed");
    }

    @Override
    public String toString() {
        return "volume: " + volume + "\nname: " + dogName + " voice: " + dog.getVoice() +
                "\nname: " + wolfName + " voice: " + wolf.getVoice();
    }
}
