package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٍۣ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9853l {
    public static final C9676l yandex = new C9676l("UNDEFINED", 2);
    public static final C9676l loadAd = new C9676l("REUSABLE_CLAIMED", 2);

    public static final boolean crashlytics(AbstractC1872l abstractC1872l, InterfaceC12932l interfaceC12932l) throws C1049l {
        try {
            return abstractC1872l.mo1065throw(interfaceC12932l);
        } catch (Throwable th) {
            throw new C1049l(th, abstractC1872l, interfaceC12932l);
        }
    }

    public static final void loadAd(AbstractC1872l abstractC1872l, InterfaceC12932l interfaceC12932l, Runnable runnable) {
        try {
            abstractC1872l.vip(interfaceC12932l, runnable);
        } catch (Throwable th) {
            throw new C1049l(th, abstractC1872l, interfaceC12932l);
        }
    }

    public static final void yandex(InterfaceC14029l interfaceC14029l, Object obj) {
        if (!(interfaceC14029l instanceof C16477l)) {
            interfaceC14029l.subs(obj);
            return;
        }
        C16477l c16477l = (C16477l) interfaceC14029l;
        AbstractC1872l abstractC1872l = c16477l.f32210l;
        AbstractC0283l abstractC0283l = c16477l.f32209l;
        Throwable thYandex = C1171l.yandex(obj);
        Object c2175l = thYandex == null ? obj : new C2175l(thYandex, false);
        if (crashlytics(abstractC1872l, abstractC0283l.metrica())) {
            c16477l.f32211l = c2175l;
            c16477l.f14041l = 1;
            loadAd(abstractC1872l, abstractC0283l.metrica(), c16477l);
            return;
        }
        AbstractC14868l abstractC14868lYandex = AbstractC12706l.yandex();
        if (abstractC14868lYandex.f29099l >= 4294967296L) {
            c16477l.f32211l = c2175l;
            c16477l.f14041l = 1;
            abstractC14868lYandex.m3899l(c16477l);
            return;
        }
        abstractC14868lYandex.m3898l(true);
        try {
            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) abstractC0283l.metrica().mo245l(C1083l.f2996l);
            if (interfaceC7042l == null || interfaceC7042l.mopub()) {
                Object obj2 = c16477l.f32208l;
                InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
                Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932lMetrica, obj2);
                C13887l c13887lRemoteconfig = objLoadAd != AbstractC7999l.yandex ? AbstractC14425l.remoteconfig(abstractC0283l, interfaceC12932lMetrica, objLoadAd) : null;
                try {
                    abstractC0283l.subs(obj);
                    Unit unit = Unit.INSTANCE;
                    if (c13887lRemoteconfig == null || c13887lRemoteconfig.m3796l()) {
                        AbstractC7999l.yandex(interfaceC12932lMetrica, objLoadAd);
                    }
                } catch (Throwable th) {
                    if (c13887lRemoteconfig == null || c13887lRemoteconfig.m3796l()) {
                        AbstractC7999l.yandex(interfaceC12932lMetrica, objLoadAd);
                    }
                    throw th;
                }
            } else {
                c16477l.subs(new C18435l(interfaceC7042l.mo2153default()));
            }
            while (abstractC14868lYandex.m3901l()) {
            }
        } catch (Throwable th2) {
            try {
                c16477l.mopub(th2);
            } finally {
                abstractC14868lYandex.m3900l(true);
            }
        }
    }
}
