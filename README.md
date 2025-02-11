Flowchart: https://imgur.com/a/Jzf3Wc1
Video: https://drive.google.com/file/d/1I9jMOJ_sCgtxmd8KVY5pCSoFP2IpeiqN/view?usp=sharing

The main thing that will change about performing this procedure on a website (in cases like ctrl+f) is that there will be a large body of text with various formatting, that will be scraped for certain words by a user, instead of a single unformatted sentence being submitted by a user. The RegEx methods will have to be applied in a much wider scale than just iterating through a list of a pre-set size. I would take the number of words displayed on a webpage, account for as many different formattings as I can, and then run the RegEx through every word on that webpage to determine the frequency of words on that page.

The main challenge was determining the order of events, specifically where the RegEx methods were supposed to go, and I eventually determined that they were supposed to stay entirely within the external method that determines the frequency of a word.
