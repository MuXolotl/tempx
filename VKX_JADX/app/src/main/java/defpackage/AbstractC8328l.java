package defpackage;

import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًۡۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8328l {
    public static final byte[][] yandex = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public static final byte[] loadAd = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        long j;
        int i = 1;
        long j2 = 72340172838076673L;
        while (true) {
            j = 506097522914230528L;
            if (i > 255) {
                break;
            }
            for (int i2 = 0; i2 < 256; i2 += 8) {
                AbstractC10000l.pro(loadAd(j2, j), yandex[i], i2);
                j += 578721382704613384L;
            }
            j2 += 72340172838076673L;
            i++;
        }
        for (int i3 = 0; i3 < 256; i3 += 8) {
            long jCrashlytics = crashlytics(j);
            long jCrashlytics2 = crashlytics(jCrashlytics);
            long jLoadAd = loadAd(loadAd(jCrashlytics2, jCrashlytics), crashlytics(jCrashlytics2));
            AbstractC10000l.pro(loadAd(jCrashlytics, crashlytics(loadAd(crashlytics(crashlytics(crashlytics(jLoadAd))), jLoadAd))), loadAd, i3);
            j += 578721382704613384L;
        }
    }

    public static long crashlytics(long j) {
        long j2 = j ^ ((j & (-6148914691236517206L)) >>> 1);
        long j3 = (-8608480567731124088L) & j2;
        long j4 = j2 ^ (((((4919131752989213764L & j2) << 1) ^ j3) ^ (j3 >>> 1)) >>> 2);
        long j5 = (-4557430888798830400L) & j4;
        long j6 = j5 >>> 2;
        long j7 = (((3472328296227680304L & j4) << 2) ^ j5) ^ j6;
        long j8 = (-6148914691236517206L) & j7;
        return j4 ^ ((((j8 >>> 1) ^ (((6148914691236517205L & j7) << 1) ^ j8)) ^ j6) >>> 4);
    }

    public static long loadAd(long j, long j2) {
        long jYandex = yandex(j, j2);
        long j3 = 1085102592571150095L & jYandex;
        return (yandex(((j ^ (j << 4)) & (-1085102592571150096L)) ^ ((jYandex & (-1085102592571150096L)) >>> 4), ((j2 ^ (j2 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j3 << 4)) ^ j3;
    }

    public static long yandex(long j, long j2) {
        long j3 = j & j2;
        long j4 = (((((j << 1) & j2) ^ ((j2 << 1) & j)) & (-6148914691236517206L)) ^ j3) ^ ((j3 & (-6148914691236517206L)) >>> 1);
        long j5 = 3689348814741910323L & j4;
        long j6 = ((j ^ (j << 2)) & (-3689348814741910324L)) ^ ((j4 & (-3689348814741910324L)) >>> 2);
        long j7 = ((j2 ^ (j2 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L;
        long j8 = (((j6 << 1) & j7) ^ ((j7 << 1) & j6)) & (-6148914691236517206L);
        long j9 = j6 & j7;
        return ((((j9 & (-6148914691236517206L)) >>> 1) ^ (j9 ^ j8)) ^ (j5 << 2)) ^ j5;
    }
}
