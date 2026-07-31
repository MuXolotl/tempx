package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lَؘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10121l extends AbstractC9453l {
    public static final Parcelable.Creator<C10121l> CREATOR = new C15160l(22);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5586l f20630l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5586l f20631l;

    public C10121l(C5586l c5586l, C5586l c5586l2) {
        this.f20631l = c5586l;
        this.f20630l = c5586l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10121l)) {
            return false;
        }
        C10121l c10121l = (C10121l) obj;
        return AbstractC15091l.crashlytics(this.f20631l, c10121l.f20631l) && AbstractC15091l.crashlytics(this.f20630l, c10121l.f20630l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20631l, this.f20630l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 2, this.f20631l, i);
        AbstractC9968l.remoteconfig(parcel, 3, this.f20630l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
