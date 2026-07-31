package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕۙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15906l extends AbstractC9453l {
    public static final Parcelable.Creator<C15906l> CREATOR = new C5422l(18);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9369l f31218l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f31219l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31220l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8495l f31221l;

    public C15906l(String str, int i, C9369l c9369l, C8495l c8495l) {
        this.f31220l = str;
        this.f31219l = i;
        this.f31218l = c9369l;
        this.f31221l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15906l) {
            C15906l c15906l = (C15906l) obj;
            if (AbstractC7236l.amazon(this.f31220l, c15906l.f31220l) && AbstractC7236l.amazon(Integer.valueOf(this.f31219l), Integer.valueOf(c15906l.f31219l)) && AbstractC7236l.amazon(this.f31218l, c15906l.f31218l) && AbstractC7236l.amazon(this.f31221l, c15906l.f31221l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31220l, Integer.valueOf(this.f31219l), this.f31218l, this.f31221l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f31220l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f31219l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f31218l, i);
        AbstractC9968l.remoteconfig(parcel, 4, this.f31221l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
