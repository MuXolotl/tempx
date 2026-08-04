package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lْؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13084l extends AbstractC9453l {
    public static final Parcelable.Creator<C13084l> CREATOR = new C18485l(15);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f25600l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f25601l;

    public C13084l(boolean z, boolean z2) {
        this.f25601l = z;
        this.f25600l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13084l)) {
            return false;
        }
        C13084l c13084l = (C13084l) obj;
        return this.f25601l == c13084l.f25601l && this.f25600l == c13084l.f25600l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f25601l), Boolean.valueOf(this.f25600l)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UwbConnectivityCapability<S-STS: " + this.f25601l + ", P-STS: " + this.f25600l + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f25601l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f25600l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
