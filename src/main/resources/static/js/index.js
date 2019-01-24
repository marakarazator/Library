'use strict'
var app = angular.module("app", ["ngRoute"])
.config(function($routeProvider, $locationProvider) {
	$locationProvider.html5Mode(true);
	$routeProvider
		.when("/", {
			templateUrl: "pages/book.html"
		})
		.when("/books", {
			templateUrl: "pages/books.html"
		})
		.when("/users", {
			templateUrl: "pages/users.html"
		})
		.when("/rents", {
			templateUrl: "pages/rents.html",
		})
		.when("/contact", {
			templateUrl: "pages/contact.html"
		})
//		.otherwise({ redirectTo: "/" });
})
