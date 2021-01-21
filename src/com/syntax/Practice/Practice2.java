package com.syntax.Practice;

import java.util.*;

public class Practice2 {

//    Bob is a wall painter and he needs your help. You have to write a program that helps Bob
//    calculate how many buckets of paint he needs to buy before going to work. Bob might also
//    have some extra buckets at home. He also knows the area that he can cover with one bucket
//    of paint.
//    Write a method named getBucketCount with 4 parameters. The first parameter should
//    be named width of type double. This parameter represents the width of the wall.
//    The second parameter should be named height of type double. This parameter represents the height of the
//    wall.
//    The third parameter should be named areaPerBucket. This parameter represents the area
//    that can be covered with one bucket of paint.
//    The fourth parameter should be named extraBuckets.
//    This parameter represents the bucket count that Bob has at home.
//    The method needs to return a value
//    of type int that represents the number ofbuckets that Bob needs to buy before going to work.
//    To calculate the bucket count, refer to the notes below.
//    If one of the parameters width, height or
//    areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1
//    to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate the number
//    of buckets and return it.


    //first method
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double bucketToBuy;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            bucketToBuy = -1;
        } else {
            double areaOfWall = width * height;
            bucketToBuy= areaOfWall / areaPerBucket;
            if (bucketToBuy % 2 != 0) {
                bucketToBuy+=1;
            }
            bucketToBuy-= extraBuckets;
        }
        return (int)bucketToBuy;
    }

//    Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
//    Write another overloaded method named getBucketCount with 3 parameters namely width,
//    height, and areaPerBucket (all of type double).
//    This method needs to return a value of type int that represents the number of buckets
//    that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
//    If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to
//    return -1 to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate
//    the number of buckets and return it.


    //second method
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double bucketToBuy;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            bucketToBuy = -1;
        } else {
            double areaOfWall = width * height;
            bucketToBuy = areaOfWall / areaPerBucket;
            if (bucketToBuy % 2 != 0) {
                bucketToBuy+=1;
            }
        }
        return (int) bucketToBuy;
    }
//    In some cases, Bob does not know the width and height of the wall but he knows the area of a wall.
//    He needs you to write another method.
//    Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket(both of type double).
//    The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.
//    To calculate the bucket count, refer to the notes below.
//    If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
//    If all parameters are valid, the method needs to calculate the number of buckets and return it.

    //method 3
    public static int getBucketCount(double area, double areaPerBucket) {
        double bucketToBuy;
        if (area <= 0 || areaPerBucket <= 0) {
            bucketToBuy = -1;
        } else {
            bucketToBuy=area/areaPerBucket;
            if (bucketToBuy % 2 != 0) {
                bucketToBuy+=1;
            }
        }
        return (int)bucketToBuy;
    }




    public static void main(String[] args) {
        System.out.println(Practice2.getBucketCount(2.75, 3.25, 2.5, 1));
        //  Examples of input/output for first method:
        //  *getBucketCount(-3.4, 2.1, 1.5, 2);
        //  → should return -1 since the width parameter is invalid
        //  *getBucketCount(3.4, 2.1, 1.5, 2);
        //  → should return 3 since the wall area is 7.14, a single bucket can cover an
        //  area of 1.5 and Bob has 2 extra buckets home.
        //  *getBucketCount(2.75, 3.25, 2.5, 1);
        //  → should return 3 since the wall area is 8.9375, a single bucket can cover an
        //  area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(Practice2.getBucketCount(7.25, 4.3, 2.35));
        //    Examples of input/output:
        //    *getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameteris invalid
        //    *getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a
        //    single bucket can cover an area of 1.5.
        //    *getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175,
        //    and a single bucket can cover an area of 2.35.
        System.out.println(Practice2.getBucketCount(3.26, 0.75));
//        Examples of input/output:
//        *getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a
//        single bucket can cover an area of 1.5
//        *getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26
//        and a single bucket can cover an area of 2.2.
//        *getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26,
//        and a single bucket can cover an area of 0.75 .
//        Do your best to help Bob.
//        NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert
//        it into an int before returning the value from the methods.

    }

}