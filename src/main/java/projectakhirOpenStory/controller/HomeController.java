package projectakhirOpenStory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projectakhirOpenStory.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	private String index(Model model) {

		return "index";
	}
	
	@GetMapping("/index")
	private String home(Model model) {

		return "index";
	}
	
	@GetMapping("/contacts")
	private String contacts(Model model) {

		return "contacts";
	}
	
	@GetMapping("/explore")
	private String explore(Model model) {

		return "explore";
	}
	
	@GetMapping("/help")
	private String help(Model model) {

		return "help";
	}
	
	@GetMapping("/login")
	private String login(Model model) {

		return "login";
	}
	
	@GetMapping("/register")
	private String register(Model model) {

		return "register";
	}
	
	@GetMapping("/author")
	private String author(Model model) {

		return "author";
	}
	
	@GetMapping("/blog")
	private String blog(Model model) {

		return "blog";
	}
	
	@GetMapping("/index-author")
	private String indexAuthor(Model model) {

		return "index-author";
	}
	
	@GetMapping("/explore-author")
	private String exploreAuthor(Model model) {

		return "explore-author";
	}
	
	@GetMapping("/upload-artwork")
	private String uploadArtwork(Model model) {

		return "upload-artwork";
	}
	
	@GetMapping("/contacts-author")
	private String contactsAuthor(Model model) {

		return "contacts-author";
	}
	
	@GetMapping("/help-author")
	private String helpAuthor(Model model) {

		return "help-author";
	}
	
	@GetMapping("/connect-wallet")
	private String connectWallet(Model model) {

		return "connect-wallet";
	}
	
	@GetMapping("/account-settings")
	private String accountSetting(Model model) {

		return "account-settings";
	}
	
	@GetMapping("/author-edit-profile")
	private String authorEditProfile(Model model) {

		return "author-edit-profile";
	}
	
	@GetMapping("/become-author")
	private String becomeAuthor(Model model) {

		return "become-author";
	}
	
	@GetMapping("/detail-page")
	private String detailPage(Model model) {

		return "detail-page";
	}
	
	
	
	
}
