coreServicesModule.service('loggingService', function($log){
	'use strict';
	this.debug = function(isLoggingOn, message)
	{
		if (isLoggingOn){
			$log.debug(message);
		};
	}
	
	this.error = function(message){
		$log.error(message);
	}
});
