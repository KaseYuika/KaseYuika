package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Participant;

/**
 * participantテーブルを操作するためのRepositoryクラスです
 */
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}