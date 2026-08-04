package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6479l implements InterfaceC11075l {
    public final InterfaceC14328l crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C6479l(Object obj, InterfaceC14328l interfaceC14328l, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = interfaceC14328l;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        switch (this.yandex) {
            case 0:
                return new C17991l(this);
            default:
                return new C17991l(this, (byte) 0);
        }
    }
}
