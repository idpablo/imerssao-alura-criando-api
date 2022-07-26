package br.com.pablo.alura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens =
            List.of(
                    new Linguagem("JAVA", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png"),
                    new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png")
            );

    @GetMapping("/linguagem")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
}
