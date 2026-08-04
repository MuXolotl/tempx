package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًَٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10325l extends AbstractC2704l {
    public static final Parcelable.Creator<C10325l> CREATOR = new C11384l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f21050l;

    public C10325l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21050l = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21050l ? 1 : 0);
    }
}
