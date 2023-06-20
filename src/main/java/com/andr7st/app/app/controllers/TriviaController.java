package com.andr7st.app.app.controllers;

import com.andr7st.app.app.entities.Category;
import com.andr7st.app.app.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categorie}")
    public Question getQuestion(@PathVariable String categorie) {

        Question q = new Question();
        q.setCategory("Cultura");
        q.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
        q.setAnswer(0);
        q.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

        String[] options = new String[3];
        options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante.";
        options[1] = "Cerveza, lima/limón y limon";
        options[2] = "Cerveza, sal, tabasco y lima/limón";

        q.setOptions(options);

        return q;
    }

    @GetMapping("/categories")
    public Category[] getCategories() {

        Category cat1 = new Category();
        cat1.setCategory("Deporte");
        cat1.setDescription("Preguntas de deportes");

        Category cat2 = new Category();
        cat2.setCategory("Deporte");
        cat2.setDescription("Preguntas de deportes");

        Category[] categories = new Category[2];
        categories[0] = cat1;
        categories[1] = cat2;

        return categories;
    }
}
