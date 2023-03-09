package com.vcrts.rest.Client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class ClientServices {






        private final ClientRepository clientRepository;
        @Autowired
        public ClientServices(ClientRepository clientRepository){
            this.clientRepository = clientRepository;
        }
        public List<Client> getClients(){
            return clientRepository.findAll();

        }
        public void addNewClient(Client client){
            Optional<Client> clientByEmail = clientRepository.findClientByEmail(client.getEmail());
            if (clientByEmail.isPresent()){
                throw new IllegalStateException("email taken");
            }
            clientRepository.save(client);
        }
        public void deleteClient(long clientID){
            boolean exists = clientRepository.existsById(clientID);

            if(!exists){
                throw new IllegalStateException("client with id" + clientID + "does not exists");

            }
            clientRepository.deleteById(clientID);
        }
        public void updateClient(Long clientId, String name, String email, int JobID){

        }
    }







