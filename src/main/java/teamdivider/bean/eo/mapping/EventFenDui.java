/*
 * $Id$
 */
package teamdivider.bean.eo.mapping;

import java.util.HashSet;
import java.util.Set;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import teamdivider.entity.Team;

@Entity
public class EventFenDui {

  @Id
  private ObjectId id;

  private long mappingId;
  
  private long eventId;
  
  private int teamNumber;
  
  @Embedded
  private Set<Team> teams = new HashSet<Team>();

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public long getMappingId() {
    return mappingId;
  }

  public void setMappingId(long mappingId) {
    this.mappingId = mappingId;
  }

  public long getEventId() {
    return eventId;
  }

  public void setEventId(long eventId) {
    this.eventId = eventId;
  }

  public int getTeamNumber() {
    return teamNumber;
  }

  public void setTeamNumber(int teamNumber) {
    this.teamNumber = teamNumber;
  }

  public Set<Team> getTeams() {
    return teams;
  }

  public void setTeams(Set<Team> teams) {
    this.teams = teams;
  }

}
