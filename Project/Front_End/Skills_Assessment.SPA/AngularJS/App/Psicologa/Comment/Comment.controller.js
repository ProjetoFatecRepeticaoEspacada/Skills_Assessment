﻿FatecControllers.controller('CommentController',
    ['$scope', '$routeParams', 'PsicologaService', '$log',
        function ($scope, $routeParams, psicologaService, $log) {

            $scope.psicologa;
            // FAZER
 /*           $scope.user = [];
            $scope.userDelete = _userDelete;

            init();

            function init() {
                userList();
            }

            function userList() {
                userService.userList().then(function (data) {
                    if (data.State == 0) {
                        $scope.user = data.Result;
                    }
                    else {
                        toastr.error(data.Message, "Error");
                    }
                });
            }

            function _userDelete(Id) {
                userService.userDelete(Id).then(function (data) {
                    if (data.State == 0) {
                        toastr.success(data.Message);
                        userList();
                    }
                    else {
                        toastr.error(data.Message, "Error");
                    }
                });
            }
    */
        }]);