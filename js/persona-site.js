$('#sans').dblclick(function (){
    console.log('hello')
    $('body').css({
        "font-family": '"Comic Sans MS", "Comic Sans", cursive',
    })

})
let defaultcolor;
$('#github').hover(function () {
    defaultcolor = $(this).css('background-color');
    $(this).css('background-color', '#b7fefc')
},function (){
        $(this).css('background-color', defaultcolor)
    })

$('#linkdin').hover(function () {
    defaultcolor = $(this).css('background-color');
    $(this).css('background-color', '#b7fefc')
},function (){
    $(this).css('background-color', defaultcolor)
})