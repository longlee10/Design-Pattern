package com.codewithmosh.mediator;

public class SignUpDialogBox {
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox terms = new CheckBox();
    private Button button = new Button();

    public SignUpDialogBox(){
        username.addEventHandler(this::controlChanged); // overriding the update method
        password.addEventHandler(this::controlChanged);
        terms.addEventHandler(this::controlChanged);
    }

    public void simulateInteraction(){
        System.out.println("Button enabled initially: " + button.isEnabled());

        username.setContent("User 1");
        System.out.println("Button enabled after filling username: " + button.isEnabled());

        password.setContent("mypassword");
        System.out.println("Button enabled after filling password: " + button.isEnabled());

        terms.setChecked(true);
        System.out.println("Button enabled after select terms: " + button.isEnabled());

        terms.setChecked(false);
        System.out.println("Button enabled after uncheck terms: " + button.isEnabled());
    }

    private boolean isFormValid(){
        return !username.isEmpty() && !password.isEmpty() && terms.isChecked();
    }

    private void controlChanged(){
        button.setEnabled(isFormValid());
    }
}
