package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lٕٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC15733l extends AbstractBinderC5395l {
    public final C18096l billing;
    public final C10834l mopub;

    public BinderC15733l(C18096l c18096l) {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener", 5);
        this.mopub = new C10834l(0);
        this.billing = c18096l;
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final synchronized void m4108l(C11060l c11060l) {
        String str;
        try {
            boolean z = false;
            if (c11060l.f22260l != null && ((str = c11060l.f22258l) == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
                z = true;
            }
            if (!z) {
                this.mopub.add(c11060l.f22258l);
            }
            this.billing.yandex(new C7089l(c11060l, 4));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final synchronized void m4109l(C4031l c4031l) {
        this.mopub.remove(c4031l.f8312l);
        this.billing.yandex(new C7089l(c4031l, 5));
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lّٔ٘ */
    public final boolean mo1423l(Parcel parcel, int i) {
        if (i == 2) {
            C11060l c11060l = (C11060l) AbstractC14866l.yandex(parcel, C11060l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            m4108l(c11060l);
            return true;
        }
        int i2 = 3;
        if (i == 3) {
            C4031l c4031l = (C4031l) AbstractC14866l.yandex(parcel, C4031l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            m4109l(c4031l);
            return true;
        }
        if (i == 4) {
            AbstractC14866l.loadAd(parcel);
            return true;
        }
        if (i != 5) {
            return false;
        }
        C14975l c14975l = (C14975l) AbstractC14866l.yandex(parcel, C14975l.CREATOR);
        AbstractC14866l.loadAd(parcel);
        synchronized (this) {
            this.billing.yandex(new C7089l(c14975l, i2));
        }
        return true;
    }
}
