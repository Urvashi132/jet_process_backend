<div class="col-xl-8">
	<div class="card overflow-hidden">
		<div class="card-header border-0 pb-0 flex-wrap">
			<h4 class="heading mb-0">Projects Overview</h4>
			<ul class="nav nav-pills mix-chart-tab" id="pills-tab" role="tablist">
				<li class="nav-item" role="presentation">
					<button class="nav-link active" data-series="week"
						id="pills-week-tab" data-bs-toggle="pill"
						data-bs-target="#pills-week" type="button" role="tab"
						aria-selected="true">Week</button>
				</li>
				<li class="nav-item" role="presentation">
					<button class="nav-link" data-series="month" id="pills-month-tab"
						data-bs-toggle="pill" data-bs-target="#pills-month" type="button"
						role="tab" aria-selected="false" tabindex="-1">Month</button>
				</li>
				<li class="nav-item" role="presentation">
					<button class="nav-link" data-series="year" id="pills-year-tab"
						data-bs-toggle="pill" data-bs-target="#pills-year" type="button"
						role="tab" aria-selected="false" tabindex="-1">Year</button>
				</li>
				<li class="nav-item" role="presentation">
					<button class="nav-link" data-series="all" id="pills-all-tab"
						data-bs-toggle="pill" data-bs-target="#pills-all" type="button"
						role="tab" aria-selected="false" tabindex="-1">All</button>
				</li>
			</ul>
		</div>
		<div class="card-body  p-0" style="position: relative;">
			<div id="overiewChart" style="min-height: 315px;">
				<div id="apexcharts23dnohtkg"
					class="apexcharts-canvas apexcharts23dnohtkg apexcharts-theme-light"
					style="width: 669px; height: 300px;">
					<svg id="SvgjsSvg1561" width="669" height="300"
						xmlns="http://www.w3.org/2000/svg" version="1.1"
						xmlns:xlink="http://www.w3.org/1999/xlink"
						xmlns:svgjs="http://svgjs.com/svgjs"
						class="apexcharts-svg apexcharts-zoomable hovering-zoom"
						xmlns:data="ApexChartsNS" transform="translate(0, 0)"
						style="background: transparent;">
						<foreignObject x="0" y="0" width="669" height="300">
						<div
							class="apexcharts-legend apexcharts-align-center position-bottom"
							xmlns="http://www.w3.org/1999/xhtml"
							style="inset: auto 0px 1px; position: absolute; max-height: 150px;">
							<div class="apexcharts-legend-series" rel="1"
								seriesname="NumberxofxProjects" data:collapsed="false"
								style="margin: 2px 5px;">
								<span class="apexcharts-legend-marker" rel="1"
									data:collapsed="false"
									style="background: var(- -primary) !important; color: var(- -primary); height: 12px; width: 12px; left: 0px; top: 0px; border-width: 0px; border-color: rgb(255, 255, 255); border-radius: 12px;"></span><span
									class="apexcharts-legend-text" rel="1" i="0"
									data:default-text="Number%20of%20Projects"
									data:collapsed="false"
									style="color: rgb(136, 136, 136); font-size: 13px; font-weight: 400; font-family: poppins;">Number of Projects</span>
							</div>
							<div class="apexcharts-legend-series" rel="2"
								seriesname="Revenue" data:collapsed="false"
								style="margin: 2px 5px;">
								<span class="apexcharts-legend-marker" rel="2"
									data:collapsed="false"
									style="background: rgb(58, 201, 119) !important; color: rgb(58, 201, 119); height: 12px; width: 12px; left: 0px; top: 0px; border-width: 0px; border-color: rgb(255, 255, 255); border-radius: 12px;"></span><span
									class="apexcharts-legend-text" rel="2" i="1"
									data:default-text="Revenue" data:collapsed="false"
									style="color: rgb(136, 136, 136); font-size: 13px; font-weight: 400; font-family: poppins;">Revenue</span>
							</div>
							<div class="apexcharts-legend-series" rel="3"
								seriesname="ActivexProjects" data:collapsed="false"
								style="margin: 2px 5px;">
								<span class="apexcharts-legend-marker" rel="3"
									data:collapsed="false"
									style="background: rgb(255, 94, 94) !important; color: rgb(255, 94, 94); height: 12px; width: 12px; left: 0px; top: 0px; border-width: 0px; border-color: rgb(255, 255, 255); border-radius: 12px;"></span><span
									class="apexcharts-legend-text" rel="3" i="2"
									data:default-text="Active%20Projects" data:collapsed="false"
									style="color: rgb(136, 136, 136); font-size: 13px; font-weight: 400; font-family: poppins;">Active Projects</span>
							</div>
						</div>
						<style type="text/css">
.apexcharts-legend {
	display: flex;
	overflow: auto;
	padding: 0 10px;
}

.apexcharts-legend.position-bottom, .apexcharts-legend.position-top {
	flex-wrap: wrap
}

.apexcharts-legend.position-right, .apexcharts-legend.position-left {
	flex-direction: column;
	bottom: 0;
}

.apexcharts-legend.position-bottom.apexcharts-align-left,
	.apexcharts-legend.position-top.apexcharts-align-left,
	.apexcharts-legend.position-right, .apexcharts-legend.position-left {
	justify-content: flex-start;
}

