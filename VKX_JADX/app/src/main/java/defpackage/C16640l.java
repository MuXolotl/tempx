package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖۛۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16640l extends AbstractC9453l {
    public static final Parcelable.Creator<C16640l> CREATOR = new C5422l(7);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32615l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f32616l;

    public C16640l(String str, String str2) {
        this.f32616l = str;
        this.f32615l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16640l)) {
            return false;
        }
        C16640l c16640l = (C16640l) obj;
        return AbstractC15091l.crashlytics(this.f32616l, c16640l.f32616l) && AbstractC15091l.crashlytics(this.f32615l, c16640l.f32615l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32616l, this.f32615l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f32616l);
        AbstractC9968l.vip(parcel, 3, this.f32615l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
