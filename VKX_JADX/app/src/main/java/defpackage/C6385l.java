package defpackage;

/* JADX INFO: renamed from: lؙُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6385l extends AbstractC0342l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile String f13364l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f13365l;

    public C6385l(String str, C18096l c18096l, String str2) {
        super(str, c18096l);
        this.f13365l = str2;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object amazon(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ void billing(Object obj) {
        this.f13364l = (String) obj;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object purchase() {
        return this.f13364l;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object yandex() {
        return this.f13365l;
    }

    @Override // defpackage.AbstractC0342l
    public final /* bridge */ /* synthetic */ Object crashlytics(String str) {
        return str;
    }
}
