package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0613l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f2068l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2069l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2070l;

    public /* synthetic */ C0613l(Function0 function0, boolean z) {
        this.f2070l = 0;
        this.f2068l = function0;
        this.f2069l = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2070l;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 2;
        final boolean z = this.f2069l;
        C13863l c13863l = C1867l.yandex;
        final Function0 function0 = this.f2068l;
        switch (i) {
            case 0:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
                C6956l c6956l = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l.m2123default(-196777734);
                final long j = ((C8620l) c6956l.isPro(AbstractC4524l.yandex)).yandex;
                boolean zPurchase = c6956l.purchase(j) | c6956l.billing(function0) | c6956l.mopub(z);
                Object objM2132native = c6956l.m2132native();
                if (zPurchase || objM2132native == c13863l) {
                    objM2132native = new Function1() { // from class: lٟٜؒ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            C3366l c3366l = (C3366l) obj4;
                            return c3366l.yandex(new C5449l(function0, z, AbstractC5103l.purchase(c3366l, Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32)) / 2.0f), new C0534l(j, 5), 0));
                        }
                    };
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC17242l interfaceC17242lFirebase = AbstractC14289l.firebase(interfaceC17242l, (Function1) objM2132native);
                c6956l.startapp(false);
                return interfaceC17242lFirebase;
            case 1:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l2.billing(c7091l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(AbstractC5020l.smaato(c7091l, c4346l), z ? 1.0f : 0.75f);
                    boolean zMopub = c6956l2.mopub(z) | c6956l2.billing(function0);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zMopub || objM2132native2 == c13863l) {
                        objM2132native2 = new C5023l(z, function0, 0);
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lYandex, z, null, (Function0) objM2132native2, 14);
                    int i3 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC17860l.subscription, interfaceC17242lLoadAd, null, AbstractC14566l.amazon(-1090882079, new C4584l(z, i2), c6956l2), AbstractC17860l.tapsense, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l2, 510), c6956l2, 27654, 420);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C7091l c7091l2 = (C7091l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l3.billing(c7091l2) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lYandex2 = AbstractC15788l.yandex(AbstractC5020l.smaato(c7091l2, c4346l), z ? 1.0f : 0.75f);
                    boolean zMopub2 = c6956l3.mopub(z) | c6956l3.billing(function0);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zMopub2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C5023l(z, function0, 1);
                        c6956l3.m2147try(objM2132native3);
                    }
                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(interfaceC17242lYandex2, z, null, (Function0) objM2132native3, 14);
                    int i4 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC17860l.Signature, interfaceC17242lLoadAd2, null, AbstractC14566l.amazon(-1291249004, new C4584l(z, 3), c6956l3), AbstractC17860l.license, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l3, 510), c6956l3, 27654, 420);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zBilling = c6956l4.billing(function0);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        objM2132native4 = new C6199l(10, function0);
                        c6956l4.m2147try(objM2132native4);
                    }
                    AbstractC6710l.yandex(this.f2069l, (Function1) objM2132native4, null, false, null, c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0613l(boolean z, Function0 function0, int i) {
        this.f2070l = i;
        this.f2069l = z;
        this.f2068l = function0;
    }
}
