package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌۢۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9138l extends AbstractC9453l {
    public static final Parcelable.Creator<C9138l> CREATOR = new C15160l(29);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f18787l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f18788l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f18789l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f18790l;

    public C9138l(int i, long j, String str, boolean z) {
        this.f18789l = str;
        this.f18788l = i;
        this.f18787l = j;
        this.f18790l = z;
    }

    public final long billing() {
        long j = this.f18787l;
        return j == -1 ? this.f18788l : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9138l) {
            C9138l c9138l = (C9138l) obj;
            if (AbstractC7236l.amazon(this.f18789l, c9138l.f18789l) && billing() == c9138l.billing() && this.f18790l == c9138l.f18790l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18789l, Long.valueOf(billing()), Boolean.valueOf(this.f18790l)});
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        c13568l.loadAd(this.f18789l, "name");
        c13568l.loadAd(Long.valueOf(billing()), "version");
        c13568l.loadAd(Boolean.valueOf(this.f18790l), "is_fully_rolled_out");
        return c13568l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f18789l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f18788l);
        long jBilling = billing();
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(jBilling);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f18790l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C9138l(long j, String str) {
        this(-1, j, str, false);
    }
}
