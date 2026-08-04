package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lۘ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18534l extends AbstractC5097l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C11362l f36168l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ArrayList f36169l;

    public C18534l(C16016l c16016l, Integer num) {
        C11362l c11362l;
        super(false, 3);
        List list = c16016l.yandex;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C11054l) {
                arrayList.add(obj);
            }
        }
        this.f36169l = arrayList;
        if (num != null) {
            String str = ((C11054l) list.get(num.intValue())).crashlytics;
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (AbstractC8576l.yandex(((C11054l) it.next()).crashlytics, str)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer[] numArr = {Integer.valueOf(i)};
            c11362l = new C11362l();
            c11362l.addAll(AbstractC8669l.m2415super(numArr));
        } else {
            c11362l = new C11362l();
        }
        this.f36168l = c11362l;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(468898952);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Integer num = (Integer) AbstractC16901l.m4217extends(this.f36168l);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-260738739, new C2736l(AbstractC11598l.yandex(num != null ? num.intValue() : 0, 2, c6956l), this, 11), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 20);
        }
    }

    public final void pro(boolean z, String str, InterfaceC6347l interfaceC6347l, Function0 function0, C6956l c6956l, int i) {
        long jLoadAd;
        long j;
        c6956l.m2133new(1519205633);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.billing(str) ? 32 : 16) | (c6956l.billing(interfaceC6347l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function0) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                c6956l.m2123default(-1710077108);
                jLoadAd = C9735l.loadAd(0.25f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1709987952);
                c6956l.startapp(false);
                jLoadAd = C9735l.isPro;
            }
            InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(jLoadAd, null, null, null, c6956l, 0, 14);
            if (z) {
                c6956l.m2123default(-1709839648);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1709768937);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                c6956l.startapp(false);
            }
            long j2 = ((C9735l) AbstractC0703l.yandex(j, null, null, null, c6956l, 0, 14).getValue()).yandex;
            C11090l c11090l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.billing;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(C4346l.f8873l, interfaceC6347l);
            boolean zBilling = c6956l.billing(interfaceC12244lYandex);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C2116l(interfaceC12244lYandex, 8);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13010l.loadAd(str, AbstractC0080l.amazon(AbstractC3605l.remoteconfig(AbstractC9151l.loadAd(AbstractC14289l.isPro(interfaceC17242lCrashlytics, (Function1) objM2132native), false, null, function0, 15), 16.0f, 8.0f), 1.0f), j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c11090l, c6956l, (i2 >> 3) & 14, 0, 131064);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8076l(this, z, str, interfaceC6347l, function0, i, 5);
        }
    }
}
