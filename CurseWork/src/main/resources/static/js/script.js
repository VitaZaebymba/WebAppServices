function days()
{ 
	today = new Date()
	//Можно установить любую дату
	nextDate = new Date("May 20, 2021")
	//Количество миллисекунд в одном дне
	msPerDay = 24*60*60*1000;
	//Высчитываем количество дней
	daysLeft = Math.round((nextDate.getTime()
	- today.getTime())/msPerDay);
	dayname=""
	ds=""+daysLeft
	//Вырезаем последнею цифру
	dd=parseInt(ds.substr(ds.length-1))
	//Определяем правильность написания
	if(daysLeft>0){
		if(daysLeft>4&&daysLeft<21)dayname=" дней"
		else
			if(dd==1)dayname=" день"
			else
			if(dd==2||dd==3||dd==4)dayname=" дня"
			else dayname=" дней"
		//Выводим надпись в документ
		document.write("До сдачи курсовой <br>"
		+daysLeft+dayname+"!!!");
	}
	else
		document.write("Здесь Вы найдете профессионала!");
}