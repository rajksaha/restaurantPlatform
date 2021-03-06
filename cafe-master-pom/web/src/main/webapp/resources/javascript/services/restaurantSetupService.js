app.service('RestaurantSetupService', function ($resource) {
    return {

        getAll : $resource('rest/restaurant/getAll', {}, {
            'query':  {
                method:'GET',
                isArray:true
            }
        }),
        getRestaurantByID : $resource('rest/restaurant/getRestaurantByID/cafeID/:cafeID', {}, {
            'query':  {
                method:'GET',
                params: {cafeID : '@cafeID'},
                isArray:false
            }
        }),
        save: $resource('rest/restaurant/save', {}, {
            'query': {
                method: 'POST'
            }
        }),

        update : $resource('rest/restaurant/update', {}, {
            'query': {
                method  : 'POST',
                isArray : false
            }
        })
    };
});