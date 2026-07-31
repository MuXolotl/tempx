package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: lؚ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7314l {
    public final Range admob;
    public final C15421l amazon;
    public final InterfaceC17944l billing;
    public final Size crashlytics;
    public final int isPro;
    public final int loadAd;
    public final int mopub;
    public final List purchase;
    public final boolean subs;
    public final C2483l yandex;

    public C7314l(C2483l c2483l, int i, Size size, C15421l c15421l, List list, InterfaceC17944l interfaceC17944l, int i2, Range range, boolean z, int i3) {
        this.yandex = c2483l;
        this.loadAd = i;
        if (size == null) {
            C6541l.subs("Null size");
            throw null;
        }
        this.crashlytics = size;
        if (c15421l == null) {
            C6541l.subs("Null dynamicRange");
            throw null;
        }
        this.amazon = c15421l;
        if (list == null) {
            C6541l.subs("Null captureTypes");
            throw null;
        }
        this.purchase = list;
        this.billing = interfaceC17944l;
        this.mopub = i2;
        if (range == null) {
            C6541l.subs("Null targetFrameRate");
            throw null;
        }
        this.admob = range;
        this.subs = z;
        this.isPro = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7314l)) {
            return false;
        }
        C7314l c7314l = (C7314l) obj;
        if (!this.yandex.equals(c7314l.yandex) || this.loadAd != c7314l.loadAd || !this.crashlytics.equals(c7314l.crashlytics) || !this.amazon.equals(c7314l.amazon) || !this.purchase.equals(c7314l.purchase)) {
            return false;
        }
        InterfaceC17944l interfaceC17944l = c7314l.billing;
        InterfaceC17944l interfaceC17944l2 = this.billing;
        if (interfaceC17944l2 == null) {
            if (interfaceC17944l != null) {
                return false;
            }
        } else if (!interfaceC17944l2.equals(interfaceC17944l)) {
            return false;
        }
        return this.mopub == c7314l.mopub && this.admob.equals(c7314l.admob) && this.subs == c7314l.subs && this.isPro == c7314l.isPro;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003;
        InterfaceC17944l interfaceC17944l = this.billing;
        return this.isPro ^ ((((((((iHashCode ^ (interfaceC17944l == null ? 0 : interfaceC17944l.hashCode())) * 1000003) ^ this.mopub) * 1000003) ^ this.admob.hashCode()) * 1000003) ^ (this.subs ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.yandex);
        sb.append(", imageFormat=");
        sb.append(this.loadAd);
        sb.append(", size=");
        sb.append(this.crashlytics);
        sb.append(", dynamicRange=");
        sb.append(this.amazon);
        sb.append(", captureTypes=");
        sb.append(this.purchase);
        sb.append(", implementationOptions=");
        sb.append(this.billing);
        sb.append(", sessionType=");
        sb.append(this.mopub);
        sb.append(", targetFrameRate=");
        sb.append(this.admob);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.subs);
        sb.append(", customMaxFrameRate=");
        return AbstractC14814l.remoteconfig(this.isPro, "}", sb);
    }
}
