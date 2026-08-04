package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًًٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8074l extends AbstractC9453l {
    public static final Parcelable.Creator<C8074l> CREATOR = new C10538l(24);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16785l f16838l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10602l f16839l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f16840l;

    public C8074l(int i, C10602l c10602l, C16785l c16785l) {
        this.f16840l = i;
        this.f16839l = c10602l;
        this.f16838l = c16785l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f16840l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f16839l, i);
        AbstractC9968l.remoteconfig(parcel, 3, this.f16838l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
