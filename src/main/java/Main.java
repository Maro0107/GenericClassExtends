public class Main {
    public static void main(String[] args) {

        Organisation<Employee> organisation = new Organisation<>();

        organisation.addParticipant(new Employee("Marek", "programista"));
        organisation.addParticipant(new Employee("Anna", "programistka"));

        organisation.printParticipants();
    }
}
