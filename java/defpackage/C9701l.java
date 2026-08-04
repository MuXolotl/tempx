package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lٍٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9701l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f19787l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19788l;
    public static final Parcelable.Creator<C9701l> CREATOR = new C1800l(28);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C9701l f19784l = new C9701l(1, 3);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C9701l f19786l = new C9701l(1, 2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C9701l f19785l = new C9701l(1, 1);

    public C9701l(int i, int i2) {
        this.f19788l = i;
        this.f19787l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9701l)) {
            return false;
        }
        C9701l c9701l = (C9701l) obj;
        return this.f19788l == c9701l.f19788l && this.f19787l == c9701l.f19787l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19788l), Integer.valueOf(this.f19787l)});
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        if (f19784l.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (f19786l.equals(this)) {
            str = "P2P_STAR";
        } else {
            str = f19785l.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN";
        }
        StringBuilder sb = new StringBuilder("Strategy(");
        sb.append(str);
        sb.append("){connectionType=");
        sb.append(this.f19788l);
        sb.append(", topology=");
        return AbstractC14814l.remoteconfig(this.f19787l, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f19788l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f19787l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
