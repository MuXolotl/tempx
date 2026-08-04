package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: lؘ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17620l implements Consumer {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17620l(int i) {
        this.yandex = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* synthetic */ void t(Object obj) {
        switch (this.yandex) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C10756l c10756l = C10368l.f21167l;
                throw null;
            default:
                throw AbstractC12589l.signatures(obj);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.yandex;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
