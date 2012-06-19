/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.entity.orders;

// Generated Mar 28, 2009 11:17:22 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.Set;

/**
 * OrdersAccount generated by hbm2java
 */
public class OrderAccount implements java.io.Serializable {

	// Fields

	private long orderAccountId;

	private long orderId;

	private int orderAccountStatusId;

	private Date orderAccountStartDate;

	private Date orderAccountEndDate;

	private int orderAccountBillDay;

	private Set orderAccountProducts;

	// Constructors

	/** default constructor */
	public OrderAccount() {
	}

	/** minimal constructor */
	public OrderAccount(long orderAccountId, long orderId,
			int orderAccountStatusId, Date orderAccountStartDate,
			int orderAccountBillDay) {
		this.orderAccountId = orderAccountId;
		this.orderId = orderId;
		this.orderAccountStatusId = orderAccountStatusId;
		this.orderAccountStartDate = orderAccountStartDate;
		this.orderAccountBillDay = orderAccountBillDay;
	}

	/** full constructor */
	public OrderAccount(long orderAccountId, long orderId,
			int orderAccountStatusId, Date orderAccountStartDate,
			Date orderAccountEndDate, int orderAccountBillDay) {
		this.orderAccountId = orderAccountId;
		this.orderId = orderId;
		this.orderAccountStatusId = orderAccountStatusId;
		this.orderAccountStartDate = orderAccountStartDate;
		this.orderAccountEndDate = orderAccountEndDate;
		this.orderAccountBillDay = orderAccountBillDay;
	}

	// Property accessors
	public long getOrderAccountId() {
		return this.orderAccountId;
	}

	public void setOrderAccountId(long orderAccountId) {
		this.orderAccountId = orderAccountId;
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getOrderAccountStatusId() {
		return this.orderAccountStatusId;
	}

	public void setOrderAccountStatusId(int orderAccountStatusId) {
		this.orderAccountStatusId = orderAccountStatusId;
	}

	public Date getOrderAccountStartDate() {
		return this.orderAccountStartDate;
	}

	public void setOrderAccountStartDate(Date orderAccountStartDate) {
		this.orderAccountStartDate = orderAccountStartDate;
	}

	public Date getOrderAccountEndDate() {
		return this.orderAccountEndDate;
	}

	public void setOrderAccountEndDate(Date orderAccountEndDate) {
		this.orderAccountEndDate = orderAccountEndDate;
	}

	public int getOrderAccountBillDay() {
		return this.orderAccountBillDay;
	}

	public void setOrderAccountBillDay(int orderAccountBillDay) {
		this.orderAccountBillDay = orderAccountBillDay;
	}

	public Set getOrderAccountProducts() {
		return orderAccountProducts;
	}

	public void setOrderAccountProducts(Set orderAccountProducts) {
		this.orderAccountProducts = orderAccountProducts;
	}

}