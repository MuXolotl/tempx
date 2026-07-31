package defpackage;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lَٙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10379l {
    public final boolean amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C14513l loadAd;
    public final boolean purchase;
    public final boolean yandex;

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    public C10379l(boolean z, C14513l c14513l, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z = Build.VERSION.SDK_INT >= 30;
        }
        c14513l = (i2 & 4) != 0 ? new C14513l(0, 1) : c14513l;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = C8409l.crashlytics;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 27) {
                z3 = true;
            } else {
                String str = Build.HARDWARE;
                if (!AbstractC8576l.yandex(str, "samsungexynos7870") && (!AbstractC16648l.license(str, "qcom", true) || i3 > 31)) {
                    Map map2 = C8409l.amazon;
                    String str2 = Build.BRAND;
                    Locale locale = Locale.ROOT;
                    Set set = (Set) map2.get(str2.toLowerCase(locale));
                    if (set == null || !set.contains(Build.MODEL.toLowerCase(locale))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = true;
                }
            }
        } else {
            z3 = true;
        }
        z2 = (i2 & 64) != 0 ? false : z2;
        boolean z4 = (i2 & 128) == 0;
        this.yandex = z;
        this.loadAd = c14513l;
        this.crashlytics = i;
        this.amazon = z3;
        this.purchase = z2;
        this.billing = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10379l)) {
            return false;
        }
        C10379l c10379l = (C10379l) obj;
        return this.yandex == c10379l.yandex && AbstractC8576l.yandex(this.loadAd, c10379l.loadAd) && this.crashlytics == c10379l.crashlytics && this.amazon == c10379l.amazon && this.purchase == c10379l.purchase && this.billing == c10379l.billing;
    }

    public final int hashCode() {
        return ((((((((this.loadAd.hashCode() + ((38347 + (this.yandex ? 1231 : 1237)) * 31)) * 961) + this.crashlytics) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.yandex);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.loadAd);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.crashlytics + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.amazon);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.purchase);
        sb.append(", enableRestartDelays=");
        return AbstractC0653l.tapsense(sb, this.billing, ')');
    }
}
