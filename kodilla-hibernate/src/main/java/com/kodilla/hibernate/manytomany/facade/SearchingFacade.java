package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    List<Company> companyList = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    public void processCompanySearch(String text) throws PhraseSearchingException {
        LOGGER.info("Start searching company with: " + text + " in name");
        companyList = companyDao.retrieveCompanyWith("%" + text + "%");
        if (companyList.isEmpty()) {
            LOGGER.error(PhraseSearchingException.ERR_NOT_FOUND);
            throw new PhraseSearchingException(PhraseSearchingException.ERR_NOT_FOUND);
        } else {
            LOGGER.info("Searching successful " + companyList + "found");
        }
    }

    public void processEmployeeSearch(String text) throws PhraseSearchingException {
        LOGGER.info("Start searching employee with: " + text + " in name");
        employees = employeeDao.retrieveEmployeeWith("%" + text + "%");
        if (employees.isEmpty()) {
            LOGGER.error(PhraseSearchingException.ERR_NOT_FOUND);
            throw new PhraseSearchingException(PhraseSearchingException.ERR_NOT_FOUND);
        } else {
            LOGGER.info("Searching successful " + employees + "found");
        }
    }

}
