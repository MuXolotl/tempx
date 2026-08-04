package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4047l {
    public static final C17150l crashlytics;
    public static final C17150l loadAd;
    public static final C17150l yandex = new C17150l(1000);

    static {
        new C17150l(1007);
        loadAd = new C17150l(1008);
        crashlytics = new C17150l(1002);
    }

    public static C2462l admob(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C2462l(new C15621l(AbstractC11965l.remoteconfig(configuration))) : C2462l.yandex(configuration.locale);
    }

    public static byte[][] amazon(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        C6541l.subs("in has null pointers");
        return null;
    }

    public static Object billing(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        String str;
        C9001l c9001l = new C9001l(cls, new ByteArrayInputStream(bArr));
        Object object = c9001l.readObject();
        if (c9001l.available() != 0) {
            str = "unexpected data found at end of ObjectInputStream";
        } else {
            if (cls.isInstance(object)) {
                return object;
            }
            str = "unexpected class found in ObjectInputStream";
        }
        C18262l.metrica(str);
        return null;
    }

    public static byte[] crashlytics(byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("in == null");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static boolean firebase(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        C8339l.smaato("index must not be negative");
        return false;
    }

    public static final void isPro(InterfaceC7150l interfaceC7150l) {
        AbstractC5573l.metrica(interfaceC7150l).m1395synchronized();
    }

    public static long loadAd(int i, byte[] bArr) {
        long j = 0;
        if (bArr == null) {
            C6541l.subs("in == null");
            return 0L;
        }
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public static byte[] mopub(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("src == null");
            return null;
        }
        if (i < 0) {
            C8339l.metrica("offset hast to be >= 0");
            return null;
        }
        if (i2 < 0) {
            C8339l.metrica("length hast to be >= 0");
            return null;
        }
        if (i + i2 > bArr.length) {
            C8339l.metrica("offset + length must not be greater then size of source array");
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static void purchase(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null) {
            C6541l.subs("src == null");
            return;
        }
        if (i < 0) {
            C8339l.metrica("offset hast to be >= 0");
            return;
        }
        if (bArr2.length + i > bArr.length) {
            C8339l.metrica("src length + offset must not be greater than size of destination");
            return;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void remoteconfig(InterfaceC7150l interfaceC7150l, Function1 function1) {
        AbstractC18026l abstractC18026l;
        if (((AbstractC14971l) interfaceC7150l).f29454l.f29462l && (abstractC18026l = AbstractC5573l.smaato(interfaceC7150l, 2).f35271l) != null) {
            abstractC18026l.m4486l(function1, true);
        }
    }

    public static byte[] smaato(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static final void subs(InterfaceC7150l interfaceC7150l) {
        AbstractC5573l.smaato(interfaceC7150l, 2).m4495l();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float yandex(AbstractC9601l abstractC9601l, boolean z, C3384l[] c3384lArr, float f) {
        float f2 = Float.NaN;
        for (C3384l c3384l : c3384lArr) {
            float fCrashlytics = abstractC9601l.crashlytics(c3384l);
            if (Float.isNaN(f2)) {
                f2 = fCrashlytics;
            } else if (z == (fCrashlytics > f2)) {
                f2 = fCrashlytics;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
