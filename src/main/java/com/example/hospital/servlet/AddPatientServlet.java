package com.example.hospital.servlet;

import com.example.hospital.dao.PatientDao;
import com.example.hospital.model.Patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/add")
public class AddPatientServlet extends HttpServlet {
    private PatientDao dao = PatientDao.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/addPatient.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        String diagnosis = req.getParameter("diagnosis");

        int age = 0;
        try { age = Integer.parseInt(ageStr); } catch (Exception ignored) {}

        Patient p = new Patient(0, name, age, diagnosis);
        dao.save(p);
        resp.sendRedirect(req.getContextPath() + "/patients");
    }
}
