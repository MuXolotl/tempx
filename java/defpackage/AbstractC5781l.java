package defpackage;

import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* JADX INFO: renamed from: lؘٚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5781l {
    public static final void yandex(AudioStreamMix audioStreamMix, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        String str;
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1044099960);
        int i2 = i | (c6956l2.billing(audioStreamMix) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C7537l c7537l = new C7537l(12.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36034l;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 16.0f, 5);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l2, 48);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AudioStreamMix.Link link = audioStreamMix.amazon;
            if (link == null || (str = link.loadAd) == null) {
                str = audioStreamMix.loadAd;
            }
            AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).subscription, c6956l, 0, 0, 130042);
            AbstractC13010l.loadAd(audioStreamMix.crashlytics, null, AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).advert, c6956l, 0, 0, 130042);
            c6956l.startapp(true);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j3 = c6956l.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            C6839l c6839l = AbstractC13106l.billing(c6956l).crashlytics;
            C17253l c17253l = C12719l.yandex;
            AbstractC17457l.loadAd(function0, c4346l, false, c6839l, C12719l.yandex(AbstractC13106l.purchase(c6956l).adcel, AbstractC13106l.purchase(c6956l).license, 0L, 0L, c6956l, 12), null, null, new C17253l(12.0f, 8.0f, 12.0f, 8.0f), C12371l.f24462l, c6956l, ((i2 >> 3) & 14) | 805306416, 356);
            c6956l2 = c6956l;
            if (function1 != null) {
                c6956l2.m2123default(-1897673038);
                AbstractC7470l.billing(function1, null, false, AbstractC12442l.isVip(AbstractC13106l.purchase(c6956l2).adcel, c6956l2), null, AbstractC7497l.yandex(8.0f), C12371l.f24461l, c6956l, ((i2 >> 6) & 14) | 1572864, 22);
                c6956l2 = c6956l;
                z = false;
            } else {
                z = false;
                c6956l2.m2123default(-1900893008);
            }
            c6956l2.startapp(z);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(audioStreamMix, function0, function1, i, 18);
        }
    }
}
