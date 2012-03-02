/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class MysqlFactory extends org.jooq.util.mysql.MySQLFactory {

	private static final long serialVersionUID = 1751227421;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public MysqlFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public MysqlFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
