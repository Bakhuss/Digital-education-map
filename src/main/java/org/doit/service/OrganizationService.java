package org.doit.service;

import org.doit.model.Organization;
import org.doit.model.OrganizationCategory;

import java.util.List;

public interface OrganizationService {

    Organization createOrUpdate(Organization organization);

    void delete(long id) throws RuntimeException;

    Organization get(long id);

    List<Organization> getAll();

    List<Organization> getAllWithAddressesAndContacts();

    List<Organization> getAllByCity(String city);

    List<Organization> getAllByCategory(OrganizationCategory category);
}
