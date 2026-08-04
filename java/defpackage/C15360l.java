package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕؐٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15360l extends AbstractC9453l {
    public static final Parcelable.Creator<C15360l> CREATOR = new C15160l(15);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f30036l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f30037l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15360l)) {
            return false;
        }
        C15360l c15360l = (C15360l) obj;
        return this.f30037l == c15360l.f30037l && AbstractC7236l.amazon(Boolean.valueOf(this.f30036l), Boolean.valueOf(c15360l.f30036l));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30037l), Boolean.valueOf(this.f30036l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f30037l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.f30036l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
