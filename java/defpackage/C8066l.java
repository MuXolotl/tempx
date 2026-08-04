package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: renamed from: lً٘ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8066l extends AbstractC9453l {
    public static final Parcelable.Creator<C8066l> CREATOR = new C5422l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Intent f16801l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f16802l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f16803l;

    public C8066l(int i, String str, Intent intent) {
        this.f16803l = i;
        this.f16802l = str;
        this.f16801l = intent;
    }

    public static C8066l billing(Activity activity) {
        return new C8066l(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8066l)) {
            return false;
        }
        C8066l c8066l = (C8066l) obj;
        return this.f16803l == c8066l.f16803l && Objects.equals(this.f16802l, c8066l.f16802l) && Objects.equals(this.f16801l, c8066l.f16801l);
    }

    public final int hashCode() {
        return this.f16803l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f16803l);
        AbstractC9968l.vip(parcel, 2, this.f16802l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f16801l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
