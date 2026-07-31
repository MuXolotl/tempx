package defpackage;

/* JADX INFO: renamed from: lۣؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2342l extends AbstractC0342l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile long f5094l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f5095l;

    public C2342l(String str, C18096l c18096l, long j) {
        super(str, c18096l);
        this.f5095l = j;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object amazon(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ void billing(Object obj) {
        this.f5094l = ((Long) obj).longValue();
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object crashlytics(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object purchase() {
        return Long.valueOf(this.f5094l);
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object yandex() {
        return Long.valueOf(this.f5095l);
    }
}
