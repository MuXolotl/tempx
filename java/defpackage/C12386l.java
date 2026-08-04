package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: lِّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12386l extends AbstractC9453l implements Comparable {
    public static final Parcelable.Creator<C12386l> CREATOR = new C18485l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String[] f24473l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C4153l[] f24474l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f24475l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TreeMap f24476l = new TreeMap();

    public C12386l(int i, C4153l[] c4153lArr, String[] strArr) {
        this.f24475l = i;
        this.f24474l = c4153lArr;
        for (C4153l c4153l : c4153lArr) {
            this.f24476l.put(c4153l.f8522l, c4153l);
        }
        this.f24473l = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f24475l - ((C12386l) obj).f24475l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12386l)) {
            return false;
        }
        C12386l c12386l = (C12386l) obj;
        return this.f24475l == c12386l.f24475l && AbstractC8960l.isPro(this.f24476l, c12386l.f24476l) && Arrays.equals(this.f24473l, c12386l.f24473l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f24475l);
        sb.append(", (");
        Iterator it = this.f24476l.values().iterator();
        while (it.hasNext()) {
            sb.append((C4153l) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f24473l;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f24475l);
        AbstractC9968l.adcel(parcel, 3, this.f24474l, i);
        AbstractC9968l.metrica(parcel, 4, this.f24473l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
