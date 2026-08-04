package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6438l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4240l f13466l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13467l;

    public /* synthetic */ C6438l(C4240l c4240l, int i) {
        this.f13467l = i;
        this.f13466l = c4240l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13467l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 1;
        C4240l c4240l = this.f13466l;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = c4240l.f8676l;
                if (!zBooleanValue) {
                    c4240l.m1508l();
                    C16328l c16328l = c4240l.f8682l;
                    C10178l c10178l = c16328l.yandex;
                    InterfaceC13142l interfaceC13142l = c16328l.loadAd;
                    c10178l.loadAd.yandex().premium();
                    C2566l c2566l = c10178l.loadAd;
                    c2566l.billing(null);
                    c16328l.smaato(c2566l);
                    C10178l.yandex(c10178l, interfaceC13142l, true, 1);
                    c10178l.amazon(true);
                    c4240l.f8682l.yandex();
                } else if (z) {
                    c4240l.m1510l(false);
                }
                AbstractC3700l.admob(c4240l, new C9495l(c4240l, i2));
                return Unit.INSTANCE;
            case 1:
                AbstractC5632l.yandex(c4240l);
                return Unit.INSTANCE;
            case 2:
                C1612l c1612l = new C1612l();
                c4240l.f8685l.loadAd(c1612l);
                c4240l.f8692l = c1612l;
                AbstractC5632l.yandex(c4240l);
                return Unit.INSTANCE;
            case 3:
                C10312l c10312l = c4240l.f8693l;
                long jTapsense = ((C1187l) obj).yandex;
                InterfaceC18212l interfaceC18212lLoadAd = c10312l.loadAd();
                if (interfaceC18212lLoadAd != null && interfaceC18212lLoadAd.mopub()) {
                    jTapsense = interfaceC18212lLoadAd.tapsense(jTapsense);
                }
                int iAmazon = c4240l.f8693l.amazon(jTapsense, true);
                if (iAmazon >= 0) {
                    c4240l.f8682l.isPro(AbstractC2296l.loadAd(iAmazon, iAmazon));
                }
                c4240l.f8681l.isVip(EnumC1826l.f4235l, jTapsense);
                return Unit.INSTANCE;
            case 4:
                c4240l.m1513l();
                c4240l.f8681l.amazon();
                AbstractC5632l.yandex(c4240l);
                return Unit.INSTANCE;
            case 5:
                c4240l.m1513l();
                return Unit.INSTANCE;
            case 6:
                AbstractC10999l.mopub(c4240l.m3914l(), null, 4, new C15352l((EnumC14173l) obj, c4240l, interfaceC14029l, 17), 1);
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj;
                C0327l c0327lCrashlytics = c4240l.f8693l.crashlytics();
                return Boolean.valueOf(c0327lCrashlytics != null ? list.add(c0327lCrashlytics) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c4240l.f8681l.smaato.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
