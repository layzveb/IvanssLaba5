package Commands;

import Controller.CommandWithoutArg;

public class Help implements CommandWithoutArg {
    String name = "help";

    @Override
    public String execute(Object o) {
        return ("help : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "insert null {element} : добавить новый элемент с заданным ключом\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_key null : удалить элемент из коллекции по его ключу\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
                "history : вывести последние 8 команд (без их аргументов)\n" +
                "replace_if_greater null {element} : заменить значение по ключу, если новое значение больше старого\n" +
                "remove_any_by_category : удалить из коллекции один элемент, значение поля category которого эквивалентно заданному\n" +
                "max_by_id : вывести любой объект из коллекции, значение поля id которого является максимальным\n" +
                "print_descending : вывести элементы коллекции в порядке убывания");
    }

    @Override
    public String getName() {
        return name;
    }
}
