package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10852l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Context f21935l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4043l f21936l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21937l = 0;

    public /* synthetic */ C10852l(C4043l c4043l, Context context) {
        this.f21936l = c4043l;
        this.f21935l = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f21937l;
        Context context = this.f21935l;
        C4043l c4043l = this.f21936l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c6956l.isVip()) {
                    c6956l.m2124else();
                } else {
                    C10092l c10092lYandex = AbstractC9404l.loadAd.yandex(context);
                    C10092l c10092lYandex2 = AbstractC9404l.amazon.yandex(c4043l.billing);
                    C8540l c8540l = AbstractC3941l.yandex;
                    Bundle bundle = (Bundle) c4043l.firebase.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    AbstractC10478l.loadAd(new C10092l[]{c10092lYandex, c10092lYandex2, c8540l.yandex(bundle), AbstractC9404l.crashlytics.yandex(c4043l.isPro.getValue())}, AbstractC14566l.amazon(-1811403166, new C10852l(c4043l, context), c6956l), c6956l, 56);
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c6956l2.isVip()) {
                    c6956l2.m2124else();
                } else {
                    Object objM2132native = c6956l2.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC8020l.smaato(new C2261l(0L));
                        c6956l2.m2147try(objM2132native);
                    }
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
                    Boolean bool = Boolean.FALSE;
                    boolean zAdmob = c6956l2.admob(c4043l) | c6956l2.admob(context);
                    Object objM2132native2 = c6956l2.m2132native();
                    Unit unit = null;
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C0384l(c4043l, context, interfaceC8714l, (InterfaceC14029l) null);
                        c6956l2.m2147try(objM2132native2);
                    }
                    if (((Boolean) AbstractC8020l.remoteconfig(c6956l2, bool, (Function2) objM2132native2).getValue()).booleanValue()) {
                        c6956l2.m2123default(-1541018146);
                        Object objM2132native3 = c6956l2.m2132native();
                        if (objM2132native3 == c13863l) {
                            C1274l c1274l = new C1274l(new C0384l(c4043l.purchase, context, c4043l.billing, (InterfaceC14029l) null), C17218l.f33421l, -2, 1, 0);
                            c6956l2.m2147try(c1274l);
                            objM2132native3 = c1274l;
                        }
                        Function2 function2 = (Function2) AbstractC8020l.loadAd((InterfaceC6942l) objM2132native3, null, c6956l2, 48).getValue();
                        if (function2 == null) {
                            c6956l2.m2123default(-1540889931);
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(-1540889930);
                            AbstractC3308l.billing(0, ((C2261l) interfaceC8714l.getValue()).yandex, c6956l2, c4043l.admob, function2);
                            c6956l2.startapp(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            c6956l2.m2123default(-1296630672);
                            AbstractC3957l.yandex(c6956l2, 0);
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(-1296636252);
                            c6956l2.startapp(false);
                        }
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(-1540810446);
                        AbstractC3957l.yandex(c6956l2, 0);
                        c6956l2.startapp(false);
                    }
                    boolean zAdmob2 = c6956l2.admob(c4043l);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C9636l(9, c4043l);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC12311l.billing((Function0) objM2132native4, c6956l2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C10852l(Context context, C4043l c4043l) {
        this.f21935l = context;
        this.f21936l = c4043l;
    }
}
