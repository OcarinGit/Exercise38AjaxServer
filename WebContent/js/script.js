let xhr = new XMLHttpRequest();

window.onload  = function()
{
	document.getElementById("btnSalary").addEventListener("click", CalculateSalary);
	document.getElementById("btnSalary2").addEventListener("click", CalculateSalary2);
}
function CalculateSalary()
{
	xhr.onload = funcionCallBack;
	let name = document.getElementById("txtName").value;
	let salary = document.querySelector("#txtSalary").value;
	console.log(name);
	console.log(salary);
	xhr.open("GET", "CalculateSalaryServlet?txtName="+name+"&txtSalary="+salary);
	xhr.send(null);
}
function funcionCallBack()
{
	document.getElementById("SalaryCalculated").innerHTML = xhr.responseText;
}
function CalculateSalary2()
{
	xhr.onload = funcionCallBack2;
	let name2 = document.getElementById("txtName2").value;
	let salary2 = document.querySelector("#txtSalary2").value;
	console.log(name2);
	console.log(salary2);
	//Crea mi formulario
	let miFormulario = new FormData();
	//Crea los parámetros txtName y txtSalary
	miFormulario.append("txtName",name2);
	miFormulario.append("txtSalary",salary2);
	xhr.open("POST", "CalculateSalaryServlet2");
	xhr.send(miFormulario);
}
function funcionCallBack2()
{
	document.getElementById("SalaryCalculated2").innerHTML = xhr.responseText;
}