package com.vcrts.rest.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"api/v1/Client"})
public class ClientController {

    private final ClientServices clientServices;

    @Autowired
    public ClientController(ClientServices clientServices) {
        this.clientServices = clientServices;


    }


    @GetMapping
    public List<Client> getClients() {
        return clientServices.getClients();
    }

    @PostMapping
    public void registerNewClient(@RequestBody Client client) {
        clientServices.addNewClient(client);

    }

    @DeleteMapping(path = "{clientId}")
    public void deleteOwner(@PathVariable("clientID") Long ClientID) {
        clientServices.deleteClient(ClientID);
    }

    @PutMapping(path = "{clientId}")
    public void updateClient(
            @PathVariable("clientId") Long clientId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) int JobID) {
        clientServices.updateClient(clientId, name, email, JobID );

    }
}


    //Long clientId, String name, String email, int JobID


