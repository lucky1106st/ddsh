var b=false;var editHTML;var editText;var prefix;function setEditHTML(a){editHTML='<input type="text" class="text_half" value="'+a+'" />';editHTML+='&nbsp;<input type="image" onclick="ok(this)" src="../images/accept.gif" border="0" alt="确定" />';editHTML+='&nbsp;<input type="image" onclick="cancel(this)" src="../images/closs.gif" border="0" alt="关闭" />'}function cancel(a){var c=$(a).parent();c.html(c.data("oldtxt"));c.bind("dblclick",function(){editText=$(this).html();setEditHTML(editText);$(this).data("oldtxt",editText).html(editHTML).unbind("dblclick")})}function ok(a){var g=$(a).parent();var f=g.attr("id");var e=g.parent().attr("id");var c=g.find("input:text")[0].value;var d="trid="+e+"&tdid="+f+"&value="+c+"&t="+new Date().getTime();$.ajax({url:prefix+"!edit.zf",type:"POST",dataType:"json",data:d,error:function(){alert("error")},success:function(h){alert(h.info);if(h.result==true){g.data("oldtxt",c);cancel(a)}else{cancel(a)}}})}function editbox(){$(".editbox").each(function(){$(this).bind("dblclick",function(){editText=$(this).html();setEditHTML(editText);$(this).data("oldtxt",editText).html(editHTML).unbind("dblclick")})})}function ck(){if(b){b=false}else{b=true}var c=document.getElementsByName("row");for(var a=0;a<c.length;a++){c[a].checked=b}}function deletes(){var d="";var c=document.getElementsByName("row");for(var a=0;a<c.length;a++){if(c[a].checked==true){d+=c[a].value+","}}if(d==""){alert("请至少选择一条记录");return false}if(window.confirm("确定要删除这些记录吗？")){$.ajax({url:prefix+"!del.zf?ids="+d+"&t="+new Date().getTime(),type:"POST",dataType:"json",error:function(){alert("error")},success:function(e){alert(e.info);load("")}})}}function exports(){window.open(prefix+"!export.zf?type=1&t="+new Date().getTime())};