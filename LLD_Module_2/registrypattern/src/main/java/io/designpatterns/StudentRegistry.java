package io.designpatterns;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public Student addStudent(String key, Student student) throws Exception {
        if (registry.containsKey(key)) {
            throw new Exception("Student already exists..!");
        }
        return registry.put(key, student);
    }

    public Student getStudent(String key) throws Exception {
        if (!registry.containsKey(key)) {
            throw new Exception("Student does not exists..!");
        }
        return registry.get(key);
    }

    public HashMap<String, Student> getRegistry() {
        return registry;
    }

    public void setRegistry(HashMap<String, Student> registry) {
        this.registry = registry;
    }

    

}
