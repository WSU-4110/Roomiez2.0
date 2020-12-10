package project4110.apiControllers;

////import javax.validation.Valid;
//
//@Controller
//public class NewUserController  {
//
//    private NewUserService newUserService;
//
//    private NewUserToNewUserForm newUserToNewUserForm;
//
//    @Autowired
//    public void setNewUserToNewUserForm(NewUserToNewUserForm newUserToNewUserForm){
//        this.newUserToNewUserForm = newUserToNewUserForm;
//    }
//
//    @Autowired
//    public void setNewUserService(NewUserService newUserService){
//        this.newUserService = newUserService;
//    }
//
//    @RequestMapping("/")
//    public String redirToList(){
//        return "redirect:/login";
//    }
//
//    @RequestMapping("/newUser")
//    public String listNewUserAttributes(Model model){
//        model.addAttribute("newUser", newUserService.listAll());
//        return "/newUser";
//    }
//
//    @RequestMapping("/newUser/show/{id}")
//    public String getUser(@PathVariable String id, Model model){
//        model.addAttribute("newUser", newUserService.getById(Long.valueOf(id)));
//        return "/newUser/show";
//    }
//
//    @RequestMapping("/newUser/edit/{id}")
//    public String editUser(@PathVariable String id, Model model){
//        NewUser newUser = newUserService.getById(Long.valueOf(id));
//        NewUserForm newUserForm = newUserToNewUserForm.convert(newUser);
//
//        model.addAttribute("newUserForm", newUserForm);
//        return "/newUser/newuserform";
//    }
//
//    @RequestMapping("newUser/new")
//    public String addNewUser(Model model){
//        model.addAttribute("newUserForm", new NewUserForm());
//        return "newUser/newuserform";
//    }
//
//
//
//
//    //OLD
//
////    @RequestMapping(path="/Registration")
////    public String newUser(Model model){
////        model.addAttribute("newUserForm", new NewUserForm());
////        return "redirect:/logIn";
////    }
//
//
//    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
//    public String saveOrUpdateUser(NewUserForm newUserForm, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return "Registration";
//        }
//        NewUser savedNewUser = newUserService.saveOrUpdateNewUserForm(newUserForm);
//
//        return "redirext:/newUSer/show/" + savedNewUser.getId();
//    }
//
//    @RequestMapping("/newUSer/delete/{id}")
//    public String deleteUser(@PathVariable String id){
//        newUserService.delete(Long.valueOf(id));
//        return "redirext:/newUser/list";
//    }
//
//}