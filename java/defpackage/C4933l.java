package defpackage;

import java.util.UUID;

/* JADX INFO: renamed from: lٍؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4933l extends AbstractC16374l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C4933l f10053l;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f10053l = new C4933l("<skip trace>", uuidRandomUUID, AbstractC17970l.yandex(uuidRandomUUID), C13185l.purchase, AbstractC10540l.loadAd());
    }

    @Override // defpackage.InterfaceC14094l
    /* JADX INFO: renamed from: lؘِٞ */
    public final InterfaceC14094l mo766l(String str, AbstractC15076l abstractC15076l, C9226l c9226l) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.InterfaceC14094l
    public final AbstractC15076l remoteconfig() {
        return C13185l.purchase;
    }
}
