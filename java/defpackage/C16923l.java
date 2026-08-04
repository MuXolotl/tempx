package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٗؗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16923l extends AbstractC9453l {
    public static final Parcelable.Creator<C16923l> CREATOR = new C1800l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f33005l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33006l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f33007l;

    public C16923l(String str, int i, String str2) {
        this.f33007l = str;
        this.f33006l = i;
        this.f33005l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f33007l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f33006l);
        AbstractC9968l.vip(parcel, 4, this.f33005l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
