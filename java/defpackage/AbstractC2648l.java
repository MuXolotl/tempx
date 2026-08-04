package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;

/* JADX INFO: renamed from: lٍٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2648l {
    public static C5197l yandex;

    public static final C5197l amazon() {
        C5197l c5197l = yandex;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(18.3f, 5.71f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.amazon(12.0f, 10.59f);
        c15659l.amazon(7.11f, 5.7f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.amazon(10.59f, 12.0f);
        c15659l.amazon(5.7f, 16.89f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.amazon(12.0f, 13.41f);
        c15659l.purchase(4.89f, 4.89f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.amazon(13.41f, 12.0f);
        c15659l.purchase(4.89f, -4.89f);
        c15659l.loadAd(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        yandex = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static Method crashlytics(Class cls, Class... clsArr) throws NoSuchMethodException {
        Method declaredMethod = null;
        while (cls != null) {
            try {
                declaredMethod = cls.getDeclaredMethod("get", clsArr);
            } catch (NoSuchMethodException unused) {
            }
            cls = cls.getSuperclass();
        }
        if (declaredMethod == null) {
            throw new NoSuchMethodException("methodName == get");
        }
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, InterfaceC2901l interfaceC2901l, InterfaceC14371l interfaceC14371l, EnumC7283l enumC7283l, boolean z) {
        return interfaceC17242l.premium(new C18342l(interfaceC2901l, interfaceC14371l, enumC7283l, z));
    }

    public static final void yandex(Catalog2Banner catalog2Banner, Function0 function0, C6956l c6956l, int i) {
        int i2;
        Function0 function1 = function0;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1665376595);
        if ((i & 6) == 0) {
            i2 = i | (c6956l2.admob(catalog2Banner) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 4.0f, 5);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i4 = (int) ((j >>> 32) ^ j);
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
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            String str = catalog2Banner.billing;
            if (str == null) {
                str = "";
            }
            AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).billing, c6956l, 0, 0, 131066);
            String str2 = catalog2Banner.purchase;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC13010l.loadAd(str2, null, AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 0, 0, 131066);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 12.0f));
            C6839l c6839l = AbstractC13106l.billing(c6956l).crashlytics;
            C17253l c17253l = C12719l.yandex;
            c6956l2 = c6956l;
            function1 = function0;
            AbstractC17457l.loadAd(function1, c4346l, false, c6839l, C12719l.yandex(AbstractC13106l.purchase(c6956l).adcel, AbstractC13106l.purchase(c6956l).license, 0L, 0L, c6956l, 12), null, null, new C17253l(12.0f, 8.0f, 12.0f, 8.0f), AbstractC7799l.yandex, c6956l2, ((i3 >> 3) & 14) | 805306416, 356);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(catalog2Banner, function1, i, 25);
        }
    }

    public abstract String loadAd();
}
