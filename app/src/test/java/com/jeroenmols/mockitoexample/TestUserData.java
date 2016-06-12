package com.jeroenmols.mockitoexample;

/**
 * @author Jeroen Mols on 12/06/16.
 */
public class TestUserData extends UserData {
    @Override
    public String getFirstName() {
        return "FirstName";
    }

    @Override
    public String getLastName() {
        return "LastName";
    }

    @Override
    public int getUserId() {
        return 1111007;
    }

    @Override
    public String getStreet() {
        return "StreetName";
    }

    @Override
    public int getHouseNumber() {
        return 1;
    }

    @Override
    public String getCity() {
        return "City";
    }

    @Override
    public String getCountry() {
        return "Country";
    }
}
