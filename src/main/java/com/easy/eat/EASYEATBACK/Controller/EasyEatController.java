package com.easy.eat.EASYEATBACK.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.easy.eat.EASYEATBACK.Documents.*;
import com.easy.eat.EASYEATBACK.service.CarritoService;
import com.easy.eat.EASYEATBACK.service.*;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/")
public class EasyEatController {

    @Autowired
    UserService serviceuser;
    @Autowired
    CarritoService serviceCarrito;
    @Autowired
    MenuService serviceMenu;
    @Autowired
    MesaService serviceMesa;
    @Autowired
    PlatoService servicePlato;
    
    

    @CrossOrigin
    @PostMapping(value = "/create-user")
    public ResponseEntity<?> insertUser(@RequestBody User user) {
        try {

            serviceuser.CreateUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @CrossOrigin
    @GetMapping(value = "/all-user")
    public ResponseEntity<?> allUser() {
        try {
            List<User> usuarios = serviceuser.findAllUser();
            return new ResponseEntity<>(usuarios, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }

    @CrossOrigin
    @GetMapping(value = "/user/{email}/{password}")
    public ResponseEntity<?> UserByPassword(@PathVariable("email") String email, @PathVariable("password") String password) {
        try {
            User user = serviceuser.findUserbyPassword(email, password);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }
    
    @CrossOrigin
    @PostMapping(value = "/create-plato")
    public ResponseEntity<?> createPlato(@RequestBody Plato plato) {
        try {

            servicePlato.CreatePlato(plato);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @CrossOrigin
    @GetMapping(value = "/all-plato")
    public ResponseEntity<?> allPlato() {
        try {
            List<Plato> platos = servicePlato.findAllPlato();
            return new ResponseEntity<>(platos,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
    @CrossOrigin
    @PutMapping("/{plato}")
    public Plato updatePlato(@RequestBody Plato plato, @PathVariable String deptId) {
        plato.setId(deptId);
        servicePlato.CreatePlato(plato);
        return plato;
    }

    //
//    @CrossOrigin
//    @PostMapping(value = "/usuario")
//    public String insertUsuarioIntoDynamoDB(@RequestBody Usuario usuario) {
//        repository.insertUsuarioIntoDynamoDB(usuario);
//        return "Successfully inserted usuario into Dynamo table";
//    }
//
//    @CrossOrigin
//    @PostMapping(value = "/archivo")
//    public String insertArchivoIntoDynamoDB(@RequestBody Archivo archivo) {
//        repository.insertArchivoIntoDynamoDB(archivo);
//        return "Successfully inserted archivo into Dynamo table";
//    }
//
    /*
	 * get
     */
}
