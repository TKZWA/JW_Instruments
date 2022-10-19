package jw.guitar.builders.rhythm;

import jw.guitar.rhythms.events.ChordChangeEvent;
import jw.guitar.rhythms.events.NoteEvent;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

@Data
public class RhythmModel
{
    private Set<Consumer<NoteEvent>> events = new HashSet<>();
    private Consumer<ChordChangeEvent> onChordChanged = (s)->{};
    private String name = "custom_rhythm";
    private String displayedName = "Custom rhythm";
    private Integer speed = 5;
}