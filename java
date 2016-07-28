
//Twitter-Button
     !function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');

     //Facebook-Button
     (function(d, s, id) {
          var js, fjs = d.getElementsByTagName(s)[0];
          if (d.getElementById(id)) return;
          js = d.createElement(s); js.id = id;
          js.src = "//connect.facebook.net/de_DE/sdk.js#xfbml=1&version=v2.6";
          fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));



$(document).ready(function(){
	//Smooth Scrolling
	   var $root = $('html, body');
          $('.navbar-nav a').click(function() {
              var href = $.attr(this, 'href');
              $root.animate({
                  scrollTop: $(href).offset().top
              }, 500, function () {
                  window.location.hash = href;
              });
              return false;
          });


          $("#textbox").on("keyup", function() {
                  console.log("keyup happened");
                  var charCount = $("#textbox").val().length;
                  console.log(charCount);
                  $("#char-count").html("Characters: " + charCount);
                  if(charCount > 30){
                    $("#char-count").css("color", "red");
                  } else {
                    $("#char-count").css("color", "white");
                  };
                });


          //Stellar
          $.stellar();

          //Tooltips
         $(function () {
         $("#item1").tooltip();
       });

        $(function () {
          $('[data-toggle="tooltip"]').tooltip();
      });

        //Button

        $("#button").on("click", function() {
 		var comment = $("#textbox").val();
        	console.log(comment);       
        if(comment == ""){
          $("#textbox").css("border-color", "red");
          return false;
        } else {
          $("#labeltextbox").html("This is your comment: " + comment);
          $("#textbox").hide();
          return false; 
              }	
        });

  // work section
  for(var i = 0; i < works.length; ++i) {
    $("#work").append("\
      <div class='col-sm-3 col-md-3'>\
      <a href='" + works[i].link + "' class='work-img'>\
      <img class='img-responsive' src='" + works[i].pic + "'>\
      <span class='info'><p class='proj-title'>_</p>" + works[i].title + "</span>\
      </a>\
      </div>\
    ");

      var images = $("#work img");
      if (i%2 === 0) {
      $(images[i]).css("border-bottom", "2px solid black");  
    } else {
      $(images[i]).css("border-bottom", "2px solid white");
    }};

    $(".work-img").mouseenter(function(){
      $(".info", this).show();
    }).mouseleave(function(){
      $(".info", this).hide();
    });
});


function initMap() {

  var myLatLng = {lat: 47.6586019, lng: 9.4338951};

  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 3,
    center: myLatLng
  });

  var marker = new google.maps.Marker({
    position: myLatLng,
    map: map,
    icon: {
        size: new google.maps.Size(30, 30),
        scaledSize: new google.maps.Size(30, 30),
        url: 'img/logo.png'
    },
    title: 'Arcanaeum Headquarters'
  });

}
