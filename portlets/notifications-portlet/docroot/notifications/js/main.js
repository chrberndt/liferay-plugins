<<<<<<< HEAD
AUI().use(
	'aui-base',
	'aui-io-plugin-deprecated',
	'liferay-poller',
	'liferay-portlet-url',
	function(A) {
		Liferay.namespace('Notifications');

		Liferay.Notifications = {
			init: function(config) {
				var instance = this;

				instance._baseActionURL = config.baseActionURL;
				instance._baseRenderURL = config.baseRenderURL;
				instance._baseResourceURL = config.baseResourceURL;
				instance._currentPageNotificationEventsCount = config.currentPageNotificationEventsCount;
				instance._dockbarNotificationsURL = instance._getRenderURL('/dockbar_notifications/view.jsp', 'unread', null, null, 'false', 'true');
				instance._fullviewNotificationsURL = instance._getRenderURL('/notifications/view_entries.jsp', config.filter, config.start.toString(), config.end.toString(), 'true');
				instance._lastPage = config.userNotificationEventsCount <= config.end;
				instance._nextPageNotificationsURL = instance._getRenderURL('/notifications/view_entries.jsp', config.filter, (config.start + config.delta).toString(), (config.end + config.delta).toString(), 'true');
				instance._previousPageNotificationsURL = instance._getRenderURL('/notifications/view_entries.jsp', config.filter, (config.start - config.delta).toString(), (config.end - config.delta).toString(), 'true');

				instance._createMarkAllAsReadNode(config);

				instance._bindUI();

				instance._updateFullviewNotificationsCount(config.filter, config.userNotificationEventsCount);
			},

			initDockbarNotifications: function(config) {
				var instance = this;

				instance._baseActionURL = config.baseActionURL;
				instance._baseRenderURL = config.baseRenderURL;
				instance._namespace = config.namespace;
				instance._portletKey = config.portletKey;

				instance._dockbarNotificationsURL = instance._getRenderURL('/dockbar_notifications/view.jsp', 'unread', null, null, 'false', 'true');

				instance._createMenuToggle(config.menuOpen);

				A.on(
					'domready',
					function() {
						Liferay.Poller.addListener(instance._portletKey, instance._onPollerUpdate, instance);
					}
				);
			},

			renderNotificationsList: function(notificationsList, uri) {
				var instance = this;

				if (notificationsList && !instance._hasRequestSent(notificationsList, uri)) {
					if (!notificationsList.io) {
						notificationsList.plug(
							A.Plugin.IO,
							{
								autoLoad: false
							}
						);
					}

					notificationsList.io.set('uri', uri);
					notificationsList.io.start();
				}
			},

			_bindMarkAllAsRead: function() {
				var instance = this;

				instance._bindMarkAsReadDelegation(false, instance._getDockbarNotificationsList(), true, '.mark-all-as-read');
				instance._bindMarkAsReadDelegation(true, instance._getFullviewNotificationsList(), true, '.mark-all-as-read');
			},

			_bindMarkAsRead: function() {
				var instance = this;

				instance._bindMarkAsReadDelegation(false, instance._getDockbarNotificationsList(), false, '.user-notification .btn-action');
				instance._bindMarkAsReadDelegation(true, instance._getFullviewNotificationsList(), false, '.user-notification .btn-action');
			},

			_bindMarkAsReadDelegation: function(fullView, notificationsList, markAllAsRead, selector) {
				var instance = this;

				if (notificationsList) {
					notificationsList.delegate(
						'click',
						function(event) {
							instance._markAsRead(event, fullView, markAllAsRead);
						},
						selector
					);
				}
			},

			_bindNavMenu: function(menu, uri, allNotifications, unread) {
				var instance = this;

				if (menu) {
					menu.on(
						'click',
						function() {
							instance._allNotifications = allNotifications;
							instance._unread = unread;

							instance._setDelivered();

							instance.renderNotificationsList(instance._getFullviewNotificationsList(), uri);

							var userNotificationsSidebar = A.one('.user-notifications-sidebar');

							if (userNotificationsSidebar) {
								userNotificationsSidebar.all('.nav a').removeClass('selected');
							}

							menu.addClass('selected');
						}
					);
				}
			},

			_bindNextPageNotifications: function() {
				var instance = this;

				instance._bindPaginateDelegation(this._getFullviewNotificationsList(), false, '.message .next a');
			},

			_bindPaginateDelegation: function(userNotificationsList, previous, selector) {
				var instance = this;

				if (userNotificationsList) {
					userNotificationsList.delegate(
						'click',
						function(event) {
							event.preventDefault();

							var currentTarget = event.currentTarget;

							var userNotificationsList = currentTarget.ancestor('.user-notifications-list-container .user-notifications-list');

							if (userNotificationsList) {
								if (previous) {
									instance.renderNotificationsList(instance._getFullviewNotificationsList(), instance._previousPageNotificationsURL);
								}
								else {
									instance.renderNotificationsList(instance._getFullviewNotificationsList(), instance._nextPageNotificationsURL);
								}
							}
						},
						selector
					);
				}
			},

			_bindPreviousPageNotifications: function() {
				var instance = this;

				instance._bindPaginateDelegation(this._getFullviewNotificationsList(), true, '.message .previous a');
			},

			_bindUI: function() {
				var instance = this;

				instance._bindMarkAllAsRead();

				instance._bindMarkAsRead();

				instance._bindNextPageNotifications();

				instance._bindPreviousPageNotifications();

				instance._bindUserNotificationsSideBar();

				instance._bindViewNotification();
			},

			_bindUserNotificationsSideBar: function() {
				var instance = this;

				var userNotificationsSidebar = A.one('.user-notifications-sidebar');

				if (userNotificationsSidebar) {
					var unreadNav = userNotificationsSidebar.one('.unread');

					instance._bindNavMenu(unreadNav, instance._getRenderURL('/notifications/view_entries.jsp', 'unread'), false, true);

					var allNotificationsNav = userNotificationsSidebar.one('.all-notifications');

					instance._bindNavMenu(allNotificationsNav, instance._getRenderURL('/notifications/view_entries.jsp'), true, false);

					var manageNav = userNotificationsSidebar.one('.manage');

					instance._bindNavMenu(manageNav, instance._getRenderURL('/notifications/configuration.jsp'), false, false);
				}
			},

			_bindViewDelegation: function(notificationsList, selector) {
				var instance = this;

				if (notificationsList) {
					notificationsList.delegate(
						'click',
						function(event) {
							instance._viewNotification(event);
						},
						selector
					);
				}
			},

			_bindViewNotification: function() {
				var instance = this;

				instance._bindViewDelegation(instance._getDockbarNotificationsList(), '.user-notification .user-notification-link');
				instance._bindViewDelegation(instance._getFullviewNotificationsList(), '.user-notification .user-notification-link');
			},

			_createMarkAllAsReadNode: function(config) {
				var instance = this;

				if (config.userNotificationEventsCount > 0) {
					var nodeHTML = '<a class="mark-all-as-read" href="' + instance._getActionURL('markAllAsRead', config.userNotificationEventIds) + '">' +
							A.Lang.sub(Liferay.Language.get('mark-all-as-read-x'), [config.currentPageNotificationEventsCount]) + '</a>';

					var dockbarMarkAllAsRead = A.one('.dockbarMarkAllAsRead');

					if (dockbarMarkAllAsRead) {
						dockbarMarkAllAsRead.get('parentNode').replaceChild(A.Node.create(nodeHTML), dockbarMarkAllAsRead);
					}

					var fullViewMarkAllAsRead = A.one('.fullViewMarkAllAsRead');

					if (fullViewMarkAllAsRead) {
						fullViewMarkAllAsRead.get('parentNode').replaceChild(A.Node.create(nodeHTML), fullViewMarkAllAsRead);
					}
				}
			},

			_createMenuToggle: function(menuOpen) {
				var instance = this;

				var unreadURL = instance._getRenderURL('/notifications/view_entries.jsp', 'unread', null, null, 'false');

				var userNotifications =  A.one('.dockbar-user-notifications');

				instance._setDelivered();

				if (menuOpen) {
					if (!userNotifications.hasClass('open')) {
						userNotifications.addClass('open');
					}

					userNotifications.on(
						'clickoutside',
						function(event) {
							userNotifications.removeClass('open');
						}
					);

					instance.renderNotificationsList(instance._getDockbarNotificationsList(), unreadURL);
				}
				else {
					userNotifications.on(
						'click',
						function(event) {
							var currentTarget = event.currentTarget;

							var target = event.target;

							if (!target.hasClass('user-notification') && !target.ancestor('.user-notification')) {
								currentTarget.toggleClass('open');

								var menuOpen = currentTarget.hasClass('open');

								if (menuOpen) {
									currentTarget.on(
										'clickoutside',
										function(event) {
											currentTarget.removeClass('open');
										}
									);

									instance.renderNotificationsList(instance._getDockbarNotificationsList(), unreadURL);

									if (instance._allNotifications) {
										instance.renderNotificationsList(instance._getFullviewNotificationsList(), instance._getRenderURL('/notifications/view_entries.jsp'));
									}
									else if (instance._unread || ((typeof(instance._allNotifications) == 'undefined') && (typeof(instance._unread) == 'undefined'))) {
										instance.renderNotificationsList(instance._getFullviewNotificationsList(), instance._getRenderURL('/notifications/view_entries.jsp', 'unread'));
									}

									var dockbarUserNotificationsCount = A.one('.dockbar-user-notifications .user-notifications-count');

									if (dockbarUserNotificationsCount) {
										dockbarUserNotificationsCount.removeClass('alert');
									}
								}
							}
						}
					);
				}
			},

			_getActionURL: function(name, userNotificationEventIds) {
				var instance = this;

				var portletURL = new Liferay.PortletURL.createURL(instance._baseActionURL);

				portletURL.setParameter('javax.portlet.action', name);

				if (userNotificationEventIds) {
					portletURL.setParameter('userNotificationEventIds', userNotificationEventIds);
				}

				portletURL.setWindowState('normal');

				return portletURL.toString();
			},

			_getDockbarNotificationsList: function() {
				var instance = this;

				if (instance._dockbarNotificationsList) {
					return instance._dockbarNotificationsList;
				}

				instance._dockbarNotificationsList = A.one('.dockbar-user-notifications .user-notifications-list');

				return instance._dockbarNotificationsList ;
			},

			_getFullviewNotificationsList: function() {
				var instance = this;

				if (instance._fullviewNotificationsList) {
					return instance._fullviewNotificationsList;
				}

				instance._fullviewNotificationsList = A.one('.user-notifications-list-container .user-notifications-list');

				return instance._fullviewNotificationsList;
			},

			_getRenderURL: function(mvcPath, filter, start, end, fullview, menuOpen) {
				var instance = this;

				var portletURL = new Liferay.PortletURL.createURL(instance._baseRenderURL);

				portletURL.setParameter('mvcPath', mvcPath);

				if (filter) {
					portletURL.setParameter('filter', filter);
				}

				if (start) {
					portletURL.setParameter('start', start);
				}

				if (end) {
					portletURL.setParameter('end', end);
				}

				if (fullview) {
					portletURL.setParameter('fullView', fullview);
				}

				if (menuOpen) {
					portletURL.setParameter('menuOpen', menuOpen);
				}

				portletURL.setWindowState('exclusive');

				return portletURL.toString();
			},

			_getResourceURL: function(resourceId) {
				var instance = this;

				var portletURL = new Liferay.PortletURL.createURL(instance._baseResourceURL);

				portletURL.setResourceId(resourceId);

				return portletURL.toString();
			},

			_hasRequestSent: function(node, uri) {
				var instance = this;

				if ((instance._lastNode == node) && (instance._lastUri == uri)) {
					return true;
				}
				else {
					instance._lastNode = node;
					instance._lastUri = uri;

					setTimeout(
						function() {
							instance._lastNode = null;
							instance._lastUri = null;
						}, 300);

					return false;
				}
			},

			_markAsRead: function(event, fullView, markAllAsRead) {
				event.preventDefault();

				var instance = this;

				var currentRow;

				var currentTarget = event.currentTarget;

				var loadingRow = A.Node.create('<div class="loading-animation"></div>');

				if (!markAllAsRead) {
					currentRow = currentTarget.ancestor('.user-notification');
					currentRow.hide().placeAfter(loadingRow);
				}

				A.io.request(
					currentTarget.attr('href'),
					{
						after: {
							success: function() {
								var response = this.get('responseData');

								if (response) {
									if (!markAllAsRead) {
										currentRow.remove();
										loadingRow.remove();
									}

									if (response.success) {
										instance._updateNotifications(fullView, markAllAsRead);
									}
								}
							}
						},
						dataType: 'JSON'
					}
				);
			},

			_onPollerUpdate: function(response) {
				var instance = this;

				instance._updateDockbarNotificationsCount(response.newUserNotificationsCount, response.unreadUserNotificationsCount);
			},

			_openWindow: function(uri) {
				if (uri.match('p_p_state=maximized') || uri.match('p_p_state=pop_up') || uri.match('p_p_state=exclusive')) {
					return true;
				}

				return false;
			},

			_redirect: function(uri) {
				var instance = this;

				if (uri) {
					if (instance._openWindow(uri)) {
						Liferay.Util.openWindow(
							{
								id: 'notificationsWindow',
								uri: uri
							}
						);
					}
					else {
						var topWindow = Liferay.Util.getTop();

						topWindow.location.href = uri;
					}
				}
			},

			_setDelivered: function() {
				var instance = this;

				A.io.request(instance._getActionURL('setDelivered'));
			},

			_updateDockbarNotificationsCount: function(newUserNotificationsCount, unreadUserNotificationsCount) {
				var dockbarUserNotificationsCount = A.one('.dockbar-user-notifications .user-notifications-count');

				if (dockbarUserNotificationsCount) {
					dockbarUserNotificationsCount.toggleClass('alert', (newUserNotificationsCount > 0));

					dockbarUserNotificationsCount.setHTML(unreadUserNotificationsCount);
				}
			},

			_updateFullviewNotificationsCount: function(filter, unreadUserNotificationsCount) {
				if (filter == 'unread') {
					var userNotificationsSidebar = A.one('.user-notifications-sidebar');

					if (userNotificationsSidebar) {
						var unreadCount = userNotificationsSidebar.one('.unread .count');

						if (unreadCount) {
							unreadCount.setHTML(unreadUserNotificationsCount);
						}
					}
				}
			},

			_updateNotifications: function(fullView, markAllAsRead) {
				var instance = this;

				A.io.request(
					instance._getResourceURL('notifcationsCount'),
					{
						on: {
							success: function() {
								var response = this.get('responseData');

								if (response.success) {
									if (!fullView) {
										instance.renderNotificationsList(instance._getDockbarNotificationsList(), instance._dockbarNotificationsURL);
									}

									if (instance._unread || ((typeof(instance._allNotifications) == 'undefined') && (typeof(instance._unread) == 'undefined'))) {
										if (instance._lastPage && (markAllAsRead || (instance._currentPageNotificationEventsCount == 1))) {
											instance.renderNotificationsList(instance._getFullviewNotificationsList(), instance._previousPageNotificationsURL);
										}
										else {
											instance.renderNotificationsList(instance._getFullviewNotificationsList(),  instance._fullviewNotificationsURL);
										}
									}

									instance._updateNotificationsCount(response['newUserNotificationsCount'], response['unreadUserNotificationsCount']);
								}
							}
						},
						dataType: 'JSON'
					}
				);
			},

			_updateNotificationsCount: function(newUserNotificationsCount, unreadUserNotificationsCount) {
				var instance = this;

				instance._updateDockbarNotificationsCount(newUserNotificationsCount, unreadUserNotificationsCount);
				instance._updateFullviewNotificationsCount('unread', unreadUserNotificationsCount);
			},

			_viewNotification: function(event) {
				var instance = this;

				var currentTarget = event.currentTarget;

				var uri = currentTarget.attr('data-href');

				var markAsReadURL = currentTarget.attr('data-markAsReadURL');

				if (markAsReadURL) {
					A.io.request(
						markAsReadURL,
						{
							after: {
								success: function() {
									var responseData = this.get('responseData');

									if (responseData.success) {
										var userNotification = currentTarget.ancestor('.user-notification');

										if (userNotification) {
											userNotification.removeClass('unread');

											var read = userNotification.one('.content .read');

											if (read) {
												read.setHTML(Liferay.Language.get('read'));
											}

											instance._redirect(uri);
										}
									}
								}
							},
							dataType: 'JSON'
						}
					);
				}
				else {
					var userNotification = currentTarget.ancestor('.user-notification');

					if (userNotification) {
						instance._redirect(uri);
					}
				}
			}
		};
=======
AUI.add(
	'liferay-plugin-dockbar-notifications',
	function(A) {
		var DockbarNotifications = A.Component.create(
			{
				AUGMENTS: [Liferay.PortletBase],

				EXTENDS: A.Base,

				NAME: 'dockbarnotifications',

				prototype: {
					initializer: function(config) {
						var instance = this;

						instance._actionableNotificationsList = config.actionableNotificationsList;
						instance._baseActionURL = config.baseActionURL;
						instance._baseResourceURL = config.baseResourceURL;
						instance._nonactionableNotificationsList = config.nonactionableNotificationsList;
						instance._portletKey = config.portletKey;

						var navAccountControls = A.one('.nav-account-controls');

						navAccountControls.delegate(
							'click',
							function(event) {
								var target = event.target;

								if (target.ancestor('.dockbar-user-notifications-container')) {
									return;
								}

								var currentTarget = event.currentTarget;

								instance._setDelivered(currentTarget.hasClass('actionable-container'));

								var container = currentTarget.one('.dockbar-user-notifications-container');

								container.toggleClass('open');

								currentTarget.toggleClass('open');

								var menuOpen = container.hasClass('open');

								if (menuOpen) {
									currentTarget.on(
										'clickoutside',
										function(event) {
											container.removeClass('open');
											currentTarget.removeClass('open');
										}
									);

									if (currentTarget.hasClass('actionable-container')) {
										instance._actionableNotificationsList.render();
									}

									if (currentTarget.hasClass('nonactionable-container')) {
										instance._nonactionableNotificationsList.render();
									}
								}
							},
							'.dockbar-user-notifications'
						);

						A.on(
							'domready',
							function() {
								Liferay.Poller.addListener(instance._portletKey, instance._onPollerUpdate, instance);
							}
						);

						Liferay.on('updateNotificationsCount', instance._getNotificationsCount, instance);
					},

					_getNotificationsCount: function() {
						var instance = this;

						var portletURL = new Liferay.PortletURL.createURL(instance._baseResourceURL);

						portletURL.setResourceId('getNotificationsCount');

						A.io.request(
							portletURL.toString(),
							{
								dataType: 'JSON',
								on: {
									success: function() {
										var response = this.get('responseData');

										if (response) {
											instance._updateDockbarNotificationsCount(response);
										}
									}
								}
							}
						);
					},

					_onPollerUpdate: function(response) {
						var instance = this;

						instance._updateDockbarNotificationsCount(response);
					},

					_setDelivered: function(actionable) {
						var instance = this;

						var portletURL = new Liferay.PortletURL.createURL(instance._baseActionURL);

						portletURL.setParameter('javax.portlet.action', 'setDelivered');

						portletURL.setParameter('actionable', actionable);

						portletURL.setWindowState('normal');

						A.io.request(
							portletURL.toString(),
							{
								on: {
									success: function() {
										instance._getNotificationsCount();
									}
								}
							}
						);
					},

					_updateDockbarNotificationsCount: function(response) {
						var instance = this;

						var timestamp = response.timestamp;

						if (!instance._previousTimestamp || (instance._previousTimestamp < timestamp)) {
							instance._previousTimestamp = timestamp;

							var dockbarUserNotificationsCount = A.one('.dockbar-user-notifications .user-notifications-count');

							if (dockbarUserNotificationsCount) {
								dockbarUserNotificationsCount.toggleClass('alert', (response.newUserNotificationsCount > 0));

								dockbarUserNotificationsCount.setHTML(response.unreadUserNotificationsCount);
							}

							var dockbarActionableUserNotificationsCount = A.one('.dockbar-user-notifications .actionable-user-notifications-count');

							if (dockbarActionableUserNotificationsCount) {
								dockbarActionableUserNotificationsCount.toggleClass('alert', (response.newActionableUserNotificationsCount > 0));
								dockbarActionableUserNotificationsCount.toggleClass('hide', (response.unreadActionableUserNotificationsCount == 0));

								dockbarActionableUserNotificationsCount.setHTML(response.unreadActionableUserNotificationsCount);
							}

							var dockbarNonactionableUserNotificationsCount = A.one('.dockbar-user-notifications .nonactionable-user-notifications-count');

							if (dockbarNonactionableUserNotificationsCount) {
								dockbarNonactionableUserNotificationsCount.toggleClass('alert', (response.newNonactionableUserNotificationsCount > 0));
								dockbarNonactionableUserNotificationsCount.toggleClass('hide', (response.unreadNonactionableUserNotificationsCount == 0));

								dockbarNonactionableUserNotificationsCount.setHTML(response.unreadNonactionableUserNotificationsCount);
							}
						}
					}
				}
			}
		);

		Liferay.DockbarNotifications = DockbarNotifications;
	},
	'',
	{
		requires: ['aui-base', 'aui-io', 'liferay-poller', 'liferay-portlet-base', 'liferay-portlet-url']
	}

);

AUI.add(
	'liferay-plugin-notifications',
	function(A) {
		var Notifications = A.Component.create(
			{
				AUGMENTS: [Liferay.PortletBase],

				EXTENDS: A.Base,

				NAME: 'notifications',

				prototype: {
					initializer: function(config) {
						var instance = this;

						instance._actionableUserNotificationsStart = 0;
						instance._baseRenderURL = config.baseRenderURL;
						instance._namespace = config.namespace;
						instance._nonactionableUserNotificationsStart = 0;
						instance._notificationsList = config.notificationsList;

						instance._notificationsList.render();

						var notificationsConfigurationNode = A.one('.notifications-portlet .user-notifications-container .notifications-configurations');
						var userNotificationsListNode = A.one('.notifications-portlet .user-notifications-container .user-notifications-list');
						var userNotificationsContainerNode = A.one('.notifications-portlet .user-notifications-container');

						var nonactionableUserNotificationsLink = A.one('.notifications-portlet .user-notifications-container .user-notifications-sidebar .nav .nonactionable');

						if (nonactionableUserNotificationsLink) {
							nonactionableUserNotificationsLink.on(
								'click',
								function() {
									var userNotificationsSidebar = A.one('.user-notifications-sidebar');

									if (userNotificationsSidebar) {
										userNotificationsSidebar.all('.nav a').removeClass('selected');
									}

									nonactionableUserNotificationsLink.addClass('selected');

									if (userNotificationsContainerNode) {
										userNotificationsContainerNode.addClass('nonactionable');
										userNotificationsContainerNode.removeClass('actionable');
									}

									notificationsConfigurationNode.hide();
									userNotificationsListNode.show();

									instance._notificationsList.setActionable(false);

									instance._notificationsList.setNotificationsCount('.nonactionable .count');

									instance._actionableUserNotificationsStart = instance._notificationsList.getStart();

									instance._notificationsList.setStart(instance._nonactionableUserNotificationsStart);

									instance._notificationsList.render();
								}
							);
						}

						var actionableUserNotificationsLink = A.one('.notifications-portlet .user-notifications-container .user-notifications-sidebar .nav .actionable');

						if (actionableUserNotificationsLink) {
							actionableUserNotificationsLink.on(
								'click',
								function() {
									var userNotificationsSidebar = A.one('.user-notifications-sidebar');

									if (userNotificationsSidebar) {
										userNotificationsSidebar.all('.nav a').removeClass('selected');
									}

									actionableUserNotificationsLink.addClass('selected');

									if (userNotificationsContainerNode) {
										userNotificationsContainerNode.addClass('actionable');
										userNotificationsContainerNode.removeClass('nonactionable');
									}

									notificationsConfigurationNode.hide();
									userNotificationsListNode.show();

									instance._notificationsList.setActionable(true);

									instance._notificationsList.setNotificationsCount('.actionable .count');

									instance._nonactionableUserNotificationsStart = instance._notificationsList.getStart();

									instance._notificationsList.setStart(instance._actionableUserNotificationsStart);

									instance._notificationsList.render();
								}
							);
						}

						var manageLink = A.one('.notifications-portlet .user-notifications-container .user-notifications-sidebar .nav .manage');

						if (manageLink) {
							manageLink.on(
								'click',
								function() {
									var userNotificationsSidebar = A.one('.user-notifications-sidebar');

									if (userNotificationsSidebar) {
										userNotificationsSidebar.all('.nav a').removeClass('selected');
									}

									manageLink.addClass('selected');

									if (notificationsConfigurationNode) {
										notificationsConfigurationNode.show();
										notificationsConfigurationNode.plug(A.LoadingMask).loadingmask.show();

										userNotificationsListNode.hide();

										var portletURL = new Liferay.PortletURL.createURL(instance._baseRenderURL);

										portletURL.setParameter('mvcPath', '/notifications/configuration.jsp');

										portletURL.setWindowState('exclusive');

										notificationsConfigurationNode.plug(A.Plugin.ParseContent);

										notificationsConfigurationNode.load(
											portletURL.toString(),
											'#' + instance._namespace + 'manageNotifications',
											function() {
												var manageNotificationsNode = notificationsConfigurationNode.one('.manage-notifications');

												if (!manageNotificationsNode) {
													var html = '<div class=\"manage-notifications\">' + Liferay.Language.get('please-sign-in-to-continue') + '</div>';

													notificationsConfigurationNode.setHTML(html);
												}

												notificationsConfigurationNode.unplug(A.LoadingMask);
											}
										);
									}
								}
							);
						}
					}
				}
			}
		);

		Liferay.Notifications = Notifications;
	},
	'',
	{
		requires: ['aui-base', 'aui-io', 'aui-loading-mask-deprecated', 'liferay-portlet-base', 'liferay-portlet-url', 'node-load']
	}

);

AUI.add(
	'liferay-plugin-notifications-list',
	function(A) {
		var Lang = A.Lang;

		var NotificationsList = A.Component.create(
			{
				AUGMENTS: [Liferay.PortletBase],

				EXTENDS: A.Base,

				NAME: 'notificationslist',

				prototype: {
					initializer: function(config) {
						var instance = this;

						instance._actionable = config.actionable;
						instance._baseActionURL = config.baseActionURL;
						instance._baseRenderURL = config.baseRenderURL;
						instance._baseResourceURL = config.baseResourceURL;
						instance._delta = config.delta;
						instance._end = config.start + config.delta;
						instance._fullView = config.fullView;
						instance._namespace = config.namespace;
						instance._nextPageNode = config.nextPageNode;
						instance._markAllAsReadNode = config.markAllAsReadNode;
						instance._notificationsContainer = config.notificationsContainer;
						instance._notificationsCount = config.notificationsCount;
						instance._notificationsNode = config.notificationsNode;
						instance._paginationInfoNode = config.paginationInfoNode;
						instance._portletKey = config.portletKey;
						instance._previousPageNode = config.previousPageNode;
						instance._start = config.start;

						instance._bindUI();
					},

					getStart: function() {
						var instance = this;

						return instance._start;
					},

					render: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var notificationsNode = notificationsContainer.one(instance._notificationsNode);

						notificationsNode.plug(A.LoadingMask);

						notificationsNode.loadingmask.show();

						var portletURL = new Liferay.PortletURL.createURL(instance._baseResourceURL);

						portletURL.setParameter('actionable', instance._actionable);
						portletURL.setParameter('end', instance._end);
						portletURL.setParameter('fullView', instance._fullView);
						portletURL.setParameter('start', instance._start);

						portletURL.setResourceId('getUserNotificationEvents');

						A.io.request(
							portletURL.toString(),
							{
								dataType: 'JSON',
								on: {
									success: function() {
										var response = this.get('responseData');

										if (response) {
											var newTotalUuserNotificationEventsCount = response.newTotalUuserNotificationEventsCount;

											var notificationsCountNode = notificationsContainer.one(instance._notificationsCount);

											if (notificationsCountNode) {
												notificationsCountNode.setHTML(newTotalUuserNotificationEventsCount);
											}

											var entries = [];

											var entriesJSONArray = response.entries;

											if (entriesJSONArray) {
												for (var i = 0; i < entriesJSONArray.length; i++) {
													entries.push(entriesJSONArray[i]);
												}

												entries = entries.join('');
											}

											var markAllAsReadNode = notificationsContainer.one(instance._markAllAsReadNode);

											var markAllAsReadLink;

											if (markAllAsReadNode) {
												markAllAsReadLink = markAllAsReadNode.one('a');
											}

											var hasEntries = (entriesJSONArray.length > 0);

											if (!hasEntries) {
												var message = Liferay.Language.get('you-do-not-have-any-notifications');

												if (instance._actionable) {
													message = Liferay.Language.get('you-do-not-have-any-requests');
												}

												notificationsNode.setHTML('<div class=\"message\">' + message + '</div>');

												if (markAllAsReadLink) {
													markAllAsReadLink.hide();
												}
											}
											else {
												notificationsNode.setHTML(entries);

												var newUserNotificationEventsCount = response.newUserNotificationEventsCount;

												if (markAllAsReadLink) {
													markAllAsReadLink.toggle(!instance._actionable && newUserNotificationEventsCount > 0);
												}
											}

											var nextPageNode = notificationsContainer.all(instance._nextPageNode);
											var previousPageNode = notificationsContainer.all(instance._previousPageNode);

											var total = response.total;

											if (nextPageNode) {
												nextPageNode.toggle(total > instance._end);
											}

											if (previousPageNode) {
												previousPageNode.toggle(instance._start != 0);
											}

											var paginationInfoNode = notificationsContainer.all(instance._paginationInfoNode);

											var displayingCount = instance._end <= total ? instance._end : total;

											var paginationInfoText = Lang.sub(Liferay.Language.get('showing-x-x-of-x-results'), [(instance._start + 1), displayingCount, total]);

											if (paginationInfoNode) {
												if (hasEntries) {
													paginationInfoNode.setHTML(paginationInfoText);
												}

												paginationInfoNode.toggle(hasEntries);
											}

											instance._userNotificationEventIds = response.newUserNotificationEventIds;

											notificationsNode.loadingmask.hide();
										}
									}
								}
							}
						);

						Liferay.fire('updateNotificationsCount');
					},

					setActionable: function(actionable) {
						var instance = this;

						instance._actionable = actionable;
					},

					setNotificationsCount: function(notificationsCount) {
						var instance = this;

						instance._notificationsCount = notificationsCount;
					},

					setStart: function(start) {
						var instance = this;

						instance._start = start;

						instance._end = instance._start + instance._delta;
					},

					_bindIconMenu: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var notificationsNode = notificationsContainer.one(instance._notificationsNode);

						if (notificationsNode) {
							notificationsNode.delegate(
								'click',
								function(event) {
									var currentTarget = event.currentTarget;

									var currentRow = currentTarget.ancestor('.user-notification');

									currentRow.plug(A.LoadingMask);

									currentRow.loadingmask.show();

									var unsubscribeLink = currentRow.one('.user-notification-link .unsubscribe');

									var unsubscribeURL = unsubscribeLink.attr('data-unsubscribeURL');

									if (unsubscribeURL) {
										A.io.request(
											unsubscribeURL,
											{
												after: {
													success: function() {
														var responseData = this.get('responseData');

														if (responseData.success) {
															currentRow.loadingmask.hide();

															instance.render();
														}
														else {
															currentRow.loadingmask.hide();

															instance.render();

															var notificationsNode = notificationsContainer.one(instance._notificationsNode);

															notificationsContainer.insertBefore('<div class="alert alert-danger">' + Liferay.Language.get('there-was-an-unexpected-error.-please-refresh-the-current-page') + '</div>', notificationsNode);
														}
													}
												},
												dataType: 'JSON'
											}
										);
									}
								},
								'.user-notification .unsubscribe'
							);

							notificationsNode.delegate(
								'click',
								function(event) {
									var currentTarget = event.currentTarget;

									var iconMenu = currentTarget.ancestor('.lfr-icon-menu');

									iconMenu.addClass('open');

									if (iconMenu.hasClass('open')) {
										currentTarget.on(
											'clickoutside',
											function(event) {
												currentTarget.ancestor().removeClass('open');
											}
										);
									}
								},
								'.user-notification .dropdown-toggle'
							);
						}
					},

					_bindMarkAllAsRead: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var markAllAsReadNode = notificationsContainer.one(instance._markAllAsReadNode);

						if (markAllAsReadNode) {
							markAllAsReadNode.on(
								'click',
								function(event) {
									event.preventDefault();

									var portletURL = new Liferay.PortletURL.createURL(instance._baseActionURL);

									portletURL.setParameter('javax.portlet.action', 'markAllAsRead');
									portletURL.setParameter('userNotificationEventIds', instance._userNotificationEventIds);

									portletURL.setWindowState('normal');

									A.io.request(
										portletURL.toString(),
										{
											after: {
												success: function() {
													var response = this.get('responseData');

													if (response.success) {
														instance.render();
													}
												}
											},
											dataType: 'JSON'
										}
									);
								}
							);
						}
					},

					_bindMarkAsRead: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var notificationsNode = notificationsContainer.one(instance._notificationsNode);

						if (notificationsNode) {
							notificationsNode.delegate(
								'click',
								function(event) {
									var currentTarget = event.currentTarget;

									var currentRow = currentTarget.ancestor('.user-notification');

									currentRow.plug(A.LoadingMask);

									currentRow.loadingmask.show();

									var userNotificationLink = currentRow.one('.user-notification-link');

									var markAsReadURL = userNotificationLink.attr('data-markAsReadURL');

									if (markAsReadURL) {
										A.io.request(
											markAsReadURL,
											{
												after: {
													success: function() {
														var responseData = this.get('responseData');

														if (responseData.success) {
															currentRow.loadingmask.hide();

															instance.render();
														}
													}
												},
												dataType: 'JSON'
											}
										);
									}
								},
								'.user-notification .mark-as-read'
							);
						}
					},

					_bindNextPageNotifications: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						if (notificationsContainer) {
							notificationsContainer.delegate(
								'click',
								function() {
									instance._start += instance._delta;
									instance._end += instance._delta;

									instance.render();
								},
								instance._nextPageNode
							);
						}
					},

					_bindNotificationsAction: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var notificationsNode = notificationsContainer.one(instance._notificationsNode);

						if (notificationsNode) {
							notificationsNode.delegate(
								'click',
								function(event) {
									event.preventDefault();

									var currentTarget = event.currentTarget;

									var currentRow = currentTarget.ancestor('.user-notification');

									currentRow.plug(A.LoadingMask);

									currentRow.loadingmask.show();

									A.io.request(
										currentTarget.attr('href'),
										{
											after: {
												success: function() {
													var response = this.get('responseData');

													if (response.success) {
														var deleteNode = currentTarget.ancestor('.user-notification-delete');

														if (deleteNode) {
															A.io.request(deleteNode.getAttribute('data-deleteURL'));
														}

														currentRow.loadingmask.hide();

														instance.render();
													}
													else {
														currentRow.loadingmask.hide();
													}
												}
											},
											dataType: 'JSON'
										}
									);
								},
								'.user-notification .btn-action'
							);
						}
					},

					_bindPreviousPageNotifications: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						if (notificationsContainer) {
							notificationsContainer.delegate(
								'click',
								function() {
									instance._start -= instance._delta;
									instance._end -= instance._delta;

									instance.render();
								},
								instance._previousPageNode
							);

						}
					},

					_bindUI: function() {
						var instance = this;

						instance._bindIconMenu();
						instance._bindMarkAllAsRead();
						instance._bindMarkAsRead();
						instance._bindNotificationsAction();
						instance._bindNextPageNotifications();
						instance._bindPreviousPageNotifications();
						instance._bindViewNotification();
					},

					_bindViewNotification: function() {
						var instance = this;

						var notificationsContainer = A.one(instance._notificationsContainer);

						var notificationsNode = notificationsContainer.one(instance._notificationsNode);

						if (notificationsNode) {
							notificationsNode.delegate(
								'click',
								function(event) {
									var currentTarget = event.currentTarget;

									var target = event.target;

									if (target.hasClass('.mark-as-read') || target.ancestor('.mark-as-read') || (target._node.tagName == 'A') || (target.ancestor()._node.tagName == 'A')) {
										return;
									}

									var uri = currentTarget.attr('data-href');

									var markAsReadURL = currentTarget.attr('data-markAsReadURL');

									if (markAsReadURL) {
										A.io.request(
											markAsReadURL,
											{
												after: {
													success: function() {
														var responseData = this.get('responseData');

														if (responseData.success) {
															instance._redirect(uri);
														}
													}
												},
												dataType: 'JSON'
											}
										);
									}
									else {
										instance._redirect(uri);
									}
								},
								'.user-notification .user-notification-link'
							);
						}
					},

					_openWindow: function(uri) {
						return /p_p_state=(maximized|pop_up|exclusive)/.test(uri);
					},

					_redirect: function(uri) {
						var instance = this;

						if (uri) {
							if (instance._openWindow(uri)) {
								Liferay.Util.openWindow(
									{
										id: 'notificationsWindow',
										uri: uri
									}
								);
							}
							else {
								var topWindow = Liferay.Util.getTop();

								topWindow.location.href = uri;
							}
						}
					}
				}
			}
		);

		Liferay.NotificationsList = NotificationsList;
	},
	'',
	{
		requires: ['aui-base', 'aui-io', 'aui-loading-mask-deprecated', 'liferay-poller', 'liferay-portlet-base', 'liferay-portlet-url']
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}
);