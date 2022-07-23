package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.ApplicationStatus;

@Component
public class DaoMethodImpl implements DaoMethods{

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public ApplicationStatus addorUpdateApplicationStatus(ApplicationStatus applicationStatus) {
		ApplicationStatus ASPersisted = em.merge(applicationStatus);
		return ASPersisted;
	}

	public ApplicationStatus searchApplicationStatusByApplicationId(int applicationId) {
		String jpql = "select astatus from ApplicationStatus astatus where astatus.applicationId=:appid";
		return em.createQuery(jpql,ApplicationStatus.class).setParameter("appid", applicationId).getSingleResult();
	}

}
