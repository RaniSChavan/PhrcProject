package com.ambertag.phrc.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="asset_Transactions")
public class AssetTransactions implements Serializable {
	private AssetTransactionsId id;

	public AssetTransactions() {
		// TODO Auto-generated constructor stub
	}

	public AssetTransactions(AssetTransactionsId id) {
		//super();
		this.id = id;
	}


	@EmbeddedId
	@AttributeOverrides({@AttributeOverride(name="assetNo", column=@Column(name="assetNo", length=20)),
		@AttributeOverride(name="deptNo", column=@Column(name="deptNo")),
		@AttributeOverride(name="assetAttributeId", column=@Column(name="assetAttributeId")),
		@AttributeOverride(name="attributeStatus", column=@Column(name="attributeStatus")),
		@AttributeOverride(name = "dateTimeStamp", column = @Column(name = "dateTimeStamp", nullable = false, length = 0))
			})
	public AssetTransactionsId getId() {
		return id;
	}

	public void setId(AssetTransactionsId id) {
		this.id = id;
	}

}
