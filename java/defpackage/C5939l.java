package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lؘۙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5939l extends AbstractC11653l implements InterfaceC8526l {
    public boolean admob;
    public final String billing;
    public C7815l firebase;
    public int isPro;
    public final C15536l mopub;
    public final /* synthetic */ ServiceConnectionC2783l remoteconfig;
    public int subs = -1;
    public int smaato = -1;

    public C5939l(ServiceConnectionC2783l serviceConnectionC2783l, String str, C15536l c15536l) {
        this.remoteconfig = serviceConnectionC2783l;
        this.billing = str;
        this.mopub = c15536l;
    }

    @Override // defpackage.AbstractC16531l
    public final void admob(int i) {
        this.admob = false;
        C7815l c7815l = this.firebase;
        if (c7815l != null) {
            int i2 = this.smaato;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c7815l.amazon;
            c7815l.amazon = i3 + 1;
            c7815l.loadAd(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void amazon() {
        ServiceConnectionC2783l serviceConnectionC2783l = this.remoteconfig;
        serviceConnectionC2783l.f6080l.remove(this);
        crashlytics();
        serviceConnectionC2783l.smaato();
    }

    @Override // defpackage.AbstractC16531l
    public final void billing(int i) {
        C7815l c7815l = this.firebase;
        if (c7815l != null) {
            c7815l.crashlytics(this.smaato, i);
        } else {
            this.subs = i;
            this.isPro = 0;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final void crashlytics() {
        C7815l c7815l = this.firebase;
        if (c7815l != null) {
            int i = this.smaato;
            int i2 = c7815l.amazon;
            c7815l.amazon = i2 + 1;
            c7815l.loadAd(4, i2, i, null, null);
            this.firebase = null;
            this.smaato = 0;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final void loadAd(C7815l c7815l) {
        C7413l c7413l = new C7413l();
        this.firebase = c7815l;
        int i = c7815l.purchase;
        c7815l.purchase = i + 1;
        int i2 = c7815l.amazon;
        c7815l.amazon = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.billing);
        bundle.putParcelable("routeControllerOptions", this.mopub.yandex);
        c7815l.loadAd(11, i2, i, null, bundle);
        c7815l.admob.put(i2, c7413l);
        this.smaato = i;
        if (this.admob) {
            c7815l.yandex(i);
            int i3 = this.subs;
            if (i3 >= 0) {
                c7815l.crashlytics(this.smaato, i3);
                this.subs = -1;
            }
            int i4 = this.isPro;
            if (i4 != 0) {
                c7815l.amazon(this.smaato, i4);
                this.isPro = 0;
            }
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void mopub() {
        admob(0);
    }

    @Override // defpackage.AbstractC16531l
    public final void purchase() {
        this.admob = true;
        C7815l c7815l = this.firebase;
        if (c7815l != null) {
            c7815l.yandex(this.smaato);
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void subs(int i) {
        C7815l c7815l = this.firebase;
        if (c7815l != null) {
            c7815l.amazon(this.smaato, i);
        } else {
            this.isPro += i;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final int yandex() {
        return this.smaato;
    }
}
