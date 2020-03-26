/**
 * 
 */
var a = Math.floor(Math.random()*(100-1))+1
window.alert("You have a chance to win an exciting gift !!!")
//prompt("Enter any number between 1 to 100 : ")
//document.write(a)
var count=0;
for(var i=0;i<5;i++)
	{
	count++;
	if(a==prompt("Enter any number between 1 to 100 : "))
		document.writeln("You win !!! Lucky customer !!! <br>")
	else if(5-count==0)
		document.writeln("Game over !!!<br>");
	else
		document.writeln("You lose !!! You have "+(5-count)+" chances left !!! Try again.<br>")
	 }
//if(a==prompt("Enter any number between 1 to 100 : "))
//document.write("You win !!! Lucky customer !!!")
//else
//document.write("You lose !!! Better luck next time !!!")	