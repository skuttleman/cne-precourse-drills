package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
    private final List<Address> addresses;
    private final String name;

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }
}
