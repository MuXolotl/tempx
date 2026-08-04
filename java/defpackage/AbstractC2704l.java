package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؔٙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2704l implements Parcelable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Parcelable f5855l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C16159l f5854l = new C16159l();
    public static final Parcelable.Creator<AbstractC2704l> CREATOR = new C11384l(1);

    public AbstractC2704l(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5855l = parcelable == f5854l ? null : parcelable;
        } else {
            C8339l.metrica("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5855l, i);
    }

    public AbstractC2704l() {
        this.f5855l = null;
    }

    public AbstractC2704l(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f5855l = parcelable == null ? f5854l : parcelable;
    }
}
