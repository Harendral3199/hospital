package com.example.hospital.servlet;

import com.example.hospital.dao.PatientDao;
import com.example.hospital.model.Patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/patients")
public class PatientListServlet extends HttpServlet {
    private PatientDao dao = PatientDao.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Patient> patients = dao.findAll();
        req.setAttribute("patients", patients);
        req.getRequestDispatcher("/WEB-INF/views/patients.jsp").forward(req, resp);
    }
}
