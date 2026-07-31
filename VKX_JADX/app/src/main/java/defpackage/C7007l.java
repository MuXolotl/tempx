package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7007l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0442l f14696l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13640l f14697l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14698l;

    public /* synthetic */ C7007l(C13640l c13640l, EnumC0442l enumC0442l, int i) {
        this.f14698l = i;
        this.f14697l = c13640l;
        this.f14696l = enumC0442l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14698l;
        C4346l c4346l = C4346l.f8873l;
        EnumC0442l enumC0442l = this.f14696l;
        C13640l c13640l = this.f14697l;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(AbstractC14566l.amazon(1493671012, new C7007l(c13640l, enumC0442l, i2), c6956l), AbstractC4927l.amazon(c4346l, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, AbstractC16837l.yandex), null, null, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), AbstractC0831l.amazon(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, 0L, 0L, c6956l, 30), null, null, c6956l, 6, 412);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    Object objM2132native = c6956l2.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = AbstractC13273l.loadAd(c13640l.isVip(), enumC0442l.f1619l);
                        c6956l2.m2147try(objM2132native);
                    }
                    C12371l.yandex(AbstractC7041l.yandex((Drawable) objM2132native, c6956l2), AbstractC0080l.isPro(c4346l, 28.0f), null, null, 0.0f, c6956l2, 440, 120);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.app_name), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
