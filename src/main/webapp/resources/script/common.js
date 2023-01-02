/**
 * 
 */
$(document).on('click', '.mainlogo', function(e){
    e.preventDefault();  
  $(this).css('background-color', 'gold');
   $('.mainlogo').not($(this)).css('background-color', '#fff');
})