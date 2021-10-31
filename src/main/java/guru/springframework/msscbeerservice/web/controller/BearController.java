package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BearDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@RequestMapping("/api/v1/beer")
@RestController
public class BearController {

    @GetMapping("/{bearId}")
    public ResponseEntity<BearDto> getBearByID(@PathVariable("bearId") UUID bearId){
        //todo impl
        return new ResponseEntity<>(BearDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBear(@RequestBody BearDto bearDto){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{bearId}")
    public ResponseEntity updateBearById(@PathVariable("bearId") UUID bearId, @RequestBody BearDto bearDto){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
