package hr.kingict.springbootakademija2023.controller;

import hr.kingict.springbootakademija2023.dto.VegetableDto;
import hr.kingict.springbootakademija2023.form.VegetableForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api")
public class TestController {

   @GetMapping(value = "/vegetables")
    public ResponseEntity<List<String>> getVegetables(){
        return ResponseEntity
                .ok() //can be badRequest() value: 400, internalServerError etc.
                .header("moj header","bla bla")
                .body(Arrays.asList("Jabuke","Kruske","Prokulice"));
    }
    @GetMapping(value = "/vegetable/{passcode}")

    public ResponseEntity<String> getVegetable(@PathVariable String passcode){

       if( passcode == null){
           return ResponseEntity
                   .badRequest()
                   .build();
       }

       if( passcode.equalsIgnoreCase("MRK")){
           return ResponseEntity
                   .ok()
                   .body("mrkva");
       }
       return ResponseEntity
               .badRequest()
               .build();

    }

    @PostMapping(value = "/vegetables")
    public ResponseEntity<VegetableDto> saveVegetable(@RequestBody @Valid VegetableForm vegetableForm){

       VegetableDto vegetableDto = new VegetableDto();
       vegetableDto.setName(vegetableForm.getName());
       vegetableDto.setColor(vegetableForm.getColor());
       vegetableDto.setOrganic(vegetableForm.getOrganic());

       return ResponseEntity
               .ok()
               .body(vegetableDto);
    }
}
