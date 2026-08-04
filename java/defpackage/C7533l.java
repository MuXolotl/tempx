package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؚٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7533l extends AbstractC9453l implements Comparable {
    public static final Parcelable.Creator<C7533l> CREATOR = new C18485l(19);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f15537l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f15538l;

    public C7533l(int i, int i2) {
        this.f15538l = i;
        this.f15537l = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7533l c7533l = (C7533l) obj;
        int i = c7533l.f15538l;
        int i2 = this.f15538l;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c7533l.f15537l;
        int i4 = this.f15537l;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (defpackage.C7533l) r3).f15538l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f15537l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C7533l
            if (r0 == 0) goto L1c
            lؚٜۜ r3 = (defpackage.C7533l) r3
            int r0 = r3.f15538l
            int r1 = r2.f15538l
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f15537l
            int r2 = r2.f15537l
            if (r2 >= r3) goto L17
            goto L1c
        L17:
            if (r2 <= r3) goto L1a
            goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7533l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f15538l * 31) + this.f15537l;
    }

    public final String toString() {
        int i = this.f15538l;
        int length = String.valueOf(i).length();
        int i2 = this.f15537l;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f15538l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f15537l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
