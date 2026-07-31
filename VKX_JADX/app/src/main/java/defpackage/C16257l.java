package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lًؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16257l extends AbstractC9453l {
    public static final Parcelable.Creator<C16257l> CREATOR = new C5422l(22);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f31815l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17484l f31816l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31817l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9369l f31818l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f31819l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8495l f31820l;

    public C16257l(String str, C17484l c17484l, boolean z, int i, C9369l c9369l, C8495l c8495l) {
        this.f31817l = str;
        this.f31816l = c17484l;
        this.f31815l = z;
        this.f31819l = i;
        this.f31818l = c9369l;
        this.f31820l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16257l) {
            C16257l c16257l = (C16257l) obj;
            if (AbstractC7236l.amazon(this.f31817l, c16257l.f31817l) && AbstractC7236l.amazon(this.f31816l, c16257l.f31816l) && AbstractC7236l.amazon(Boolean.valueOf(this.f31815l), Boolean.valueOf(c16257l.f31815l)) && AbstractC7236l.amazon(Integer.valueOf(this.f31819l), Integer.valueOf(c16257l.f31819l)) && AbstractC7236l.amazon(this.f31818l, c16257l.f31818l) && AbstractC7236l.amazon(this.f31820l, c16257l.f31820l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31817l, this.f31816l, Boolean.valueOf(this.f31815l), Integer.valueOf(this.f31819l), this.f31818l, this.f31820l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f31817l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f31816l, i);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f31815l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f31819l);
        AbstractC9968l.remoteconfig(parcel, 5, this.f31818l, i);
        AbstractC9968l.remoteconfig(parcel, 6, this.f31820l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
