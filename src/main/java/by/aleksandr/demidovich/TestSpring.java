package by.aleksandr.demidovich;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author  Demidovich
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean" , Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        by.aleksandr.demidovich.MusicPlayer musicPlayer = context.getBean("musicPlayer", by.aleksandr.demidovich.MusicPlayer.class);
        musicPlayer.playMusicList();

        context.close();
    }
}
