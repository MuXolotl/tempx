package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.AbstractC13766l;
import defpackage.AbstractC7236l;
import defpackage.AbstractC9453l;
import defpackage.AbstractC9968l;
import defpackage.C10602l;
import defpackage.C13568l;
import defpackage.C5422l;
import defpackage.InterfaceC3736l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class Status extends AbstractC9453l implements InterfaceC3736l, ReflectedParcelable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final PendingIntent f582l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f583l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f584l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10602l f585l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Status f580l = new Status(0, null, null, null);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Status f581l = new Status(15, null, null, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Status f579l = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C5422l(9);

    public Status(int i, String str, PendingIntent pendingIntent, C10602l c10602l) {
        this.f584l = i;
        this.f583l = str;
        this.f582l = pendingIntent;
        this.f585l = c10602l;
    }

    public final boolean billing() {
        return this.f584l <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f584l == status.f584l && AbstractC7236l.amazon(this.f583l, status.f583l) && AbstractC7236l.amazon(this.f582l, status.f582l) && AbstractC7236l.amazon(this.f585l, status.f585l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f584l), this.f583l, this.f582l, this.f585l});
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        String strBilling = this.f583l;
        if (strBilling == null) {
            strBilling = AbstractC13766l.billing(this.f584l);
        }
        c13568l.loadAd(strBilling, "statusCode");
        c13568l.loadAd(this.f582l, "resolution");
        return c13568l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f584l);
        AbstractC9968l.vip(parcel, 2, this.f583l);
        AbstractC9968l.remoteconfig(parcel, 3, this.f582l, i);
        AbstractC9968l.remoteconfig(parcel, 4, this.f585l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    @Override // defpackage.InterfaceC3736l
    public final Status amazon() {
        return this;
    }
}
