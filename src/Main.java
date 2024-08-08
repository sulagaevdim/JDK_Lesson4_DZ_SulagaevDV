/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */
public class Main {
    public static void main(String[] args) {
        //создание справочника и добавление сотрудников
        WorkerDirectory directory = new WorkerDirectory();
        directory.addWorker(new Worker(1, "Дмитрий", 89278182015l, 8));
        directory.addWorker(new Worker(2, "Дарья", 89278183090l, 10));
        directory.addWorker(new Worker(3, "Александр", 89176364404l, 10));
        directory.addWorker(new Worker(4, "Дарья", 89021256743l, 1));

        //вывод созданного справочника в консоль
        for (int i = 0; i < directory.getSize(); i++) {
            System.out.println(directory.get(i));
        }
        System.out.println();

        //поиск сотрудника(ов) по стажу
        System.out.println(directory.findWorkerByExperience(10));
        System.out.println(directory.findWorkerByExperience(1));
        System.out.println();

        //поиск номеров по имени
        System.out.println(directory.numbersByName("Дарья"));
        System.out.println(directory.numbersByName("Дмитрий"));
        System.out.println();

        //поиск сотрудника по табельному номеру
        System.out.println(directory.workerByTabelNumber(1));



    }
}