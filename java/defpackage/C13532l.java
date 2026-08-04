package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lّْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13532l extends AbstractC9453l {
    public static final Parcelable.Creator<C13532l> CREATOR = new C5422l(10);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f26550l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f26551l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26552l;

    public C13532l(String str, byte[] bArr, ArrayList arrayList) {
        this.f26552l = str;
        this.f26551l = bArr;
        this.f26550l = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13532l)) {
            return false;
        }
        C13532l c13532l = (C13532l) obj;
        return AbstractC7236l.amazon(this.f26552l, c13532l.f26552l) && AbstractC7236l.amazon(this.f26551l, c13532l.f26551l) && AbstractC7236l.amazon(this.f26550l, c13532l.f26550l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26552l, this.f26551l, this.f26550l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f26552l);
        AbstractC9968l.billing(parcel, 2, this.f26551l);
        AbstractC9968l.isPro(parcel, 3, new ArrayList(this.f26550l));
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
