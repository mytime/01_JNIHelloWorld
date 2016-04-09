#include<stdio.h>
#include<stdlib.h>
#include<jni.h>

//JNIEnv* env 是结构体JNINativeInterface 的二级指针, *env：转为一级指针，
//JNIEnv是结构体JNINativeInterface的一级指针
// (*env) -> 转为一级指针，“->”间接运算符, 访问结构体内的函数指针
//jobject 调用本地函数java对象，
//c本地函数命名规范：Java_包名_类名_本地方法名
//jstring     (*NewStringUTF)(JNIEnv*, const char*);

jstring Java_com_yanwanfu_jnihello_MainActivity_helloFromC(JNIEnv* env,jobject thiz){
	char* cstr = "hello from c";
	return (*env)->NewStringUTF(env,cstr);
}
