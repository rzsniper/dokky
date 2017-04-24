<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>사이드 메뉴</title>
</head>
<body>
	<!-- 사이드바 -->
	<div id="sidebar">
		<div class="inner">

			<!-- 서치 -->
			<section id="search" class="alt">
				<form method="post" action="#">
					<input type="text" name="query" id="query" placeholder="Search" />
				</form>
			</section>

			<!-- 로그인 회원가입등 -->
			<section id="icons">
				<a href="#" class="icon fa-sign-in"> 로그인</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#" class="icon fa-user-plus"> 회원가입</a>
				<!-- 로그인 처리 -->
				<ul>
				<br/>
					로그인했으면
					<a href="#" class="icon fa-sign-out"> 로그아웃</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#" class="icon fa-bell"> 알림</a>
					<br/><br/>
					관리자이면
					<a href="/dokky/ml.do">회원 관리(톱니바퀴 등 이미지로 할까)</a>
				</ul>
			</section>

			<!-- 메뉴 -->
			<nav id="menu">
				<ul>
					<li><a href="index.html">메인</a></li>
					<li><a href="generic.html">Q&A게시판</a></li>
					<li><span class="opener">구인구직</span>
						<ul>
							<li><a href="#">구인</a></li>
							<li><a href="#">구직</a></li>
						</ul></li>
					<li><a href="elements.html">자유게시판</a></li>
					<li><a href="elements.html">오픈소스</a></li>
					<li><a href="/dokky/soundtest.do">음성인식 검색 테스트</a></li>
				</ul>
			</nav>
		</div>
	</div>
</body>
</html>