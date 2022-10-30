
Scenario Outline: incorrect e-mail
Given	page for registration
When	user chooses field  'Sign in'
And	user enter incorrect email address
And	user enter password
And	user press "Sign in securely"
Then the message appears "please ensure you have entered the correct email address"


Examples:
| email_address   | password |
| incorrect_email@mail | 123456789   |

Scenario: Show pass
When	user chooses field  'Sign in'
And	user enter email address
And	user enter password
And	user check "Show password"
Then user sign in
