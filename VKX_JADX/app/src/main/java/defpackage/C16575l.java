package defpackage;

/* JADX INFO: renamed from: lٖۗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16575l extends AbstractC0013l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f32539l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f32540l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32541l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32542l;

    public C16575l(C14307l c14307l) {
        this.f32541l = 1;
        this.f32542l = c14307l;
        this.f32540l = false;
        this.f32539l = 0;
    }

    @Override // defpackage.InterfaceC5174l
    public final void crashlytics() {
        int i = this.f32541l;
        Object obj = this.f32542l;
        switch (i) {
            case 0:
                if (!this.f32540l) {
                    ((C18434l) obj).yandex.setVisibility(this.f32539l);
                }
                break;
            default:
                int i2 = this.f32539l + 1;
                this.f32539l = i2;
                C14307l c14307l = (C14307l) obj;
                if (i2 == c14307l.yandex.size()) {
                    InterfaceC5174l interfaceC5174l = c14307l.amazon;
                    if (interfaceC5174l != null) {
                        interfaceC5174l.crashlytics();
                    }
                    this.f32539l = 0;
                    this.f32540l = false;
                    c14307l.purchase = false;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0013l, defpackage.InterfaceC5174l
    public final void loadAd() {
        int i = this.f32541l;
        Object obj = this.f32542l;
        switch (i) {
            case 0:
                ((C18434l) obj).yandex.setVisibility(0);
                break;
            default:
                if (!this.f32540l) {
                    this.f32540l = true;
                    InterfaceC5174l interfaceC5174l = ((C14307l) obj).amazon;
                    if (interfaceC5174l != null) {
                        interfaceC5174l.loadAd();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0013l, defpackage.InterfaceC5174l
    public void yandex() {
        switch (this.f32541l) {
            case 0:
                this.f32540l = true;
                break;
        }
    }

    public C16575l(C18434l c18434l, int i) {
        this.f32541l = 0;
        this.f32542l = c18434l;
        this.f32539l = i;
        this.f32540l = false;
    }
}
