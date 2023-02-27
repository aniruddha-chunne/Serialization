package com.inheritance;

import com.model.Address;
import com.model.Employee;

import java.io.*;

public class Main_Inher
{
    public static void main(String[] args)
    {

        String fileName = "serializedObject_inher.txt";
        serializeOjbect(fileName);
        deSerialized(fileName);


    }


    private static void serializeOjbect(String fileName)
    {

        try
        {
            Employee_inh employee_inh = new Employee_inh();
            employee_inh.setEmail("achunne3@gmail.com");
            employee_inh.setPassword("Aniruddha_Password");
            employee_inh.setId(11);
            employee_inh.setAge(23);
            employee_inh.setName("Aniruddh_Name");

            File f = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee_inh);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private static void deSerialized (String fileName)
    {

        try
        {
            File f = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(f);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee_inh deserialize_object = (Employee_inh) objectInputStream.readObject();
            System.out.println(deserialize_object.getId() + " : id");
            System.out.println(deserialize_object.getAge() + " : Age");
            System.out.println(deserialize_object.getName() + " : Name" );
            System.out.println(deserialize_object.getEmail() + " : Email");
            System.out.println(deserialize_object.getPassword() + " : Password");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
