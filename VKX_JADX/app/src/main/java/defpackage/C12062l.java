package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِۘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12062l implements InterfaceC18035l {
    public final C8688l yandex;

    public C12062l(Function0 function0) {
        this.yandex = new C8688l(function0);
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return loadAd().admob(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        return loadAd().amazon(str);
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return loadAd().billing();
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        return loadAd().firebase(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ List getAnnotations() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        return loadAd().isPro(i);
    }

    public final InterfaceC18035l loadAd() {
        return (InterfaceC18035l) this.yandex.getValue();
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return loadAd().mopub();
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        return loadAd().subs(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return loadAd().yandex();
    }
}
