@B29G6-327 @smoke
Feature: As a user, I should be able to upload files and pictures while sending appreciation.

		#@B29G6-288
		Background: User is on the login page.
		    Given user is on the login page

	#_*User story:*_
	#
	#As a user, I should be able to upload files and pictures while sending appreciation.
	#
	#_*AC:*_
	#
	#User should be able to upload files and pictures.
	#Supported file formats: .pdf, .txt, .jpeg, .png, .docx
	@B29G6-324
	Scenario Outline: US255_TC01 User should be able to upload files and pictures.
		When "<user>" logs in
		    And user clicks the activity stream button
		    And user clicks the More button inside the page
		    And user clicks the Appreciation button
		    And user clicks the Upload File button
		    And user drags the chosen "<file>" into uploading field
	 	    Then user should see the file uploaded in ready to be used
		    Examples:
		      | user        | file                                   |
		      | hr38        | C:\Users\daemo\Desktop\US255\DOCX.docx |
		      | helpdesk52  | C:\Users\daemo\Desktop\US255\TEXT.txt  |
		      | marketing73 | C:\Users\daemo\Desktop\US255\JPEG.jpg  |
		      | hr41        | C:\Users\daemo\Desktop\US255\PDF.pdf   |
		      | helpdesk96  | C:\Users\daemo\Desktop\US255\PNG.png   |	

	#_*User story:*_
	#
	#As a user, I should be able to upload files and pictures while sending appreciation.
	#
	#_*AC:*_
	#
	#User should be able to insert the files and images into the text.
	@B29G6-325
	Scenario Outline: US255_TC02 User should be able to insert the files and images into the text.
		When "<user>" logs in
		    And user clicks the activity stream button
		    And user clicks the More button inside the page
		    And user clicks the Appreciation button
		    And user clicks the Upload File button
		    And user drags the chosen "<file>" into uploading field
		    And user clicks the insert in text button
		    Then user should see the file inserted in the text input field
		    Examples:
		      | user        | file                                   |
		      | hr38        | C:\Users\daemo\Desktop\US255\DOCX.docx |
		      | helpdesk52  | C:\Users\daemo\Desktop\US255\TEXT.txt  |
		      | marketing73 | C:\Users\daemo\Desktop\US255\JPEG.jpg  |
		      | hr41        | C:\Users\daemo\Desktop\US255\PDF.pdf   |
		      | helpdesk96  | C:\Users\daemo\Desktop\US255\PNG.png   |	

	#_*User story:*_
	#
	#As a user, I should be able to upload files and pictures while sending appreciation.
	#
	#_*AC:*_
	#
	#User should be able to remove files and images at any time before sending.
	@B29G6-326
	Scenario Outline: US255_TC03 User should be able to remove files and images at any time before sending.
		When "<user>" logs in
		    And user clicks the activity stream button
		    And user clicks the More button inside the page
		    And user clicks the Appreciation button
		    And user clicks the Upload File button
		    And user drags the chosen "<file>" into uploading field
		    And user clicks the insert in text button
		    And user sees the file inserted in the text input field
		    Then user should be able to remove files and images at any time before sending
		    Examples:
		      | user        | file                                   |
		      | hr38        | C:\Users\daemo\Desktop\US255\DOCX.docx |
		      | helpdesk52  | C:\Users\daemo\Desktop\US255\TEXT.txt  |
		      | marketing73 | C:\Users\daemo\Desktop\US255\JPEG.jpg  |
		      | hr41        | C:\Users\daemo\Desktop\US255\PDF.pdf   |
		      | helpdesk96  | C:\Users\daemo\Desktop\US255\PNG.png   |