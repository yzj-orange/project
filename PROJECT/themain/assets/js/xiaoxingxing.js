rat('star1','result1',10);
rat('star2','result2',1);
rat('star3','result3',1)
rat('star4','result4',1)
rat('star5','result5',1)
rat('star6','result6',1)
rat('star7','result7',1)
rat('star8','result8',1)
rat('star9','result9',1)
rat('star10','result10',1)
rat('star11','result11',1)
rat('star12','result12',1)
rat('star13','result13',1)
rat('star14','result14',1)
rat('star15','result15',1)
rat('star16','result16',1)


function rat(star,result,m){

	star= '#' + star;
	result= '#' + result;
	$(result).hide();//将结果DIV隐藏

	$(star).raty({
		hints: ['10','20', '30', '40', '50','60', '70', '80', '90', '100'],
		path: "css/img",
		starOff: 'star-off-big.png',
		starOn: 'star-on-big.png',
		size: 24,
		start: 40,
		showHalf: true,
		target: result,
		targetKeep : true,//targetKeep 属性设置为true，用户的选择值才会被保持在目标DIV中，否则只是鼠标悬停时有值，而鼠标离开后这个值就会消失
		click: function (score, evt) {

			//第一种方式：直接取值
			/*alert('你的评分是'+score*m+'分');*/
		}
	});                 

	//第二种方式可以设置一个隐蔽的HTML元素来保存用户的选择值，然后可以在脚本里面通过jQuery选中这个元素来处理该值。 弹出结果
	/*var text = $(result).text();
	$('img').click(function () {
		if ($(result).text() != text) {
			alert('你的评分是'+$(result).text()/m+'分');
			alert(result);
			return;
		}
	});*/
} 