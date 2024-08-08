import java.util.ArrayList;
import java.util.List;

public class WorkerDirectory {
    private static List<Worker> directory;
    private static int directorySize;

    public WorkerDirectory(){
        directory = new ArrayList<>();
    }

    public Worker get(int number) {
        return directory.get(number);
    }
    public int getSize() {
        return directorySize;
    }

    //добавление нового сотрудника в справочник
    public void addWorker(Worker worker) {
        directory.add(worker);
        directorySize++;
    }
    //поиск сотрудника по стажу (может быть список)
    public List<Worker> findWorkerByExperience(int experience) {
        if (directorySize == 0) return null;
        List<Worker> experienceWorker = new ArrayList<>();
        for (int i = 0; i < directorySize; i++) {
            if (directory.get(i).getExperience() == experience) {
                experienceWorker.add(directory.get(i));
            }
        }
        return experienceWorker;
    }
    //поиск номера телефона сотрудника по имени (может быть список)
    public List<Long> numbersByName (String name) {
        if (directorySize == 0) return null;
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < directorySize; i++) {
            if (directory.get(i).getName() == name) {
                numbers.add(directory.get(i).getPhoneNumber());
            }
        }
        return numbers;
    }

    //поиск сотрудника по табельному номеру
    public String workerByTabelNumber(int number) {
        for (int i = 0; i < directorySize; i++) {
            if (directory.get(i).getTabelNumber() == number) {
                return "Имя: " + directory.get(i).getName() +
                        ", Номер телефона: " + directory.get(i).getPhoneNumber() +
                        ", Стаж: " + directory.get(i).getExperience() + "\n";
            }
        }
        return null;
    }

}
