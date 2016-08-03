#include <jni.h>
JNIEXPORT jstring JNICALL

Java_cn_lovexiaov_jnidemo_AtyMain_getMsgFromJni(JNIEnv *env, jobject instance) {

    return (*env)->NewStringUTF(env, "Hello From JNI");
}