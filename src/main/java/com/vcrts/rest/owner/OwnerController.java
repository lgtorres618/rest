package com.vcrts.rest.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"api/v1/Owner"})
public class OwnerController {

    private final OwnerServices ownerServices;
    @Autowired
    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;


    }


 @GetMapping
    public List<Owner> getOwners(){
        return ownerServices.getOwners();
    }

    @PostMapping
    public void registerNewOwner(@RequestBody Owner owner){
        ownerServices.addNewOwner(owner);

    }
    @DeleteMapping(path = "{ownerId}")
     public void deleteOwner (@PathVariable("ownerID") Long OwnerID){
         ownerServices.deleteOwner(OwnerID);
    }
    @PutMapping(path = "{ownerId}")
        public void updateOwner(
                @PathVariable("ownerId") Long ownerId,
                @RequestParam(required = false) String name,
                @RequestParam(required = false) String email,
                @RequestParam(required = false) String model) {
        ownerServices.updateOwner(ownerId, name, email, model);
    }



}
