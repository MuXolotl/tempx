package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lٔؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14644l extends AbstractC16531l implements InterfaceC8526l {
    public int admob;
    public boolean amazon;
    public int billing;
    public final C15536l crashlytics;
    public final String loadAd;
    public C7815l mopub;
    public int purchase = -1;
    public final /* synthetic */ ServiceConnectionC2783l subs;
    public final String yandex;

    public C14644l(ServiceConnectionC2783l serviceConnectionC2783l, String str, String str2, C15536l c15536l) {
        this.subs = serviceConnectionC2783l;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = c15536l;
    }

    @Override // defpackage.AbstractC16531l
    public final void admob(int i) {
        this.amazon = false;
        C7815l c7815l = this.mopub;
        if (c7815l != null) {
            int i2 = this.admob;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c7815l.amazon;
            c7815l.amazon = i3 + 1;
            c7815l.loadAd(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void amazon() {
        ServiceConnectionC2783l serviceConnectionC2783l = this.subs;
        serviceConnectionC2783l.f6080l.remove(this);
        crashlytics();
        serviceConnectionC2783l.smaato();
    }

    @Override // defpackage.AbstractC16531l
    public final void billing(int i) {
        C7815l c7815l = this.mopub;
        if (c7815l != null) {
            c7815l.crashlytics(this.admob, i);
        } else {
            this.purchase = i;
            this.billing = 0;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final void crashlytics() {
        C7815l c7815l = this.mopub;
        if (c7815l != null) {
            int i = this.admob;
            int i2 = c7815l.amazon;
            c7815l.amazon = i2 + 1;
            c7815l.loadAd(4, i2, i, null, null);
            this.mopub = null;
            this.admob = 0;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final void loadAd(C7815l c7815l) {
        this.mopub = c7815l;
        int i = c7815l.purchase;
        c7815l.purchase = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.yandex);
        bundle.putString("routeGroupId", this.loadAd);
        bundle.putParcelable("routeControllerOptions", this.crashlytics.yandex);
        int i2 = c7815l.amazon;
        c7815l.amazon = i2 + 1;
        c7815l.loadAd(3, i2, i, null, bundle);
        this.admob = i;
        if (this.amazon) {
            c7815l.yandex(i);
            int i3 = this.purchase;
            if (i3 >= 0) {
                c7815l.crashlytics(this.admob, i3);
                this.purchase = -1;
            }
            int i4 = this.billing;
            if (i4 != 0) {
                c7815l.amazon(this.admob, i4);
                this.billing = 0;
            }
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void mopub() {
        admob(0);
    }

    @Override // defpackage.AbstractC16531l
    public final void purchase() {
        this.amazon = true;
        C7815l c7815l = this.mopub;
        if (c7815l != null) {
            c7815l.yandex(this.admob);
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void subs(int i) {
        C7815l c7815l = this.mopub;
        if (c7815l != null) {
            c7815l.amazon(this.admob, i);
        } else {
            this.billing += i;
        }
    }

    @Override // defpackage.InterfaceC8526l
    public final int yandex() {
        return this.admob;
    }
}
