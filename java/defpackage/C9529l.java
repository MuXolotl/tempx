package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9529l {
    public final C6659l loadAd;
    public final C6659l yandex;

    public C9529l(C6659l c6659l, C6659l c6659l2) {
        this.yandex = c6659l;
        this.loadAd = c6659l2;
    }

    public final void yandex(String str, Function2 function2) {
        for (InterfaceC11343l interfaceC11343l : this.yandex.m2063l(str, "TRUEPREDICATE", new Object[0]).crashlytics()) {
            function2.invoke(interfaceC11343l, this.loadAd.m2062l(interfaceC11343l));
        }
    }
}