.apexcharts-legend.position-bottom.apexcharts-align-center,
	.apexcharts-legend.position-top.apexcharts-align-center {
	justify-content: center;
}

.apexcharts-legend.position-bottom.apexcharts-align-right,
	.apexcharts-legend.position-top.apexcharts-align-right {
	justify-content: flex-end;
}

.apexcharts-legend-series {
	cursor: pointer;
	line-height: normal;
}

.apexcharts-legend.position-bottom .apexcharts-legend-series,
	.apexcharts-legend.position-top .apexcharts-legend-series {
	display: flex;
	align-items: center;
}

.apexcharts-legend-text {
	position: relative;
	font-size: 14px;
}

.apexcharts-legend-text *, .apexcharts-legend-marker * {
	pointer-events: none;
}

.apexcharts-legend-marker {
	position: relative;
	display: inline-block;
	cursor: pointer;
	margin-right: 3px;
	border-style: solid;
}

.apexcharts-legend.apexcharts-align-right .apexcharts-legend-series,
	.apexcharts-legend.apexcharts-align-left .apexcharts-legend-series {
	display: inline-block;
}

.apexcharts-legend-series.apexcharts-no-click {
	cursor: auto;
}

.apexcharts-legend .apexcharts-hidden-zero-series, .apexcharts-legend .apexcharts-hidden-null-series
	{
	display: none !important;
}

