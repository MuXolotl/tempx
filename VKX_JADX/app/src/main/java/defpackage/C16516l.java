package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖٝٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16516l extends AbstractC9453l {
    public static final Parcelable.Creator<C16516l> CREATOR = new C1800l(26);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f32287l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32288l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f32289l;

    public C16516l(String str, int i, String str2) {
        this.f32289l = str;
        this.f32288l = str2;
        this.f32287l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f32289l);
        AbstractC9968l.vip(parcel, 2, this.f32288l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f32287l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
