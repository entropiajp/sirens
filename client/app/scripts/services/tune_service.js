(function () {
  'use strict';

  angular.module('clientApp')
    .factory('Tune', function($resource, API_URL){
      var Resource = $resource(API_URL + '/tunes/:id', {id: '@id'},{
        update: {method: 'PUT'}
      });

      var find = function(id) {
        return Resource.get({id: id}).$promise;
      };

      var save = function(entity) {
        return Resource.save(entity).$promise;
      };

      var update = function(entity) {
        return Resource.update(entity).$promise;
      };

      var query = function() {
        return Resource.query().$promise;
      };

      var findArtists = function() {
        return $resource(API_URL + '/tunes/artists').query();
      };

      var findSources = function() {
        return $resource(API_URL + '/tunes/sources').query();
      };

      var findAllWithCandidates = function(eventId) {
        return $resource(API_URL + '/tunes/with-candidates').query({eventId: eventId}).$promise;
      };

      return {
        find: find,
        save: save,
        update: update,
        query: query,
        findArtists: findArtists,
        findSources: findSources,
        findAllWithCandidates: findAllWithCandidates
      };


    });


})();