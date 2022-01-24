<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
		google.charts.load('current', {'packages' : [ 'bar' ] });
		google.charts.setOnLoadCallback(drawChart);

		function drawChart() {
			var data = google.visualization.arrayToDataTable([
					[ 'Project Team', 'Send', 'Resoponse' ],
					[ 'Team A', 0.5, 0.5 ], [ 'Dialogue 2', 0.7, 0.3 ],
					[ 'Dialogue 3', 0.4, 0.8 ], [ 'Dialogue 4', 0.2, 1 ] ]);

			var options = {
				chart : {
					title : 'Analysis of Dialogue System',
					subtitle : '',
				}
			};

			var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

			chart.draw(data, google.charts.Bar.convertOptions(options));
		}
	</script>
</head>
<body>
	<div id="columnchart_material" style="width: 800px; height: 500px;"></div>
</body>
</html>