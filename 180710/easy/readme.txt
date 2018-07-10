"I before E except after C" is perhaps the most famous English spelling rule. For the purpose of this challenge, the rule says:

if "ei" appears in a word, it must immediately follow "c".
If "ie" appears in a word, it must not immediately follow "c".
A word also follows the rule if neither "ei" nor "ie" appears anywhere in the word. Examples of words that follow this rule are:

fiery hierarchy hieroglyphic
ceiling inconceivable receipt
daily programmer one two three
There are many exceptions that don't follow this rule, such as:

sleigh stein fahrenheit
deifies either nuclei reimburse
ancient juicier societies
Challenge
Write a function that tells you whether or not a given word follows the "I before E except after C" rule.

check("a") => true
check("zombie") => true
check("transceiver") => true
check("veil") => false
check("icier") => false
Optional Bonus 1
How many words in the input.txt list are exceptions to the rule? (The answer is 4 digits long and the digits add up to 18.)
