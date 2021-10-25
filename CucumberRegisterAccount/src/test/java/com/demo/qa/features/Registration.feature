Feature: Registration
@register
Scenario: Register a new account
Given the user the registration Page
And the title is asserted to be "Register Account"
When the user details are entered
|Leonardo|DeCaprio|leonardo123@gmail.com|9876543210|test123|test123|
And clicked on subscribe radio button
And clicked on agree checkbox
When clicked on continue button
Then the user is navigated to page with title "Your Account Has Been Created!"
And the text "Your Account Has Been Created!" is displayed

