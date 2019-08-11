package org.doit.service.impl;

import org.doit.model.Organization;
import org.doit.model.OrganizationCategory;
import org.doit.repository.AddressRepository;
import org.doit.repository.OrganizationRepository;
import org.doit.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class OrganizationServiceImpl implements OrganizationService {
    private final Logger log = LoggerFactory.getLogger(OrganizationServiceImpl.class);

    private final OrganizationRepository orgRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository orgRepository, AddressRepository addressRepository) {
        this.orgRepository = orgRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    @Transactional
    public Organization createOrUpdate(Organization organization) {
        return orgRepository.save(organization);
    }

    @Override
    @Transactional
    public void delete(long id) {
        orgRepository.deleteById(id);
    }

    @Override
    public Organization get(long id) {
        return orgRepository.findById(id).orElse(null);
    }

    @Override
    public List<Organization> getAll() {
        return orgRepository.findAll();
    }

    @Override
    public List<Organization> getAllWithAddressesAndContacts() {
        return orgRepository.findAllWithAddressesAndContacts();
    }

    @Override
    public List<Organization> getAllByCity(String city) {
        return orgRepository.findByCity(city);
    }

    @Override
    public List<Organization> getAllByCategory(OrganizationCategory category) {
        log.info("Nothing has been implemented yet");
        return null;
    }
}
