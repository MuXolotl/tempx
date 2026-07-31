package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؖۜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4403l extends AbstractC9453l implements InterfaceC3736l {
    public static final Parcelable.Creator<C4403l> CREATOR = new C10538l(22);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f8926l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f8927l;

    public C4403l(String str, ArrayList arrayList) {
        this.f8927l = arrayList;
        this.f8926l = str;
    }

    @Override // defpackage.InterfaceC3736l
    public final Status amazon() {
        return this.f8926l != null ? Status.f580l : Status.f579l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.startapp(parcel, 1, this.f8927l);
        AbstractC9968l.vip(parcel, 2, this.f8926l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
