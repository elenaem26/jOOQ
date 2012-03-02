/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Tables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -722007800;

	/**
	 * The singleton instance of information_schema.TABLES
	 */
	public static final org.jooq.util.mysql.information_schema.tables.Tables TABLES = new org.jooq.util.mysql.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_COLLATION = createField("TABLE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.tools.unsigned.ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CREATE_OPTIONS = createField("CREATE_OPTIONS", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_COMMENT = createField("TABLE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", org.jooq.util.mysql.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
