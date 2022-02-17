package org.cigma;

import org.cigma.command.Commands;
import org.cigma.entities.person.Gender;
import org.cigma.entities.person.Person;
import org.cigma.service.HeaderQuarterService;
import org.cigma.service.PersonService;
import org.cigma.service.imp.HeadQuarterServiceImp;
import org.cigma.service.imp.PersonServiceImp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;

public class Entry {
    public static Logger logger = Logger.getLogger(Entry.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HeaderQuarterService headerQuarterService = new HeadQuarterServiceImp("CIGMA");
        PersonService personService = new PersonServiceImp();
        Collection<Person> students = new HashSet<>();
        String optionsValues = "Tapez l'une des commandes suivantes : \n - create_student \n - show_students \n - grant_access_student  ";
        do{
            System.out.println(optionsValues);

            String input = scanner.nextLine();
            Commands currentCommand = Commands.getCommand(input);


            switch (currentCommand) {
                case CREATE_STUDENT: {
                    System.out.println("Veuillez entrer les informations de l'étudiant au format : fistName,lastName,age,gender(MALE|FEMALE|OTHER),cin");
                    String[] studentArgs = scanner.nextLine().split(",");
                    students.add(personService.createStudent(studentArgs[0], studentArgs[1], Integer.valueOf(studentArgs[2]), Gender.valueOf(studentArgs[3]), studentArgs[4]));
                    break;
                }
                case SHOW_STUDENTS: {
                    logger.info(String.format("Students : %s", students));
                    break;
                }
                case GRANT_STUDENT_ACCESS: {
                    System.out.println("Veuillez saisir le cin et le code d'accès au format cin,code");
                    String[] accessArgs = scanner.nextLine().split(",");
                    students.stream().filter((s) -> s.getCin().equals(accessArgs[0]))
                            .findAny().ifPresentOrElse((s) -> {
                        headerQuarterService.grantAccess(s, accessArgs[1]);
                    }, () -> {
                        logger.warning(String.format("L'étudiant avec le CIN : %s est introuvable", accessArgs[0]));
                    });
                    break;
                }
                default: {
                    logger.warning(String.format("Not handler found for this command %s", input));

                }
            }

        }while (true);



    }
}
