package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8640l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f17797l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13490l f17798l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17799l;

    public /* synthetic */ C8640l(InterfaceC13490l interfaceC13490l, InterfaceC8714l interfaceC8714l, int i) {
        this.f17799l = i;
        this.f17798l = interfaceC13490l;
        this.f17797l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17799l;
        InterfaceC16182l interfaceC16182l = C3303l.f7043l;
        InterfaceC8714l interfaceC8714l = this.f17797l;
        InterfaceC13490l interfaceC13490l = this.f17798l;
        switch (i) {
            case 0:
                C6199l c6199l = new C6199l(13, (Function0) obj);
                C8640l c8640l = new C8640l(interfaceC13490l, interfaceC8714l, 1);
                if (!AbstractC11433l.yandex()) {
                    C10754l.ads("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    interfaceC16182l = C16278l.f31881l;
                }
                return AbstractC11433l.loadAd(c6199l, c8640l, interfaceC16182l);
            case 1:
                C2261l c2261l = (C2261l) obj;
                int iMo870l = interfaceC13490l.mo870l(C2261l.loadAd(c2261l.yandex));
                interfaceC8714l.setValue(new C4999l((((long) interfaceC13490l.mo870l(C2261l.yandex(c2261l.yandex))) & 4294967295L) | (((long) iMo870l) << 32)));
                return Unit.INSTANCE;
            case 2:
                C6199l c6199l2 = new C6199l(16, (Function0) obj);
                C8640l c8640l2 = new C8640l(interfaceC13490l, interfaceC8714l, 3);
                if (!AbstractC11433l.yandex()) {
                    C10754l.ads("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    interfaceC16182l = C16278l.f31881l;
                }
                return AbstractC11433l.loadAd(c6199l2, c8640l2, interfaceC16182l);
            default:
                C2261l c2261l2 = (C2261l) obj;
                int iMo870l2 = interfaceC13490l.mo870l(C2261l.loadAd(c2261l2.yandex));
                interfaceC8714l.setValue(new C4999l((((long) interfaceC13490l.mo870l(C2261l.yandex(c2261l2.yandex))) & 4294967295L) | (((long) iMo870l2) << 32)));
                return Unit.INSTANCE;
        }
    }
}
