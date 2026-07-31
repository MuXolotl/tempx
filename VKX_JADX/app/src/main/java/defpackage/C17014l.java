package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17014l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6727l f33146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33147l;

    public /* synthetic */ C17014l(C6727l c6727l, int i) {
        this.f33147l = i;
        this.f33146l = c6727l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.f33147l;
        C6727l c6727l = this.f33146l;
        switch (i) {
            case 0:
                return AbstractC1845l.yandex(((InterfaceC13937l) AbstractC16131l.billing(c6727l.loadAd.yandex)).mo1730private()).yandex();
            case 1:
                C2312l c2312lMopub = c6727l.mopub();
                C8673l c8673l = c6727l.loadAd;
                C10038l c10038l = c6727l.yandex;
                if (c2312lMopub == null) {
                    return C8741l.loadAd(EnumC5123l.f11134l, c8673l.toString());
                }
                C7757l c7757l = (C7757l) c10038l.f20463l;
                InterfaceC11865l interfaceC11865l = c7757l.metrica;
                AbstractC16860l abstractC16860lSubs = interfaceC11865l.subs();
                String str = C4632l.yandex;
                C3624l c3624lMopub = C4632l.mopub(c2312lMopub);
                InterfaceC17477l interfaceC17477lIsPro = c3624lMopub != null ? abstractC16860lSubs.isPro(c3624lMopub.yandex()) : null;
                if (interfaceC17477lIsPro == null) {
                    C12875l c12875l = new C12875l(((InterfaceC13937l) AbstractC16131l.billing(c8673l.yandex)).mo1730private());
                    C5501l c5501l = (C5501l) c7757l.firebase.f21690l;
                    if (c5501l == null) {
                        c5501l = null;
                    }
                    interfaceC17477lIsPro = c5501l.m1813l(c12875l);
                    if (interfaceC17477lIsPro == null) {
                        C3624l c3624l = new C3624l(c2312lMopub.loadAd(), c2312lMopub.yandex.mopub());
                        C0511l c0511l = c7757l.amazon.yandex;
                        interfaceC17477lIsPro = AbstractC9033l.billing(interfaceC11865l, c3624l, (C12014l) (c0511l != null ? c0511l : null).firebase);
                    }
                }
                return interfaceC17477lIsPro.ad();
            default:
                ArrayList<InterfaceC0808l> arrayListYandex = c6727l.loadAd.yandex();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC0808l interfaceC0808l : arrayListYandex) {
                    C3498l c3498l = ((AbstractC14423l) interfaceC0808l).yandex;
                    if (c3498l == null) {
                        c3498l = AbstractC6830l.loadAd;
                    }
                    AbstractC0757l abstractC0757lLoadAd = c6727l.loadAd(interfaceC0808l);
                    C8195l c8195l = abstractC0757lLoadAd != null ? new C8195l(c3498l, abstractC0757lLoadAd) : null;
                    if (c8195l != null) {
                        arrayList.add(c8195l);
                    }
                }
                return AbstractC8676l.subscription(arrayList);
        }
    }
}
