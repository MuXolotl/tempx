package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4781l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9805l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9806l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f9807l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4781l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9806l = i;
        this.f9807l = obj;
        this.f9805l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object c18435l;
        Throwable th;
        ?? r2;
        int i = this.f9806l;
        int i2 = 1;
        Object c18435l2 = null;
        Object obj2 = this.f9805l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((C9395l) this.f9807l).yandex(((C4201l) obj2).f8621l);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                ((Cconst) ((C18396l) this.f9807l).f35933l).invoke();
                ((C4456l) obj2).purchase();
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                C11830l c11830l = (C11830l) this.f9807l;
                c11830l.applovin(EnumC13576l.CACHE, (C13109l) obj2);
                c11830l.f23663l = c11830l.appmetrica();
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                Context context = (Context) obj2;
                try {
                    C12382l c12382l = AbstractC5921l.f12465l;
                    C18404l c18404l = C18404l.yandex;
                    String str = C14025l.f27330l;
                    C1503l c1503l = new C1503l(c12382l.mo692default(C6162l.ads(context.getFilesDir()).purchase("vkx_remote_config.json")));
                    try {
                        C13047l c13047l = C18404l.loadAd;
                        c13047l.getClass();
                        c18435l = (C1203l) AbstractC10802l.loadAd(c13047l, C1203l.Companion.serializer(), new C6309l(c1503l, i2));
                        try {
                            c1503l.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            c1503l.close();
                        } catch (Throwable th4) {
                            AbstractC11718l.yandex(th3, th4);
                        }
                        th = th3;
                        c18435l = null;
                        break;
                    }
                    if (th != null) {
                        throw th;
                    }
                } catch (Throwable th5) {
                    c18435l = new C18435l(th5);
                }
                C1203l c1203l = (C1203l) (c18435l instanceof C18435l ? null : c18435l);
                if (c1203l == null) {
                    return Boolean.FALSE;
                }
                for (Map.Entry entry : c1203l.yandex.entrySet()) {
                    C18404l.amazon.put((String) entry.getKey(), (String) entry.getValue());
                }
                return Boolean.TRUE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                C11610l c11610l = (C11610l) this.f9807l;
                C11644l c11644l = new C11644l(28);
                c11644l.m3157l((String) obj2);
                c11644l.m3145l("GET", null);
                C18389l c18389lBilling = c11610l.yandex(new C17032l(c11644l)).billing();
                try {
                    Boolean boolValueOf = Boolean.valueOf(c18389lBilling.f35909l || c18389lBilling.f35915l == 429);
                    c18389lBilling.close();
                    return boolValueOf;
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        AbstractC7876l.loadAd(c18389lBilling, th6);
                        throw th7;
                    }
                }
            case 5:
                AbstractC2829l.crashlytics(obj);
                C12382l c12382l2 = AbstractC5921l.f12465l;
                C14025l c14025l = (C14025l) obj2;
                boolean zIsVip = c12382l2.isVip(c14025l);
                Object obj3 = C2580l.f5619l;
                if (!zIsVip) {
                    return obj3;
                }
                try {
                    C1503l c1503l2 = new C1503l(c12382l2.mo692default(c14025l));
                    try {
                        C15913l c15913l = AbstractC8237l.amazon;
                        c15913l.getClass();
                        List list = (List) AbstractC10802l.loadAd(c15913l, new C0087l(C11359l.Companion.serializer(), 0), new C6309l(c1503l2, i2));
                        try {
                            c1503l2.close();
                        } catch (Throwable th8) {
                            c18435l2 = th8;
                        }
                        Object obj4 = c18435l2;
                        c18435l2 = list;
                        r2 = obj4;
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        try {
                            c1503l2.close();
                            r2 = th10;
                        } catch (Throwable th11) {
                            AbstractC11718l.yandex(th10, th11);
                            r2 = th10;
                        }
                    }
                    if (r2 != 0) {
                        throw r2;
                    }
                    break;
                } catch (Throwable th12) {
                    c18435l2 = new C18435l(th12);
                }
                if (!(c18435l2 instanceof C18435l)) {
                    obj3 = c18435l2;
                }
                return (List) obj3;
            case 6:
                C7814l c7814l = (C7814l) this.f9807l;
                AbstractC2829l.crashlytics(obj);
                return C7814l.loadAd(c7814l, null, null, 0L, (EnumC3503l) obj2, 767);
            case 7:
                AbstractC2829l.crashlytics(obj);
                ((C15035l) this.f9807l).purchase.invoke(Boolean.valueOf(((C1673l) obj2).crashlytics));
                return Unit.INSTANCE;
            case 8:
                C18554l c18554l = (C18554l) this.f9807l;
                AbstractC2829l.crashlytics(obj);
                return C18554l.loadAd(c18554l, false, false, false, false, false, (EnumC10468l) obj2, null, null, false, false, false, false, false, false, false, false, 262111);
            case 9:
                C18554l c18554l2 = (C18554l) this.f9807l;
                AbstractC2829l.crashlytics(obj);
                return C18554l.loadAd(c18554l2, false, false, false, false, false, null, (EnumC14810l) obj2, null, false, false, false, false, false, false, false, false, 262079);
            default:
                C18554l c18554l3 = (C18554l) this.f9807l;
                AbstractC2829l.crashlytics(obj);
                return C18554l.loadAd(c18554l3, false, false, false, false, false, null, null, (EnumC0972l) obj2, false, false, false, false, false, false, false, false, 262015);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f9806l;
        Object obj2 = this.f9805l;
        switch (i) {
            case 0:
                return new C4781l((C9395l) this.f9807l, (C4201l) obj2, interfaceC14029l, 0);
            case 1:
                return new C4781l((C18396l) this.f9807l, (C4456l) obj2, interfaceC14029l, 1);
            case 2:
                return new C4781l((C11830l) this.f9807l, (C13109l) obj2, interfaceC14029l, 2);
            case 3:
                C4781l c4781l = new C4781l((Context) obj2, interfaceC14029l, 3);
                c4781l.f9807l = obj;
                return c4781l;
            case 4:
                return new C4781l((C11610l) this.f9807l, (String) obj2, interfaceC14029l, 4);
            case 5:
                C4781l c4781l2 = new C4781l((C14025l) obj2, interfaceC14029l, 5);
                c4781l2.f9807l = obj;
                return c4781l2;
            case 6:
                C4781l c4781l3 = new C4781l((EnumC3503l) obj2, interfaceC14029l, 6);
                c4781l3.f9807l = obj;
                return c4781l3;
            case 7:
                return new C4781l((C15035l) this.f9807l, (C1673l) obj2, interfaceC14029l, 7);
            case 8:
                C4781l c4781l4 = new C4781l((EnumC10468l) obj2, interfaceC14029l, 8);
                c4781l4.f9807l = obj;
                return c4781l4;
            case 9:
                C4781l c4781l5 = new C4781l((EnumC14810l) obj2, interfaceC14029l, 9);
                c4781l5.f9807l = obj;
                return c4781l5;
            default:
                C4781l c4781l6 = new C4781l((EnumC0972l) obj2, interfaceC14029l, 10);
                c4781l6.f9807l = obj;
                return c4781l6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9806l) {
            case 0:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C4781l) ads((InterfaceC14029l) obj2, (C7814l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C4781l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C4781l) ads((InterfaceC14029l) obj2, (C18554l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C4781l) ads((InterfaceC14029l) obj2, (C18554l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C4781l) ads((InterfaceC14029l) obj2, (C18554l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4781l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9806l = i;
        this.f9805l = obj;
    }
}
