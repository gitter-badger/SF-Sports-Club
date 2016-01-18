/*
 * $Id$
 */
package teamdivider.dao;

import org.springframework.stereotype.Repository;

import teamdivider.bean.eo.SequenceId;
import teamdivider.bean.eo.mapping.EventMember;

@Repository
public class EventMemberDAO extends AbstractDAO<EventMember> {

  @Override
  protected Class<EventMember> getClazz() {
    return EventMember.class;
  }

  public void create(EventMember mapping) {
    mapping.setMappingId(
        this.sequenceDAO.getNextSequenceId(SequenceId.SEQUENCE_EVENT_MEMBER));
    this.getBasicDAO().save(mapping);
  }

}
