package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17999l implements InterfaceC10835l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17999l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(final InterfaceC7448l interfaceC7448l, List list, long j) {
        final AbstractC10113l abstractC10113lAdcel;
        int i = this.yandex;
        Object obj = this.loadAd;
        int i2 = 0;
        C14054l c14054l = C14054l.f27396l;
        switch (i) {
            case 0:
                return interfaceC7448l.isVip(C15519l.admob(j), C15519l.mopub(j), c14054l, new C8854l(list, this, i2));
            case 1:
                AbstractC10113l abstractC10113lAdcel2 = ((InterfaceC6357l) AbstractC16901l.m4231native(list)).adcel(j);
                int i3 = abstractC10113lAdcel2.f20592l;
                int i4 = abstractC10113lAdcel2.f20591l;
                C11625l c11625l = (C11625l) obj;
                c11625l.subs.subs(0.0f);
                c11625l.mopub.subs(i3);
                return interfaceC7448l.isVip(i3, i4, c14054l, new C10889l(abstractC10113lAdcel2, 10));
            default:
                final AbstractC10113l abstractC10113l = null;
                if (((Function2) obj) != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
                            C17132l.firebase();
                            return null;
                        }
                        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i5);
                        if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l), "text")) {
                            abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, 0, 0, 11, j));
                        } else {
                            i5++;
                        }
                    }
                } else {
                    abstractC10113lAdcel = null;
                }
                final int iMax = Math.max(abstractC10113lAdcel != null ? abstractC10113lAdcel.f20592l : 0, 0);
                final int iMax2 = Math.max(interfaceC7448l.mo870l(AbstractC12853l.yandex), interfaceC7448l.mo874transient(AbstractC12853l.purchase) + 0 + (abstractC10113lAdcel != null ? abstractC10113lAdcel.f20591l : 0));
                final Integer numValueOf = abstractC10113lAdcel != null ? Integer.valueOf(abstractC10113lAdcel.mo884throw(AbstractC12013l.yandex)) : null;
                final Integer numValueOf2 = abstractC10113lAdcel != null ? Integer.valueOf(abstractC10113lAdcel.mo884throw(AbstractC12013l.loadAd)) : null;
                return interfaceC7448l.isVip(iMax, iMax2, c14054l, new Function1() { // from class: lَٓۡ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AbstractC9601l abstractC9601l = (AbstractC9601l) obj2;
                        AbstractC10113l abstractC10113l2 = abstractC10113lAdcel;
                        AbstractC10113l abstractC10113l3 = abstractC10113l;
                        int i6 = iMax2;
                        if (abstractC10113l2 != null && abstractC10113l3 != null) {
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            float f = iIntValue == iIntValue2 ? AbstractC12853l.crashlytics : AbstractC12853l.amazon;
                            InterfaceC7448l interfaceC7448l2 = interfaceC7448l;
                            int iMo870l = interfaceC7448l2.mo870l(f);
                            float f2 = AbstractC4049l.yandex;
                            int iMo870l2 = interfaceC7448l2.mo870l(3.0f) + iMo870l;
                            int iMo874transient = (interfaceC7448l2.mo874transient(AbstractC12853l.purchase) + abstractC10113l3.f20591l) - iIntValue;
                            int i7 = abstractC10113l2.f20592l;
                            int i8 = iMax;
                            int i9 = (i6 - iIntValue2) - iMo870l2;
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, (i8 - i7) / 2, i9);
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l3, (i8 - abstractC10113l3.f20592l) / 2, i9 - iMo874transient);
                        } else if (abstractC10113l2 != null) {
                            float f3 = AbstractC12853l.yandex;
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, 0, (i6 - abstractC10113l2.f20591l) / 2);
                        } else if (abstractC10113l3 != null) {
                            float f4 = AbstractC12853l.yandex;
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l3, 0, (i6 - abstractC10113l3.f20591l) / 2);
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1757l.ads(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1757l.metrica(this, interfaceC12822l, list, i);
    }
}
