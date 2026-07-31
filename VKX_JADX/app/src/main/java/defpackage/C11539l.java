package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11539l {
    public final C3789l admob;
    public final Size amazon;
    public final ArrayList billing;
    public final C5571l crashlytics = null;
    public C5571l loadAd;
    public final boolean mopub;
    public final int purchase;
    public final C3789l subs;
    public C5571l yandex;

    public C11539l(Size size, int i, ArrayList arrayList, boolean z, C3789l c3789l, C3789l c3789l2) {
        if (size == null) {
            C6541l.subs("Null size");
            throw null;
        }
        this.amazon = size;
        this.purchase = i;
        this.billing = arrayList;
        this.mopub = z;
        this.admob = c3789l;
        this.subs = c3789l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11539l) {
            C11539l c11539l = (C11539l) obj;
            return this.amazon.equals(c11539l.amazon) && this.purchase == c11539l.purchase && this.billing.equals(c11539l.billing) && this.mopub == c11539l.mopub && this.admob == c11539l.admob && this.subs == c11539l.subs;
        }
        return false;
    }

    public final int hashCode() {
        return this.subs.hashCode() ^ ((((((((((this.amazon.hashCode() ^ 1000003) * 1000003) ^ this.purchase) * 1000003) ^ this.billing.hashCode()) * 1000003) ^ (this.mopub ? 1231 : 1237)) * 583896283) ^ this.admob.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.amazon + ", inputFormat=" + this.purchase + ", outputFormats=" + this.billing + ", virtualCamera=" + this.mopub + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.admob + ", errorEdge=" + this.subs + "}";
    }
}
