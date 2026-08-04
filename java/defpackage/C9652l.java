package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٍؙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9652l extends AbstractC9453l {
    public static final Parcelable.Creator<C9652l> CREATOR = new C13546l(22);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f19689l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19690l;

    public C9652l(int i, String str) {
        this.f19690l = i;
        this.f19689l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f19690l);
        AbstractC9968l.vip(parcel, 2, this.f19689l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
