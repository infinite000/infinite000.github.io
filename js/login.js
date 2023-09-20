window.onload = function(){
	var timeNode = document.getElementsByClassName("time")[0];

	function time(){
		
		var date = new Date;
		var year = date.getFullYear();
		var month = date.getMonth()+1;
		var week = date.getDay();
		var wek = parseInt(week);
		switch(wek){
			 case 0:
			  wk = "星期日";
			 break;
			 case 1:
			  wk= "星期一";
			 break;
			 case 2:
			  wk ="星期二";
			 break;
			 case 3:
			  wk ="星期三";
			 break;
			 case 4:
			  wk ="星期四";
			 break;
			 case 5:
			  wk ="星期五";
			 break;
			 case 6:
			  wk ="星期六";
			 break;
			 
		}
		
		var time = date.toLocaleTimeString();
		var day = date.getDate();
		
		timeNode.innerHTML =  year+"年"+month+"月"+day+"日"+"&nbsp;"+time +"&nbsp;"+wk;
	}
	
	setInterval(function(){
		time()
	},1000);
}