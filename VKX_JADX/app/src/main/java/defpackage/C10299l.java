package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10299l extends AbstractC5097l {

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f20979l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f20980l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C2980l f20981l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C2558l f20982l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C8256l f20983l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f20984l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f20985l;

    public C10299l(String str, C8256l c8256l, C2558l c2558l) {
        super(false, 1);
        this.f20984l = str;
        this.f20983l = c8256l;
        this.f20982l = c2558l;
        this.f20981l = new C2980l(VKXApplication.f36625l, new C3359l(this, 0), new C3359l(this, 1));
        this.f20985l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1716523384);
        int i2 = (c6956l2.admob(this) ? 4 : 2) | i;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Map mapSingletonMap = Collections.singletonMap("X-Requested-With", "com.vkontakte.android");
            int i3 = AbstractC17981l.yandex;
            Object objM2132native = c6956l2.m2132native();
            String str = this.f20984l;
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C6576l(new C6033l(str, mapSingletonMap));
                c6956l2.m2147try(objM2132native);
            }
            C6576l c6576l = (C6576l) objM2132native;
            c6576l.loadAd.setValue(new C6033l(str, mapSingletonMap));
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
            C18196l c18196l = (C18196l) c6956l2.isPro(AbstractC4751l.subscription);
            C10086l c10086l = this.f20985l;
            Boolean bool = (Boolean) c10086l.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) this.f20981l.purchase.getValue();
            bool2.getClass();
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAdmob || objM2132native3 == c13863l) {
                objM2132native3 = new C5163l(this, interfaceC8714l, null, 25);
                c6956l2.m2147try(objM2132native3);
            }
            AbstractC12311l.purchase(bool, bool2, (Function2) objM2132native3, c6956l2);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), ((Boolean) c10086l.getValue()).booleanValue() ? 1.0f : 0.0f);
            Object objM2132native4 = c6956l2.m2132native();
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C7363l(this);
                c6956l2.m2147try(objM2132native4);
            }
            C7363l c7363l = (C7363l) objM2132native4;
            boolean zAdmob2 = c6956l2.admob(this);
            Object objM2132native5 = c6956l2.m2132native();
            if (zAdmob2 || objM2132native5 == c13863l) {
                objM2132native5 = new C3359l(this, 2);
                c6956l2.m2147try(objM2132native5);
            }
            AbstractC17981l.yandex(c6576l, interfaceC17242lYandex, false, null, (Function1) objM2132native5, null, c7363l, null, c6956l2, 0);
            boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
            C16170l c16170l = C16170l.yandex;
            if (zBooleanValue) {
                z = false;
                c6956l2.m2123default(-463615360);
            } else {
                c6956l2.m2123default(-459103837);
                AbstractC8960l.loadAd(c16170l.yandex(c4346l, C18450l.f36043l), 0L, null, c6956l2, 0, 6);
                z = false;
            }
            c6956l2.startapp(z);
            AbstractC3308l.amazon(((Boolean) interfaceC8714l.getValue()).booleanValue(), c16170l.yandex(AbstractC2697l.subscription(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), AbstractC2697l.amazon), C18450l.f36017l), null, null, null, AbstractC14566l.amazon(-1819114646, new C1350l(8, c18196l), c6956l2), c6956l, 196608, 28);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(this, i, 11);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        if (this.f20980l) {
            return;
        }
        this.f20983l.invoke();
    }
}
