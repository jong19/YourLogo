package data;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 7/13/2017.
 */
public class UserDetails {

    private String firstname = "";
    private String lastname = "";
    private String password = "";
    // date of birth
    private String address = "";
    private String city = "";
    // state
    private String postal = "";
    // country
    private String phone = "";
    private String alias = "";

    Random rand = new Random();


    ArrayList<String> firstname_list = new ArrayList<>();
    ArrayList<String> lastname_list = new ArrayList<>();
    ArrayList<String> password_list = new ArrayList<>();
    ArrayList<String> address_list = new ArrayList<>();
    ArrayList<String> city_list = new ArrayList<>();
    ArrayList<String> postal_list = new ArrayList<>();
    ArrayList<String> phone_list = new ArrayList<>();
    ArrayList<String> alias_list = new ArrayList<>();


    public String getFirstname() {

        firstname_list.add("Calvin");
        firstname_list.add("John Paul");
        firstname_list.add("Maynard James");
        firstname_list.add("Clovel");
        firstname_list.add("Shauntal");

        firstname =  firstname_list.get(rand.nextInt(firstname_list.size()));

        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {

        lastname_list.add("Lockwood");
        lastname_list.add("Ward");
        lastname_list.add("Morgan");
        lastname_list.add("Guttenberg");
        lastname_list.add("Williams");

        lastname =  lastname_list.get(rand.nextInt(lastname_list.size()));



        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {

        password_list.add("%mypassword1234%");
        password_list.add("1234mypassword1234");
        password_list.add("$dollardollar1234$");
        password_list.add("ripe1234ripe4321");
        password_list.add("7h15password666");

        password =  password_list.get(rand.nextInt(password_list.size()));
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {

        address_list.add("101 St. Holdings, Stone Sour");
        address_list.add("Block 666, Arizona Hail");
        address_list.add("Suite 108, The Aces Building");
        address_list.add("Treehouse Academy, Apartment 408, Des Moines");
        address_list.add("Nuggets Wrath, Simmons St., Sin City");

        address =  address_list.get(rand.nextInt(address_list.size()));


        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {

        city_list.add("Sta. Barbara");
        city_list.add("Salt Lake City");
        city_list.add("Jacksonville");
        city_list.add("Memphis");
        city_list.add("San Antonio");

        city =  city_list.get(rand.nextInt(city_list.size()));

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {

        postal_list.add("40304");
        postal_list.add("12345");
        postal_list.add("23049");
        postal_list.add("29393");
        postal_list.add("00121");

        postal =  postal_list.get(rand.nextInt(postal_list.size()));

        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPhone() {

        phone_list.add("100-200-3000");
        phone_list.add("232-1330-2020");
        phone_list.add("09345687900");
        phone_list.add("09414554101");
        phone_list.add("700-800-9000");

        phone =  phone_list.get(rand.nextInt(phone_list.size()));

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    public String getAlias() {

        alias_list.add("My Address 1");
      

        alias=  alias_list.get(rand.nextInt(alias_list.size()));

        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
