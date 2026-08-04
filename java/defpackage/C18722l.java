package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18722l implements InterfaceC1389l {
    public static Boolean loadAd;
    public static final C18722l yandex = new C18722l();

    @Override // defpackage.InterfaceC1389l
    public final void amazon(boolean z) {
        loadAd = Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC1389l
    public final boolean loadAd() {
        Boolean bool = loadAd;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC5020l.metrica("canFocus is read before it is written");
    }

    @Override // defpackage.InterfaceC1389l
    public final /* synthetic */ void billing(Function1 function1) {
    }

    @Override // defpackage.InterfaceC1389l
    public final /* synthetic */ void crashlytics(Function1 function1) {
    }

    @Override // defpackage.InterfaceC1389l
    public final /* synthetic */ void purchase(C8896l c8896l) {
    }

    @Override // defpackage.InterfaceC1389l
    public final /* synthetic */ void yandex(C6523l c6523l) {
    }
}
