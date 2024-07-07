package com.model;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sun.tools.javac.util.List;

public class Test 
{
	public static void main(String[] args)
	{
		Transaction tr=null;
		
		
		try(Session ses=HBUtil.getSesFactory().openSession())
		{
			tr=ses.beginTransaction();
            Question q=new Question();
            q.setQuestion("What is Hibernate?");
            Question q1=new Question();
            q1.setQuestion("What is Entity class?");
            Answers a=new Answers(101,"Hb is An ORM.","Ram");
            Answers a1=new Answers(102,"Hb implements JPA","Sumesh");
            Answers b1=new Answers(103,"Entity Class is a simple java class","KANI");
            Answers b2=new Answers(201,"POJO classes called Entity class","Abi");
            ArrayList<Answers> li=new ArrayList<Answers>();
            li.add(a);
            li.add(a1);
            ArrayList<Answers> li1=new ArrayList<Answers>();
            li1.add(b1);
            li1.add(b2);
            q.setAnswers(li);
            q1.setAnswers(li1);
            ses.merge(q);
            
            ses.merge(q1);
            
            tr.commit();
			ses.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
            
            
            
            
}
		
		
		
}
