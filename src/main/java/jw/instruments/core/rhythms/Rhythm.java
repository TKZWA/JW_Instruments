package jw.instruments.core.rhythms;


import jw.fluent.api.desing_patterns.dependecy_injection.api.annotations.Injection;
import jw.instruments.core.rhythms.events.NoteEvent;
import jw.instruments.core.rhythms.events.PlayingStyleEvent;


import java.util.function.Consumer;

@Injection
public interface Rhythm {

    default String getName() {

        return  getClass().getSimpleName();
    }
    default void onEvent(Consumer<NoteEvent> event)
    {

    }

    void cancel();

    default String getSoundName(int noteId, String guitarName)
    {
        noteId +=1;
        return "instruments:"+guitarName+noteId;
    }

    default void emitEvent(NoteEvent noteEvent){};

    void play(PlayingStyleEvent event);
}
