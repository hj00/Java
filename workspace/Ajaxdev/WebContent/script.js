var Classmate=[
	{
		"no":"1",
		"name":"박병규",
		"say":"화이팅~!!"
	},
	{
		"no":"2",
		"name":"Yamashita Tomoko",
		"say":"Yes It's me"
	},
	{
		"no":"3",
		"name":"박종봉",
		"say":"훗~!"
	},
	{
		"no":"4",
		"name":"주희",
		"say":"주희언니"		
	}
];

var items = [];
$.each(Classmate, function(key, val){
	items.push(
			'<li id="' + key + '">' +
			val['no'] + ":" + 
			val['name'] + ":" + 
			val['say'] + "</li>");
});
$('#rcvMSG').append(items);