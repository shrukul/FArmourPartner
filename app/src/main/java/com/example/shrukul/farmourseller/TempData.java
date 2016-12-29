package com.example.shrukul.farmourseller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shrukul on 12/18/16.
 */

public class TempData {

    public List<Person> chickenList = new ArrayList<Person>();

    public TempData () {}

    public List<Person> getChickenList() {
        chickenList.add(new Person("Mahesh", "9214123134", R.drawable.user, "200", 0));
        chickenList.add(new Person("Vishvesh", "9712124124", R.drawable.user, "190", 1));
        chickenList.add(new Person("kriti", "9124352352", R.drawable.user, "250", 0));
        chickenList.add(new Person("Ramesh", "9836235235", R.drawable.user, "240", 1));
        chickenList.add(new Person("Sachin", "9812573634", R.drawable.user, "190", 1));
        chickenList.add(new Person("Valasang", "9598523136", R.drawable.user, "180", 0));
        chickenList.add(new Person("Vishvesh", "9711249279", R.drawable.user, "205", 1));
        chickenList.add(new Person("kriti", "9135531298", R.drawable.user, "270", 0));
        chickenList.add(new Person("Ramesh", "9836551290", R.drawable.user, "230", 1));
        chickenList.add(new Person("Sachin", "9253173261", R.drawable.user, "220", 1));
        chickenList.add(new Person("Mahesh", "9216113218", R.drawable.user, "210", 0));
        return chickenList;
    }

    public List<Person> getMuttonList() {
        chickenList.add(new Person("Valasang", "9598523136", R.drawable.user, "380", 0));
        chickenList.add(new Person("Vishvesh", "9711249279", R.drawable.user, "405", 1));
        chickenList.add(new Person("kriti", "9135531298", R.drawable.user, "470", 0));
        chickenList.add(new Person("Ramesh", "9836551290", R.drawable.user, "430", 1));
        chickenList.add(new Person("Sachin", "9253173261", R.drawable.user, "420", 1));
        chickenList.add(new Person("Mahesh", "9216113218", R.drawable.user, "410", 0));
        chickenList.add(new Person("Mahesh", "9214123134", R.drawable.user, "400", 0));
        chickenList.add(new Person("Vishvesh", "9712124124", R.drawable.user, "390", 1));
        chickenList.add(new Person("kriti", "9124352352", R.drawable.user, "450", 0));
        chickenList.add(new Person("Ramesh", "9836235235", R.drawable.user, "440", 1));
        chickenList.add(new Person("Sachin", "9812573634", R.drawable.user, "490", 1));
        return chickenList;
    }

    public List<Person> getPorkList() {
        chickenList.add(new Person("Sachin", "9253173261", R.drawable.user, "320", 1));
        chickenList.add(new Person("Valasang", "9598523136", R.drawable.user, "280", 0));
        chickenList.add(new Person("Vishvesh", "9711249279", R.drawable.user, "305", 1));
        chickenList.add(new Person("kriti", "9135531298", R.drawable.user, "270", 0));
        chickenList.add(new Person("Ramesh", "9836551290", R.drawable.user, "330", 1));
        chickenList.add(new Person("Mahesh", "9216113218", R.drawable.user, "310", 0));
        chickenList.add(new Person("Mahesh", "9214123134", R.drawable.user, "300", 0));
        chickenList.add(new Person("Vishvesh", "9712124124", R.drawable.user, "290", 1));
        chickenList.add(new Person("kriti", "9124352352", R.drawable.user, "350", 0));
        chickenList.add(new Person("Ramesh", "9836235235", R.drawable.user, "340", 1));
        chickenList.add(new Person("Sachin", "9812573634", R.drawable.user, "290", 1));
        return chickenList;
    }

    public List<Person> getSeaFoodList() {
        chickenList.add(new Person("kriti", "9124352352", R.drawable.user, "550", 0));
        chickenList.add(new Person("Ramesh", "9836235235", R.drawable.user, "540", 1));
        chickenList.add(new Person("Sachin", "9812573634", R.drawable.user, "590", 1));
        chickenList.add(new Person("Valasang", "9598523136", R.drawable.user, "580", 0));
        chickenList.add(new Person("Vishvesh", "9711249279", R.drawable.user, "605", 1));
        chickenList.add(new Person("kriti", "9135531298", R.drawable.user, "570", 0));
        chickenList.add(new Person("Ramesh", "9836551290", R.drawable.user, "630", 1));
        chickenList.add(new Person("Sachin", "9253173261", R.drawable.user, "620", 1));
        chickenList.add(new Person("Mahesh", "9216113218", R.drawable.user, "610", 0));
        chickenList.add(new Person("Mahesh", "9214123134", R.drawable.user, "600", 0));
        chickenList.add(new Person("Vishvesh", "9712124124", R.drawable.user, "590", 1));
        return chickenList;
    }

    public List<Person> getInsuranceFarmList() {
        return getChickenList();
    }

    public List<Person> getInsuranceVehicleList() {
        return getMuttonList();
    }

    public List<Person> getInsuranceLifeList() {
        return getPorkList();
    }
}
