package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lَْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13604l implements Parcelable {
    public static final Parcelable.Creator<C13604l> CREATOR = new C17440l(7);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f26632l;

    public C13604l(int i) {
        this.f26632l = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13604l) && this.f26632l == ((C13604l) obj).f26632l;
    }

    public final int hashCode() {
        return this.f26632l;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("DefaultLazyKey(index=", this.f26632l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26632l);
    }
}
