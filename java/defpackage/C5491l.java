package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5491l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17284l f11745l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11746l;

    public /* synthetic */ C5491l(C17284l c17284l) {
        this.f11746l = 1;
        this.f11745l = c17284l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11746l;
        C17284l c17284l = this.f11745l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c17284l.m4294import((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.cache_migration_header);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, AbstractC7039l.isPro(14), null, null, null, AbstractC7039l.subs(2.5d), null, 0L, 0, false, 0, 0, null, c6956l, 100687872, 0, 261866);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 4.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_migration_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 131070);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 12.0f));
                    String strPurchase2 = AbstractC11999l.purchase(c6956l, R.string.cache_migration_start);
                    long j2 = ((C14370l) c6956l.isPro(c10707l)).yandex.yandex;
                    C11090l c11090l = ((C14370l) c6956l.isPro(c10707l)).loadAd.remoteconfig;
                    C17284l c17284l2 = this.f11745l;
                    boolean zAdmob = c6956l.admob(c17284l2);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C5735l(0, c17284l2, C17284l.class, "dispatchAssetMigration", "dispatchAssetMigration()V", 0, 0, 27);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd(strPurchase2, AbstractC9151l.loadAd(c4346l, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c11090l, c6956l, 0, 0, 131064);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c17284l.m4293finally((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                c17284l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                ((Integer) obj2).getClass();
                c17284l.m4297this((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5491l(C17284l c17284l, int i, int i2) {
        this.f11746l = i2;
        this.f11745l = c17284l;
    }
}
