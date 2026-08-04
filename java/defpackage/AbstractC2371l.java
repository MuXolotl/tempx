package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: lؔؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2371l {
    public final List admob;
    public final C8259l amazon;
    public final C5565l billing;
    public final String crashlytics;
    public final int loadAd;
    public final C5959l mopub;
    public final C4220l purchase;
    public final Size yandex;

    public AbstractC2371l(Size size, int i, String str, C8259l c8259l, C4220l c4220l, C5565l c5565l, C5959l c5959l, List list) {
        this.yandex = size;
        this.loadAd = i;
        this.crashlytics = str;
        this.amazon = c8259l;
        this.purchase = c4220l;
        this.billing = c5565l;
        this.mopub = c5959l;
        this.admob = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.yandex);
        sb.append(", format=");
        sb.append((Object) C10134l.loadAd(this.loadAd));
        sb.append(", camera=");
        String str = this.crashlytics;
        sb.append((Object) (str == null ? "null" : C10160l.loadAd(str)));
        sb.append(", mirrorMode=");
        sb.append(this.amazon);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.purchase);
        sb.append(", streamUseCase=");
        sb.append(this.billing);
        sb.append(", streamUseHint=");
        sb.append(this.mopub);
        sb.append(", sensorPixelModes=");
        return AbstractC0653l.subscription(sb, this.admob, ')');
    }
}
