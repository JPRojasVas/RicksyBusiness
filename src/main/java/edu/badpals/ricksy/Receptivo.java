package edu.badpals.ricksy;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
    Receptivo(){}
    private List<GuestDispatcher> dispatchers = new ArrayList<>();
    void registra(GuestDispatcher dispatcher){
        dispatchers.add(dispatcher);
    }

    void dispatch(CreditCard card) {
        for (GuestDispatcher dispatcher: dispatchers){
            dispatcher.dispatch(card);
        }
    }
}