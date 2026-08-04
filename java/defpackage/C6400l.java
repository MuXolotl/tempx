package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lؙِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6400l {
    public final /* synthetic */ AbstractComponentCallbacksC4411l yandex;

    public C6400l(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        this.yandex = abstractComponentCallbacksC4411l;
    }

    public final void yandex() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = this.yandex;
        ((C17464l) abstractComponentCallbacksC4411l.f8951l.f26581l).purchase();
        AbstractC6531l.loadAd(abstractComponentCallbacksC4411l);
        Bundle bundle = abstractComponentCallbacksC4411l.f8964l;
        abstractComponentCallbacksC4411l.f8951l.startapp(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
