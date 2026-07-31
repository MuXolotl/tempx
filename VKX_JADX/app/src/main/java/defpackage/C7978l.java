package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7978l {
    public final List amazon;
    public final ArrayList crashlytics;
    public final List loadAd;
    public final AbstractC18041l yandex;

    public C7978l(AbstractC18041l abstractC18041l, List list, ArrayList arrayList, List list2) {
        this.yandex = abstractC18041l;
        this.loadAd = list;
        this.crashlytics = arrayList;
        this.amazon = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7978l)) {
            return false;
        }
        C7978l c7978l = (C7978l) obj;
        return AbstractC8576l.yandex(this.yandex, c7978l.yandex) && this.loadAd.equals(c7978l.loadAd) && this.crashlytics.equals(c7978l.crashlytics) && this.amazon.equals(c7978l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((((this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 961, 31, this.loadAd)) * 31) + 1237) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.yandex);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.loadAd);
        sb.append(", typeParameters=");
        sb.append(this.crashlytics);
        sb.append(", hasStableParameterNames=false, errors=");
        return AbstractC0653l.subscription(sb, this.amazon, ')');
    }
}
