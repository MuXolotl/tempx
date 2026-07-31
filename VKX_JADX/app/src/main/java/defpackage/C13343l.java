package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lْْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13343l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26191l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5803l f26192l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f26193l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26194l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26195l;

    public C13343l(InterfaceC13238l interfaceC13238l, C5803l c5803l, Function1 function1, Function1 function2, Function1 function3) {
        this.f26193l = interfaceC13238l;
        this.f26192l = c5803l;
        this.f26191l = function1;
        this.f26195l = function2;
        this.f26194l = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C8206l c8206l;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            InterfaceC17314l interfaceC17314l = (InterfaceC17314l) this.f26193l.get(iIntValue);
            c6956l.m2123default(-710224281);
            boolean zYandex = AbstractC8576l.yandex(interfaceC17314l, C17536l.yandex);
            C4346l c4346l = C4346l.f8873l;
            C13863l c13863l = C1867l.yandex;
            String str = null;
            if (zYandex) {
                c6956l.m2123default(-710191143);
                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                C5803l c5803l = this.f26192l;
                boolean zAdmob = c6956l.admob(c5803l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    C4936l c4936l = new C4936l(0, c5803l, C5803l.class, "onPlaylistLinkClicked", "onPlaylistLinkClicked()V", 0, 0, 5);
                    c6956l.m2147try(c4936l);
                    objM2132native = c4936l;
                }
                AbstractC10704l.amazon(AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), c6956l, 0);
                c6956l.startapp(false);
            } else if (AbstractC8576l.yandex(interfaceC17314l, C5631l.yandex)) {
                c6956l.m2123default(-709845090);
                AbstractC10704l.crashlytics(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), c6956l, 6);
                c6956l.startapp(false);
            } else if (interfaceC17314l instanceof C15661l) {
                c6956l.m2123default(-709576785);
                c6956l.startapp(false);
            } else {
                if (!(interfaceC17314l instanceof C7933l)) {
                    throw AbstractC12900l.billing(808373532, c6956l, false);
                }
                c6956l.m2123default(-709485118);
                C7933l c7933l = (C7933l) interfaceC17314l;
                C2757l c2757l = c7933l.loadAd;
                C12787l c12787l = c2757l.adcel;
                if (c12787l != null && (c8206l = c12787l.purchase) != null) {
                    str = c8206l.billing;
                }
                String str2 = c2757l.amazon;
                String str3 = c2757l.yandex;
                boolean zBooleanValue = ((Boolean) this.f26191l.invoke(c7933l.yandex)).booleanValue();
                Function1 function1 = this.f26195l;
                boolean zBilling = c6956l.billing(function1) | c6956l.admob(interfaceC17314l);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling || objM2132native2 == c13863l) {
                    objM2132native2 = new C16056l(function1, c7933l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                Function0 function0 = (Function0) objM2132native2;
                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                InterfaceC2186l interfaceC2186l = (InterfaceC2186l) c6956l.isPro(AbstractC14631l.yandex);
                Function1 function2 = this.f26194l;
                boolean zBilling2 = c6956l.billing(function2) | c6956l.admob(interfaceC17314l);
                Object objM2132native3 = c6956l.m2132native();
                if (zBilling2 || objM2132native3 == c13863l) {
                    objM2132native3 = new C16056l(function2, c7933l, 1);
                    c6956l.m2147try(objM2132native3);
                }
                Function0 function3 = (Function0) objM2132native3;
                boolean zBilling3 = c6956l.billing(function1) | c6956l.admob(interfaceC17314l);
                Object objM2132native4 = c6956l.m2132native();
                if (zBilling3 || objM2132native4 == c13863l) {
                    objM2132native4 = new C16056l(function1, c7933l, 2);
                    c6956l.m2147try(objM2132native4);
                }
                AbstractC10704l.loadAd(0, c6956l, AbstractC9151l.crashlytics(interfaceC17242lAmazon2, null, interfaceC2186l, false, function3, (Function0) objM2132native4, 444), str, str2, str3, function0, zBooleanValue);
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
