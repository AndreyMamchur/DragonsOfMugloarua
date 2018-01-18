package ua.DragonsOfMugolar.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.DragonsOfMugolar.entity.Dragon;
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

    @GetMapping("/startGame")
    public String startGame(Model model){
            model.addAttribute("knight", gameService.startGame().getKnight());
            return "game";
    }

    @PostMapping("/createDragon")
    public String createDragon(@ModelAttribute Dragon dragon, Model model){
        gameService.createDragon(dragon);
        model.addAttribute("knight", GameService.game.getKnight());
        model.addAttribute("dragon", GameService.game.getDragon());
        return "game";
    }

    @PostMapping("/startBattle")
    public String startBatttle(Model model){
        model.addAttribute("response", gameService.startBattle());
        return "game";
    }
}
