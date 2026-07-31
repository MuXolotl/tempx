package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.isPro;

/* JADX INFO: renamed from: lؙِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6625l extends AbstractC2704l {
    public static final Parcelable.Creator<C6625l> CREATOR = new C9499l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Parcelable f13864l;

    public C6625l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13864l = parcel.readParcelable(classLoader == null ? isPro.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13864l, 0);
    }
}
