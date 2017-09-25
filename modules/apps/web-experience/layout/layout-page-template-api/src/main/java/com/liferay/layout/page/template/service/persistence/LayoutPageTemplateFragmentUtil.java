/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.layout.page.template.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.layout.page.template.model.LayoutPageTemplateFragment;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the layout page template fragment service. This utility wraps {@link com.liferay.layout.page.template.service.persistence.impl.LayoutPageTemplateFragmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutPageTemplateFragmentPersistence
 * @see com.liferay.layout.page.template.service.persistence.impl.LayoutPageTemplateFragmentPersistenceImpl
 * @generated
 */
@ProviderType
public class LayoutPageTemplateFragmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		LayoutPageTemplateFragment layoutPageTemplateFragment) {
		getPersistence().clearCache(layoutPageTemplateFragment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LayoutPageTemplateFragment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LayoutPageTemplateFragment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LayoutPageTemplateFragment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LayoutPageTemplateFragment update(
		LayoutPageTemplateFragment layoutPageTemplateFragment) {
		return getPersistence().update(layoutPageTemplateFragment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LayoutPageTemplateFragment update(
		LayoutPageTemplateFragment layoutPageTemplateFragment,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(layoutPageTemplateFragment, serviceContext);
	}

	/**
	* Returns all the layout page template fragments where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the layout page template fragments where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @return the range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByGroupId_First(long groupId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByGroupId_First(
		long groupId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByGroupId_Last(long groupId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByGroupId_Last(long groupId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the layout page template fragments before and after the current layout page template fragment in the ordered set where groupId = &#63;.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the current layout page template fragment
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment[] findByGroupId_PrevAndNext(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK,
		long groupId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(layoutPageTemplateFragmentPK,
			groupId, orderByComparator);
	}

	/**
	* Removes all the layout page template fragments where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of layout page template fragments where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching layout page template fragments
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @return the matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_LPTI(long groupId,
		long layoutPageTemplateId) {
		return getPersistence().findByG_LPTI(groupId, layoutPageTemplateId);
	}

	/**
	* Returns a range of all the layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @return the range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_LPTI(long groupId,
		long layoutPageTemplateId, int start, int end) {
		return getPersistence()
				   .findByG_LPTI(groupId, layoutPageTemplateId, start, end);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_LPTI(long groupId,
		long layoutPageTemplateId, int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .findByG_LPTI(groupId, layoutPageTemplateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_LPTI(long groupId,
		long layoutPageTemplateId, int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_LPTI(groupId, layoutPageTemplateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByG_LPTI_First(long groupId,
		long layoutPageTemplateId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_LPTI_First(groupId, layoutPageTemplateId,
			orderByComparator);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByG_LPTI_First(long groupId,
		long layoutPageTemplateId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .fetchByG_LPTI_First(groupId, layoutPageTemplateId,
			orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByG_LPTI_Last(long groupId,
		long layoutPageTemplateId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_LPTI_Last(groupId, layoutPageTemplateId,
			orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByG_LPTI_Last(long groupId,
		long layoutPageTemplateId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .fetchByG_LPTI_Last(groupId, layoutPageTemplateId,
			orderByComparator);
	}

	/**
	* Returns the layout page template fragments before and after the current layout page template fragment in the ordered set where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the current layout page template fragment
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment[] findByG_LPTI_PrevAndNext(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK,
		long groupId, long layoutPageTemplateId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_LPTI_PrevAndNext(layoutPageTemplateFragmentPK,
			groupId, layoutPageTemplateId, orderByComparator);
	}

	/**
	* Removes all the layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	*/
	public static void removeByG_LPTI(long groupId, long layoutPageTemplateId) {
		getPersistence().removeByG_LPTI(groupId, layoutPageTemplateId);
	}

	/**
	* Returns the number of layout page template fragments where groupId = &#63; and layoutPageTemplateId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateId the layout page template ID
	* @return the number of matching layout page template fragments
	*/
	public static int countByG_LPTI(long groupId, long layoutPageTemplateId) {
		return getPersistence().countByG_LPTI(groupId, layoutPageTemplateId);
	}

	/**
	* Returns all the layout page template fragments where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @return the matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_FEI(long groupId,
		long fragmentEntryId) {
		return getPersistence().findByG_FEI(groupId, fragmentEntryId);
	}

	/**
	* Returns a range of all the layout page template fragments where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @return the range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_FEI(long groupId,
		long fragmentEntryId, int start, int end) {
		return getPersistence().findByG_FEI(groupId, fragmentEntryId, start, end);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_FEI(long groupId,
		long fragmentEntryId, int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .findByG_FEI(groupId, fragmentEntryId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the layout page template fragments where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findByG_FEI(long groupId,
		long fragmentEntryId, int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_FEI(groupId, fragmentEntryId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByG_FEI_First(long groupId,
		long fragmentEntryId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_FEI_First(groupId, fragmentEntryId,
			orderByComparator);
	}

	/**
	* Returns the first layout page template fragment in the ordered set where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByG_FEI_First(long groupId,
		long fragmentEntryId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .fetchByG_FEI_First(groupId, fragmentEntryId,
			orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment findByG_FEI_Last(long groupId,
		long fragmentEntryId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_FEI_Last(groupId, fragmentEntryId, orderByComparator);
	}

	/**
	* Returns the last layout page template fragment in the ordered set where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template fragment, or <code>null</code> if a matching layout page template fragment could not be found
	*/
	public static LayoutPageTemplateFragment fetchByG_FEI_Last(long groupId,
		long fragmentEntryId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence()
				   .fetchByG_FEI_Last(groupId, fragmentEntryId,
			orderByComparator);
	}

	/**
	* Returns the layout page template fragments before and after the current layout page template fragment in the ordered set where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the current layout page template fragment
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment[] findByG_FEI_PrevAndNext(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK,
		long groupId, long fragmentEntryId,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence()
				   .findByG_FEI_PrevAndNext(layoutPageTemplateFragmentPK,
			groupId, fragmentEntryId, orderByComparator);
	}

	/**
	* Removes all the layout page template fragments where groupId = &#63; and fragmentEntryId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	*/
	public static void removeByG_FEI(long groupId, long fragmentEntryId) {
		getPersistence().removeByG_FEI(groupId, fragmentEntryId);
	}

	/**
	* Returns the number of layout page template fragments where groupId = &#63; and fragmentEntryId = &#63;.
	*
	* @param groupId the group ID
	* @param fragmentEntryId the fragment entry ID
	* @return the number of matching layout page template fragments
	*/
	public static int countByG_FEI(long groupId, long fragmentEntryId) {
		return getPersistence().countByG_FEI(groupId, fragmentEntryId);
	}

	/**
	* Caches the layout page template fragment in the entity cache if it is enabled.
	*
	* @param layoutPageTemplateFragment the layout page template fragment
	*/
	public static void cacheResult(
		LayoutPageTemplateFragment layoutPageTemplateFragment) {
		getPersistence().cacheResult(layoutPageTemplateFragment);
	}

	/**
	* Caches the layout page template fragments in the entity cache if it is enabled.
	*
	* @param layoutPageTemplateFragments the layout page template fragments
	*/
	public static void cacheResult(
		List<LayoutPageTemplateFragment> layoutPageTemplateFragments) {
		getPersistence().cacheResult(layoutPageTemplateFragments);
	}

	/**
	* Creates a new layout page template fragment with the primary key. Does not add the layout page template fragment to the database.
	*
	* @param layoutPageTemplateFragmentPK the primary key for the new layout page template fragment
	* @return the new layout page template fragment
	*/
	public static LayoutPageTemplateFragment create(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK) {
		return getPersistence().create(layoutPageTemplateFragmentPK);
	}

	/**
	* Removes the layout page template fragment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the layout page template fragment
	* @return the layout page template fragment that was removed
	* @throws NoSuchPageTemplateFragmentException if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment remove(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence().remove(layoutPageTemplateFragmentPK);
	}

	public static LayoutPageTemplateFragment updateImpl(
		LayoutPageTemplateFragment layoutPageTemplateFragment) {
		return getPersistence().updateImpl(layoutPageTemplateFragment);
	}

	/**
	* Returns the layout page template fragment with the primary key or throws a {@link NoSuchPageTemplateFragmentException} if it could not be found.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the layout page template fragment
	* @return the layout page template fragment
	* @throws NoSuchPageTemplateFragmentException if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment findByPrimaryKey(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK)
		throws com.liferay.layout.page.template.exception.NoSuchPageTemplateFragmentException {
		return getPersistence().findByPrimaryKey(layoutPageTemplateFragmentPK);
	}

	/**
	* Returns the layout page template fragment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutPageTemplateFragmentPK the primary key of the layout page template fragment
	* @return the layout page template fragment, or <code>null</code> if a layout page template fragment with the primary key could not be found
	*/
	public static LayoutPageTemplateFragment fetchByPrimaryKey(
		LayoutPageTemplateFragmentPK layoutPageTemplateFragmentPK) {
		return getPersistence().fetchByPrimaryKey(layoutPageTemplateFragmentPK);
	}

	public static java.util.Map<java.io.Serializable, LayoutPageTemplateFragment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the layout page template fragments.
	*
	* @return the layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the layout page template fragments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @return the range of layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the layout page template fragments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findAll(int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the layout page template fragments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateFragmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template fragments
	* @param end the upper bound of the range of layout page template fragments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of layout page template fragments
	*/
	public static List<LayoutPageTemplateFragment> findAll(int start, int end,
		OrderByComparator<LayoutPageTemplateFragment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the layout page template fragments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of layout page template fragments.
	*
	* @return the number of layout page template fragments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LayoutPageTemplateFragmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LayoutPageTemplateFragmentPersistence, LayoutPageTemplateFragmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LayoutPageTemplateFragmentPersistence.class);
}