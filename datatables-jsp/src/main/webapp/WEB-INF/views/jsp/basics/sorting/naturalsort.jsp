<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../common/taglib.jsp"%>
<div class="row-fluid">
   <div class="span12">
      <h3>Sorting type: natural</h3>
      <br />
   </div>
</div>
<datatables:table id="myTableId" data="${persons}" row="person">
   <datatables:column title="Id" property="id" />
   <datatables:column title="FirstName" property="firstName" />
   <datatables:column title="LastName" property="lastName" />
   <datatables:column title="City" property="address.town.name" />
   <datatables:column title="Mail" sortType="natural">
      <a href="mailto:${person.mail}">${person.mail}</a>
   </datatables:column>
   <datatables:column title="Birthdate" property="birthDate" format="{0,date,dd/MM/yyyy}" sortType="date" />
   <datatables:column title="Pocket money" sortType="natural">
      ${person.pocketMoney}€
   </datatables:column>
   <datatables:column title="Company" property="company.name" />
</datatables:table>
