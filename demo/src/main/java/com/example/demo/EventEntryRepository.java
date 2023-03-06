//package com.example.demo;
//
//import org.hibernate.mapping.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//
///**
// * event_entryテーブルを操作するためのRepositoryクラスです
// */
//public interface EventEntryRepository extends JpaRepository<EventEntry, Integer> {
//	/**
//	 * 指定したイベントIDからイベント参加者の情報を検索します.
//	 * @param eventId イベントID
//	 * @return	イベント参加者一覧
//	 */
//	public List<EventEntry> findByEventId(Integer eventId);
//}