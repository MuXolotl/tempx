package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lَؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10003l extends AbstractC9453l {
    public static final Parcelable.Creator<C10003l> CREATOR = new C1800l(25);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f20402l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f20403l;

    public C10003l(String str, String str2) {
        this.f20403l = str;
        this.f20402l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f20403l);
        AbstractC9968l.vip(parcel, 2, this.f20402l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
