String[] arr = new String[1000];                //String array for the whole job description
String str1 = (mEdit.getText().toString());     //Nammal kodukana string
Pattern p = Pattern.compile("[a-zA-Z]+");       //Magic starts
Matcher m1 = p.matcher(str1);
int i=0;
String[] arr1={"Urgent","Important","compelling","critical","crucial","demanding","essential","immediate","imperative","important","indispensable","necessary","persuasive","pressing","serious","vital","weighty"};
int[] arr_1=(5,5,4,5,5,3,3,5,4,3,3,3,1,3,4,4,3)   //Database and athinte priority values
int j=arr1.length;
while (m1.find())
     {
       arr[i]=m1.group();
       i++;
     }
int score=0;
    while (i>=0)
     {
        while(j>=0)
         {
           if(arr[i].equals(arr1[j]))
           {
           score+=arr_1[j];
           }
           j--;
         }
     i--;
     }
int[] scores = new int[1000];    //Scores of all 
        