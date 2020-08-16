function Select_SecondaryLinkage(){
    var select = document.getElementById("select");
    	select.onchange=function(){
    		var selvalue = select.value;
    		var val = document.getElementById("val");
    		switch(selvalue){
                case "a" : val.innerHTML="<option>请选择</option>";break;
    			case "weiguo" : val.innerHTML="<option>荀彧</option><option>曹操</option>";break;
    			case "shuguo" : val.innerHTML="<option>刘备</option><option>孔明</option>";break;
    			case "wuguo" : val.innerHTML="<option>孙权</option><option>周瑜</option>";break;
    			default : alert("erro");
    		}
    	};
}