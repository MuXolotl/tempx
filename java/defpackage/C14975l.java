package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔٙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14975l extends AbstractC9453l {
    public static final Parcelable.Creator<C14975l> CREATOR = new C5422l(19);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2243l f29474l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f29475l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f29476l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8495l f29477l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f29478l;

    public C14975l(String str, int i, C2243l c2243l, int i2, C8495l c8495l) {
        this.f29476l = str;
        this.f29475l = i;
        this.f29474l = c2243l;
        this.f29478l = i2;
        this.f29477l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14975l) {
            C14975l c14975l = (C14975l) obj;
            if (AbstractC7236l.amazon(this.f29476l, c14975l.f29476l) && AbstractC7236l.amazon(Integer.valueOf(this.f29475l), Integer.valueOf(c14975l.f29475l)) && AbstractC7236l.amazon(this.f29474l, c14975l.f29474l) && AbstractC7236l.amazon(Integer.valueOf(this.f29478l), Integer.valueOf(c14975l.f29478l)) && AbstractC7236l.amazon(this.f29477l, c14975l.f29477l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29476l, Integer.valueOf(this.f29475l), this.f29474l, Integer.valueOf(this.f29478l), this.f29477l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f29476l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f29475l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f29474l, i);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f29478l);
        AbstractC9968l.remoteconfig(parcel, 5, this.f29477l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
