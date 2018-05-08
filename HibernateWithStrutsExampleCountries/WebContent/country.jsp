<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<form action="./saveCountries.do">
		<table align="center" border="1" colspan="1">
			<h1 align="center">
				<font color="green"> Countries Table</font>
			</h1>

			<tr>
			<td>Country Code</td>
			<td><input type="text" name="countryCode"></td>
			<tr>
			<tr>
				<td>Countries</td>
				<td><select text="type" name="Countries">
						<option value="select">select</option>
						<option value="India">India</option>
						<option value="United Stated">United Stated</option>
						<option value="China">China</option>
						<option value="Singapore">Singapore</option>
						<option value="Malaysia">Malaysia</option>
				</select></td>
			</tr>
			<tr>
				<td>States</td>
				<td><select text="type" name="States">
						<option value="select">select</option>
						<option value="AP">AP</option>
						<option value="TS">TS</option>
						<option value="UP">UP</option>
						<option value="MP">MP</option>
						<option value="US States">US States</option>
				</select></td>
			</tr>
			<tr>
				<td>Districts</td>
				<td><select text="type" name="Districts">
						<option value="select">select</option>
						<option value="Krishna District">Krishna District</option>
						<option value="Gunter District">Gunter District</option>
						<option value="Prakasam District">Prakasam District</option>
						<option value="Visakhapatnam Distric">Visakhapatnam District</option>
				</select></td>
			</tr>
			
			<tr>
				<td align="center" colspan="1"><input type="submit"
					value="Save">
					<input type="reset" value="ResetYourDetalies"></td>
			</tr>

		</table>
	</form>
</body>
</html>