package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lؕٞؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3529l implements InterfaceC9526l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f7425l;

    public /* synthetic */ C3529l(Object obj) {
        this.f7425l = obj;
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        C18289l c18289l = (C18289l) this.f7425l;
        return AbstractC7151l.billing(AbstractC7151l.admob((ListenableFuture) c18289l.crashlytics, AbstractC6854l.loadAd(new C9496l(c18289l, 3)), (ExecutorC1688l) c18289l.purchase));
    }

    public C9299l yandex(String str, boolean z) {
        return new C9299l(str, (C18096l) this.f7425l, z);
    }
}
