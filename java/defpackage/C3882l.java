package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lؖؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3882l extends AbstractC9453l {
    public static final Parcelable.Creator<C3882l> CREATOR = new C15160l(8);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8014l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public double f8015l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f8016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public double f8017l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f8018l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C5040l f8019l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C10121l f8020l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3882l)) {
            return false;
        }
        C3882l c3882l = (C3882l) obj;
        if (this.f8017l == c3882l.f8017l && this.f8016l == c3882l.f8016l && this.f8014l == c3882l.f8014l && AbstractC15091l.crashlytics(this.f8019l, c3882l.f8019l) && this.f8018l == c3882l.f8018l) {
            C10121l c10121l = this.f8020l;
            if (AbstractC15091l.crashlytics(c10121l, c10121l) && this.f8015l == c3882l.f8015l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f8017l), Boolean.valueOf(this.f8016l), Integer.valueOf(this.f8014l), this.f8019l, Integer.valueOf(this.f8018l), this.f8020l, Double.valueOf(this.f8015l)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f8017l));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        double d = this.f8017l;
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.f8016l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.f8014l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC9968l.remoteconfig(parcel, 5, this.f8019l, i);
        int i3 = this.f8018l;
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(i3);
        AbstractC9968l.remoteconfig(parcel, 7, this.f8020l, i);
        double d2 = this.f8015l;
        AbstractC9968l.subscription(parcel, 8, 8);
        parcel.writeDouble(d2);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
