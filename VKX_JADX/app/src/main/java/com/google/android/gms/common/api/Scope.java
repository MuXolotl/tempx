package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC1051l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C5422l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends AbstractC9453l implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C5422l(2);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f578l;

    public Scope(int i, String str) {
        AbstractC1051l.mopub(str, "scopeUri must not be null or empty");
        this.f578l = i;
        this.f577l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f577l.equals(((Scope) obj).f577l);
    }

    public final int hashCode() {
        return this.f577l.hashCode();
    }

    public final String toString() {
        return this.f577l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f578l);
        AbstractC9968l.vip(parcel, 2, this.f577l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
