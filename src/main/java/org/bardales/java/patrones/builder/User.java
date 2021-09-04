package org.bardales.java.patrones.builder;

public class User {

    //Todos los atributos son finales
    private final String firstName; //required
    private final String lastName; //required
    private final Integer age; //optinal
    private final String phone; //optional
    private final String address; //optional

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public static UserBuilder builder(String firstName, String lastName) {
        return new UserBuilder(firstName, lastName);
    }

    @Override
    public String toString() {
        return "FirstName: " + this.firstName + " LastName: " + this.lastName + " Age: " + this.age + " Phone: " + this.phone + " Address: " + this.address;
    }

    public static class UserBuilder {

        private final String firstName;
        private final String lastName;
        private Integer age;
        private String phone;
        private String address;

        private UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            this.validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            //Hacer validaciones sobre el objeto
            // a construir, para no romper el sistema
        }

    }

}