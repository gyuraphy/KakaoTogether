<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<div id="nav_wrap">
	<div id="nav_ctr">
		<div id="nav_logo">			
				<a class="mainlogo" href="/main"><span class="light">GYURAPHY <span class="bold">같이가치</span></span></a>
		</div>
		<div id="nav_gnb" role="navigtion">
			<ul class="inner">
				<li>
					<a class="link_gnb" href="#">
						<span class="on">같이기부</span>
					</a>
				</li>
				<li>
					<a class="link_gnb" href="#">
						<span>프로모션</span>
					</a>
				</li>
				<li>
					<a class="link_gnb" href="#">
						<span>더보기</span>
					</a>
				</li>
				<li>
					<a class="link_gnb" href="#">
						<span>준비중</span>
					</a>
				</li>
			</ul>
		</div>
		
		<div id="wrap_util">
			<ul class="inner">
				<!-- DTO 설계후 -->
				<%-- <%
				MemberDTO loginDTO = (MemberDTO) session.getAttribute("login");
				if (loginDTO == null){
				%> --%>
				<li>
					<a class="link_util link_fund" href="/join">회원가입</a>
				</li>
				<li>
					<a class="link_util link_fund" href="#">로그인</a>
				</li>
				<%-- <% } else { %> --%>
				<li>
				<%-- <c:if test="${url ne '/write'}">
				<a class="link_util link_fund" href="/write" 
				 style="background-color:#dc287c; border-color:#dc287c;">등록하기</a>
				</c:if>
				</li>
				<li>
				<a class="link_util link_login" href="/mypage" 
				 style="background-color:#333; border-color:#333; color: #fff;">마이페이지</a>
				</li>
				<li>
				<a class="link_util link_login" href="/logout.action">로그아웃</a>
				</li>
				<% } %>
				<li>
				<a class="btn_search" href="/search"><span class="ico_search"><img src="${imgSrc}/ico_search_01.svg"></span></a>
				</li>
				</ul> --%>
		</div>
	</div>
</div>
