package tk.asithasandakalum.spellmasterserver;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tk.asithasandakalum.repository.DataSource;
import tk.asithasandakalum.repository.TextDataSource;

import java.io.IOException;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 9/14/2019
 -----------------------------------------------------------------------*/
@Controller
public class ServerController {

    Server server;

    @Autowired
    public ServerController(Server server) {
        this.server = server;
    }

    @GetMapping("/")
    public String getStartPage(Model model) {
        return "startPage";
    }

    @GetMapping("/getData")
    @ResponseBody
    public String getData() throws IOException {
        return server.getData();

    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file,
                           RedirectAttributes redirectAttributes) throws IOException {

        server.uploadFile(file.getInputStream());

        return "redirect:/";
    }


}
