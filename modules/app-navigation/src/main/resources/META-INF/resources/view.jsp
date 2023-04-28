<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp"%>
<%@page import="java.util.Locale"%>
<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.model.Layout"%>
 <div class="deznav">
     <div class="deznav-scroll mm-active">
			<ul class="metismenu mm-show" id="menu">
				<li class="menu-title">YOUR COMPANY</li>
					<% 
					 List<Layout> list = null; 
                    List<Layout> layoutList = (List<Layout>)request.getAttribute("layoutList");	
								for(Layout parentLayout :layoutList){							         									
								     list =	parentLayout.getChildren();
								     if(ListUtil.isNotNull(list)){
									%>						
								<li class=" dropdown">
									<a class="has arrow dropdown-toggle"  data-toggle="liferay-dropdown" href="" aria-expanded="false">
											
										<span class="nav-text"><%=parentLayout.getName(Locale.ENGLISH) %></span>
									</a>
									<ul aria-expanded="false" class="mm-collapse  left dropdown-menu">
									<%									
									for(Layout childLayout :list){
										//System.out.println("type setting---"+childLayout.getTypeSettings());
 										String string[] = childLayout.getTypeSettings().split("=");
										//System.out.println("urls----"+string[2]+"="+string[3]);
										%>									
											<li class="mm-active dropdown-item">
													<a href="<%=string[2]+"="+string[3]%>"><%=childLayout.getName(Locale.ENGLISH) %></a>
											</li>									
                               <%} %>
                               </ul>									
								</li>
									
								    <% } else {%>
 								
								<li><a  href="<%=themeDisplay.getScopeGroupName()+parentLayout.getFriendlyURL()%>"   >
										
										<span class="nav-text"><%=parentLayout.getName(Locale.ENGLISH) %></span>
										</a>
								</li>								
								  <%
								    }}
									%>																
				</ul>	
						<div class="help-desk">
							<a href="javascript:void(0)" class="btn btn-primary">Help Desk</a>
						</div>
		</div> 
	</div>
 
 