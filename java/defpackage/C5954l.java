package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؘۚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5954l {
    public final InterfaceC9576l Signature;
    public final InterfaceC9576l ad;
    public final InterfaceC9576l adcel;
    public final InterfaceC9576l admob;
    public final InterfaceC9576l ads;
    public final InterfaceC9576l advert;
    public final InterfaceC9576l amazon;
    public final InterfaceC9576l billing;
    public final C5954l crashlytics;
    public final InterfaceC9576l firebase;
    public final InterfaceC9576l isPro;
    public final InterfaceC9576l isVip;
    public final C14785l license;
    public final C7221l loadAd;
    public final InterfaceC9576l metrica;
    public final InterfaceC9576l mopub;
    public final InterfaceC9576l pro;
    public final InterfaceC9576l purchase;
    public final InterfaceC9576l remoteconfig;
    public final InterfaceC9576l signatures;
    public final InterfaceC9576l smaato;
    public final InterfaceC9576l startapp;
    public final InterfaceC9576l subs;
    public final InterfaceC9576l subscription;
    public final InterfaceC9576l tapsense;
    public final InterfaceC9576l vip;
    public final C10975l yandex;

    public C5954l(C10975l c10975l, C7221l c7221l) {
        Object obj = C10969l.f22102l;
        this.crashlytics = this;
        this.yandex = c10975l;
        this.loadAd = c7221l;
        this.amazon = AbstractC11043l.billing(this, 1);
        this.purchase = AbstractC11043l.billing(this, 0);
        this.billing = AbstractC11043l.billing(this, 5);
        int i = 3;
        C14785l c14785l = new C14785l(this, 7, i);
        C10969l c10969l = new C10969l();
        c10969l.f22103l = obj;
        c10969l.f22104l = c14785l;
        this.mopub = c10969l;
        this.admob = AbstractC11043l.billing(this, 8);
        this.subs = AbstractC11043l.billing(this, 9);
        this.isPro = AbstractC11043l.billing(this, 10);
        this.firebase = AbstractC11043l.billing(this, 6);
        this.smaato = AbstractC11043l.billing(this, 12);
        this.remoteconfig = AbstractC11043l.billing(this, 13);
        this.vip = AbstractC11043l.billing(this, 11);
        this.metrica = AbstractC11043l.billing(this, 17);
        this.startapp = AbstractC11043l.billing(this, 16);
        C14785l c14785l2 = new C14785l(this, 18, i);
        C10969l c10969l2 = new C10969l();
        c10969l2.f22103l = obj;
        c10969l2.f22104l = c14785l2;
        this.adcel = c10969l2;
        this.ads = AbstractC11043l.billing(this, 19);
        this.subscription = AbstractC11043l.billing(this, 15);
        this.tapsense = AbstractC11043l.billing(this, 20);
        this.Signature = AbstractC11043l.billing(this, 14);
        this.license = new C14785l(this, 4, i);
        this.pro = AbstractC11043l.billing(this, 3);
        this.ad = AbstractC11043l.billing(this, 2);
        this.advert = AbstractC11043l.billing(this, 21);
        this.isVip = AbstractC11043l.billing(this, 22);
        this.signatures = AbstractC11043l.billing(this, 23);
    }

    public final Context yandex() {
        Context context = ((C3026l) this.yandex.f22121l).yandex;
        AbstractC17943l.yandex(context);
        return context;
    }
}
