package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌؘؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8593l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f17711l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f17712l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f17713l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f17714l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0022l f17710l = new C0022l("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<C8593l> CREATOR = new C13546l(15);

    public C8593l(long j, long j2, boolean z, boolean z2) {
        this.f17713l = Math.max(j, 0L);
        this.f17712l = Math.max(j2, 0L);
        this.f17711l = z;
        this.f17714l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8593l)) {
            return false;
        }
        C8593l c8593l = (C8593l) obj;
        return this.f17713l == c8593l.f17713l && this.f17712l == c8593l.f17712l && this.f17711l == c8593l.f17711l && this.f17714l == c8593l.f17714l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17713l), Long.valueOf(this.f17712l), Boolean.valueOf(this.f17711l), Boolean.valueOf(this.f17714l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f17713l);
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(this.f17712l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f17711l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f17714l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
