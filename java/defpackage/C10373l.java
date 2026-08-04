package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lَٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10373l extends AbstractC9453l {
    public static final Parcelable.Creator<C10373l> CREATOR = new C1800l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f21169l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f21170l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f21171l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f21172l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10373l) {
            C10373l c10373l = (C10373l) obj;
            if (AbstractC7236l.amazon(Long.valueOf(this.f21171l), Long.valueOf(c10373l.f21171l)) && AbstractC7236l.amazon(Integer.valueOf(this.f21170l), Integer.valueOf(c10373l.f21170l)) && AbstractC7236l.amazon(Long.valueOf(this.f21169l), Long.valueOf(c10373l.f21169l)) && AbstractC7236l.amazon(Long.valueOf(this.f21172l), Long.valueOf(c10373l.f21172l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f21171l), Integer.valueOf(this.f21170l), Long.valueOf(this.f21169l), Long.valueOf(this.f21172l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        long j = this.f21171l;
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.f21170l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.f21169l;
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(j2);
        long j3 = this.f21172l;
        AbstractC9968l.subscription(parcel, 4, 8);
        parcel.writeLong(j3);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
