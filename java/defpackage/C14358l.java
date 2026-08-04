package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٓۗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14358l implements InterfaceC16983l {
    public final AtomicBoolean amazon = new AtomicBoolean(false);
    public volatile C6267l crashlytics;
    public final C14338l loadAd;
    public final InterfaceC15897l yandex;

    public C14358l(InterfaceC15897l interfaceC15897l, C14338l c14338l) {
        this.yandex = interfaceC15897l;
        this.loadAd = c14338l;
    }

    public static final C6267l smaato(C14358l c14358l) {
        if (c14358l.amazon.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        C6267l c6267l = c14358l.crashlytics;
        if (c6267l != null) {
            return c6267l;
        }
        C6267l c6267l2 = (C6267l) c14358l.yandex.get();
        if (c14358l.amazon.get()) {
            c6267l2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        c14358l.crashlytics = c6267l2;
        return c6267l2;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l admob(LinkedHashSet linkedHashSet, boolean z) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.admob(linkedHashSet, z) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C8122l(this, (InterfaceC14029l) null, z, linkedHashSet));
    }

    @Override // defpackage.InterfaceC16983l
    public final Object amazon(AbstractC5563l abstractC5563l) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.amazon(abstractC5563l) : AbstractC10999l.firebase(AbstractC5103l.billing(this.loadAd.amazon), new C0505l(this, null, 0), abstractC5563l);
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l billing(int i) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.billing(i) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C13017l(this, (InterfaceC14029l) null, i));
    }

    @Override // defpackage.InterfaceC16983l
    public final void close() {
        if (this.amazon.getAndSet(true)) {
            return;
        }
        AbstractC10999l.mopub(this.loadAd.purchase, null, 0, new C14951l(null, this), 3);
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l crashlytics(List list, List list2, List list3) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.crashlytics(list, list2, list3) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C0384l(this, (InterfaceC14029l) null, list, list2, list3, 14));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l firebase() {
        C6267l c6267l = this.crashlytics;
        if (c6267l != null) {
            return c6267l.firebase();
        }
        return AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C0505l(this, null, 1));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l isPro(Map map, EnumC10534l enumC10534l) {
        C6267l c6267l = this.crashlytics;
        if (c6267l != null) {
            return c6267l.isPro(map, enumC10534l);
        }
        return AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C4647l(this, (InterfaceC14029l) null, map, enumC10534l, 6));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l loadAd() {
        C6267l c6267l = this.crashlytics;
        if (c6267l != null) {
            return c6267l.loadAd();
        }
        return AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C0505l(this, null, 2));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l mopub(List list) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.mopub(list) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C18731l(this, (InterfaceC14029l) null, list));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l purchase(C16443l c16443l, Map map) {
        C6267l c6267l = this.crashlytics;
        if (c6267l != null) {
            return c6267l.purchase(c16443l, map);
        }
        return AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C4647l(this, (InterfaceC14029l) null, c16443l, map, 7));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l subs(Map map, EnumC17911l enumC17911l, EnumC10534l enumC10534l) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.subs(map, enumC17911l, enumC10534l) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C0384l(this, (InterfaceC14029l) null, map, enumC17911l, enumC10534l, 13));
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l yandex(List list, List list2, List list3, C6953l c6953l, C6558l c6558l, long j) {
        C6267l c6267l = this.crashlytics;
        return c6267l != null ? c6267l.yandex(list, list2, list3, c6953l, c6558l, j) : AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C0744l(this, null, list, list2, list3, c6953l, c6558l, j));
    }
}
