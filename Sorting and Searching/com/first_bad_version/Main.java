package com.first_bad_version;

public class Main extends VersionControl{

	public static void main(String[] args) {
		int n = 5;
		int result = n, l = 0, r = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(isBadVersion(mid)){
                result = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        System.out.println(result);

	}

}
