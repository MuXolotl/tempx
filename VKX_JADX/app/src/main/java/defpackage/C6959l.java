package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6959l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f14612l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0205l f14613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14614l;

    public /* synthetic */ C6959l(C15578l c15578l, C0205l c0205l) {
        this.f14614l = 2;
        this.f14612l = c15578l;
        this.f14613l = c0205l;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C15812l c15812l;
        C18329l c18329lBilling;
        C15812l c15812l2;
        C18329l c18329lBilling2;
        boolean z;
        int i = this.f14614l;
        C0205l c0205l = this.f14613l;
        C15578l c15578l = this.f14612l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC16763l.yandex(c0205l, c15578l, (C6956l) obj, AbstractC0545l.purchase(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1896l.yandex(c0205l, c15578l, (C6956l) obj, AbstractC0545l.purchase(49));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                int i3 = 0;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c15578l.invoke(c6956l, 0);
                    if (c0205l.isPro() && ((Boolean) c0205l.f1171l.getValue()).booleanValue()) {
                        C3242l c3242lSubs = c0205l.subs();
                        if (c3242lSubs == null ? true : AbstractC8576l.yandex(c3242lSubs.yandex, c3242lSubs.loadAd)) {
                            c6956l.m2123default(-1374590254);
                            c6956l.startapp(false);
                        } else {
                            c6956l.m2123default(1202520707);
                            C3242l c3242lSubs2 = c0205l.subs();
                            if (c3242lSubs2 == null) {
                                c6956l.m2123default(-1376563746);
                                c6956l.startapp(false);
                                z = false;
                            } else {
                                c6956l.m2123default(-1376563745);
                                c6956l.m2123default(1202522235);
                                List listRemoteconfig = AbstractC14055l.remoteconfig(Boolean.TRUE, Boolean.FALSE);
                                int size = listRemoteconfig.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    boolean zBooleanValue = ((Boolean) listRemoteconfig.get(i4)).booleanValue();
                                    boolean zMopub = c6956l.mopub(zBooleanValue);
                                    Object objM2132native = c6956l.m2132native();
                                    Object obj3 = C1867l.yandex;
                                    if (zMopub || objM2132native == obj3) {
                                        objM2132native = new C2084l(zBooleanValue, c0205l);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    InterfaceC2077l interfaceC2077l = (InterfaceC2077l) objM2132native;
                                    boolean zMopub2 = c6956l.mopub(zBooleanValue);
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (zMopub2 || objM2132native2 == obj3) {
                                        objM2132native2 = zBooleanValue ? new C1120l(c0205l, i3) : new C1120l(c0205l, i2);
                                        c6956l.m2147try(objM2132native2);
                                    }
                                    Function0 function0 = (Function0) objM2132native2;
                                    int i5 = zBooleanValue ? c3242lSubs2.yandex.yandex : c3242lSubs2.loadAd.yandex;
                                    float fVip = 0.0f;
                                    if (zBooleanValue) {
                                        C3242l c3242lSubs3 = c0205l.subs();
                                        if (c3242lSubs3 != null && (c18329lBilling2 = c0205l.billing((c15812l2 = c3242lSubs3.yandex))) != null) {
                                            int i6 = c15812l2.loadAd;
                                            C0327l c0327l = (C0327l) c18329lBilling2.crashlytics.invoke();
                                            if (c0327l != null) {
                                                fVip = AbstractC11184l.vip(c0327l, i6);
                                            }
                                        }
                                    } else {
                                        C3242l c3242lSubs4 = c0205l.subs();
                                        if (c3242lSubs4 != null && (c18329lBilling = c0205l.billing((c15812l = c3242lSubs4.loadAd))) != null) {
                                            int i7 = c15812l.loadAd;
                                            C0327l c0327l2 = (C0327l) c18329lBilling.crashlytics.invoke();
                                            if (c0327l2 != null) {
                                                fVip = AbstractC11184l.vip(c0327l2, i7);
                                            }
                                        }
                                    }
                                    int i8 = i4;
                                    C8658l c8658l = new C8658l(function0);
                                    int i9 = i5;
                                    boolean z2 = c3242lSubs2.crashlytics;
                                    boolean zAdmob = c6956l.admob(interfaceC2077l);
                                    Object objM2132native3 = c6956l.m2132native();
                                    if (zAdmob || objM2132native3 == obj3) {
                                        objM2132native3 = new C16646l(interfaceC2077l, i3);
                                        c6956l.m2147try(objM2132native3);
                                    }
                                    AbstractC5103l.loadAd(c8658l, zBooleanValue, i9, z2, 0L, fVip, new C8110l(interfaceC2077l, null, null, (PointerInputEventHandler) objM2132native3, 6), c6956l, 0, 16);
                                    i4 = i8 + 1;
                                    i3 = i3;
                                    i2 = 1;
                                    c3242lSubs2 = c3242lSubs2;
                                }
                                boolean z3 = i3;
                                c6956l.startapp(z3);
                                c6956l.startapp(z3);
                                z = z3;
                            }
                            c6956l.startapp(z);
                        }
                    } else {
                        c6956l.m2123default(-1374590254);
                        c6956l.startapp(false);
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6959l(C0205l c0205l, C15578l c15578l, int i, int i2) {
        this.f14614l = i2;
        this.f14613l = c0205l;
        this.f14612l = c15578l;
    }
}
