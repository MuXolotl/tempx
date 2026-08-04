package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lؙِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3237l {
    public final AbstractC5006l yandex;

    public C3237l(AbstractC5006l abstractC5006l) {
        this.yandex = abstractC5006l;
    }

    public ListenableFuture amazon(Uri uri, InputEvent inputEvent) {
        return AbstractC2387l.crashlytics(AbstractC10999l.crashlytics(3, null, AbstractC11990l.yandex(AbstractC11463l.yandex), new C4647l(this, uri, inputEvent, (InterfaceC14029l) null, 28)));
    }

    public ListenableFuture billing(AbstractC6459l abstractC6459l) {
        throw null;
    }

    public ListenableFuture crashlytics(AbstractC14619l abstractC14619l) {
        throw null;
    }

    public ListenableFuture loadAd() {
        return AbstractC2387l.crashlytics(AbstractC10999l.crashlytics(3, null, AbstractC11990l.yandex(AbstractC11463l.yandex), new C8912l(this, null, 19)));
    }

    public ListenableFuture mopub(AbstractC18437l abstractC18437l) {
        throw null;
    }

    public ListenableFuture purchase(Uri uri) {
        return AbstractC2387l.crashlytics(AbstractC10999l.crashlytics(3, null, AbstractC11990l.yandex(AbstractC11463l.yandex), new C5888l(this, uri, null, 1)));
    }

    public ListenableFuture yandex(AbstractC1634l abstractC1634l) {
        throw null;
    }
}
