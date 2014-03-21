#include<stdio.h>
#include"jni.h"
#include"Calcu.h"

JNIEXPORT jint JNICALL Java_Calcu_suma(JNIEnv *env, jobject obj, jint num1, jint num2)
{
	int resultado;
	resultado = num1 + num2;
	return resultado;
}

JNIEXPORT jint JNICALL Java_Calcu_resta(JNIEnv *env, jobject obj, jint num1, jint num2)
{
	int resultado;
	resultado = num1 - num2;
	return resultado;
}
  
JNIEXPORT jint JNICALL Java_Calcu_multi(JNIEnv *env, jobject obj, jint num1, jint num2)
{
	int resultado;
	resultado = num1 * num2;
	return resultado;
}
  
JNIEXPORT jdouble JNICALL Java_Calcu_divi(JNIEnv *env, jobject obj, jint num1, jint num2)
{
	double resultado;
	resultado = num1 / num2;
	return resultado;
}