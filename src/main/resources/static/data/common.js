//获取当前网址，如： http://localhost:8080/Tmall/index.jsp
var curWwwPath=window.document.location.href;

//获取主机地址之后的目录如：/Tmall/index.jsp
var pathName=window.document.location.pathname;
var pos=curWwwPath.indexOf(pathName);

//获取主机地址，如： http://localhost:8080
var localhostPaht=curWwwPath.substring(0,pos);

//获取带"/"的项目名，如：/Tmall
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);

var hosturl=localhostPaht+projectName;