package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7096l implements InterfaceC10835l {
    public final Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7096l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
            case 1:
                C8464l c8464l = (C8464l) this.loadAd;
                c8464l.measure(AbstractC0290l.firebase(c8464l, 0, i, c8464l.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c8464l.getMeasuredHeight();
            default:
                return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
            case 1:
                C8464l c8464l = (C8464l) this.loadAd;
                c8464l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC0290l.firebase(c8464l, 0, i, c8464l.getLayoutParams().height));
                return c8464l.getMeasuredWidth();
            default:
                return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        ArrayList arrayList;
        C8195l c8195l;
        int i = this.yandex;
        C14054l c14054l = C14054l.f27396l;
        Object obj = this.loadAd;
        Object obj2 = this.crashlytics;
        switch (i) {
            case 0:
                ((C11941l) obj).setParentLayoutDirection((EnumC9931l) obj2);
                return interfaceC7448l.isVip(0, 0, c14054l, C11192l.f22538l);
            case 1:
                C8464l c8464l = (C8464l) obj;
                if (c8464l.getChildCount() == 0) {
                    return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, C11192l.f22517l);
                }
                if (C15519l.isPro(j) != 0) {
                    c8464l.getChildAt(0).setMinimumWidth(C15519l.isPro(j));
                }
                if (C15519l.subs(j) != 0) {
                    c8464l.getChildAt(0).setMinimumHeight(C15519l.subs(j));
                }
                c8464l.measure(AbstractC0290l.firebase(c8464l, C15519l.isPro(j), C15519l.admob(j), c8464l.getLayoutParams().width), AbstractC0290l.firebase(c8464l, C15519l.subs(j), C15519l.mopub(j), c8464l.getLayoutParams().height));
                return interfaceC7448l.isVip(c8464l.getMeasuredWidth(), c8464l.getMeasuredHeight(), c14054l, new C15329l(c8464l, (C3654l) obj2, 1));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (!(((InterfaceC6357l) obj3).Signature() instanceof C13336l)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((Function0) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i3 = 0;
                    for (int size2 = list2.size(); i3 < size2; size2 = size2) {
                        C8896l c8896l = (C8896l) list2.get(i3);
                        if (c8896l != null) {
                            float f = c8896l.loadAd;
                            float f2 = c8896l.yandex;
                            c8195l = new C8195l(((InterfaceC6357l) arrayList2.get(i3)).adcel(AbstractC7563l.loadAd(0, (int) Math.floor(c8896l.crashlytics - f2), 0, (int) Math.floor(c8896l.amazon - f), 5)), new C5177l((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            c8195l = null;
                        }
                        if (c8195l != null) {
                            arrayList3.add(c8195l);
                        }
                        i3++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj4 = list.get(i4);
                    if (((InterfaceC6357l) obj4).Signature() instanceof C13336l) {
                        arrayList4.add(obj4);
                    }
                }
                return interfaceC7448l.isVip(C15519l.admob(j), C15519l.mopub(j), c14054l, new C16874l(arrayList, AbstractC17307l.mopub(arrayList4, (Function0) obj)));
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                return AbstractC1757l.ads(this, interfaceC12822l, list, i);
            case 1:
                C8464l c8464l = (C8464l) this.loadAd;
                c8464l.measure(AbstractC0290l.firebase(c8464l, 0, i, c8464l.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c8464l.getMeasuredHeight();
            default:
                return AbstractC1757l.ads(this, interfaceC12822l, list, i);
        }
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        switch (this.yandex) {
            case 0:
                return AbstractC1757l.metrica(this, interfaceC12822l, list, i);
            case 1:
                C8464l c8464l = (C8464l) this.loadAd;
                c8464l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC0290l.firebase(c8464l, 0, i, c8464l.getLayoutParams().height));
                return c8464l.getMeasuredWidth();
            default:
                return AbstractC1757l.metrica(this, interfaceC12822l, list, i);
        }
    }
}
