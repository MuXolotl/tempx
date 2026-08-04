package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3448l extends AbstractC9453l {
    public static final Parcelable.Creator<C3448l> CREATOR = C17440l.loadAd;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3448l f7322l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f7323l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f7324l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17913l f7325l;

    static {
        C3448l c3448l = new C3448l(null, false);
        c3448l.f7323l = false;
        f7322l = c3448l;
    }

    public C3448l(C17913l c17913l, boolean z) {
        this.f7325l = c17913l;
        this.f7324l = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3448l)) {
            return false;
        }
        C3448l c3448l = (C3448l) obj;
        return AbstractC7236l.amazon(this.f7325l, c3448l.f7325l) && this.f7323l == c3448l.f7323l && this.f7324l == c3448l.f7324l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7325l, Boolean.valueOf(this.f7323l), Boolean.valueOf(this.f7324l)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7325l);
        return AbstractC9361l.ad(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f7323l) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f7325l, i);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f7324l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
