package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lْْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13368l implements InterfaceC12538l {
    public final /* synthetic */ int yandex;
    public static final /* synthetic */ C13368l loadAd = new C13368l(0);
    public static final /* synthetic */ C13368l crashlytics = new C13368l(2);

    public /* synthetic */ C13368l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) {
        switch (this.yandex) {
            case 0:
                C3890l c3890l = (C3890l) obj;
                throw new C9303l(c3890l.f8033l.f584l, c3890l.getMessage(), c3890l);
            case 1:
                throw null;
            default:
                return AbstractC7151l.purchase("");
        }
    }
}
