package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C12196l;
import defpackage.C13886l;
import defpackage.C17132l;
import defpackage.C18073l;
import defpackage.Ccase;
import defpackage.Cclass;
import defpackage.Cstrictfp;
import defpackage.appmetrica;
import defpackage.remoteconfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes3.dex */
public class GcmSpecUtil {
    private static final Constructor constructor;
    static final Class gcmSpecClass;
    private static final Method iv;
    private static final Method tLen;

    static {
        Method methodExtractMethod;
        Class clsLoadClass = ClassUtil.loadClass(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        gcmSpecClass = clsLoadClass;
        if (clsLoadClass != null) {
            constructor = extractConstructor();
            tLen = extractMethod("getTLen");
            methodExtractMethod = extractMethod("getIV");
        } else {
            methodExtractMethod = null;
            constructor = null;
            tLen = null;
        }
        iv = methodExtractMethod;
    }

    public static remoteconfig extractAeadParameters(final C13886l c13886l, final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            return (remoteconfig) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.3
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return new remoteconfig(c13886l, ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue(), (byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null), null);
                }
            });
        } catch (Exception unused) {
            C18073l.pro("Cannot process GCMParameterSpec.");
            return null;
        }
    }

    private static Constructor extractConstructor() {
        try {
            return (Constructor) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static Cclass extractGcmParameters(final AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return (Cclass) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.4
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    byte[] bArr = (byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null);
                    int iIntValue = ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue() / 8;
                    byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
                    appmetrica appmetricaVar = new appmetrica(2, 0);
                    appmetricaVar.purchase(new C11327l(bArrCrashlytics));
                    if (iIntValue != 12) {
                        appmetricaVar.purchase(Cstrictfp.m4580private(iIntValue));
                    }
                    C11138l c11138l = new C11138l(appmetricaVar);
                    c11138l.f22357l = -1;
                    return Cclass.inmobi(c11138l);
                }
            });
        } catch (Exception unused) {
            C17132l.startapp("Cannot process GCMParameterSpec");
            return null;
        }
    }

    public static AlgorithmParameterSpec extractGcmSpec(Ccase ccase) throws InvalidParameterSpecException {
        try {
            C12196l c12196lVip = C12196l.vip(ccase);
            return (AlgorithmParameterSpec) constructor.newInstance(Integer.valueOf(c12196lVip.f24238l * 8), AbstractC14024l.crashlytics(c12196lVip.f24239l));
        } catch (Exception e) {
            throw new InvalidParameterSpecException(AbstractC12900l.admob(e, new StringBuilder("Construction failed: ")));
        }
    }

    private static Method extractMethod(final String str) {
        try {
            return (Method) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.2
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getDeclaredMethod(str, null);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static boolean gcmSpecExists() {
        return gcmSpecClass != null;
    }

    public static boolean gcmSpecExtractable() {
        return constructor != null;
    }

    public static boolean isGcmSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = gcmSpecClass;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }

    public static boolean isGcmSpec(Class cls) {
        return gcmSpecClass == cls;
    }
}
