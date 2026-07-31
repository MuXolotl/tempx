package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lِؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11649l {
    public static final /* synthetic */ AtomicIntegerFieldUpdater loadAd = AtomicIntegerFieldUpdater.newUpdater(C11649l.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;
    public final InterfaceC1142l[] yandex;

    public C11649l(InterfaceC1142l[] interfaceC1142lArr) {
        this.yandex = interfaceC1142lArr;
        this.notCompletedCount$volatile = interfaceC1142lArr.length;
    }
}
