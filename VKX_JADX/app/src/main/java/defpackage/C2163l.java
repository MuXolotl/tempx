package defpackage;

/* JADX INFO: renamed from: lؓ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2163l extends C7265l {
    public int remoteconfig;

    public C2163l(AbstractC14648l abstractC14648l) {
        super(abstractC14648l);
        if (abstractC14648l instanceof C8431l) {
            this.purchase = 2;
        } else {
            this.purchase = 3;
        }
    }

    @Override // defpackage.C7265l
    public final void amazon(int i) {
        if (this.isPro) {
            return;
        }
        this.isPro = true;
        this.mopub = i;
        for (InterfaceC1419l interfaceC1419l : this.firebase) {
            interfaceC1419l.yandex(interfaceC1419l);
        }
    }
}
