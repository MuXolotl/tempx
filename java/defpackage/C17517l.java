package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17517l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f34136l = 0;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C12376l f34137l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f34138l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f34139l;

    public C17517l(String str, Map map) {
        super(false, 3);
        this.f34139l = str;
        this.f34138l = AbstractC8020l.smaato(C11482l.yandex);
        C12376l c12376l = new C12376l();
        c12376l.putAll(map);
        this.f34137l = c12376l;
    }

    public static final void advert(C17517l c17517l, C1820l c1820l, C14718l c14718l) {
        C12376l c12376l = c17517l.f34137l;
        String str = c1820l.yandex;
        Object obj = c12376l.get(str);
        String str2 = c14718l.yandex;
        if (AbstractC8576l.yandex(obj, str2)) {
            c12376l.remove(str);
        } else {
            c12376l.put(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public final void ad(final boolean z, final C14718l c14718l, final Function0 function0, InterfaceC17242l interfaceC17242l, InterfaceC17242l interfaceC17242l2, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l3;
        int i3;
        InterfaceC17242l interfaceC17242l4;
        boolean z2;
        final InterfaceC17242l interfaceC17242l5;
        final InterfaceC17242l interfaceC17242l6;
        C4224l c4224lAds;
        C4346l c4346l;
        InterfaceC17242l interfaceC17242l7;
        c6956l.m2133new(-284046409);
        int i4 = (c6956l.mopub(z) ? 4 : 2) | i | (c6956l.admob(c14718l) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            interfaceC17242l3 = interfaceC17242l;
        } else {
            interfaceC17242l3 = interfaceC17242l;
            i3 = i4 | (c6956l.billing(interfaceC17242l3) ? 2048 : 1024);
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                interfaceC17242l4 = interfaceC17242l2;
                i3 |= c6956l.billing(interfaceC17242l4) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i3 & 1, z2)) {
                c4346l = C4346l.f8873l;
                if (i5 != 0) {
                    interfaceC17242l3 = c4346l;
                }
                if (i6 != 0) {
                    interfaceC17242l7 = c4346l;
                } else {
                    interfaceC17242l7 = interfaceC17242l4;
                }
                AbstractC1544l.amazon(z, function0, AbstractC14566l.amazon(-1439934934, new C10848l(c14718l, interfaceC17242l7, 24), c6956l), interfaceC17242l3, false, null, null, null, null, null, null, new C17253l(8.0f, 8.0f, 8.0f, 8.0f), c6956l, (i3 & 14) | 384 | ((i3 >> 3) & 112) | (i3 & 7168), 384, 12272);
                interfaceC17242l5 = interfaceC17242l7;
            } else {
                c6956l.m2124else();
                interfaceC17242l5 = interfaceC17242l4;
            }
            interfaceC17242l6 = interfaceC17242l3;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٔۨؗ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.f29984l.ad(z, c14718l, function0, interfaceC17242l6, interfaceC17242l5, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 24576;
        interfaceC17242l4 = interfaceC17242l2;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i3 & 1, z2)) {
            c4346l = C4346l.f8873l;
            if (i5 != 0) {
                interfaceC17242l3 = c4346l;
            }
            if (i6 != 0) {
                interfaceC17242l7 = c4346l;
            } else {
                interfaceC17242l7 = interfaceC17242l4;
            }
            AbstractC1544l.amazon(z, function0, AbstractC14566l.amazon(-1439934934, new C10848l(c14718l, interfaceC17242l7, 24), c6956l), interfaceC17242l3, false, null, null, null, null, null, null, new C17253l(8.0f, 8.0f, 8.0f, 8.0f), c6956l, (i3 & 14) | 384 | ((i3 >> 3) & 112) | (i3 & 7168), 384, 12272);
            interfaceC17242l5 = interfaceC17242l7;
        } else {
            c6956l.m2124else();
            interfaceC17242l5 = interfaceC17242l4;
        }
        interfaceC17242l6 = interfaceC17242l3;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٔۨؗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f29984l.ad(z, c14718l, function0, interfaceC17242l6, interfaceC17242l5, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-1654529144);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 7;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8036l(this, (InterfaceC14029l) null, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(2046563661, new C1674l(this, iAdmob, 15), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, i3);
        }
    }

    public final void pro(boolean z, C14718l c14718l, Function0 function0, C6956l c6956l, int i) {
        C14830l c14830l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1961226616);
        int i2 = i | (c6956l2.mopub(z) ? 4 : 2) | (c6956l2.admob(c14718l) ? 32 : 16) | (c6956l2.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C10765l c10765l = new C10765l(c14718l.loadAd);
            c6956l2.m2125final(-1248473602);
            C12349l c12349l = new C12349l(3, null, 2);
            Context context = (Context) c6956l2.isPro(AbstractC1242l.loadAd);
            c6956l2.m2125final(1388713953);
            boolean zBilling = c6956l2.billing(c10765l);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(new C14830l());
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            c6956l2.startapp(false);
            c6956l2.m2125final(1388714244);
            boolean zBilling2 = c6956l2.billing(c10765l) | c6956l2.billing("__LottieInternalDefaultCacheKey__");
            Object objM2132native2 = c6956l2.m2132native();
            if (zBilling2 || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC12832l.purchase(context, c10765l, "__LottieInternalDefaultCacheKey__");
                c6956l2.m2147try(objM2132native2);
            }
            c6956l2.startapp(false);
            AbstractC12311l.purchase(c10765l, "__LottieInternalDefaultCacheKey__", new C12393l(c12349l, context, c10765l, interfaceC8714l, null), c6956l2);
            C14830l c14830l2 = (C14830l) interfaceC8714l.getValue();
            c6956l2.startapp(false);
            c6956l2.m2125final(2024497114);
            c6956l2.m2125final(-610207850);
            Object objM2132native3 = c6956l2.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C8998l();
                c6956l2.m2147try(objM2132native3);
            }
            C8998l c8998l = (C8998l) objM2132native3;
            c6956l2.startapp(false);
            c6956l2.startapp(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zBilling3 = c6956l2.billing(c8998l) | ((i2 & 14) == 4) | c6956l2.billing(c14830l2);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling3 || objM2132native4 == c13863l) {
                c14830l = c14830l2;
                C8122l c8122l = new C8122l(c8998l, z, c14830l, (InterfaceC14029l) null, 8);
                c6956l2.m2147try(c8122l);
                objM2132native4 = c8122l;
            } else {
                c14830l = c14830l2;
            }
            AbstractC12311l.amazon(c6956l2, boolValueOf, (Function2) objM2132native4);
            InterfaceC17242l interfaceC17242lVip = AbstractC0080l.vip(C4346l.f8873l, 76.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3383l.purchase(function0, null, false, null, null, null, null, AbstractC14566l.amazon(20768235, new C3091l(c8998l, c14830l, 7), c6956l2), c6956l2, ((i2 >> 6) & 14) | 100663296, 254);
            AbstractC13010l.loadAd(c14718l.amazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, 0, 24960, 110590);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(this, z, c14718l, function0, i, 9);
        }
    }
}
