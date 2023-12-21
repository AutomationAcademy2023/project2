package Data;

import static Utils.UtilMethods.Methods.generateRandomAlphabetic;

public class UserData {
    public String firstName = "Durmishkhan",
            lastName = "Marjvena",
            phone = "1122334455",
            password = "abcd1234",
            address = "Imis iqitis 2",
            email = generateRandomAlphabetic(10) + "@gmail.com",
            country = "Georgia",
            state = "Tbilisi",
            city = "Tbilisi";
    public int zip = 12345;
}
