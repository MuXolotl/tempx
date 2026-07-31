package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lُۧؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC11501l extends AbstractBinderC5395l implements InterfaceC12038l, InterfaceC11948l {
    public final C10834l admob;
    public final C18096l billing;
    public final C10834l mopub;

    public BinderC11501l(C18096l c18096l) {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener", 5);
        this.mopub = new C10834l(0);
        this.admob = new C10834l(0);
        this.billing = c18096l;
    }

    @Override // defpackage.InterfaceC12038l
    public final synchronized void amazon() {
        try {
            C10834l c10834l = this.mopub;
            c10834l.getClass();
            C11786l c11786l = new C11786l(c10834l);
            while (c11786l.hasNext()) {
                this.billing.yandex(new C9952l((String) c11786l.next(), 0));
            }
            this.mopub.clear();
            C10834l c10834l2 = this.admob;
            c10834l2.getClass();
            C11786l c11786l2 = new C11786l(c10834l2);
            while (c11786l2.hasNext()) {
                this.billing.yandex(new C9952l((String) c11786l2.next(), 1));
            }
            this.admob.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final synchronized void m3090l(C14151l c14151l) {
        this.mopub.add(c14151l.f27670l);
        this.billing.yandex(new C7089l(c14151l, 0));
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final synchronized void m3091l(C14829l c14829l) {
        try {
            this.mopub.remove(c14829l.f29028l);
            Status statusAppmetrica = C11963l.appmetrica(c14829l.f29027l);
            if (statusAppmetrica.billing()) {
                this.admob.add(c14829l.f29028l);
            }
            this.billing.yandex(new C16200l(c14829l, statusAppmetrica, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lّٔ٘ */
    public final boolean mo1423l(Parcel parcel, int i) {
        if (i == 2) {
            C14151l c14151l = (C14151l) AbstractC14866l.yandex(parcel, C14151l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            m3090l(c14151l);
        } else if (i == 3) {
            C14829l c14829l = (C14829l) AbstractC14866l.yandex(parcel, C14829l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            m3091l(c14829l);
        } else if (i == 4) {
            C15906l c15906l = (C15906l) AbstractC14866l.yandex(parcel, C15906l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            synchronized (this) {
                this.admob.remove(c15906l.f31220l);
                this.billing.yandex(new C7089l(c15906l, 1));
            }
        } else {
            if (i != 5) {
                return false;
            }
            C15397l c15397l = (C15397l) AbstractC14866l.yandex(parcel, C15397l.CREATOR);
            AbstractC14866l.loadAd(parcel);
            this.billing.yandex(new C7089l(c15397l, 2));
        }
        return true;
    }
}
