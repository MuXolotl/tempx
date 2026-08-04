package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٌۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18631l extends AbstractC9453l implements InterfaceC3736l {
    public static final Parcelable.Creator<C18631l> CREATOR = new C10538l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Intent f36406l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f36407l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f36408l;

    public C18631l(int i, int i2, Intent intent) {
        this.f36408l = i;
        this.f36407l = i2;
        this.f36406l = intent;
    }

    @Override // defpackage.InterfaceC3736l
    public final Status amazon() {
        return this.f36407l == 0 ? Status.f580l : Status.f579l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f36408l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f36407l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f36406l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
