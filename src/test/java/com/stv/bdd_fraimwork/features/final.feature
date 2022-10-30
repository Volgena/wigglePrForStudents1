Screnario:  Bike page
Given	homepage
When	user click on the link  'Bikes' in the footer container
Then	the page with bikes is open
When	the user hovers over the picture with the category bike
Then 	the inscription "show now" appears on the picture
  And user click on the category picture
  Then category page open
  And user press on the button "more filters"
  Then open all filters
  And user press on the button "less filters"
  Then filters hide


