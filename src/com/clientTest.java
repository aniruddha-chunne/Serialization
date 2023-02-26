package com;

import com.model.Address;
import com.model.Employee;

import java.io.*;

public class clientTest
{
    public static void main(String[] args)
    {



        String fileName = "serializedObject.txt";
        serializeOjbect(fileName);
        deSerialized(fileName);


    }


        private static void serializeOjbect(String fileName)
        {
            Address address = new Address(1111, "address Line 1", "address Line 2", "Mumbai", 440008L);

            Employee employee = new Employee(1001, "KK", 30, "kishan.javatrainer@gmail.com", "password", address);

            try
            {

                File f = new File(fileName);

                FileOutputStream fileOutputStream = new FileOutputStream(f);

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

//                objectOutputStream.writeObject(employee);

//                String a = "Aniruddha Subhash Chunne";




                objectOutputStream.writeObject(employee);




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

                System.out.println(objectInputStream.readObject().toString());

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }



        }


}
