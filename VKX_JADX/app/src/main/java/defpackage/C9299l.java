package defpackage;

/* JADX INFO: renamed from: lٍؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9299l extends AbstractC0342l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile boolean f19109l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f19110l;

    public C9299l(String str, C18096l c18096l, boolean z) {
        super(str, c18096l);
        this.f19110l = z;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object amazon(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ void billing(Object obj) {
        this.f19109l = ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object crashlytics(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object purchase() {
        return Boolean.valueOf(this.f19109l);
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object yandex() {
        return Boolean.valueOf(this.f19110l);
    }
}
