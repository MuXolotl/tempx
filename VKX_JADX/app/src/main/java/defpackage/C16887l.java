package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16887l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f32936l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2882l f32937l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C2994l f32938l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f32939l;

    public C16887l(C2994l c2994l, C2882l c2882l, float f, InterfaceC8714l interfaceC8714l) {
        this.f32938l = c2994l;
        this.f32937l = c2882l;
        this.f32936l = f;
        this.f32939l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC8714l interfaceC8714l = this.f32939l;
        C3554l c3554l = (C3554l) interfaceC8714l.getValue();
        float f = this.f32937l.f6280l;
        List<C2882l> list = c3554l.f7469l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (C2882l c2882l : list) {
            if (c2882l.f6280l == f) {
                c2882l = new C2882l(f, this.f32936l);
            }
            arrayList.add(c2882l);
        }
        C3554l c3554lLoadAd = C3554l.loadAd(c3554l, null, null, arrayList, 27);
        C13434l c13434l = C13434l.yandex;
        String str = c3554lLoadAd.f7471l;
        c13434l.getClass();
        ArrayList arrayList2 = C13434l.amazon;
        C2994l c2994l = this.f32938l;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (AbstractC8576l.yandex(((C11359l) it.next()).yandex, str)) {
                    C13434l c13434l2 = C13434l.yandex;
                    C11359l c11359lAmazon = AbstractC8265l.amazon(c3554lLoadAd);
                    c13434l2.getClass();
                    C11359l c11359lLoadAd = C13434l.loadAd(c11359lAmazon);
                    AbstractC10999l.mopub(c2994l, null, 0, new C18020l(c11359lLoadAd, null, 3), 3);
                    c3554lLoadAd = C3554l.loadAd(c3554lLoadAd, c11359lLoadAd.yandex, c11359lLoadAd.loadAd, null, 28);
                }
            }
            AbstractC10999l.mopub(c2994l, null, 0, new C11039l(c3554lLoadAd, null, 29), 3);
        } else {
            AbstractC10999l.mopub(c2994l, null, 0, new C11039l(c3554lLoadAd, null, 29), 3);
        }
        interfaceC8714l.setValue(c3554lLoadAd);
        return Unit.INSTANCE;
    }
}
