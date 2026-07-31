package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15397l extends AbstractC9453l {
    public static final Parcelable.Creator<C15397l> CREATOR = new C5422l(14);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f30072l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f30073l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f30074l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9369l f30075l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f30076l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8495l f30077l;

    public C15397l(String str, int i, int i2, int i3, C9369l c9369l, C8495l c8495l) {
        this.f30074l = str;
        this.f30073l = i;
        this.f30072l = i2;
        this.f30076l = i3;
        this.f30075l = c9369l;
        this.f30077l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15397l) {
            C15397l c15397l = (C15397l) obj;
            if (AbstractC7236l.amazon(this.f30074l, c15397l.f30074l) && AbstractC7236l.amazon(Integer.valueOf(this.f30073l), Integer.valueOf(c15397l.f30073l)) && AbstractC7236l.amazon(Integer.valueOf(this.f30072l), Integer.valueOf(c15397l.f30072l)) && AbstractC7236l.amazon(Integer.valueOf(this.f30076l), Integer.valueOf(c15397l.f30076l)) && AbstractC7236l.amazon(this.f30075l, c15397l.f30075l) && AbstractC7236l.amazon(this.f30077l, c15397l.f30077l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30074l, Integer.valueOf(this.f30073l), Integer.valueOf(this.f30072l), Integer.valueOf(this.f30076l), this.f30075l, this.f30077l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f30074l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f30073l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f30072l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f30076l);
        AbstractC9968l.remoteconfig(parcel, 5, this.f30075l, i);
        AbstractC9968l.remoteconfig(parcel, 6, this.f30077l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
