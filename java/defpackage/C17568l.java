package defpackage;

import androidx.car.app.loadAd;
import androidx.car.app.subs;
import androidx.car.app.utils.billing;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٗۧۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17568l implements InterfaceC10744l {
    public final C5268l crashlytics;
    public final subs loadAd;
    public final ArrayDeque yandex = new ArrayDeque();

    public C17568l(subs subsVar, C5268l c5268l) {
        this.loadAd = subsVar;
        this.crashlytics = c5268l;
        c5268l.yandex(new C4437l(3, this));
    }

    public static void loadAd(C7297l c7297l, boolean z) {
        EnumC8981l enumC8981l = c7297l.f15145l.subs;
        if (enumC8981l.yandex(EnumC8981l.f18523l)) {
            c7297l.crashlytics(EnumC14812l.ON_PAUSE);
        }
        if (enumC8981l.yandex(EnumC8981l.f18524l)) {
            c7297l.crashlytics(EnumC14812l.ON_STOP);
        }
        if (z) {
            c7297l.crashlytics(EnumC14812l.ON_DESTROY);
        }
    }

    public final void yandex(C7297l c7297l, boolean z) {
        this.yandex.push(c7297l);
        EnumC8981l enumC8981l = EnumC8981l.f18520l;
        C5268l c5268l = this.crashlytics;
        if (z && c5268l.subs.yandex(enumC8981l)) {
            c7297l.crashlytics(EnumC14812l.ON_CREATE);
        }
        if (c7297l.f15145l.subs.yandex(enumC8981l) && c5268l.subs.yandex(EnumC8981l.f18524l)) {
            billing.amazon("invalidate", new C17706l(((loadAd) this.loadAd.loadAd(loadAd.class)).crashlytics, "invalidate", new C8339l(11), 5));
            c7297l.crashlytics(EnumC14812l.ON_START);
        }
    }
}
