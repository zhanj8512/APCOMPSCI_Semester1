public class Magpie2
{

public String getGreeting()
{
return "Hello, let's talk.";
}


public String getResponse(String statement)
{
String response = "";


if (statement.trim().length() == 0)
{
response = "Say something, please.";
}


else if (findKeyword(statement, "no") >= 0)
{
response = "Why so negative?";
}

else if (statement.indexOf("mother") >= 0
|| statement.indexOf("father") >= 0
|| statement.indexOf("sister") >= 0
|| statement.indexOf("brother") >= 0)
{
response = "Tell me more about your family.";
}


else if (findKeyword(statement, "cat") >= 0
|| findKeyword(statement, "dog") >= 0
|| findKeyword(statement, "fish") >= 0
|| findKeyword(statement, "turtle") >= 0)
{
response = "Tell me more about your pet.";
}

else if (findKeyword(statement, "Robinette") >= 0)
{
response = "He sounds like a pretty dank teacher.";
}
else if (findKeyword(statement, "I want to",0) >= 0)
{
response = transformIWantToStatement(statement);
}

else
{
int psn = findKeyword(statement, "you", 0);
if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
{
response = transformYouMeStatement(statement);
}
else if (findKeyword(statement, "i") >= 0 && findKeyword(statement, "you", psn) >= 0)
{
response = transformIYouStatement(statement);
}
else
{
response = getRandomResponse();
}
}
return response;
}

private String transformIWantToStatement(String statement)
{
String phrase = statement.trim();
String lastChar = phrase.substring(phrase.length()-1);
if(lastChar.equals("."))
{
phrase = phrase.substring(0, phrase.length()-1);
}
int psn = findKeyword(phrase, "I want to");
String restOfStatement = phrase.substring(psn+9);
return "What would it mean to" + restOfStatement;
}

private String transformYouMeStatement(String statement)
{
String phrase = statement.trim();;
String lastChar = phrase.substring(phrase.length()-1);

if (lastChar.equals("."))
{
phrase = phrase.substring(0, phrase.length()-1);
}

int psnOfYou = findKeyword(phrase, "you");
int psnOfMe = findKeyword(phrase, "me");
String restOfStatement = phrase.substring(psnOfYou + 3, psnOfMe);
return "What makes you think that I" + restOfStatement + "you?";

}
private String transformIYouStatement(String statement)
{
String phrase = statement.trim().toLowerCase();
String lastChar = phrase.substring(phrase.length()-1);

if (lastChar.equals("."))
{
phrase = phrase.substring(0, phrase.length()-1);
}

int psnOfI = findKeyword(phrase, "i");
int psnOfYou = findKeyword(phrase, "you");
String restOfStatement = phrase.substring(psnOfI + 1, psnOfYou);
return "Why do you" + restOfStatement + "me";
}

/** Ex_02: The findKeyword() Method...
* ========================================================= */
private int findKeyword(String statement, String goal, int startPos)
{


String phrase = statement.trim().toLowerCase();
int psn = phrase.indexOf(goal, startPos);
while (psn >= 0)
{
String before = " ";
String after = " ";

if (psn > 0)
{
before = phrase.substring(psn-1, psn);
}

if (goal.length() + psn < phrase.length())
{
after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
}

if (((before.compareTo("a") < 0 ) || (before.compareTo("z") > 0)) && ((after.compareTo ("a") < 0) || (after.compareTo("z") > 0)))
{
return psn;
}

psn = phrase.indexOf(goal, psn +1);

}

return -1;

}

/** Override - this method is used if there are only 2 parameters...*/
private int findKeyword(String statement, String goal)
{

return findKeyword(statement, goal, 0);
}


private String getRandomResponse()
{
final int NUMBER_OF_RESPONSES = 4;
double r = Math.random();
int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
String response = "";

if (whichResponse == 0)
response = "Interesting, tell me more.";
else if (whichResponse == 1)
response = "Hmmm.";
else if (whichResponse == 2)
response = "Do you really think so?";
else if (whichResponse == 3)
response = "You don't say.";

return response;
}
}