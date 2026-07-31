package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lؚْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13653l extends AbstractC4892l {
    public static final /* synthetic */ int amazon = 0;
    public final AtomicLong crashlytics = new AtomicLong(-1);

    static {
        new C7172l(1);
    }

    @Override // defpackage.AbstractC4892l
    public final void yandex() {
        AtomicLong atomicLong = this.crashlytics;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
