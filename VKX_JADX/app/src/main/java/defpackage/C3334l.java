package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3334l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ View f7109l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7110l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f7111l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f7112l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18297l f7113l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7114l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f7115l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7116l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10507l f7117l;

    public C3334l(C18297l c18297l, C2403l c2403l, View view, InterfaceC12244l interfaceC12244l, Function1 function1, C10507l c10507l, boolean z, String str, Function1 function2) {
        this.f7113l = c18297l;
        this.f7112l = c2403l;
        this.f7109l = view;
        this.f7115l = interfaceC12244l;
        this.f7114l = function1;
        this.f7117l = c10507l;
        this.f7110l = z;
        this.f7111l = str;
        this.f7116l = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            View view = this.f7109l;
            boolean zAdmob = c6956l.admob(view);
            InterfaceC12244l interfaceC12244l = this.f7115l;
            boolean zBilling = zAdmob | c6956l.billing(interfaceC12244l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = new C3768l(view, interfaceC12244l, 18);
                c6956l.m2147try(objM2132native);
            }
            Function1 function1 = (Function1) objM2132native;
            boolean zAdmob2 = c6956l.admob(view) | c6956l.billing(interfaceC12244l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C11239l(view, interfaceC12244l, 15);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC17242l interfaceC17242lSubs = AbstractC14055l.subs(this.f7113l, this.f7112l, function1, (Function0) objM2132native2, 17);
            InterfaceC2186l interfaceC2186l = (InterfaceC2186l) c6956l.isPro(AbstractC14631l.yandex);
            Function1 function2 = this.f7114l;
            boolean zBilling2 = c6956l.billing(function2);
            C10507l c10507l = this.f7117l;
            boolean zBilling3 = zBilling2 | c6956l.billing(c10507l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling3 || objM2132native3 == c13863l) {
                objM2132native3 = new C11239l(function2, c10507l, 16);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.yandex(C4346l.f8873l, this.f7112l, interfaceC2186l, false, null, (Function0) objM2132native3, 28), 1.0f), 16.0f, 6.0f);
            boolean z = this.f7110l;
            boolean zMopub = c6956l.mopub(z);
            Object objM2132native4 = c6956l.m2132native();
            if (zMopub || objM2132native4 == c13863l) {
                objM2132native4 = new C15301l(z);
                c6956l.m2147try(objM2132native4);
            }
            Function0 function0 = (Function0) objM2132native4;
            String str = this.f7111l;
            boolean zBilling4 = c6956l.billing(str);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling4 || objM2132native5 == c13863l) {
                objM2132native5 = new C8362l(str, 3);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC17948l.loadAd(function0, (Function0) objM2132native5, this.f7116l, c10507l, interfaceC17242lSubs, interfaceC17242lRemoteconfig, c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
