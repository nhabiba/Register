package ma.projet.demo.controller;



import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                model.addAttribute("errorMsg", "La page demandée est introuvable");
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                model.addAttribute("errorMsg", "Une erreur interne du serveur s'est produite");
            } else if (statusCode == HttpStatus.FORBIDDEN.value()) {
                model.addAttribute("errorMsg", "Vous n'êtes pas autorisé à accéder à cette page");
            }
        }
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }
}

