coreServicesModule.service('serviceClientService', function($q, $http){
	"use strict";

	var wrappingServiceName = "serviceClientService";
	var urlBase = "/_ah/api";
    
	this.get = function(isDebug, serviceName, url) {
        var methodName = wrappingServiceName + " - " + serviceName + " - get";

        var fullUrl = urlBase + url;
        var debugString = methodName + ' - ajax - ' + fullUrl;

        var defer = $q.defer();

        $http.get(fullUrl).success(function(data, status, headers, config)
        {
            if (data != null && data != '') {
                defer.resolve(data);
            } else {
                defer.resolve(null);
            }
        }).error(function(data, status, headers, config){
            defer.reject(status);
        });

        return defer.promise;
    }

	this.put = function(isDebug, serviceName, url, data) {
		var methodName = wrappingServiceName + " - " + serviceName + " - put";

        var fullUrl = urlBase + url;
        var debugString = methodName + ' - ajax - ' + fullUrl;

        var defer = $q.defer();        
        
    	$http.post(fullUrl, data).success(function(data, status, headers, config)
    	{
	        if (data != null && data != '') {
	            defer.resolve(data);
	        } else {
	            defer.resolve(null);
	        }
    	}).error(function(data, status, headers, config){
    		defer.reject(status);
    	});        	

        return defer.promise;
	}			
});