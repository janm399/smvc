package uk.org.jug.smvc.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author janm
 */
@Controller
public class RecipeController {

    @RequestMapping(value = "/recipes/{id}",
                    method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("recipe", getRecipeById(id));
        return "recipes/addOrEdit";
    }

    @RequestMapping(value = "/recipes/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "recipes/addOrEdit";
    }

    /*
    @RequestMapping(value = "/recipes",
                    method = RequestMethod.POST)
    public String save(@ModelAttribute Recipe recipe) {
        saveTheRecipe(recipe);
        return "redirect:/recipes";
    }
    */

    @RequestMapping(value = "/recipes", method = RequestMethod.POST)
    public String save(@ModelAttribute Recipe recipe, BindingResult result) {
        if (result.hasErrors()) {
            return "recipes/addOrEdit";
        } 
        saveTheRecipe(recipe);
        return "redirect:/recipes";
    }

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public String recipes(Model model) {
        List<Recipe> recipes = new ArrayList<Recipe>();
        for (int i = 0; i < 10; i++) {
            Recipe recipe = new Recipe();
            recipe.setId((long)i);
            recipe.setName(String.format("Recipe #%d", i));
            recipe.setCookingTime(100);
            recipes.add(recipe);
        }
        model.addAttribute(recipes);
        return "recipes/index";
    }

    private void saveTheRecipe(Recipe recipe) {
        System.out.println(recipe);
    }

    private Recipe getRecipeById(final long id) {
        return new Recipe() {{ setId(id); }};
    }
}