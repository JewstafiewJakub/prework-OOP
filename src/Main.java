public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact friendSam = new Contact();
        friendSam.name = "Sam";
        friendSam.phoneNumber = "123456789";
        myContactsManager.addContact(friendSam);

        Contact friendSully = new Contact();
        friendSully.name = "Sully";
        friendSully.phoneNumber = "123451234";
        myContactsManager.addContact(friendSully);

        Contact friendMike = new Contact();
        friendMike.name = "Mike";
        friendMike.phoneNumber = "65465466";
        myContactsManager.addContact(friendMike);

        Contact result = myContactsManager.searchContact("Mike");
        System.out.println(result.phoneNumber);
    }
}