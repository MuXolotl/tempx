package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؑۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0511l {
    public final Object adcel;
    public final Object admob;
    public final Object ads;
    public final Object amazon;
    public final Object billing;
    public final Object crashlytics;
    public final Object firebase;
    public final Object isPro;
    public final Object loadAd;
    public final Object metrica;
    public final Object mopub;
    public final Object purchase;
    public final Object remoteconfig;
    public final Object smaato;
    public final Object startapp;
    public final Object subs;
    public final Object subscription;
    public final Object vip;
    public final Object yandex;

    public C0511l(C5954l c5954l, C10023l c10023l) {
        this.yandex = c10023l;
        int i = 8;
        this.loadAd = C6693l.yandex(new C13698l(c5954l, this, 2, i));
        this.crashlytics = C6693l.yandex(new C13698l(c5954l, this, 1, i));
        this.amazon = C6693l.yandex(new C13698l(c5954l, this, 4, i));
        this.adcel = new C13161l();
        this.ads = new C13161l();
        this.subscription = new C13161l();
        this.purchase = C6693l.yandex(new C13698l(c5954l, this, 9, i));
        C13161l.m3575native((C13161l) this.subscription, C6693l.yandex(new C13698l(c5954l, this, i, i)));
        C13161l.m3575native((C13161l) this.ads, C6693l.yandex(new C13698l(c5954l, this, 7, i)));
        this.billing = C6693l.yandex(new C13698l(c5954l, this, 10, i));
        this.mopub = C6693l.yandex(new C13698l(c5954l, this, 11, i));
        this.admob = C6693l.yandex(new C13698l(c5954l, this, 6, i));
        this.subs = C6693l.yandex(new C13698l(c5954l, this, 5, i));
        C13161l.m3575native((C13161l) this.adcel, C6693l.yandex(new C13698l(c5954l, this, 3, i)));
        this.isPro = C6693l.yandex(new C13698l(c5954l, this, 13, i));
        this.firebase = C6693l.yandex(new C13698l(c5954l, this, 14, i));
        this.smaato = C6693l.yandex(new C13698l(c5954l, this, 12, i));
        this.remoteconfig = C6693l.yandex(new C13698l(c5954l, this, 15, i));
        this.vip = C6693l.yandex(new C13698l(c5954l, this, 17, i));
        this.metrica = C6693l.yandex(new C13698l(c5954l, this, 16, i));
        this.startapp = C6693l.yandex(new C13698l(c5954l, this, 0, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0511l(C16412l c16412l, InterfaceC11865l interfaceC11865l, C1770l c1770l, C10023l c10023l, InterfaceC4182l interfaceC4182l, Iterable iterable, C12014l c12014l, InterfaceC9630l interfaceC9630l, InterfaceC10240l interfaceC10240l, C3429l c3429l, InterfaceC11175l interfaceC11175l, int i) {
        InterfaceC11175l interfaceC11175l2;
        C1461l c1461l = C1461l.f3661l;
        InterfaceC17806l interfaceC17806l = C13772l.f26868l;
        if ((i & 65536) != 0) {
            InterfaceC11175l.loadAd.getClass();
            interfaceC11175l2 = C11900l.loadAd;
        } else {
            interfaceC11175l2 = interfaceC11175l;
        }
        this(c16412l, interfaceC11865l, c1770l, c10023l, interfaceC4182l, InterfaceC9407l.license, c1461l, iterable, c12014l, interfaceC9630l, interfaceC10240l, c3429l, interfaceC11175l2, Collections.singletonList(C8382l.yandex), (i & 524288) != 0 ? C15617l.f30505l : interfaceC17806l);
    }

    public C0511l(C16412l c16412l, InterfaceC11865l interfaceC11865l, InterfaceC12200l interfaceC12200l, InterfaceC0252l interfaceC0252l, InterfaceC4182l interfaceC4182l, InterfaceC9407l interfaceC9407l, InterfaceC10599l interfaceC10599l, Iterable iterable, C12014l c12014l, InterfaceC9630l interfaceC9630l, InterfaceC10240l interfaceC10240l, C3429l c3429l, InterfaceC11175l interfaceC11175l, List list, InterfaceC17806l interfaceC17806l) {
        C17334l c17334l = C17334l.f33657l;
        C7472l c7472l = C7472l.f15450l;
        this.yandex = c16412l;
        this.loadAd = interfaceC11865l;
        this.crashlytics = c17334l;
        this.amazon = interfaceC12200l;
        this.purchase = interfaceC0252l;
        this.billing = interfaceC4182l;
        this.mopub = c7472l;
        this.admob = interfaceC9407l;
        this.subs = interfaceC10599l;
        this.isPro = iterable;
        this.firebase = c12014l;
        this.smaato = C18575l.yandex;
        this.remoteconfig = interfaceC9630l;
        this.vip = interfaceC10240l;
        this.metrica = c3429l;
        this.startapp = interfaceC11175l;
        this.adcel = list;
        this.ads = interfaceC17806l;
        this.subscription = new C1683l(this);
    }
}
