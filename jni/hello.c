#include<stdio.h>
#include<stdlib.h>
#include<jni.h>

//JNIEnv* env �ǽṹ��JNINativeInterface �Ķ���ָ��, *env��תΪһ��ָ�룬
//JNIEnv�ǽṹ��JNINativeInterface��һ��ָ��
// (*env) -> תΪһ��ָ�룬��->����������, ���ʽṹ���ڵĺ���ָ��
//jobject ���ñ��غ���java����
//c���غ��������淶��Java_����_����_���ط�����
//jstring     (*NewStringUTF)(JNIEnv*, const char*);

jstring Java_com_yanwanfu_jnihello_MainActivity_helloFromC(JNIEnv* env,jobject thiz){
	char* cstr = "hello from c";
	return (*env)->NewStringUTF(env,cstr);
}
