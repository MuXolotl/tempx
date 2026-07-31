package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؓۤٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2220l extends AbstractC9453l {
    public static final Parcelable.Creator<C2220l> CREATOR = new C10538l(29);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Intent f4901l;

    public C2220l(Intent intent) {
        this.f4901l = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f4901l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
