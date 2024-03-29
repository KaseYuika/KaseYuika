package service;

import java.util.List;

import entity.Participant;
import form.EventEntryForm;

public interface EventEntryService {
	/**
	 * 指定したイベントIDに紐づく参加者の一覧を取得します.
	 * @param eventId イベントID
	 * @return 参加者の一覧
	 */
	public List<Participant> findByEventId(Integer eventId);
	/**
	 * イベント参加者の情報をDBに登録します.
	 * @param eventEntryForm イベント参加者情報
	 */
	public void save(EventEntryForm eventEntryForm);

}
