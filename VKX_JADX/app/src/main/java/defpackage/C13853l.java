package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٓؐ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13853l extends AbstractC9453l {
    public static final Parcelable.Creator<C13853l> CREATOR = new C15160l(27);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f27090l;

    public C13853l(String str) {
        this.f27090l = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13853l) {
            return AbstractC15091l.crashlytics(this.f27090l, ((C13853l) obj).f27090l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27090l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f27090l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
