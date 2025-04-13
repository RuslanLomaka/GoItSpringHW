package notes;
import org.springframework.stereotype.Service;
import java.util.List;
// тут все поки що на заглушках
@Service
public class NoteService {
    private List<Note> notes = List.of();

    public List<Note> listAll() {
        return notes;
    }

    Note add(Note note) {
        return note;
    }

    void deleteById(long id) {
    }

    public void update(Note note) {
    }

    Note getById(long id){
        return null;
    }}
/*
List<Note> listAll() - повертає список всіх нотаток
Note add(Note note) - додає нову нотатку, генеруючи для цієї нотатки унікальний (випадковий) числовий ідентифікатор, повертає цю ж нотатку з згенерованим ідентифікатором.
void deleteById(long id) - видаляє нотатку з вказаним ідентифікатором. Якщо нотатки з ідентифікатором немає - викидає виключення.
void update(Note note) - шукає нотатку по note.id. Якщо нотатка є - оновлює для неї title та content. Якщо нотатки немає - викидає виключення.
Note getById(long id) - повертає нотатку по її ідентифікатору. Якщо нотатки немає - викидає виключення.
*/

