package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lِِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14829l extends AbstractC9453l {
    public static final Parcelable.Creator<C14829l> CREATOR = new C5422l(17);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f29026l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f29027l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f29028l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9369l f29029l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f29030l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8495l f29031l;

    public C14829l(String str, int i, byte[] bArr, int i2, C9369l c9369l, C8495l c8495l) {
        this.f29028l = str;
        this.f29027l = i;
        this.f29026l = bArr;
        this.f29030l = i2;
        this.f29029l = c9369l;
        this.f29031l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14829l) {
            C14829l c14829l = (C14829l) obj;
            if (AbstractC7236l.amazon(this.f29028l, c14829l.f29028l) && AbstractC7236l.amazon(Integer.valueOf(this.f29027l), Integer.valueOf(c14829l.f29027l)) && Arrays.equals(this.f29026l, c14829l.f29026l) && AbstractC7236l.amazon(Integer.valueOf(this.f29030l), Integer.valueOf(c14829l.f29030l)) && AbstractC7236l.amazon(this.f29029l, c14829l.f29029l) && AbstractC7236l.amazon(this.f29031l, c14829l.f29031l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29028l, Integer.valueOf(this.f29027l), Integer.valueOf(Arrays.hashCode(this.f29026l)), Integer.valueOf(this.f29030l), this.f29029l, this.f29031l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f29028l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f29027l);
        AbstractC9968l.billing(parcel, 3, this.f29026l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f29030l);
        AbstractC9968l.remoteconfig(parcel, 5, this.f29029l, i);
        AbstractC9968l.remoteconfig(parcel, 6, this.f29031l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
