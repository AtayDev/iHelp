package DAO.interfaces;

import Models.ParticipationF;

import java.util.List;


import Models.ParticipationB;

public interface IParticipation {
	
	ParticipationF insertParticipationF(ParticipationF partf);
	ParticipationB insertParticipationB(ParticipationB partb);
	List<ParticipationF> getAllParticipationF(int dona_id);
	List<ParticipationB> getAllParticipationB(int dona_id);
}
