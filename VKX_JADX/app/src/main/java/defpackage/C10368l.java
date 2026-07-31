package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lَ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10368l extends AbstractC17970l implements InterfaceC18293l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C10756l f21167l = new C10756l(17);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Exception f21168l;

    public C10368l(UUID uuid, String str, Exception exc, C9226l c9226l) {
        super("<missing root>", uuid, str, c9226l);
        this.f21168l = exc;
    }

    public static C10368l billing(C9226l c9226l) {
        UUID uuidLoadAd = C9019l.crashlytics.loadAd();
        String strYandex = AbstractC17970l.yandex(uuidLoadAd);
        AbstractC8481l abstractC8481l = (AbstractC8481l) AbstractC10540l.yandex.get();
        if (!abstractC8481l.isEmpty()) {
            Iterable$EL.forEach(abstractC8481l, new C17620l(0));
        }
        return new C10368l(uuidLoadAd, strYandex, f21167l, c9226l);
    }

    @Override // defpackage.InterfaceC14094l
    public final AbstractC15076l admob() {
        return C13185l.purchase;
    }

    @Override // defpackage.InterfaceC18293l
    public final Exception amazon() {
        return this.f21168l;
    }

    @Override // defpackage.InterfaceC14094l
    /* JADX INFO: renamed from: lؘِٞ */
    public final InterfaceC14094l mo766l(String str, AbstractC15076l abstractC15076l, C9226l c9226l) {
        AtomicReference atomicReference = AbstractC10540l.yandex;
        return mo767static(str, abstractC15076l, true, c9226l);
    }

    @Override // defpackage.InterfaceC18293l
    /* JADX INFO: renamed from: static */
    public final C0998l mo767static(String str, AbstractC15076l abstractC15076l, boolean z, C9226l c9226l) {
        if (z) {
            AtomicReference atomicReference = AbstractC10540l.yandex;
        }
        return new C0998l(str, this, abstractC15076l, z, c9226l);
    }
}
