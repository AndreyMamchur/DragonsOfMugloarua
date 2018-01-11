package ua.DragonsOfMugolar.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.DragonsOfMugolar.service.GameService;

@Controller
@RequestMapping("/")
public class GameController {

    private static final Logger logger = Logger.getLogger(GameController.class);

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/game")
    public String startGame(Model model){
        model.addAttribute("knight", gameService.startGame().getKnight());
        return "game";
    }
}
