package com.vcrts.rest.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServices {
    private final OwnerRepository ownerRepository;
    @Autowired
    public OwnerServices(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }
    public List<Owner> getOwners(){
        return ownerRepository.findAll();

    }
    public void addNewOwner(Owner owner){
        Optional<Owner> ownerByEmail = ownerRepository.findOwnerByEmail(owner.getEmail());
        if (ownerByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        ownerRepository.save(owner);
    }
    public void deleteOwner(long ownerID){
        boolean exists = ownerRepository.existsById(ownerID);

        if(!exists){
            throw new IllegalStateException("owner with id" + ownerID + "does not exists");

        }
       ownerRepository.deleteById(ownerID);
    }
    public void updateOwner(Long ownerId, String name, String email, String model){

    }
}
