package com.example.hospital.dao;

import com.example.hospital.model.Patient;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PatientDao {
    private static PatientDao instance = new PatientDao();
    private Map<Integer, Patient> store = new LinkedHashMap<>();
    private AtomicInteger idSeq = new AtomicInteger(1);

    private PatientDao() {
        // some sample data
        save(new Patient(0, "John Doe", 30, "Flu"));
        save(new Patient(0, "Jane Smith", 45, "Diabetes"));
    }

    public static PatientDao getInstance() { return instance; }

    public List<Patient> findAll() {
        return new ArrayList<>(store.values());
    }

    public Patient findById(int id) {
        return store.get(id);
    }

    public Patient save(Patient p) {
        if (p.getId() <= 0) {
            p.setId(idSeq.getAndIncrement());
        }
        store.put(p.getId(), p);
        return p;
    }

    public void delete(int id) {
        store.remove(id);
    }
}
