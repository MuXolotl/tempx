package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌؙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6350l extends AbstractC9453l {
    public static final Parcelable.Creator<C6350l> CREATOR = new C1800l(24);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f13313l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f13314l;

    public C6350l(String str, String str2) {
        this.f13314l = str;
        this.f13313l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f13314l);
        AbstractC9968l.vip(parcel, 2, this.f13313l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
