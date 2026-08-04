package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٕ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17945l implements Comparable, Parcelable {
    public static final Parcelable.Creator<C17945l> CREATOR = new C10538l(10);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String f34921l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final String f34922l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final String f34923l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f34924l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34925l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34926l;

    static {
        String str = AbstractC15323l.yandex;
        f34922l = Integer.toString(0, 36);
        f34921l = Integer.toString(1, 36);
        f34923l = Integer.toString(2, 36);
    }

    public C17945l(Parcel parcel) {
        this.f34926l = parcel.readInt();
        this.f34925l = parcel.readInt();
        this.f34924l = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17945l c17945l = (C17945l) obj;
        int i = this.f34926l - c17945l.f34926l;
        return (i == 0 && (i = this.f34925l - c17945l.f34925l) == 0) ? this.f34924l - c17945l.f34924l : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17945l.class == obj.getClass()) {
            C17945l c17945l = (C17945l) obj;
            if (this.f34926l == c17945l.f34926l && this.f34925l == c17945l.f34925l && this.f34924l == c17945l.f34924l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f34926l * 31) + this.f34925l) * 31) + this.f34924l;
    }

    public final String toString() {
        return this.f34926l + "." + this.f34925l + "." + this.f34924l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34926l);
        parcel.writeInt(this.f34925l);
        parcel.writeInt(this.f34924l);
    }

    public C17945l(int i, int i2, int i3) {
        this.f34926l = i;
        this.f34925l = i2;
        this.f34924l = i3;
    }
}
