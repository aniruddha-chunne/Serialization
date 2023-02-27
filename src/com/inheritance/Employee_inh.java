package com.inheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee_inh extends Person implements Serializable
{
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException
    {
        oos.defaultWriteObject();
        oos.writeInt(getId());
        oos.writeObject(getName());
        oos.writeInt(getAge());
    }
    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
    {
        ois.defaultReadObject();
        setId(ois.readInt());
        setName((String) ois.readObject());
        setAge(ois.readInt());
    }

    @Override
    public String toString()

    {
        return "Employee_inh{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
