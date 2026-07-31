package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٍؘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5683l extends AbstractC9453l {
    public static final Parcelable.Creator<C5683l> CREATOR = new C1800l(12);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String[] f12076l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f12077l;

    public C5683l(int i, String[] strArr) {
        this.f12077l = i;
        this.f12076l = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f12077l);
        AbstractC9968l.metrica(parcel, 2, this.f12076l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
