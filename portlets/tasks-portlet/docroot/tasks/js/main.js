AUI().use(
	'aui-base',
	'aui-io-plugin-deprecated',
<<<<<<< HEAD
	'liferay-util-window',
=======
	'aui-modal',
	'liferay-util-window',
	'liferay-widget-zindex',
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	function(A) {
		Liferay.namespace('Tasks');

		Liferay.Tasks = {
			init: function(param) {
				var instance = this;

				instance._setupFilter();
				instance._setupTagsPopup();
				instance._setupProgressBar();

				instance._baseActionURL = param.baseActionURL;
				instance._currentTab = param.currentTab;
				instance._namespace = param.namespace;
				instance._taskListURL = param.taskListURL;
			},

			clearFilters: function() {
				var instance = this;

				A.all('.tasks-portlet .asset-tag-filter .asset-tag.selected').toggleClass('selected');

				var groupFilter = A.one('.tasks-portlet .group-filter select');

				if (groupFilter) {
					groupFilter.set('value', 0);
				}

				instance.updateTaskList();
			},

			displayPopup: function(url, title) {
				var instance = this;

				Liferay.Util.openWindow(
					{
						dialog: {
							after: {
								destroy: function(event) {
									instance.updateTaskList();
								}
							},
							centered: true,
							constrain: true,
							cssClass: 'tasks-dialog',
							destroyOnHide: true,
							modal: true,
							plugins: [Liferay.WidgetZIndex],
							width: 800
						},
						id: instance._namespace + 'Dialog',
						title: title,
						uri: url
					}
				);
			},

			initUpcomingTasks: function(param) {
				var instance = this;

<<<<<<< HEAD
				var viewportRegion = A.getBody().get('viewportRegion');

				var popup = instance.getPopup();

				popup.show();

				popup.titleNode.html(title);

				popup.io.set('uri', url);
				popup.io.start();
=======
				instance._upcomingTasksListURL = param.upcomingTasksListURL;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			},

			openTask: function(href, tasksEntryId) {
				var instance = this;

<<<<<<< HEAD
				if (!instance._popup) {
					instance._popup = Liferay.Util.Window.getWindow(
						{
							dialog: {
								align: {
									node: null,
									points: ['tc', 'tc']
								},
								constrain2view: true,
								cssClass: 'tasks-dialog',
								modal: true,
								resizable: false,
								width: 600
							}
						}
					).plug(
						A.Plugin.IO,
						{autoLoad: false}
					).render();
				}

				instance._popup.io.set('form', null);
				instance._popup.io.set('uri', null);
=======
				instance.displayPopup(href, Liferay.Language.get('model.resource.com.liferay.tasks.model.TasksEntry'));
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

				instance._updateViewCount(tasksEntryId);
			},

			toggleCommentForm: function() {
				var comment = A.one('.tasks-dialog .add-comment');

				var control = comment.one('.control');
				var form = comment.one('.form');

				form.toggle();
				control.toggle();
			},

			toggleTasksFilter: function() {
				A.one('.tasks-portlet .filter-wrapper').toggle();
			},

			updateTaskList: function(url, showAll) {
				var instance = this;

				instance._taskList = A.one('.tasks-portlet .list-wrapper');

				if (!instance._taskList) {
					instance._taskList = A.one('.upcoming-tasks-portlet .tasks-entries-container');

					if (!url) {
						url = instance._upcomingTasksListURL;
					}
				}

				if (!instance._taskList.io) {
					instance._taskList.plug(
						A.Plugin.IO,
						{autoLoad: false}
					);
				}

				if (!url) {
					url = instance._taskListURL;

					var data = {};

					if (!showAll) {
<<<<<<< HEAD
						var showAll = A.one('.tasks-portlet input[name="all-tasks"]').get('checked');
=======
						showAll = A.one('.tasks-portlet input[name="all-tasks"]').get('checked');
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					}

					data[instance._namespace + 'assetTagIds'] = instance._getAssetTagIds();
					data[instance._namespace + 'groupId'] = instance._getGroupId();
					data[instance._namespace + 'tabs1'] = instance._currentTab;
					data[instance._namespace + 'tabs2'] = showAll ? 'all' : 'open';

					instance._taskList.io.set('data', data);
				}

				instance._taskList.io.set('uri', url);

				instance._taskList.io.start();
			},

			_getAssetTagIds: function() {
				var assetTagIds = [];

				A.all('.tasks-portlet .asset-tag-filter .asset-tag.selected').each(
					function(assetTag, index, collection) {
						assetTagIds.push(assetTag.attr('data-assetTagId'));
					}
				);

				return assetTagIds.join(',');
			},

			_getGroupId: function() {
				var groupSelect = A.one('.tasks-portlet .group-filter select');

				if (!groupSelect) {
					return 0;
				}

				return groupSelect.get('value');
			},

			_setupFilter: function() {
				var instance = this;

				A.one('.tasks-portlet .asset-tag-filter').delegate(
					'click',
					function(event) {
						var assetTag = event.currentTarget;

						if (assetTag.hasClass('icon-check')) {
							assetTag.removeClass('icon-check');
							assetTag.addClass('icon-check-empty');
						}
						else {
							assetTag.removeClass('icon-check-empty');
							assetTag.addClass('icon-check');
						}

<<<<<<< HEAD
=======
						assetTag.toggleClass('selected');

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
						instance.updateTaskList();
					},
					'.asset-tag'
				);

				A.all('.tasks-portlet .group-filter select').on(
					'change',
					function(event) {
						instance.updateTaskList();
					}
				);
			},

			_setupProgressBar: function() {
				var instance = this;

				var portlet = A.one('.tasks-portlet .list-wrapper');

				portlet.delegate(
					'mouseover',
					function(event) {
						event = event.currentTarget;

						event.one('.current').hide();
						event.one('.progress-picker').show();
					},
					'.progress-wrapper'
				);

				portlet.delegate(
					'mouseout',
					function(event) {
						event = event.currentTarget;

						event.one('.current').show();
						event.one('.progress-picker').hide();
					},
					'.progress-wrapper'
				);

				portlet.delegate(
					'mouseover',
					function(event) {
						event = event.currentTarget;

						var str = event.getAttribute('class');

						var pos = str.substring(str.indexOf('progress-') + 9);

						var completedText = Liferay.Language.get('complete');

						if (pos !== '100') {
							completedText = Liferay.Language.get(pos + '-percent-complete');
						}

						var container = event.ancestor('.progress-wrapper');

						container.one('.new-progress').setStyle('width', pos + '%');
						container.one('.progress-indicator').set('text', completedText);
					},
					'.progress-selector a'
				);

				portlet.delegate(
					'click',
					function(event) {
						event.halt();

						var href = event.currentTarget.getAttribute('href');

						instance.updateTaskList(href);
					},
					'.progress-selector a'
				);
			},

			_setupTagsPopup: function() {
				var container = A.one('.tasks-portlet');

				container.delegate(
					'mouseover',
					function(event) {
						event.currentTarget.one('.tags').show();
					},
					'.tags-wrapper'
				);

				container.delegate(
					'mouseout',
					function(event) {
						event.currentTarget.one('.tags').hide();
					},
					'.tags-wrapper'
				);
			},

			_updateViewCount: function(tasksEntryId) {
				var instance = this;

				var portletURL = new Liferay.PortletURL.createURL(instance._baseActionURL);

				portletURL.setParameter('javax.portlet.action', 'updateTasksEntryViewCount');
				portletURL.setParameter('tasksEntryId', tasksEntryId);
				portletURL.setWindowState('normal');

				A.io.request(portletURL.toString());
			}
		};
	}
);