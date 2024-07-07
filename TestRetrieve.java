package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestRetrieve {
	
	public static void main(String[] args)
	{
		Transaction tr=null;
		
		
		try(Session ses=HBUtil.getSesFactory().openSession())
		{
			tr=ses.beginTransaction();
			Query<Question> qry=ses.createQuery("from Question",Question.class);
			List<Question> li3=qry.list();
			for(Question q:li3)
			{
				System.out.println(q.getId()+"\t"+q.getQuestion());
			
			Query<Answers> ans = ses.createQuery("from Answers",Answers.class);
			List<Answers> answersList = ans.list();
			if (answersList != null && !answersList.isEmpty()) {
			    for (Answers ad : answersList) {
			        System.out.println("Answer is " + ad.getAnswername() + "and posted by" + ad.getPostby());
			    }
			}
			}
			tr.commit();
			ses.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}
