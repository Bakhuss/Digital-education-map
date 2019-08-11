package org.doit.controller;

import org.doit.dto.MapObject;
import org.doit.model.Organization;
import org.doit.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class RestOrganizationController {
    private final Logger log = LoggerFactory.getLogger(RestOrganizationController.class);

    private final OrganizationService service;

    @Autowired
    public RestOrganizationController(OrganizationService service) {
        this.service = service;
    }

    @GetMapping(value = "/organizations")
    public MapObject getAllWithAddressesAndContacts(@RequestParam(required = false) String city,
                                                    @RequestParam(required = false) String category) {
        log.info("city:\n" + city + "\ncategory:\n" + category);
        if (city != null) {
            return new MapObject(service.getAllByCity(city));
        } else
            return new MapObject(service.getAllWithAddressesAndContacts());
    }

    @GetMapping("/organization/{id}")
    public Organization get(@PathVariable long id) {
        return service.get(id);
    }
}
