package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌٍؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9417l extends AbstractC9453l {
    public static final Parcelable.Creator<C9417l> CREATOR = new C5422l(24);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f19265l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f19266l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9417l) {
            C9417l c9417l = (C9417l) obj;
            if (AbstractC7236l.amazon(Integer.valueOf(this.f19266l), Integer.valueOf(c9417l.f19266l)) && AbstractC7236l.amazon(this.f19265l, c9417l.f19265l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19266l), this.f19265l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f19266l;
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(i2);
        AbstractC9968l.vip(parcel, 2, this.f19265l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
