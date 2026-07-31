package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘَِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5586l extends AbstractC9453l {
    public static final Parcelable.Creator<C5586l> CREATOR = new C15160l(19);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f11863l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f11864l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f11865l;

    public C5586l(float f, float f2, float f3) {
        this.f11865l = f;
        this.f11864l = f2;
        this.f11863l = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5586l)) {
            return false;
        }
        C5586l c5586l = (C5586l) obj;
        return this.f11865l == c5586l.f11865l && this.f11864l == c5586l.f11864l && this.f11863l == c5586l.f11863l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11865l), Float.valueOf(this.f11864l), Float.valueOf(this.f11863l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeFloat(this.f11865l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeFloat(this.f11864l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeFloat(this.f11863l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
