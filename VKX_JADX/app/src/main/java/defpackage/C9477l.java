package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9477l {
    public InterfaceC0476l adcel;
    public InterfaceC3525l admob;
    public int ads;
    public InterfaceC3710l amazon;
    public boolean billing;
    public Object crashlytics;
    public InterfaceC12932l firebase;
    public InterfaceC12932l isPro;
    public C4865l loadAd;
    public Function1 metrica;
    public Map mopub;
    public String purchase;
    public C1791l remoteconfig;
    public int smaato;
    public final Function1 startapp;
    public InterfaceC12932l subs;
    public int subscription;
    public Object tapsense;
    public Function1 vip;
    public final Context yandex;

    public C9477l(C7819l c7819l, Context context) {
        this.yandex = context;
        this.loadAd = c7819l.pro;
        this.crashlytics = c7819l.loadAd;
        this.amazon = c7819l.crashlytics;
        this.purchase = c7819l.amazon;
        this.mopub = c7819l.purchase;
        C7934l c7934l = c7819l.license;
        this.admob = c7819l.mopub;
        this.subs = c7934l.yandex;
        this.isPro = c7934l.loadAd;
        this.firebase = c7934l.crashlytics;
        this.smaato = c7934l.amazon;
        this.remoteconfig = c7819l.vip;
        this.vip = c7934l.purchase;
        this.metrica = c7934l.billing;
        this.startapp = c7934l.mopub;
        this.adcel = c7934l.admob;
        this.ads = c7934l.subs;
        this.subscription = c7934l.isPro;
        this.tapsense = c7819l.Signature;
    }

    public final void crashlytics(int i) {
        AbstractC12704l.yandex(i);
        C12881l c12881l = new C12881l(i);
        AbstractC12704l.yandex(i);
        this.adcel = new C18347l(new C9192l(c12881l, new C12881l(i)));
    }

    public final C13767l loadAd() {
        Object obj = this.tapsense;
        if (obj instanceof C13767l) {
            return (C13767l) obj;
        }
        if (!(obj instanceof C3548l)) {
            C11586l.yandex();
            return null;
        }
        C13767l c13767l = new C13767l((C3548l) obj);
        this.tapsense = c13767l;
        return c13767l;
    }

    public final C7819l yandex() {
        C3548l c3548l;
        Object obj = this.crashlytics;
        if (obj == null) {
            obj = C17126l.yandex;
        }
        Object obj2 = obj;
        InterfaceC3710l interfaceC3710l = this.amazon;
        String str = this.purchase;
        Map mapSubs = this.mopub;
        if (AbstractC8576l.yandex(mapSubs, Boolean.valueOf(this.billing))) {
            mapSubs = AbstractC18296l.subs(AbstractC9464l.loadAd(mapSubs));
        } else if (!AbstractC2812l.advert(mapSubs)) {
            C11586l.yandex();
            return null;
        }
        Map map = mapSubs;
        C4865l c4865l = this.loadAd;
        AbstractC5921l abstractC5921l = c4865l.yandex;
        InterfaceC3525l interfaceC3525l = this.admob;
        int i = this.smaato;
        if (i == 0) {
            i = c4865l.purchase;
        }
        int i2 = i;
        int i3 = c4865l.billing;
        int i4 = c4865l.mopub;
        InterfaceC12932l interfaceC12932l = this.subs;
        if (interfaceC12932l == null) {
            interfaceC12932l = c4865l.loadAd;
        }
        InterfaceC12932l interfaceC12932l2 = interfaceC12932l;
        InterfaceC12932l interfaceC12932l3 = this.isPro;
        if (interfaceC12932l3 == null) {
            interfaceC12932l3 = c4865l.crashlytics;
        }
        InterfaceC12932l interfaceC12932l4 = interfaceC12932l3;
        InterfaceC12932l interfaceC12932l5 = this.firebase;
        if (interfaceC12932l5 == null) {
            interfaceC12932l5 = c4865l.amazon;
        }
        InterfaceC12932l interfaceC12932l6 = interfaceC12932l5;
        C1791l c1791l = this.remoteconfig;
        Function1 function1 = this.vip;
        if (function1 == null) {
            function1 = c4865l.admob;
        }
        Function1 function2 = function1;
        Function1 function3 = this.metrica;
        if (function3 == null) {
            function3 = c4865l.subs;
        }
        Function1 function4 = function3;
        Function1 function5 = this.startapp;
        if (function5 == null) {
            function5 = c4865l.isPro;
        }
        Function1 function6 = function5;
        InterfaceC0476l interfaceC0476l = this.adcel;
        if (interfaceC0476l == null) {
            interfaceC0476l = c4865l.firebase;
        }
        InterfaceC0476l interfaceC0476l2 = interfaceC0476l;
        int i5 = this.ads;
        if (i5 == 0) {
            i5 = c4865l.smaato;
        }
        int i6 = i5;
        int i7 = this.subscription;
        if (i7 == 0) {
            i7 = c4865l.remoteconfig;
        }
        int i8 = i7;
        Object obj3 = this.tapsense;
        if (obj3 instanceof C13767l) {
            c3548l = new C3548l(AbstractC18296l.subs(((C13767l) obj3).yandex));
        } else {
            if (!(obj3 instanceof C3548l)) {
                C11586l.yandex();
                return null;
            }
            c3548l = (C3548l) obj3;
        }
        C3548l c3548l2 = c3548l;
        InterfaceC12932l interfaceC12932l7 = this.subs;
        InterfaceC12932l interfaceC12932l8 = this.isPro;
        InterfaceC12932l interfaceC12932l9 = this.firebase;
        Function1 function7 = this.vip;
        Function1 function8 = this.metrica;
        return new C7819l(this.yandex, obj2, interfaceC3710l, str, map, abstractC5921l, interfaceC3525l, interfaceC12932l2, interfaceC12932l4, interfaceC12932l6, i2, i3, i4, c1791l, function2, function4, function6, interfaceC0476l2, i6, i8, c3548l2, new C7934l(interfaceC12932l7, interfaceC12932l8, interfaceC12932l9, this.smaato, function7, function8, this.startapp, this.adcel, this.ads, this.subscription), this.loadAd);
    }

    public C9477l(Context context) {
        this.yandex = context;
        this.loadAd = C4865l.metrica;
        this.crashlytics = null;
        this.amazon = null;
        this.purchase = null;
        this.mopub = C14054l.f27396l;
        this.admob = null;
        this.subs = null;
        this.isPro = null;
        this.firebase = null;
        this.smaato = 0;
        this.remoteconfig = null;
        C12844l c12844l = C12844l.f25251l;
        this.vip = c12844l;
        this.metrica = c12844l;
        this.startapp = c12844l;
        this.adcel = null;
        this.ads = 0;
        this.subscription = 0;
        this.tapsense = C3548l.loadAd;
    }
}
