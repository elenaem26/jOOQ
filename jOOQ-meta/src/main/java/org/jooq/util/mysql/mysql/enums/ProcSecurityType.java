/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public enum ProcSecurityType implements org.jooq.EnumType {
	INVOKER("INVOKER"),

	DEFINER("DEFINER"),

	;

	private final java.lang.String literal;

	private ProcSecurityType(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "proc_security_type";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
