package defpackage;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: renamed from: lُؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11102l {
    public static final boolean crashlytics;
    public final byte[] loadAd;
    public final UUID yandex;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        crashlytics = z;
    }

    public C11102l(UUID uuid, byte[] bArr) {
        this.yandex = uuid;
        this.loadAd = bArr;
    }
}
