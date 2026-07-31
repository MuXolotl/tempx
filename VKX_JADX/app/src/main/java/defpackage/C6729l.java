package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙؙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6729l extends AbstractC9453l {
    public static final Parcelable.Creator<C6729l> CREATOR = new C15160l(18);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f14087l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14088l;

    public C6729l(String str, String str2) {
        this.f14088l = str;
        this.f14087l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6729l)) {
            return false;
        }
        C6729l c6729l = (C6729l) obj;
        return AbstractC7236l.amazon(this.f14088l, c6729l.f14088l) && AbstractC7236l.amazon(this.f14087l, c6729l.f14087l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14088l, this.f14087l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f14088l);
        AbstractC9968l.vip(parcel, 2, this.f14087l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
