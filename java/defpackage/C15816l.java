package defpackage;

import androidx.recyclerview.widget.subs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕٝؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15816l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f31055l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31056l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f31057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15816l(AbstractC9694l abstractC9694l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f31056l = i;
        this.f31055l = abstractC9694l;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0027 A[SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C14451l c14451l;
        C14451l c14451l2;
        C14451l c14451l3;
        C14451l c14451l4;
        int i = this.f31056l;
        AbstractC9694l abstractC9694l = this.f31055l;
        Object obj2 = this.f31057l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.f19770l.setValue(((C11134l) obj2).yandex);
                break;
            case 1:
                C1725l c1725l = (C1725l) obj2;
                AbstractC2829l.crashlytics(obj);
                for (subs subsVar : abstractC9694l.f19775l.values()) {
                    if (subsVar instanceof C14451l) {
                        c14451l = (C14451l) subsVar;
                    } else if (subsVar instanceof C0663l) {
                        AbstractC14630l abstractC14630l = ((C0663l) subsVar).f2135l;
                        if (abstractC14630l instanceof C14451l) {
                            c14451l = (C14451l) abstractC14630l;
                        } else {
                            c14451l = null;
                        }
                    } else {
                        c14451l = null;
                    }
                    if (c14451l != null) {
                        c14451l.m3856package(c1725l);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                break;
            case 2:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.f19771l.setValue(c14759l.yandex);
                for (subs subsVar2 : abstractC9694l.f19775l.values()) {
                    if (subsVar2 instanceof C14451l) {
                        c14451l2 = (C14451l) subsVar2;
                    } else if (subsVar2 instanceof C0663l) {
                        AbstractC14630l abstractC14630l2 = ((C0663l) subsVar2).f2135l;
                        if (abstractC14630l2 instanceof C14451l) {
                            c14451l2 = (C14451l) abstractC14630l2;
                        } else {
                            c14451l2 = null;
                        }
                    } else {
                        c14451l2 = null;
                    }
                    if (c14451l2 != null) {
                        c14451l2.m3857throws(c14759l);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                break;
            default:
                C15553l c15553l = (C15553l) obj2;
                AbstractC2829l.crashlytics(obj);
                if (abstractC9694l.mo781return().mo226l() instanceof C4842l) {
                    for (subs subsVar3 : abstractC9694l.f19775l.values()) {
                        if (subsVar3 instanceof C14451l) {
                            c14451l4 = (C14451l) subsVar3;
                        } else {
                            if (subsVar3 instanceof C0663l) {
                                AbstractC14630l abstractC14630l3 = ((C0663l) subsVar3).f2135l;
                                if (abstractC14630l3 instanceof C14451l) {
                                    c14451l4 = (C14451l) abstractC14630l3;
                                }
                                if (c14451l3 != null) {
                                    long j = c15553l.loadAd;
                                    int i2 = c15553l.yandex;
                                    C16552l c16552l = AbstractC11463l.yandex;
                                    AbstractC10999l.mopub(c14451l3, AbstractC17278l.yandex, 0, new C1772l(c14451l3, j, i2, null), 2);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                            c14451l3 = null;
                            if (c14451l3 != null) {
                                long j2 = c15553l.loadAd;
                                int i3 = c15553l.yandex;
                                C16552l c16552l2 = AbstractC11463l.yandex;
                                AbstractC10999l.mopub(c14451l3, AbstractC17278l.yandex, 0, new C1772l(c14451l3, j2, i3, null), 2);
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        c14451l3 = c14451l4;
                        if (c14451l3 != null) {
                            long j3 = c15553l.loadAd;
                            int i4 = c15553l.yandex;
                            C16552l c16552l3 = AbstractC11463l.yandex;
                            AbstractC10999l.mopub(c14451l3, AbstractC17278l.yandex, 0, new C1772l(c14451l3, j3, i4, null), 2);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f31056l;
        AbstractC9694l abstractC9694l = this.f31055l;
        switch (i) {
            case 0:
                C15816l c15816l = new C15816l(abstractC9694l, interfaceC14029l, 0);
                c15816l.f31057l = obj;
                return c15816l;
            case 1:
                C15816l c15816l2 = new C15816l(abstractC9694l, interfaceC14029l, 1);
                c15816l2.f31057l = obj;
                return c15816l2;
            case 2:
                C15816l c15816l3 = new C15816l(abstractC9694l, interfaceC14029l, 2);
                c15816l3.f31057l = obj;
                return c15816l3;
            default:
                C15816l c15816l4 = new C15816l(abstractC9694l, interfaceC14029l, 3);
                c15816l4.f31057l = obj;
                return c15816l4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31056l) {
            case 0:
                return ((C15816l) ads((InterfaceC14029l) obj2, (C11134l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C15816l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C15816l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C15816l) ads((InterfaceC14029l) obj2, (C15553l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
