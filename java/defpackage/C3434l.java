package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؕٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3434l extends AbstractC9453l {
    public static final Parcelable.Creator<C3434l> CREATOR = new C13546l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f7297l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f7298l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float[] f7299l;

    public C3434l(float[] fArr, int i, boolean z) {
        this.f7299l = fArr;
        this.f7298l = i;
        this.f7297l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        float[] fArr = this.f7299l;
        if (fArr != null) {
            int iTapsense2 = AbstractC9968l.tapsense(parcel, 1);
            parcel.writeFloatArray(fArr);
            AbstractC9968l.Signature(parcel, iTapsense2);
        }
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f7298l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f7297l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
