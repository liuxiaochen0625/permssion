<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
</style>
<!-- 引入css样式 -->
<link
	href="${pageContext.request.contextPath}/res/back_style/css/css.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="147"
				background="${pageContext.request.contextPath}/res/back_style/images/top02.gif"><img
				src="${pageContext.request.contextPath}/res/back_style/images/top03.gif"
				width="776" height="147" /></td>
		</tr>
	</table>
	<table width="562" border="0" align="center" cellpadding="0"
		cellspacing="0" class="right-table03">
		<tr>
			<td width="221"><table width="95%" border="0" cellpadding="0"
					cellspacing="0" class="login-text01">

					<tr>
						<td><table width="100%" border="0" cellpadding="0"
								cellspacing="0" class="login-text01">
								<tr>
									<td align="center"><img
										src="${pageContext.request.contextPath}/res/back_style/images/ico13.gif"
										width="107" height="97" /></td>
								</tr>
								<tr>
									<td height="40" align="center">&nbsp;</td>
								</tr>

							</table></td>
						<td><img
							src="${pageContext.request.contextPath}/res/back_style/images/line01.gif"
							width="5" height="292" /></td>
					</tr>
				</table></td>
			<td>
			<form action="${pageContext.request.contextPath}/admin/login" method="post">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="31%" height="35" class="login-text02">用户名称：<br /></td>
						<td width="69%"><input name="username" type="text" size="25" /></td>
					</tr>
					<tr>
						<td height="35" class="login-text02">密 码：<br /></td>
						<td><input name="password" type="password" size="25" /></td>
					</tr>
					<tr>
						<td height="35" class="login-text02">验证图片：<br /></td>
						<td><img title="点击更换" onclick="javascript:refresh(this);"
							id="img" src="${pageContext.request.contextPath}/verifycode/code" />
							<a href="javascript:void(0)"  onclick="javascript:refresh(document.getElementById('img'));" class="login-text03">看不清楚，换张图片</a></td>
					</tr>
					<tr>
						<td height="35" class="login-text02">请输入验证码：</td>
						<td><input name="verifycode" type="text" size="25" /></td>
					</tr>
					<tr>
						<td height="35">&nbsp;</td>
						<td><input name="Submit2" type="submit"	class="right-button01" value="确认登陆"/>
						<input	name="Submit232" type="submit" class="right-button02" value="重 置" /></td>
					</tr>
				</table>
				</form>
				</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
function refresh(obj) {  
      obj.src = "${pageContext.request.contextPath}/verifycode/code?"+Math.random();  
 } 
</script>
</html>
