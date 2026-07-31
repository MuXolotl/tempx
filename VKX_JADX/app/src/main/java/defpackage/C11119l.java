package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: lُٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11119l implements Parcelable {
    public static final Parcelable.Creator<C11119l> CREATOR = new C17440l(16);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0579l f22330l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f22331l;

    public C11119l(C0579l c0579l, int i) {
        if (TextUtils.isEmpty(c0579l.f1992l)) {
            C8339l.metrica("description must have a non-empty media id");
            throw null;
        }
        this.f22331l = i;
        this.f22330l = c0579l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f22331l + ", mDescription=" + this.f22330l + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22331l);
        this.f22330l.writeToParcel(parcel, i);
    }

    public C11119l(Parcel parcel) {
        this.f22331l = parcel.readInt();
        this.f22330l = C0579l.CREATOR.createFromParcel(parcel);
    }
}
