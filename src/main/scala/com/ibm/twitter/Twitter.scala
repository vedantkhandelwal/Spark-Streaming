package com.ibm.twitter
//import spark.implicits._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter._
import org.apache.spark.streaming.StreamingContext._
import org.apache.log4j.Level
import Utilities._


object Twitter {
  

 
  def main(a:String,b:String,c:String,d:String,e:String): Unit = {
    val aa : String = a
  val bb : String = b
  val cc : String = c
  val dd : String = d
  val ee : String = e
   System.setProperty("hadoop.home.dir", "E:/bin");
    println(aa)
    println(bb)
    println(cc)
    println(dd)
    println(ee)
    
    // Configure Twitter credentials using twitter.txt
    setupTwitter()
    
    // Set up a Spark streaming context named "PrintTweets" that runs locally using
    // all CPU cores and one-second batches of data
    val ssc = new StreamingContext("local[*]", "PrintTweets", Seconds(1))
    
    // Get rid of log spam (should be called after the context is set up)
    setupLogging()

    // Create a DStream from Twitter using our streaming context
    val tweets = TwitterUtils.createStream(ssc,None)
    
    // Now extract the text of each status update into RDD's using map()
  //  val statuses = tweets.map(status => status.getText())
    // Print out the first ten
      //val statuses = tweets.flatMap(_.split(" ")).map(status => (status, 1)).reduceByKey(_+_)
    val statuses    = tweets.flatMap(tweet => tweet.getText.split(" ")).filter(_.startsWith(aa))
    statuses.print()
    
    statuses.saveAsTextFiles("C:\\t\\twitterdata");
    
    // Kick it all off
    ssc.start()
    ssc.awaitTermination()
    
    
  }
  def text(a:String,b:String,c:String,d:String,e:String): Unit = {
 val aa : String = a
  val bb : String = b
  val cc : String = c
  val dd : String = d
  val ee : String = e
    
  
  }
  
  
}
