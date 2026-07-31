package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؗؗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4681l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f9510l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11362l f9511l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f9512l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9513l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9514l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C9054l f9515l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14931l f9516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4681l(Object obj, C18656l c18656l, C9054l c9054l, Function1 function1, C14931l c14931l, C11362l c11362l, Function4 function4) {
        super(2);
        this.f9513l = obj;
        this.f9510l = c18656l;
        this.f9515l = c9054l;
        this.f9514l = function1;
        this.f9516l = c14931l;
        this.f9511l = c11362l;
        this.f9512l = function4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C9054l c9054l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            C18656l c18656l = this.f9510l;
            C10086l c10086l = c18656l.purchase;
            C10086l c10086l2 = c18656l.amazon;
            Object value = c10086l.getValue();
            Object obj3 = this.f9513l;
            boolean zMopub = c6956l.mopub(AbstractC8576l.yandex(obj3, value));
            Object objM2132native = c6956l.m2132native();
            Function1 function1 = this.f9514l;
            C13863l c13863l = C1867l.yandex;
            C14931l c14931l = this.f9516l;
            if (zMopub || objM2132native == c13863l) {
                objM2132native = (!AbstractC8576l.yandex(obj3, c10086l.getValue()) || (c9054l = this.f9515l) == null) ? (C10405l) function1.invoke(c14931l) : (C10405l) function1.invoke(c9054l);
                c6956l.m2147try(objM2132native);
            }
            C10405l c10405l = (C10405l) objM2132native;
            boolean zMopub2 = c6956l.mopub(AbstractC8576l.yandex(c18656l.billing().amazon(), obj3));
            Object objM2132native2 = c6956l.m2132native();
            if (zMopub2 || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8576l.yandex(c18656l.billing().amazon(), obj3) ? C0274l.loadAd : ((C10405l) function1.invoke(c14931l)).loadAd;
                c6956l.m2147try(objM2132native2);
            }
            C0274l c0274l = (C0274l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C6549l(AbstractC8576l.yandex(obj3, c10086l2.getValue()));
                c6956l.m2147try(objM2132native3);
            }
            C6549l c6549l = (C6549l) objM2132native3;
            C3000l c3000l = c10405l.yandex;
            boolean zAdmob = c6956l.admob(c10405l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                objM2132native4 = new C2892l(i, c10405l);
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(C4346l.f8873l, (Function3) objM2132native4);
            c6549l.f13670l.setValue(Boolean.valueOf(AbstractC8576l.yandex(obj3, c10086l2.getValue())));
            if (AbstractC8576l.yandex(obj3, c10086l.getValue()) && !AbstractC8576l.yandex(obj3, c10086l2.getValue()) && !AbstractC8576l.yandex(obj3, c18656l.crashlytics())) {
                z = true;
            }
            c6549l.f13669l.setValue(Boolean.valueOf(z));
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lM3537else.premium(c6549l);
            boolean zAdmob2 = c6956l.admob(obj3);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob2 || objM2132native5 == c13863l) {
                objM2132native5 = new C3006l(6, obj3);
                c6956l.m2147try(objM2132native5);
            }
            Function1 function2 = (Function1) objM2132native5;
            boolean zBilling = c6956l.billing(c0274l);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling || objM2132native6 == c13863l) {
                objM2132native6 = new C3956l(3, c0274l);
                c6956l.m2147try(objM2132native6);
            }
            AbstractC3308l.yandex(c18656l, function2, interfaceC17242lPremium, c3000l, c0274l, (Function2) objM2132native6, AbstractC14566l.amazon(1831990167, new C1950l(this.f9511l, obj3, c14931l, this.f9512l, 0), c6956l), c6956l, 100663296);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
