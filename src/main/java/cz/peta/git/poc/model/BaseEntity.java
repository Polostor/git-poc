package cz.peta.git.poc.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
abstract class BaseEntity extends AbstractAuditableEntity<Long> {

}
