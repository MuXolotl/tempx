package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٗۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17374l implements InterfaceC11075l {
    public final /* synthetic */ Iterator loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17374l(Iterator it, int i) {
        this.yandex = i;
        this.loadAd = it;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        int i = this.yandex;
        return this.loadAd;
    }
}
