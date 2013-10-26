!function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
    if (!d.getElementById(id)) {
        js = d.createElement(s);
        js.id = id;
        js.src = p + "://platform.twitter.com/widgets.js";
        fjs.parentNode.insertBefore(js, fjs);

    }
}(document, "script", "twitter-wjs");

function query() {

    $.ajax({
        url: 'https://search.twitter.com/search.json?q=CafeUnoesc',
        dataType: 'jsonp',
        success: function(data) {
            var tweets = $('#tweets');
            var user = $('user');
            user.html('')
            tweets.html('');
            for (res in data['results']) {
                // tweets.append('<div><input type="text" value="' + data['results'][res]['to_user'] + ' ' + data['results'][res]['from_user'] + ' TWITOU: <p>' + data['results'][res]['text'] + '"</imput></div><br />');
                tweets.append('<div>' + data['results'][res]['text'] + ' </div>');
                //tweets.append('<div>  ' + data['results'][res]['from_user'] + ' TWITOU: <p>' + data['results'][res]['text'] + '"</imput></div><br />');

                if (data['results'][res]['text'] === '@CafeUnoesc #ligarCafeteira' && data['results'][res]['from_user'] === 'vaglucas' ||
                        data['results'][res]['from_user'] === 'eliezerb' || data['results'][res]['from_user'] === 'sonambulambo'
                        || data['results'][res]['from_user'] === 'luanrossa') {
                    tweets.append('<div class="alert alert-info">Ganhou café: ' + data['results'][res]['from_user'] + '</div>');
                   tweets.append('<div><input type="hidden" id="user" name="user" value="' + data['results'][res]['from_user'] + '"/></div><br />');
                    user.append(data['results'][res]['text']);


                } else {
                    tweets.append('<div>Não Ganhou café: ' + data['results'][res]['from_user'] + '</div>');

                }
            }

        }



    });
}

function clicar() {

document.getElementById("btn").click();

}