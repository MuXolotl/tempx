package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٟؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4668l extends AbstractC9453l {
    public static final Parcelable.Creator<C4668l> CREATOR = new C18485l(18);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f9499l;

    public C4668l(ArrayList arrayList) {
        this.f9499l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4668l) {
            return this.f9499l.equals(((C4668l) obj).f9499l);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (C18275l c18275l : this.f9499l) {
            if (!z) {
                sb.append(", ");
            }
            c18275l.billing(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.ads(parcel, 2, this.f9499l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
