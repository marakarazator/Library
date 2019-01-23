package com.koddokariery.library.rent;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rents")
public class RentController {

    private final RentService rentService;

    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @PostMapping
    public void addRent(@RequestBody CreateRentDto createRentDto){
        rentService.addRent(createRentDto);
    }

    @GetMapping("/{id}")
    public RentResponse getOneRent(@PathVariable("id") Long id){
        return rentService.getOneById(id);
    }

}
