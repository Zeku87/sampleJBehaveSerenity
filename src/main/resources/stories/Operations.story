Narrative:
As a user
I want to make a mathematics operation
So that I can get the result of two numbers

Scenario: Basic Operation
Given Two numbers number1 <number1> and number2 <number2>
And the operation sign is <sign>
When the operation is performed
Then the result is <result>

Examples:
|sign|number1|number2|result|
|+|5|9|14|
|-|17|9|8|
|*|5|10|50|
|/|16|2|8|

Scenario: Exponential
Given A number number1 <number1>
And the operation sign is <sign>
When the operation is performed
Then the result is <result>
Examples:
|sign|number1|result|
|**|5|25|
|**|11|121|
|**|5|50|
|**|3|8|