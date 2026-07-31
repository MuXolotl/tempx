package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: lٕۣۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16021l extends AbstractC9453l implements Iterable {
    public static final Parcelable.Creator<C16021l> CREATOR = new C13546l(4);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Bundle f31403l;

    public C16021l(Bundle bundle) {
        this.f31403l = bundle;
    }

    public final String admob() {
        return this.f31403l.getString("currency");
    }

    public final Object billing(String str) {
        return this.f31403l.get(str);
    }

    public final Bundle firebase() {
        return new Bundle(this.f31403l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C14572l(this);
    }

    public final Double mopub() {
        return Double.valueOf(this.f31403l.getDouble("value"));
    }

    public final String toString() {
        return this.f31403l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.purchase(parcel, 2, firebase());
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