.apexcharts-inactive-legend {
	opacity: 0.45;
}
</style></foreignObject>
						<g id="SvgjsG1563" class="apexcharts-inner apexcharts-graphical"
							transform="translate(64.30854170018976, 30)">
						<defs id="SvgjsDefs1562">
						<clipPath id="gridRectMask23dnohtkg">
						<rect id="SvgjsRect1569" width="601.2004624904285"
							height="209.269332818985" x="-14.5" y="-0.5" rx="0" ry="0"
							opacity="1" stroke-width="0" stroke="none" stroke-dasharray="0"
							fill="#fff"></rect></clipPath>
						<clipPath id="gridRectMarkerMask23dnohtkg">
						<rect id="SvgjsRect1570" width="578.2004624904285"
							height="212.269332818985" x="-2" y="-2" rx="0" ry="0" opacity="1"
							stroke-width="0" stroke="none" stroke-dasharray="0" fill="#fff"></rect></clipPath>
						<linearGradient id="SvgjsLinearGradient1575" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1576" stop-opacity="1" stop-color="#3ac977"
							offset="0"></stop>
						<stop id="SvgjsStop1577" stop-opacity="0.15" stop-color="#3ac977"
							offset="0.004"></stop>
						<stop id="SvgjsStop1578" stop-opacity="0" stop-color="#3ac977"
							offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1584" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1585" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1586" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1588" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1589" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1590" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1592" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1593" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1594" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1596" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1597" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1598" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1600" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1601" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1602" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1604" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1605" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1606" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1608" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1609" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1610" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1612" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1613" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1614" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1616" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1617" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1618" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1620" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1621" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1622" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1624" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1625" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1626" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1628" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1629" stop-opacity="1"
							stop-color="var(--primary)" offset="0"></stop>
						<stop id="SvgjsStop1630" stop-opacity="1"
							stop-color="var(--primary)" offset="1"></stop></linearGradient>
						<linearGradient id="SvgjsLinearGradient1636" x1="0" y1="0" x2="0"
							y2="1">
						<stop id="SvgjsStop1637" stop-opacity="1" stop-color="#ff5e5e"
							offset="0"></stop>
						<stop id="SvgjsStop1638" stop-opacity="1" stop-color="#ff5e5e"
							offset="1"></stop></linearGradient></defs>
						<line id="SvgjsLine1568" x1="103.90008408916883" y1="0"
							x2="103.90008408916883" y2="208.269332818985" stroke="#b6b6b6"
							stroke-dasharray="3" class="apexcharts-xcrosshairs"
							x="103.90008408916883" y="0" width="1" height="208.269332818985"
							fill="#b1b9c4" filter="none" fill-opacity="0.9" stroke-width="1"></line>
						<g id="SvgjsG1640" class="apexcharts-xaxis"
							transform="translate(0, 0)">
						<g id="SvgjsG1641" class="apexcharts-xaxis-texts-g"
							transform="translate(0, -4)">
						<text id="SvgjsText1643"
							font-family="Helvetica, Arial, sans-serif" x="0"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1644">Jan</tspan>
						<title>Jan</title></text>
						<text id="SvgjsText1646"
							font-family="Helvetica, Arial, sans-serif" x="52.20004204458441"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1647">Feb</tspan>
						<title>Feb</title></text>
						<text id="SvgjsText1649"
							font-family="Helvetica, Arial, sans-serif" x="104.40008408916883"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1650">Mar</tspan>
						<title>Mar</title></text>
						<text id="SvgjsText1652"
							font-family="Helvetica, Arial, sans-serif" x="156.60012613375326"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1653">Apr</tspan>
						<title>Apr</title></text>
						<text id="SvgjsText1655"
							font-family="Helvetica, Arial, sans-serif" x="208.80016817833769"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1656">May</tspan>
						<title>May</title></text>
						<text id="SvgjsText1658"
							font-family="Helvetica, Arial, sans-serif" x="261.0002102229221"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1659">Jun</tspan>
						<title>Jun</title></text>
						<text id="SvgjsText1661"
							font-family="Helvetica, Arial, sans-serif" x="313.20025226750647"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1662">Jul</tspan>
						<title>Jul</title></text>
						<text id="SvgjsText1664"
							font-family="Helvetica, Arial, sans-serif" x="365.40029431209086"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1665">Aug</tspan>
						<title>Aug</title></text>
						<text id="SvgjsText1667"
							font-family="Helvetica, Arial, sans-serif" x="417.60033635667526"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1668">Sep</tspan>
						<title>Sep</title></text>
						<text id="SvgjsText1670"
							font-family="Helvetica, Arial, sans-serif" x="469.80037840125965"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1671">Oct</tspan>
						<title>Oct</title></text>
						<text id="SvgjsText1673"
							font-family="Helvetica, Arial, sans-serif" x="522.000420445844"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1674">Nov</tspan>
						<title>Nov</title></text>
						<text id="SvgjsText1676"
							font-family="Helvetica, Arial, sans-serif" x="574.2004624904284"
							y="237.269332818985" text-anchor="middle"
							dominant-baseline="auto" font-size="13px" font-weight="400"
							fill="#888888" class="apexcharts-text apexcharts-xaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1677">Dec</tspan>
						<title>Dec</title></text></g>
						<line id="SvgjsLine1678" x1="-11.515246793573553"
							y1="209.269332818985" x2="585.7157092840021"
							y2="209.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							stroke-width="1"></line></g>
						<g id="SvgjsG1691" class="apexcharts-grid">
						<g id="SvgjsG1692" class="apexcharts-gridlines-horizontal">
						<line id="SvgjsLine1706" x1="-11.515246793573553" y1="0"
							x2="585.7157092840021" y2="0" stroke="#e0e0e0"
							stroke-dasharray="0" class="apexcharts-gridline"></line>
						<line id="SvgjsLine1707" x1="-11.515246793573553"
							y1="52.06733320474625" x2="585.7157092840021"
							y2="52.06733320474625" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-gridline"></line>
						<line id="SvgjsLine1708" x1="-11.515246793573553"
							y1="104.1346664094925" x2="585.7157092840021"
							y2="104.1346664094925" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-gridline"></line>
						<line id="SvgjsLine1709" x1="-11.515246793573553"
							y1="156.20199961423873" x2="585.7157092840021"
							y2="156.20199961423873" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-gridline"></line>
						<line id="SvgjsLine1710" x1="-11.515246793573553"
							y1="208.269332818985" x2="585.7157092840021"
							y2="208.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-gridline"></line></g>
						<g id="SvgjsG1693" class="apexcharts-gridlines-vertical"></g>
						<line id="SvgjsLine1694" x1="0" y1="209.269332818985" x2="0"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1695" x1="52.200042044584414"
							y1="209.269332818985" x2="52.200042044584414"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1696" x1="104.40008408916883"
							y1="209.269332818985" x2="104.40008408916883"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1697" x1="156.60012613375324"
							y1="209.269332818985" x2="156.60012613375324"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1698" x1="208.80016817833766"
							y1="209.269332818985" x2="208.80016817833766"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1699" x1="261.0002102229221"
							y1="209.269332818985" x2="261.0002102229221"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1700" x1="313.20025226750647"
							y1="209.269332818985" x2="313.20025226750647"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1701" x1="365.40029431209086"
							y1="209.269332818985" x2="365.40029431209086"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1702" x1="417.60033635667526"
							y1="209.269332818985" x2="417.60033635667526"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1703" x1="469.80037840125965"
							y1="209.269332818985" x2="469.80037840125965"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1704" x1="522.000420445844"
							y1="209.269332818985" x2="522.000420445844" y2="215.269332818985"
							stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1705" x1="574.2004624904284"
							y1="209.269332818985" x2="574.2004624904284"
							y2="215.269332818985" stroke="#e0e0e0" stroke-dasharray="0"
							class="apexcharts-xaxis-tick"></line>
						<line id="SvgjsLine1712" x1="0" y1="208.269332818985"
							x2="574.2004624904285" y2="208.269332818985" stroke="transparent"
							stroke-dasharray="0"></line>
						<line id="SvgjsLine1711" x1="0" y1="1" x2="0"
							y2="208.269332818985" stroke="transparent" stroke-dasharray="0"></line></g>
						<g id="SvgjsG1571"
							class="apexcharts-area-series apexcharts-plot-series">
						<g id="SvgjsG1572" class="apexcharts-series" seriesName="Revenue"
							data:longestSeries="true" rel="1" data:realIndex="1">
						<path id="SvgjsPath1579"
							d="M 0 208.269332818985L 0 116.6308263786316L 52.200042044584414 72.89426648664474L 104.40008408916883 93.72119976854324L 156.60012613375324 52.067333204746234L 208.80016817833766 114.54813305044173L 261.0002102229221 93.72119976854324L 313.20025226750647 124.96159969139099L 365.4002943120909 83.30773312759399L 417.6003363566753 52.067333204746234L 469.8003784012597 114.54813305044173L 522.0004204458442 104.1346664094925L 574.2004624904285 120.79621303501129L 574.2004624904285 208.269332818985M 574.2004624904285 120.79621303501129z"
							fill="url(#SvgjsLinearGradient1575)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-area" index="1"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 0 208.269332818985L 0 116.6308263786316L 52.200042044584414 72.89426648664474L 104.40008408916883 93.72119976854324L 156.60012613375324 52.067333204746234L 208.80016817833766 114.54813305044173L 261.0002102229221 93.72119976854324L 313.20025226750647 124.96159969139099L 365.4002943120909 83.30773312759399L 417.6003363566753 52.067333204746234L 469.8003784012597 114.54813305044173L 522.0004204458442 104.1346664094925L 574.2004624904285 120.79621303501129L 574.2004624904285 208.269332818985M 574.2004624904285 120.79621303501129z"
							pathFrom="M -1 208.269332818985L -1 208.269332818985L 52.200042044584414 208.269332818985L 104.40008408916883 208.269332818985L 156.60012613375324 208.269332818985L 208.80016817833766 208.269332818985L 261.0002102229221 208.269332818985L 313.20025226750647 208.269332818985L 365.4002943120909 208.269332818985L 417.6003363566753 208.269332818985L 469.8003784012597 208.269332818985L 522.0004204458442 208.269332818985L 574.2004624904285 208.269332818985"></path>
						<path id="SvgjsPath1580"
							d="M 0 116.6308263786316L 52.200042044584414 72.89426648664474L 104.40008408916883 93.72119976854324L 156.60012613375324 52.067333204746234L 208.80016817833766 114.54813305044173L 261.0002102229221 93.72119976854324L 313.20025226750647 124.96159969139099L 365.4002943120909 83.30773312759399L 417.6003363566753 52.067333204746234L 469.8003784012597 114.54813305044173L 522.0004204458442 104.1346664094925L 574.2004624904285 120.79621303501129"
							fill="none" fill-opacity="1" stroke="#3ac977" stroke-opacity="1"
							stroke-linecap="butt" stroke-width="1" stroke-dasharray="0"
							class="apexcharts-area" index="1"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 0 116.6308263786316L 52.200042044584414 72.89426648664474L 104.40008408916883 93.72119976854324L 156.60012613375324 52.067333204746234L 208.80016817833766 114.54813305044173L 261.0002102229221 93.72119976854324L 313.20025226750647 124.96159969139099L 365.4002943120909 83.30773312759399L 417.6003363566753 52.067333204746234L 469.8003784012597 114.54813305044173L 522.0004204458442 104.1346664094925L 574.2004624904285 120.79621303501129"
							pathFrom="M -1 208.269332818985L -1 208.269332818985L 52.200042044584414 208.269332818985L 104.40008408916883 208.269332818985L 156.60012613375324 208.269332818985L 208.80016817833766 208.269332818985L 261.0002102229221 208.269332818985L 313.20025226750647 208.269332818985L 365.4002943120909 208.269332818985L 417.6003363566753 208.269332818985L 469.8003784012597 208.269332818985L 522.0004204458442 208.269332818985L 574.2004624904285 208.269332818985"></path>
						<g id="SvgjsG1573" class="apexcharts-series-markers-wrap"
							data:realIndex="1">
						<g class="apexcharts-series-markers">
						<circle id="SvgjsCircle1718" r="0" cx="104.40008408916883"
							cy="93.72119976854324" class="apexcharts-marker wvn8pwy8e"
							stroke="#ffffff" fill="var(--primary)" fill-opacity="1"
							stroke-width="2" stroke-opacity="0.9" default-marker-size="0"></circle></g></g></g></g>
						<g id="SvgjsG1581"
							class="apexcharts-bar-series apexcharts-plot-series">
						<g id="SvgjsG1582" class="apexcharts-series" rel="1"
							seriesName="NumberxofxProjects" data:realIndex="0">
						<path id="SvgjsPath1587"
							d="M -4.698003784012597 208.269332818985L -4.698003784012597 58.067333204746234Q -4.698003784012597 52.067333204746234 1.301996215987403 52.067333204746234L -1.301996215987403 52.067333204746234Q 4.698003784012597 52.067333204746234 4.698003784012597 58.067333204746234L 4.698003784012597 58.067333204746234L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985z"
							fill="url(#SvgjsLinearGradient1584)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M -4.698003784012597 208.269332818985L -4.698003784012597 58.067333204746234Q -4.698003784012597 52.067333204746234 1.301996215987403 52.067333204746234L -1.301996215987403 52.067333204746234Q 4.698003784012597 52.067333204746234 4.698003784012597 58.067333204746234L 4.698003784012597 58.067333204746234L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985z"
							pathFrom="M -4.698003784012597 208.269332818985L -4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985L 4.698003784012597 208.269332818985L -4.698003784012597 208.269332818985"
							cy="52.067333204746234" cx="4.698003784012597" j="0" val="75"
							barHeight="156.20199961423876" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1591"
							d="M 47.502038260571815 208.269332818985L 47.502038260571815 37.24039992284773Q 47.502038260571815 31.24039992284773 53.502038260571815 31.24039992284773L 50.898045828597006 31.24039992284773Q 56.898045828597006 31.24039992284773 56.898045828597006 37.24039992284773L 56.898045828597006 37.24039992284773L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985z"
							fill="url(#SvgjsLinearGradient1588)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 47.502038260571815 208.269332818985L 47.502038260571815 37.24039992284773Q 47.502038260571815 31.24039992284773 53.502038260571815 31.24039992284773L 50.898045828597006 31.24039992284773Q 56.898045828597006 31.24039992284773 56.898045828597006 37.24039992284773L 56.898045828597006 37.24039992284773L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985z"
							pathFrom="M 47.502038260571815 208.269332818985L 47.502038260571815 208.269332818985L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985L 56.898045828597006 208.269332818985L 47.502038260571815 208.269332818985"
							cy="31.24039992284773" cx="56.898045828597006" j="1" val="85"
							barHeight="177.02893289613726" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1595"
							d="M 99.70208030515623 208.269332818985L 99.70208030515623 64.31541318931579Q 99.70208030515623 58.31541318931579 105.70208030515623 58.31541318931579L 103.09808787318143 58.31541318931579Q 109.09808787318143 58.31541318931579 109.09808787318143 64.31541318931579L 109.09808787318143 64.31541318931579L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985z"
							fill="url(#SvgjsLinearGradient1592)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 99.70208030515623 208.269332818985L 99.70208030515623 64.31541318931579Q 99.70208030515623 58.31541318931579 105.70208030515623 58.31541318931579L 103.09808787318143 58.31541318931579Q 109.09808787318143 58.31541318931579 109.09808787318143 64.31541318931579L 109.09808787318143 64.31541318931579L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985z"
							pathFrom="M 99.70208030515623 208.269332818985L 99.70208030515623 208.269332818985L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985L 109.09808787318143 208.269332818985L 99.70208030515623 208.269332818985"
							cy="58.31541318931579" cx="109.09808787318143" j="2" val="72"
							barHeight="149.9539196296692" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1599"
							d="M 151.90212234974064 208.269332818985L 151.90212234974064 6Q 151.90212234974064 0 157.90212234974064 0L 155.29812991776583 0Q 161.29812991776583 0 161.29812991776583 6L 161.29812991776583 6L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985z"
							fill="url(#SvgjsLinearGradient1596)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 151.90212234974064 208.269332818985L 151.90212234974064 6Q 151.90212234974064 0 157.90212234974064 0L 155.29812991776583 0Q 161.29812991776583 0 161.29812991776583 6L 161.29812991776583 6L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985z"
							pathFrom="M 151.90212234974064 208.269332818985L 151.90212234974064 208.269332818985L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985L 161.29812991776583 208.269332818985L 151.90212234974064 208.269332818985"
							cy="0" cx="161.29812991776583" j="3" val="100"
							barHeight="208.269332818985" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1603"
							d="M 204.10216439432506 208.269332818985L 204.10216439432506 110.1346664094925Q 204.10216439432506 104.1346664094925 210.10216439432506 104.1346664094925L 207.49817196235026 104.1346664094925Q 213.49817196235026 104.1346664094925 213.49817196235026 110.1346664094925L 213.49817196235026 110.1346664094925L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985z"
							fill="url(#SvgjsLinearGradient1600)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 204.10216439432506 208.269332818985L 204.10216439432506 110.1346664094925Q 204.10216439432506 104.1346664094925 210.10216439432506 104.1346664094925L 207.49817196235026 104.1346664094925Q 213.49817196235026 104.1346664094925 213.49817196235026 110.1346664094925L 213.49817196235026 110.1346664094925L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985z"
							pathFrom="M 204.10216439432506 208.269332818985L 204.10216439432506 208.269332818985L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985L 213.49817196235026 208.269332818985L 204.10216439432506 208.269332818985"
							cy="104.1346664094925" cx="213.49817196235026" j="4" val="50"
							barHeight="104.1346664094925" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1607"
							d="M 256.3022064389095 208.269332818985L 256.3022064389095 6Q 256.3022064389095 0 262.3022064389095 0L 259.6982140069347 0Q 265.6982140069347 0 265.6982140069347 6L 265.6982140069347 6L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985z"
							fill="url(#SvgjsLinearGradient1604)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 256.3022064389095 208.269332818985L 256.3022064389095 6Q 256.3022064389095 0 262.3022064389095 0L 259.6982140069347 0Q 265.6982140069347 0 265.6982140069347 6L 265.6982140069347 6L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985z"
							pathFrom="M 256.3022064389095 208.269332818985L 256.3022064389095 208.269332818985L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985L 265.6982140069347 208.269332818985L 256.3022064389095 208.269332818985"
							cy="0" cx="265.6982140069347" j="5" val="100"
							barHeight="208.269332818985" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1611"
							d="M 308.5022484834939 208.269332818985L 308.5022484834939 47.65386656379698Q 308.5022484834939 41.65386656379698 314.5022484834939 41.65386656379698L 311.89825605151907 41.65386656379698Q 317.89825605151907 41.65386656379698 317.89825605151907 47.65386656379698L 317.89825605151907 47.65386656379698L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985z"
							fill="url(#SvgjsLinearGradient1608)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 308.5022484834939 208.269332818985L 308.5022484834939 47.65386656379698Q 308.5022484834939 41.65386656379698 314.5022484834939 41.65386656379698L 311.89825605151907 41.65386656379698Q 317.89825605151907 41.65386656379698 317.89825605151907 47.65386656379698L 317.89825605151907 47.65386656379698L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985z"
							pathFrom="M 308.5022484834939 208.269332818985L 308.5022484834939 208.269332818985L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985L 317.89825605151907 208.269332818985L 308.5022484834939 208.269332818985"
							cy="41.65386656379698" cx="317.89825605151907" j="6" val="80"
							barHeight="166.615466255188" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1615"
							d="M 360.7022905280783 208.269332818985L 360.7022905280783 58.067333204746234Q 360.7022905280783 52.067333204746234 366.7022905280783 52.067333204746234L 364.0982980961035 52.067333204746234Q 370.0982980961035 52.067333204746234 370.0982980961035 58.067333204746234L 370.0982980961035 58.067333204746234L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985z"
							fill="url(#SvgjsLinearGradient1612)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 360.7022905280783 208.269332818985L 360.7022905280783 58.067333204746234Q 360.7022905280783 52.067333204746234 366.7022905280783 52.067333204746234L 364.0982980961035 52.067333204746234Q 370.0982980961035 52.067333204746234 370.0982980961035 58.067333204746234L 370.0982980961035 58.067333204746234L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985z"
							pathFrom="M 360.7022905280783 208.269332818985L 360.7022905280783 208.269332818985L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985L 370.0982980961035 208.269332818985L 360.7022905280783 208.269332818985"
							cy="52.067333204746234" cx="370.0982980961035" j="7" val="75"
							barHeight="156.20199961423876" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1619"
							d="M 412.9023325726627 208.269332818985L 412.9023325726627 16.413466640949252Q 412.9023325726627 10.413466640949252 418.9023325726627 10.413466640949252L 416.2983401406879 10.413466640949252Q 422.2983401406879 10.413466640949252 422.2983401406879 16.413466640949252L 422.2983401406879 16.413466640949252L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985z"
							fill="url(#SvgjsLinearGradient1616)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 412.9023325726627 208.269332818985L 412.9023325726627 16.413466640949252Q 412.9023325726627 10.413466640949252 418.9023325726627 10.413466640949252L 416.2983401406879 10.413466640949252Q 422.2983401406879 10.413466640949252 422.2983401406879 16.413466640949252L 422.2983401406879 16.413466640949252L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985z"
							pathFrom="M 412.9023325726627 208.269332818985L 412.9023325726627 208.269332818985L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985L 422.2983401406879 208.269332818985L 412.9023325726627 208.269332818985"
							cy="10.413466640949252" cx="422.2983401406879" j="8" val="95"
							barHeight="197.85586617803574" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1623"
							d="M 465.1023746172471 208.269332818985L 465.1023746172471 141.37506633234023Q 465.1023746172471 135.37506633234023 471.1023746172471 135.37506633234023L 468.4983821852723 135.37506633234023Q 474.4983821852723 135.37506633234023 474.4983821852723 141.37506633234023L 474.4983821852723 141.37506633234023L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985z"
							fill="url(#SvgjsLinearGradient1620)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 465.1023746172471 208.269332818985L 465.1023746172471 141.37506633234023Q 465.1023746172471 135.37506633234023 471.1023746172471 135.37506633234023L 468.4983821852723 135.37506633234023Q 474.4983821852723 135.37506633234023 474.4983821852723 141.37506633234023L 474.4983821852723 141.37506633234023L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985z"
							pathFrom="M 465.1023746172471 208.269332818985L 465.1023746172471 208.269332818985L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985L 474.4983821852723 208.269332818985L 465.1023746172471 208.269332818985"
							cy="135.37506633234023" cx="474.4983821852723" j="9" val="35"
							barHeight="72.89426648664475" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1627"
							d="M 517.3024166618316 208.269332818985L 517.3024166618316 58.067333204746234Q 517.3024166618316 52.067333204746234 523.3024166618316 52.067333204746234L 520.6984242298568 52.067333204746234Q 526.6984242298568 52.067333204746234 526.6984242298568 58.067333204746234L 526.6984242298568 58.067333204746234L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985z"
							fill="url(#SvgjsLinearGradient1624)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 517.3024166618316 208.269332818985L 517.3024166618316 58.067333204746234Q 517.3024166618316 52.067333204746234 523.3024166618316 52.067333204746234L 520.6984242298568 52.067333204746234Q 526.6984242298568 52.067333204746234 526.6984242298568 58.067333204746234L 526.6984242298568 58.067333204746234L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985z"
							pathFrom="M 517.3024166618316 208.269332818985L 517.3024166618316 208.269332818985L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985L 526.6984242298568 208.269332818985L 517.3024166618316 208.269332818985"
							cy="52.067333204746234" cx="526.6984242298568" j="10" val="75"
							barHeight="156.20199961423876" barWidth="9.396007568025194"></path>
						<path id="SvgjsPath1631"
							d="M 569.502458706416 208.269332818985L 569.502458706416 6Q 569.502458706416 0 575.502458706416 0L 572.8984662744411 0Q 578.8984662744411 0 578.8984662744411 6L 578.8984662744411 6L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985z"
							fill="url(#SvgjsLinearGradient1628)" fill-opacity="1"
							stroke-opacity="1" stroke-linecap="butt" stroke-width="0"
							stroke-dasharray="0" class="apexcharts-bar-area" index="0"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 569.502458706416 208.269332818985L 569.502458706416 6Q 569.502458706416 0 575.502458706416 0L 572.8984662744411 0Q 578.8984662744411 0 578.8984662744411 6L 578.8984662744411 6L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985z"
							pathFrom="M 569.502458706416 208.269332818985L 569.502458706416 208.269332818985L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985L 578.8984662744411 208.269332818985L 569.502458706416 208.269332818985"
							cy="0" cx="578.8984662744411" j="11" val="100"
							barHeight="208.269332818985" barWidth="9.396007568025194"></path></g></g>
						<g id="SvgjsG1632"
							class="apexcharts-line-series apexcharts-plot-series">
						<g id="SvgjsG1633" class="apexcharts-series"
							seriesName="ActivexProjects" data:longestSeries="true" rel="1"
							data:realIndex="2">
						<path id="SvgjsPath1639"
							d="M 0 145.78853297328948L 52.200042044584414 156.20199961423873L 104.40008408916883 114.54813305044173L 156.60012613375324 145.78853297328948L 208.80016817833766 156.20199961423873L 261.0002102229221 135.37506633234023L 313.20025226750647 166.61546625518798L 365.4002943120909 114.54813305044173L 417.6003363566753 135.37506633234023L 469.8003784012597 166.61546625518798L 522.0004204458442 135.37506633234023L 574.2004624904285 166.61546625518798"
							fill="none" fill-opacity="1"
							stroke="url(#SvgjsLinearGradient1636)" stroke-opacity="1"
							stroke-linecap="butt" stroke-width="1" stroke-dasharray="5"
							class="apexcharts-line" index="2"
							clip-path="url(#gridRectMask23dnohtkg)"
							pathTo="M 0 145.78853297328948L 52.200042044584414 156.20199961423873L 104.40008408916883 114.54813305044173L 156.60012613375324 145.78853297328948L 208.80016817833766 156.20199961423873L 261.0002102229221 135.37506633234023L 313.20025226750647 166.61546625518798L 365.4002943120909 114.54813305044173L 417.6003363566753 135.37506633234023L 469.8003784012597 166.61546625518798L 522.0004204458442 135.37506633234023L 574.2004624904285 166.61546625518798"
							pathFrom="M -1 208.269332818985L -1 208.269332818985L 52.200042044584414 208.269332818985L 104.40008408916883 208.269332818985L 156.60012613375324 208.269332818985L 208.80016817833766 208.269332818985L 261.0002102229221 208.269332818985L 313.20025226750647 208.269332818985L 365.4002943120909 208.269332818985L 417.6003363566753 208.269332818985L 469.8003784012597 208.269332818985L 522.0004204458442 208.269332818985L 574.2004624904285 208.269332818985"></path>
						<g id="SvgjsG1634" class="apexcharts-series-markers-wrap"
							data:realIndex="2">
						<g class="apexcharts-series-markers">
						<circle id="SvgjsCircle1719" r="0" cx="104.40008408916883"
							cy="114.54813305044173" class="apexcharts-marker wipkfkk72"
							stroke="#ffffff" fill="#ff5e5e" fill-opacity="1" stroke-width="2"
							stroke-opacity="0.9" default-marker-size="0"></circle></g></g></g>
						<g id="SvgjsG1574" class="apexcharts-datalabels"
							data:realIndex="1"></g>
						<g id="SvgjsG1583" class="apexcharts-datalabels"
							data:realIndex="0"></g>
						<g id="SvgjsG1635" class="apexcharts-datalabels"
							data:realIndex="2"></g></g>
						<line id="SvgjsLine1713" x1="-11.515246793573553" y1="0"
							x2="585.7157092840021" y2="0" stroke="#b6b6b6"
							stroke-dasharray="0" stroke-width="1"
							class="apexcharts-ycrosshairs"></line>
						<line id="SvgjsLine1714" x1="-11.515246793573553" y1="0"
							x2="585.7157092840021" y2="0" stroke-dasharray="0"
							stroke-width="0" class="apexcharts-ycrosshairs-hidden"></line>
						<g id="SvgjsG1715" class="apexcharts-yaxis-annotations"></g>
						<g id="SvgjsG1716" class="apexcharts-xaxis-annotations"></g>
						<g id="SvgjsG1717" class="apexcharts-point-annotations"></g>
						<rect id="SvgjsRect1720" width="0" height="0" x="0" y="0" rx="0"
							ry="0" opacity="1" stroke-width="0" stroke="none"
							stroke-dasharray="0" fill="#fefefe" class="apexcharts-zoom-rect"></rect>
						<rect id="SvgjsRect1721" width="0" height="0" x="0" y="0" rx="0"
							ry="0" opacity="1" stroke-width="0" stroke="none"
							stroke-dasharray="0" fill="#fefefe"
							class="apexcharts-selection-rect"></rect></g>
						<rect id="SvgjsRect1567" width="0" height="0" x="0" y="0" rx="0"
							ry="0" opacity="1" stroke-width="0" stroke="none"
							stroke-dasharray="0" fill="#fefefe"></rect>
						<g id="SvgjsG1679" class="apexcharts-yaxis" rel="0"
							transform="translate(18.79329490661621, 0)">
						<g id="SvgjsG1680" class="apexcharts-yaxis-texts-g">
						<text id="SvgjsText1681"
							font-family="Helvetica, Arial, sans-serif" x="20" y="31.4"
							text-anchor="end" dominant-baseline="auto" font-size="13px"
							font-weight="400" fill="#888888"
							class="apexcharts-text apexcharts-yaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1682">100</tspan></text>
						<text id="SvgjsText1683"
							font-family="Helvetica, Arial, sans-serif" x="20"
							y="83.46733320474625" text-anchor="end" dominant-baseline="auto"
							font-size="13px" font-weight="400" fill="#888888"
							class="apexcharts-text apexcharts-yaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1684">75</tspan></text>
						<text id="SvgjsText1685"
							font-family="Helvetica, Arial, sans-serif" x="20"
							y="135.5346664094925" text-anchor="end" dominant-baseline="auto"
							font-size="13px" font-weight="400" fill="#888888"
							class="apexcharts-text apexcharts-yaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1686">50</tspan></text>
						<text id="SvgjsText1687"
							font-family="Helvetica, Arial, sans-serif" x="20"
							y="187.60199961423874" text-anchor="end" dominant-baseline="auto"
							font-size="13px" font-weight="400" fill="#888888"
							class="apexcharts-text apexcharts-yaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1688">25</tspan></text>
						<text id="SvgjsText1689"
							font-family="Helvetica, Arial, sans-serif" x="20"
							y="239.669332818985" text-anchor="end" dominant-baseline="auto"
							font-size="13px" font-weight="400" fill="#888888"
							class="apexcharts-text apexcharts-yaxis-label "
							style="font-family: Helvetica, Arial, sans-serif;">
						<tspan id="SvgjsTspan1690">0</tspan></text></g></g>
						<g id="SvgjsG1564" class="apexcharts-annotations"></g></svg>
					<div class="apexcharts-tooltip apexcharts-theme-light"
						style="left: 174.709px; top: 101.635px;">
						<div class="apexcharts-tooltip-title"
							style="font-family: Helvetica, Arial, sans-serif; font-size: 12px;">Mar</div>
						<div class="apexcharts-tooltip-series-group apexcharts-active"
							style="order: 1; display: flex;">
							<span class="apexcharts-tooltip-marker"
								style="background-color: var(- -primary);"></span>
							<div class="apexcharts-tooltip-text"
								style="font-family: Helvetica, Arial, sans-serif; font-size: 12px;">
								<div class="apexcharts-tooltip-y-group">
									<span class="apexcharts-tooltip-text-label">Number of
										Projects: </span><span class="apexcharts-tooltip-text-value">72
										points</span>
								</div>
								<div class="apexcharts-tooltip-z-group">
									<span class="apexcharts-tooltip-text-z-label"></span><span
										class="apexcharts-tooltip-text-z-value"></span>
								</div>
							</div>
						</div>
						<div class="apexcharts-tooltip-series-group apexcharts-active"
							style="order: 2; display: flex;">
							<span class="apexcharts-tooltip-marker"
								style="background-color: rgb(58, 201, 119);"></span>
							<div class="apexcharts-tooltip-text"
								style="font-family: Helvetica, Arial, sans-serif; font-size: 12px;">
								<div class="apexcharts-tooltip-y-group">
									<span class="apexcharts-tooltip-text-label">Revenue: </span><span
										class="apexcharts-tooltip-text-value">55 points</span>
								</div>
								<div class="apexcharts-tooltip-z-group">
									<span class="apexcharts-tooltip-text-z-label"></span><span
										class="apexcharts-tooltip-text-z-value"></span>
								</div>
							</div>
						</div>
						<div class="apexcharts-tooltip-series-group apexcharts-active"
							style="order: 3; display: flex;">
							<span class="apexcharts-tooltip-marker"
								style="background-color: rgb(255, 94, 94);"></span>
							<div class="apexcharts-tooltip-text"
								style="font-family: Helvetica, Arial, sans-serif; font-size: 12px;">
								<div class="apexcharts-tooltip-y-group">
									<span class="apexcharts-tooltip-text-label">Active
										Projects: </span><span class="apexcharts-tooltip-text-value">45
										points</span>
								</div>
								<div class="apexcharts-tooltip-z-group">
									<span class="apexcharts-tooltip-text-z-label"></span><span
										class="apexcharts-tooltip-text-z-value"></span>
								</div>
							</div>
						</div>
					</div>
					<div
						class="apexcharts-xaxistooltip apexcharts-xaxistooltip-bottom apexcharts-theme-light"
						style="left: 146.703px; top: 240.269px;">
						<div class="apexcharts-xaxistooltip-text"
							style="font-family: Helvetica, Arial, sans-serif; font-size: 12px; min-width: 21.6792px;">Mar</div>
					</div>
					<div
						class="apexcharts-yaxistooltip apexcharts-yaxistooltip-0 apexcharts-yaxistooltip-left apexcharts-theme-light">
						<div class="apexcharts-yaxistooltip-text"></div>
					</div>
				</div>
			</div>
			<div class="ttl-project">
				<div class="pr-data">
					<h5>12,721</h5>
					<span>Number of Projects</span>
				</div>
				<div class="pr-data">
					<h5 class="text-primary">721</h5>
					<span>Active Projects</span>
				</div>
				<div class="pr-data">
					<h5>$2,50,523</h5>
					<span>Revenue</span>
				</div>
				<div class="pr-data">
					<h5 class="text-success">12,275h</h5>
					<span>Working Hours</span>
				</div>
			</div>
			<div class="resize-triggers">
				<div class="expand-trigger">
					<div style="width: 670px; height: 386px;"></div>
				</div>
				<div class="contract-trigger"></div>
			</div>
		</div>
	</div>
</div>