package com.piyushpatel2005.interfaceSegregationPrinciple;

public class Main2 {
}

interface RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}

// online client also has to implement methods for payInPerson. So, this is good place to segregate interfaces.
// We can separate out interface into payment and order interfaces and further we can separate into online payment and in person payment interfaces.
class OnlineClientImpl implements RestaurantInterface {

    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}
