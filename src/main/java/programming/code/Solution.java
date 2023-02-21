package programming.code;

import jdk.nashorn.internal.runtime.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Animal wolf = context.getBean("wolf", Wolf.class);
        System.out.println(wolf.getVoice());
        Animal dog = context.getBean("pes", Dog.class);
        System.out.println(dog.getVoice());*/
        /*AnimalVoicer animalVoicer = context.getBean("voice", AnimalVoicer.class);*/
        /*animalVoicer.voice();*/
        /*AnimalVoicer animal = context.getBean("voice", AnimalVoicer.class);
        System.out.println(animal.voice());*/
        /*AnimalVoicer animals = context.getBean("voice", AnimalVoicer.class);
        AnimalVoicer animals1 = context.getBean("voice",AnimalVoicer.class);
        animals.setVolume(10);
        animals1.setVolume(30);
        System.out.println("Animals 1 volume: " + animals1.getVolume() + " " + "animals volume: " + animals.getVolume());*/
        AnimalVoicer voicer = context.getBean("voice", AnimalVoicer.class);
        System.out.println(voicer);
        context.close();
    }
}
