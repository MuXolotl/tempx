package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lُۖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11233l extends AbstractC9453l {
    public static final Parcelable.Creator<C11233l> CREATOR = new C5422l(23);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f22604l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10373l f22605l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f22606l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8495l f22607l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C9369l f22608l;

    public C11233l(String str, C10373l c10373l, int i, C9369l c9369l, C8495l c8495l) {
        this.f22606l = str;
        this.f22605l = c10373l;
        this.f22604l = i;
        this.f22608l = c9369l;
        this.f22607l = c8495l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11233l) {
            C11233l c11233l = (C11233l) obj;
            if (AbstractC7236l.amazon(this.f22606l, c11233l.f22606l) && AbstractC7236l.amazon(this.f22605l, c11233l.f22605l) && AbstractC7236l.amazon(Integer.valueOf(this.f22604l), Integer.valueOf(c11233l.f22604l)) && AbstractC7236l.amazon(this.f22608l, c11233l.f22608l) && AbstractC7236l.amazon(this.f22607l, c11233l.f22607l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22606l, this.f22605l, Integer.valueOf(this.f22604l), this.f22608l, this.f22607l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f22606l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f22605l, i);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f22604l);
        AbstractC9968l.remoteconfig(parcel, 4, this.f22608l, i);
        AbstractC9968l.remoteconfig(parcel, 5, this.f22607l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
