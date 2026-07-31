package defpackage;

/* JADX INFO: renamed from: lؒؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0766l extends AbstractC10022l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2369l f2325l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14249l f2326l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Object f2327l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2759l f2328l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2329l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8485l f2330l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8485l f2331l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC4539l f2332l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC12932l f2333l;

    public C0766l(C14249l c14249l, C3603l c3603l) {
        this.f2326l = c14249l;
        this.f2333l = c3603l.billing;
        this.f2328l = c3603l.yandex;
        this.f2325l = c3603l.amazon;
        this.f2331l = c3603l.loadAd;
        this.f2330l = c3603l.mopub;
        Object obj = c3603l.purchase;
        InterfaceC9354l interfaceC9354l = obj instanceof InterfaceC9354l ? (InterfaceC9354l) obj : null;
        if (interfaceC9354l == null) {
            InterfaceC9354l.yandex.getClass();
            interfaceC9354l = C10708l.loadAd;
        }
        this.f2327l = interfaceC9354l;
        this.f2332l = c3603l.crashlytics;
    }

    @Override // defpackage.AbstractC10022l
    public final C2369l admob() {
        int i = this.f2329l;
        return this.f2325l;
    }

    @Override // defpackage.AbstractC10022l
    public final C8485l amazon() {
        switch (this.f2329l) {
            case 0:
                break;
        }
        return this.f2331l;
    }

    @Override // defpackage.AbstractC10022l
    public final InterfaceC9354l crashlytics() {
        int i = this.f2329l;
        Object obj = this.f2327l;
        switch (i) {
            case 0:
                return (InterfaceC9354l) obj;
            default:
                return AbstractC12300l.yandex((byte[]) obj);
        }
    }

    @Override // defpackage.AbstractC10022l
    public final C14249l loadAd() {
        int i = this.f2329l;
        C14249l c14249l = this.f2326l;
        switch (i) {
            case 0:
                return c14249l;
            default:
                return (C18134l) c14249l;
        }
    }

    @Override // defpackage.AbstractC10022l
    public final C2759l mopub() {
        int i = this.f2329l;
        return this.f2328l;
    }

    @Override // defpackage.AbstractC10022l
    public final C8485l purchase() {
        switch (this.f2329l) {
            case 0:
                break;
        }
        return this.f2330l;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        switch (this.f2329l) {
            case 0:
                break;
        }
        return this.f2333l;
    }

    @Override // defpackage.InterfaceC13536l
    public final InterfaceC4539l yandex() {
        switch (this.f2329l) {
            case 0:
                return (C5918l) this.f2332l;
            default:
                return this.f2332l;
        }
    }

    public C0766l(C18134l c18134l, byte[] bArr, AbstractC10022l abstractC10022l) {
        this.f2326l = c18134l;
        this.f2327l = bArr;
        this.f2328l = abstractC10022l.mopub();
        this.f2325l = abstractC10022l.admob();
        this.f2331l = abstractC10022l.amazon();
        this.f2330l = abstractC10022l.purchase();
        this.f2332l = abstractC10022l.yandex();
        this.f2333l = abstractC10022l.vip();
    }
}
