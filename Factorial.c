#include<stdio.h>
#include"jni.h"
#include"JniApp.h"


JNIEXPORT jint JNICALL Java_JniApp_factorial(JNIEnv *env, jobject obj, jint num)
{
	int fact=1;
	while(num>0)
	{
		fact *= num;
		num--;
	}
	return fact;
}