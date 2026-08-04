package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lْؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3618l {
    public static final String yandex = AbstractC16648l.ad(10, "H");

    public static final C7546l loadAd(C11090l c11090l, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l, int i) throws IOException {
        String strM4210case = AbstractC16901l.m4210case(AbstractC8576l.adcel(0, i), "\n", null, null, new C5562l(1), 30);
        C2580l c2580l = C2580l.f5619l;
        return new C7546l(new C14442l(strM4210case, c11090l, c2580l, c2580l, interfaceC16061l, interfaceC13490l), i, 1, AbstractC7563l.loadAd(0, 0, 0, 0, 15));
    }

    public static long yandex(C11090l c11090l, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l) throws IOException {
        C7546l c7546lLoadAd = loadAd(c11090l, interfaceC13490l, interfaceC16061l, 1);
        return (((long) AbstractC0509l.loadAd(((C14442l) c7546lLoadAd.f15545l).mo1546l())) << 32) | (((long) AbstractC0509l.loadAd(c7546lLoadAd.subs())) & 4294967295L);
    }
}
